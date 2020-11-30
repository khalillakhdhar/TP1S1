package classes;

public class Peripherique {
private String marque;
private double prix;
private String titre;
private long code;
public String getMarque() {
	return marque;
}
public void setMarque(String marque) {
	this.marque = marque;
}
public double getPrix() {
	return prix;
}
public void setPrix(double prix) {
	this.prix = prix;
}
public String getTitre() {
	return titre;
}
public void setTitre(String titre) {
	this.titre = titre;
}
public long getCode() {
	return code;
}
public void setCode(long code) {
	this.code = code;
}
public Peripherique(String marque, double prix, String titre, long code) {
	super();
	this.marque = marque;
	this.prix = prix;
	this.titre = titre;
	this.code = code;
}
@Override
public String toString() {
	return "Peripherique [marque=" + marque + ", prix=" + prix + ", titre=" + titre + ", code=" + code + "]";
}


}
