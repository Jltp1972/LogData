
public class LogTester {

	public static void main (String[] args) {
		
		LocationTree first = new LocationTree();
		String street = "1908 4th St";
		String city = "Altoona";
		String state = "IA";
		
		String street2 = "708 22nd Ave Sw";
		String city2 = "Altoona";
		String state2 = "IA";
		
		String street3 = "2134 4th Ave SE";                   
		String city3 = "Altoona";
		String state3 = "IA";

//		long key = locator.getkey(street, city, state);
		first.addNewLoc(street, city, state, null, null, null, null, null, null, null);
//		key = locator.getkey(street2, city2, state2);
		first.addNewLoc(street2, city2, state2, null, null, null, null, null, null, null);
//		key = locator.getkey(street3, city3, state3);
		first.addNewLoc(street3, city3, state3, null, null, null, null, null, null, null);
//		first.addNewLoc("123 Main St", "Albia", "John", null, "June 1", "found", null, null, null);
//		first.addNewLoc("999 Walnut St", "Cedar Rapids", null, null, "7/5/17", "bid", null, null, null);
//		first.addNewLoc("109 31st", "Denver", "Charles", null, "May 31", "found", null, null, null);
//		first.addNewLoc("852 Apple St", "Applington", null, null, "6/28/17", "bid", null, null, null);
		first.display();
		first.searchkey(first.root, 500091522);
//		first.search(null, "999 Walnut St");
	}
}




