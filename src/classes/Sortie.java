package classes;

public class Sortie extends Peripherique {
private String type;

public String getType() {
	return type;
}

public void setType(String type) {
	this.type = type;
}

  public Sortie(String marque, double prix, String titre, long code, String type) {
	super(marque, prix, titre, code);
	this.type = type;
}

@Override
public String toString() {
	return "Sortie [type=" + type + ", Sortie=" + super.toString() + "]";
}

}
