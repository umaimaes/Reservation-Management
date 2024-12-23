package presentation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import entities.Categories;
import entities.Chambre;
import entities.Client;
import services.CategoriesService;
import services.ChambreService;
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
		Categories category4= new Categories("4444","tttt");
		Categories category5= new Categories("5555","jjj");
		Categories category6= new Categories("66667","ttttjjk");
		//cats.create(category4);
		//cats.create(category5);
		//cats.delete(category3);
		//cats.create(category6);
		
		ChambreService chamS= new ChambreService();
		List<Chambre> chambres = new ArrayList<>();
		 
		Chambre chamS2= new Chambre("hjk",category2);
		
		Chambre chamS3= new Chambre("rrrr",category3);
		
		Chambre chamS4= new Chambre("3333",category4);
		//chamS.create(chamS4);
		//chamS.create(chamS4);
		//chamS.create(chamS2);
		//chamS.create(chamS3);
		Categories category7= new Categories("77778","tttt");
		//cats.create(category7);
		//chamS.create(chamS4);
		Categories category8= new Categories("88887","ttttjjk");
		Chambre chamS1= new Chambre("tttt",category8); 
		//chamS.create(chamS1);
		//chamS.delete(chamS1);
		//cats.create(category8);
		Chambre chamS5= new Chambre("tttt",category4);
		Chambre chamS6= new Chambre("tttt",category5);
		//chamS.create(chamS6);
		chamS.delete(chamS6);
		//chamS.delete(chamS4);
		//System.out.println(chamS4.toString());
		//chamS.create(chamS1);
		
		
	}

}
