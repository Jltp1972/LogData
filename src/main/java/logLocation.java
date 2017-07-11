import java.util.Date;

public class logLocation {

		String address;
		String city;
		String state;
		String ownerName;
		String phoneNumber;
		String locdate;
		String email;
		String status;		//ie. found, bid given, cut
		String NbrTrees;
		String Misc;
		long key;
		public logLocation left; 				// this node’s left child
		public logLocation right; 				// this node’s right child
		
		
		public static void main(String[] args) {
			
		}
		
		public logLocation(long k) {
//			long datekey = (new Date().getTime()/1000);
			key = k;
			address = " ";
			city = " ";
			state = " ";
			ownerName = " ";
			phoneNumber = " ";
			locdate = " ";
			email = " ";
			status = " ";
			NbrTrees = " ";
			Misc = " ";
			
		}
		
		public logLocation(String a, String c, String S, String o, String p, String l, String e, String n, String s, String m) {
//			long datekey = (new Date().getTime()/1000);
			key = locator.getkey(a, c, S);
			address = a;
			city = c;
			state = S;
			ownerName = o;
			phoneNumber = p;
			locdate = l;
			email = e;
			status = s;
			NbrTrees = n;
			Misc = m;
		}
		
		public logLocation(String a, String d, String s, String n) {
			long datekey = (new Date().getTime()/1000);
			key = datekey;
			address = a;
			ownerName = " ";
			phoneNumber = " ";
			locdate = d;
			email = " ";
			status = s;
			NbrTrees = n;
			Misc = " ";
		}
		
		public logLocation(String a, String o, String p, String l, String s) {
			long datekey = (new Date().getTime()/1000);
			key = datekey;
			address = a;
			ownerName = o;
			phoneNumber = p;
			locdate = l;
			email = " ";
			status = s;
			NbrTrees = " ";
			Misc = " ";
		}
		
		public logLocation(String a, String o, String p, String l, String s, String m) {
			long datekey = (new Date().getTime()/1000);
			key = datekey;
			address = a;
			ownerName = o;
			phoneNumber = p;
			locdate = " ";
			email = " ";
			status = s;
			NbrTrees = " ";
			Misc = m;
		}
		
//		int date = new int();
//		System.out.println(dateFormat.format(date)); //2016/11/16 12:08:43
}
