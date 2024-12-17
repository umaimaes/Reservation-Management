package DAO;

import java.util.List;

import entities.Client;

public interface IDAO <T> {
	
	boolean create(T o);
	//boolean delete(T o);
	boolean update(T o);
	boolean deleteById(Client o);	
	boolean updateById(Client o);
	
	
	T findById(int id);
	List<T> findByName(String nom);
	List<T> findAll();
	
	

	

}