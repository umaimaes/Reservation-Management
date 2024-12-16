package entities;

public class Categories {
	static private int count=0;
	private int id;
	private String code;
	private String libelle;
	
	public Categories(String code, String libelle) {
		id =++ count;
		this.code = code;
		this.libelle = libelle;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	@Override
	public String toString() {
		return "Categories [id=" + id + ", code=" + code + ", libelle=" + libelle + "]";
	}
	
	
	
	
}
