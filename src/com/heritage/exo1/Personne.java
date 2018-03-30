package com.heritage.exo1;

public class Personne {
	private String nom;
	private String prenom;
	private String profession;
	private int age;
	
	
	/**
	 * Constructeur par défaut
	 */
	public Personne() {
		this("", "", -1, "");
	}
	
	/**
	 * Constructeur de copie
	 * @param p {@link Personne} la perssone a copie
	 */
	public Personne(Personne p) {
		this(p.nom, p.prenom, p.age, p.profession);
	}
	
	public Personne(String _nom, String _prenom, int _age) {
		this(_nom, _prenom, _age, "");
	}
	
	
	/**
	 * Constructeur de class
	 * @param _nom
	 * @param _prenom
	 * @param _age
	 */
	public Personne (String _nom, String _prenom, int _age, String _profession) {
		
		nom=_nom;
		prenom=_prenom;
		age=_age;
		profession=_profession;
		
	}
	
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getNom() {
		return nom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getPrenom() {
		return prenom;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}
	public String getProfession() {
		return profession;
	}

	public void getAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	/**
	 * Permet a une personne de se présenter 
	 * @return La String de présentation de la personne...
	 */
	public String sePresenter() {
		if (getAge() != -1) {
			return "Je m'apelle " + getPrenom() + " " +getNom() + ", j'ai " +getAge();
		}else {
			return "Je m'apelle " + getPrenom() + " " +getNom();
		}
	}

}
