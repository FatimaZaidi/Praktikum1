import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Webshop {
	
	/*Erzeugung eines neuen Arrays*/
	
	private ArrayList <Customer> list= new ArrayList<Customer>(); 
	
	/*Fügt Customer hinzu*/
	public void addCustomer( String vorname, String nachname){
		Customer eintrag= new Customer(vorname, nachname);
		appendEintragAnListe(eintrag);
	}
       /*Private Methode, die den Customer an das Ende der Liste einträgt*/
	private void appendEintragAnListe(Customer eintrag) {
		if (eintrag != null){
			list.add(eintrag);
		}
	}
	/*Methode zum löschen*/
	public boolean removeCustomer(int id, String nachname, String vorname){
		
		for (Customer e: list){
			if (e.getId()==id && e.getNachname()==nachname && e.getVorname()==vorname); { 
				list.remove(e);
				System.out.println("Customer"+" "+ nachname+","+" "+ vorname +" "+"(id"+":"+" "+ id +")"+ " "+" deleted");
				return true;
			}	
		}
		return false;
	}
	
	
	
	/*Prüft ob in der Liste ein Customer mit den gegebenen Namen und Vornamen vorhanden ist*/
	public boolean getCustomerFromList(String vorname, String nachname){
		for (Customer element: list){
			if (element.getNachname().equals(nachname)&& element.getVorname().equals(vorname)){
				//System.out.println(„Übereinstimmung gefunden");
				return true;
			}
		}return false;
	}
	
	
	/*Gibt die sortierte Liste zurück*/
	public void printListOfCustomer(SortingCriterion mode){
		switch (mode) {
		
		case SORT_BY_ID:
			Collections.sort(list, new CustomerComparator1());
			
			
			break;

		case SORT_BY_LASTNAME_FIRSTNAME:
			Collections.sort(list, new CustomerComparator2());
			
			
			break;
			default:
				break;
		}
				
				for (Customer eintrag: list){
					System.out.println(eintrag.getNachname()+" "+ eintrag.getVorname()+ " (ID:" +eintrag.getId()+")");
				}
		
		         for (Customer eintrag: list){
			System.out.println(eintrag.getNachname()+" "+ eintrag.getVorname()+ " (ID:" +eintrag.getId()+")");
		}
	}
		
		
			
		
	
	
	/*gibt die Liste zurück*/
	 public List<Customer>getListe(){
		 return list;
	 }
	 /*Liste löschen*/
	 public void listeLöschen(){
		 list.clear();
		 
	 }
	 
	 /*Gibt Liste als Aray zurück*/
		public Customer []   getListeAlsArray() {
		
	
		Customer [] ergebnis= new Customer [list.size()];
		list.toArray(ergebnis);
		return ergebnis;
		}	
		
	}
