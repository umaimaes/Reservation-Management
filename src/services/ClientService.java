package services;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import DAO.IDAO;
import connexion.Connexion;
import entities.*;
public class ClientService implements IDAO<Client> {
	
	@Override
	public boolean create(Client o) {
		String query="insert into client values(null,?,?,?,?)";
		try {
			PreparedStatement ps= Connexion.getCnx().prepareStatement(query);
			ps.setString(1,o.getNom());
			ps.setString(2,o.getPrenom());
			ps.setString(3,o.getPhone());
			ps.setString(4,o.getEmail());
			
			if(ps.executeUpdate()==1) {
				return true;
			}
		}catch(SQLException e) {
			System.out.println("erreur"+e);
		}
		return false;
	}
	
	@Override
	public boolean update(Client o) {
		String query="update client SET nom=?,prenom=?,telephone=?,email=? where id=?";
		try {
			PreparedStatement ps= Connexion.getCnx().prepareStatement(query);
			ps.setString(1,o.getNom());
			ps.setString(2,o.getPrenom());
			ps.setString(3,o.getPhone());
			ps.setString(4,o.getEmail());
			ps.setLong(5, o.getId());
			if(ps.executeUpdate()==1) {
				return true;
			}
		} catch (SQLException e) {
			System.out.println("erreur update"+e);
		}
		
		return false;
	}
	

	@Override
	public Client findById(int id) {
		String query="select * from client where id=?";
		try {
			PreparedStatement ps=Connexion.getCnx().prepareStatement(query);
			ps.setInt(1, id); 
			ResultSet rs=ps.executeQuery();
			if(rs.next()) {
				return new Client(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5));
			}else {
				System.out.println("the id of the client doesnt existe");
			}
		} catch (SQLException e) {
			
			System.out.println("erreur de selection"+e);
		}
		return null;
	} 
	
	//fixes
	/*@Override
	public List<Client> findByName(String nom) {
		List<Client> ls=new ArrayList<>();
		String query="SELECT * from client where nom=?";
		try {
			PreparedStatement ps=Connexion.getCnx().prepareStatement(query);
			ps.setString(1, nom); 
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				ls.add( new Client(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5)));
			}
		} catch (SQLException e) {
			System.out.println("erreur de selection par nom"+e);
		}
		return null;
	} */

	@Override
	public List<Client> findAll() {
		List<Client> ls=new ArrayList<>();
		String query="SELECT * from client";
		try {
			PreparedStatement ps=Connexion.getCnx().prepareStatement(query);
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				ls.add(new Client(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5)));
			}
			return ls;
		}catch (SQLException e) {
			System.out.println("Erreur de selection/id sql");
		}
		return null;
	}
	
	@Override
	public boolean delete(Client o) {
		String query="DELETE FROM client where id=?";
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
}



	
