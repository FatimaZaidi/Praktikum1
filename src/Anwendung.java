
public class Anwendung {

	public static void main(String[] args) {
		
		/*
		 * Neuer Webshop
		 * webshop bekommt Kunden
		 */
		Webshop webshop = new Webshop();
		webshop.addCustomer("Jogi","Löw");
		webshop.addCustomer("Uli","Hoeneß");
		webshop.addCustomer("Hansi","Flick");
		webshop.addCustomer("Dieter","Hoeneß");
		webshop.addCustomer("Hansi","Flick");
		webshop.addCustomer("Mehmet","Scholl");
		webshop.addCustomer("Marco","Reus");
		
	
		//Kunden nach Namen sortiert//
	System.out.println("----------Sortiert nach Nachnamen-----------");	
    webshop.printListOfCustomer(SortingCriterion.SORT_BY_LASTNAME_FIRSTNAME);
    
    
    //Kunden nach Id sortiert//
    System.out.println("--------Sortiert nach ID-------");
	webshop.printListOfCustomer(SortingCriterion.SORT_BY_ID);
	
	System.out.println("-----------------------");
    
	//Kunden löschen//

	
	webshop.removeCustomer(2,"Scholl", "Mehmet");
	webshop.removeCustomer(5,"Hansi","Flick");
	
    
	




		

	}

}
