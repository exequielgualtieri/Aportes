// Autor: Exequiel Gualtieri @kekote169

import java.util.Scanner;

public class EmailforName {
		
	static String nombre = ""; //Nombre
	static String ape1 = ""; //Apellido1
	static String ape2 = ""; //Apellido2
	static Scanner datos = new Scanner(System.in);
	
	public static void main(String[] args) {	
		nombres();
	}
	public static void nombres() {
		//Pidiendo los nombres.
		System.out.println("IngreseNombre"); //Pedir Nombre
		nombre = datos.nextLine();
		
		//Evitando problemas con el nombre
		if (nombre.length() <= 1) {
			nombre = nombre+"_";
		}
		if (nombre.length() <=2) {
			nombre = nombre+"-";
		}
		
		System.out.println("IngreseApellido");  //Pedir apellido1
		ape1 = datos.nextLine();
		//Evitando problemas con el ape1
		if (ape1.length() <= 1) {
			ape1 = ape1+"_";
		}
		if (ape1.length() <=2) {
			ape1 = ape1+"-";
		}
		
		System.out.println("IngreseSegundoApellido"); //Pedir apellido2
		ape2 = datos.nextLine(); 
		//Evitando problemas con el Ape2
		if (ape2.length() <= 1) {
			ape2 = ape2+"_";
		}
		if (ape2.length() <=2) {
			ape2 = ape2+"-";
		}
		
		System.out.println("Su nombre completo es:\n"+nombre+" "+ape1+" "+ape2);
		//Corrigiendo un error
		
		//Ahora pasamos a minusculas y solo 2 carácteres
		nombre = nombre.toLowerCase().substring(0,2);
		ape1 = ape1.toLowerCase().substring(0,2);
		ape2 = ape2.toLowerCase().substring(0,2);
		
		//Ahora sustituimos tildes
		nombre = remove1(nombre); //Sin tildes
		ape1 = remove1(ape1); //Sin tildes
		ape2 = remove1(ape2); //Sin tildes
		System.out.println("Le recomendamos la siguiente dirección email:");
		System.out.println("\n"+nombre+ape1+ape2+"@email.com"); //RESULTADO FINAL
	}
	
	// Metodo Para sustituir tíldes
	public static String remove1(String entrada) {

	    String original = " ÀÁÂÃÄÅÆÇÈÉÊËÌÍÎÏÐÑÒÓÔÕÖØÙÚÛÜÝßàáâãäåæçèéêëìíîïðñòóôõöøùúûüýÿ"; //A sustituir
	    String ascii =    "_aaaaaaaceeeeiiiidnoooooouuuuybaaaaaaaceeeeiiiionoooooouuuuyy"; //Simplificacion
	    String salida = entrada;
	    for (int i=0; i<original.length(); i++) {

	        salida = salida.replace(original.charAt(i), ascii.charAt(i));
	    }
	    return salida;
	}
}
