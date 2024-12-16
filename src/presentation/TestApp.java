package presentation;

import entities.Client;
import services.ClientService;

public class TestApp {

	public static void main(String[] args) {
		ClientService cs= new ClientService();
		Client client1=  new Client("Umaima","mee","98776","me@jj");
//		cs.create(client1);
		Client client2=  new Client("me","mee","1","me@jj");
		//cs.update(client2);
		cs.deleteById(client2);
	}

}
