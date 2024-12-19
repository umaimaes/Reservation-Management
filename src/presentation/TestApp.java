package presentation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import entities.Categories;
import entities.Client;
import services.CategoriesService;
import services.ClientService;

public class TestApp {

	public static void main(String[] args) {
		ClientService cs= new ClientService();
		
		List<Client> clients = new ArrayList<>();
		Client client1=  new Client("Umaima","mee","9776","me@jj");
		
		Client client2=  new Client("me","mee","1","me@jj");
		Client client3=  new Client("umaaa","mej","9776","me@jj");
		//cs.create(client3);
		//cs.update(client1);
		//cs.updateById(client2); 
		//cs.deleteById(client3);
		//cs.deleteById(client2); 
		//clients=cs.findByName("Umaima");
		//for (Client client:clients) {
		//	System.out.println(client.toString());
		//}
		CategoriesService cats= new CategoriesService();
		List<Categories> categories = new ArrayList<>();
		Categories category1= new Categories("3333","tttt");
		Categories category2= new Categories("hjk","jjj");
		Categories category3= new Categories("rrrr","ttttjjk");
		//cats.create(category1);
		//cats.create(category3);
		//cats.delete(category1);
		//cats.update(category2);
		//System.out.println(cats.findById(1));
		/*
		categories=cats.findAll();
		for(Categories categorie:categories) {
			System.out.println(categorie.toString());
		}*/
		
		
		
	}

}
