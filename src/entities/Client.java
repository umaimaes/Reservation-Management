package entities;
/**
 * 
 */
public class Client {
	static private int count=0;
	private int id;
	private String nom;
	private String prenom;
	private String phone;
	private String email;
	
	public Client(String nom, String prenom, String phone, String email) {
		id=++count;
		this.nom = nom;
		this.prenom = prenom;
		this.phone = phone;
		this.email = email;
	}
	
	public Client(int id,String nom, String prenom, String phone, String email) {
		this.id=id;
		this.nom = nom;
		this.prenom = prenom;
		this.phone = phone;
		this.email = email;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Client avec id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", phone=" + phone + ", email=" + email;
	}
	
	
	
}
