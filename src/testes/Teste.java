package testes;

import classes.Entree;
import classes.Peripherique;
import classes.Sortie;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Peripherique p1=new Peripherique("Lenovo", 4, "memory bus", 123456);
Entree e1=new Entree("Toshiba",2, "clé usb",654321, 128);
Sortie s1=new Sortie("Ecran",100, "HD 42pouce",122333, "LCD 4K");
System.out.println(p1.toString());
System.out.println(e1.toString());
System.out.println(s1.toString());

	}

}
