package DAO;

import java.util.List;

import entities.Client;

public interface IDAO <T> {
	
	boolean create(T o);
	boolean delete(T o);
	boolean update(T o);
	
	T findById(int id);
	List<T> findAll();
	boolean deleteById(Client o);
	

}