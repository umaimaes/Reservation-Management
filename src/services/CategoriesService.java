package services;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import DAO.IDAO;
import connexion.Connexion;
import entities.Categories;

public class CategoriesService implements IDAO<Categories> {

	@Override
	public boolean create(Categories o) {
		String query="insert into categories values(null,?,?)";
		try {
			PreparedStatement ps=Connexion.getCnx().prepareStatement(query);
			ps.setString(1, o.getCode());
			ps.setString(2, o.getLibelle());
			if(ps.executeUpdate()==1) {
				return true;
			}
		} catch (SQLException e) {
			System.out.println("Erreur de create SQL");
		}
		return false;
	}
	@Override
	public boolean delete(Categories o) {
		String query="DELETE FROM categories where id=?";
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
	public boolean update(Categories o) {
		String query="update categories SET code=?,libelle=? where id=?";
		try {
			PreparedStatement ps= Connexion.getCnx().prepareStatement(query);
			ps.setString(1, o.getCode());
			ps.setString(2, o.getLibelle());
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
	public Categories findById(int id) {
		String query="select * from categories where id=?";
		try {
			PreparedStatement ps=Connexion.getCnx().prepareStatement(query);
			ps.setInt(1, id);
			ResultSet rs=ps.executeQuery();
			if(rs.next()) {
				return new Categories(rs.getInt(1),rs.getString(2),rs.getString(3));
			}
			
		} catch (SQLException e) {
			System.out.println("Erreur de selection/id sql");
		}
		return null;
	}

	@Override
	public List<Categories> findAll() {
		List<Categories> ls=new ArrayList<>();
		String query="SELECT * from categories";
		try {
			PreparedStatement ps=Connexion.getCnx().prepareStatement(query);
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				ls.add(new Categories(rs.getInt(1),rs.getString(2),rs.getString(3)));
			}
			return ls;
		}catch (SQLException e) {
			System.out.println("Erreur de selection/id sql");
		}
		return null;
	}

}

