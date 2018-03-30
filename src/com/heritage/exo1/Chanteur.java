package com.heritage.exo1;

public class Chanteur extends Personne {
	
	public Chanteur() {
		
		super();
		super.setProfession("chanteur");
	}
	
	public Chanteur (String nom, String prenom, int age, String profession) {
		super (nom, prenom, age);
		super.setProfession("chanteur");
	}
	
	@Override
	public String sePresenter() {
		return super.sePresenter() + " et mon taff c'est " + super.getProfession();
	}

}
