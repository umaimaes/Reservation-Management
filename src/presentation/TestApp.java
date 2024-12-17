package presentation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import entities.Client;
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
		cs.deleteById(client3);
		//cs.deleteById(client2);
		//clients=cs.findByName("Umaima");
		//for (Client client:clients) {
		//	System.out.println(client.toString());
		//}
		
	}

}
