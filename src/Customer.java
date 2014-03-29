/*Fatima Zaidi
 * Praktikum 1
 * Verwaltung eines Webshops
 * 29.03.2014
 */
public class Customer {
	
	/*-----------------------------------Variablen*****************************/
	private String vorname;
	private String nachname;
	private static int objektzaehler;
	private int id;
	
	/*------------------------------Konstruktor*******************************/
	public Customer(String vorname, String nachname){
		this.id=objektzaehler;
		this.vorname=vorname;
		this.nachname=nachname;
		objektzaehler++;
	}



/***********************GETTER**********************/
	public String getVorname() {
		return vorname;
	}




	public String getNachname() {
		return nachname;
	}


	public int getId() {
		return id;
	}


}
