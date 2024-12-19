package services;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import DAO.IDAO;
import connexion.Connexion;
import entities.Categories;
import entities.Chambre;

public class ChambreService implements IDAO<Chambre>{

	@Override
	public boolean create(Chambre o) {
		String query="insert into chambre values(null,?,?)";
		try {
			PreparedStatement ps=Connexion.getCnx().prepareStatement(query);
			ps.setString(1, o.getPhone()); 
			ps.setInt(2, o.getCategories().getId());
			if(ps.executeUpdate()==1) {
				return true;
			}
		} catch (SQLException e) {
			System.out.println("Erreur de create SQL");
		}
		return false;
	}

	@Override
	public boolean delete(Chambre o) {
		String query="DELETE FROM chambre where id=?";
		try {
			PreparedStatement ps= Connexion.getCnx().prepareStatement(query);
			ps.setInt(1, o.getId());
			if(ps.executeUpdate()==1) {
				return true;
			}
		} catch (SQLException e) {
			System.out.println("erreur delete"+e);
		}
		
		return false;
	}

	@Override
	public boolean update(Chambre o) {
		String query="update chambre SET phone=?,categories=? where id=?";
		try {
			PreparedStatement ps= Connexion.getCnx().prepareStatement(query);
			ps.setString(1, o.getPhone());
			ps.setInt(2, o.getCategories().getId());
			ps.setLong(3, o.getId());
			if(ps.executeUpdate()==1) {
				return true;
			}
		} catch (SQLException e) {
			System.out.println("erreur update"+e);
		}
		
		return false;
	}

	@Override
	public Chambre findById(int id) {
		String query="select * from chambre where id=?";
		try {
			PreparedStatement ps=Connexion.getCnx().prepareStatement(query);
			ps.setInt(1, id);
			ResultSet rs=ps.executeQuery();
			if(rs.next()) {
				Categories categories= new Categories(rs.getInt(3),rs.getString(4),rs.getString(5));
				return new Chambre(rs.getInt(1),rs.getString(2),categories);
			}
		} catch (SQLException e) {
			System.out.println("Erreur de selection/id sql");
		}
		return null;
	}

	@Override
	public List<Chambre> findAll() {
		List<Chambre> ls=new ArrayList<>();
		String query="SELECT * from chambre";
		try {
			PreparedStatement ps=Connexion.getCnx().prepareStatement(query);
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				Categories categories= new Categories(rs.getInt(3),rs.getString(4),rs.getString(5));
				ls.add(new Chambre(rs.getInt(1),rs.getString(2),categories));
			}
			return ls;
		}catch (SQLException e) {
			System.out.println("Erreur de selection/id sql");
		} 
		return null;
	}
	
}
