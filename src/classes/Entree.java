package classes;

public class Entree extends Peripherique {
private int capacite;

public int getCapacite() {
	return capacite;
}

public void setCapacite(int capacite) {
	this.capacite = capacite;
}

public Entree(String marque, double prix, String titre, long code, int capacite) {
	super(marque, prix, titre, code);
	this.capacite = capacite;
}

@Override
public String toString() {
	return "Entree [capacite=" + capacite + ", Périphérique=" + super.toString() + "]";
}


}
