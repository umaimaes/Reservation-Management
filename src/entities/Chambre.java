package entities;

public class Chambre {
	static private int count=0;
	private int id;
	private String phone;
	private Categories categories;
	
	public Chambre(String phone,Categories categories) {
		id =++ count;
		this.phone = phone;
		this.categories = categories;
	}
	
	public Chambre(int id,String phone,Categories categories) {
		this.id =id;
		this.phone = phone;
		this.categories = categories;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Categories getCategories() {
		return categories;
	}

	public void setCategories(Categories categories) {
		this.categories = categories;
	}

	@Override
	public String toString() {
		return "Chambre [id=" + id + ", phone=" + phone + ", categories=" + categories + "]";
	}
	
	
	
}
