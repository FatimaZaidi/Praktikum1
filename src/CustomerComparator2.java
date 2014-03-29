import java.util.Comparator;
/*CustomerComparator für die ID
 * Schnittstelle Comparator vergleicht zwei Elemente auf ihre Ordnung und kodiert sie
 */


public class CustomerComparator2 implements Comparator<Customer> {
	@Override
	public int compare(Customer o1, Customer o2){
		
		int result= o1.getNachname().compareTo(o2.getNachname());
		
		if ( result==0) {
			result= o1.getVorname().compareTo(o2.getVorname());
			
			
		}return result;
	}

}
