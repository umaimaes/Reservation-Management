package services;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import javax.sound.midi.Soundbank;

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
	public boolean deleteById(Client o) {
		String query="DELETE FROM client where id=?";
		try {
			PreparedStatement ps= Connexion.getCnx().prepareStatement(query);
			ps.setLong(1, o.getId());
			if(ps.executeUpdate()==1) {
				return true;
			}
		} catch (SQLException e) {
			System.out.println("erreur delete"+e);
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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Client> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean delete(Client o) {

		return false;
	}
	
}
