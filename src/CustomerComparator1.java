import java.util.Comparator;

/*CustomerComparator für die ID
 * Schnittstelle Comparator vergleicht zwei Elemente auf ihre Ordnung und kodiert sie
 */
public class CustomerComparator1  implements Comparator <Customer> {
	
	@Override
	public int compare(Customer o1, Customer o2){
		if (o1.getId() < o2.getId()){
			return -1;                         //o1 ist kleiner als o2. Rückgabewert  <0
		}else if (o1.getId() > o2.getId()){
			return 1;                         //o1 ist größer als o2. Rückgabewert >0
		}else { 
			return 0;                        //beide gleich gross also == 0
		}
	}

}
