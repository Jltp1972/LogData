import java.io.IOException;
import java.util.List;

import com.google.code.geocoder.Geocoder;
import com.google.code.geocoder.GeocoderRequestBuilder;
import com.google.code.geocoder.model.GeocodeResponse;
import com.google.code.geocoder.model.GeocoderAddressComponent;
import com.google.code.geocoder.model.GeocoderRequest;
import com.google.code.geocoder.model.GeocoderResult;

/**
 * 
 */

/**
 * @author jltp1
 *
 */
public class locator {

//	public static int getkey() {
	public static long getkey(String addr, String city, String state) {	
		long newkey = 99999;
		final Geocoder geocoder = new Geocoder();
		String address = addr + ", " + city + ", " + state;
		GeocoderRequest geocoderRequest = new GeocoderRequestBuilder().setAddress(address).getGeocoderRequest();

		GeocodeResponse geocoderResponse = null;
		try {
			geocoderResponse = geocoder.geocode(geocoderRequest);
			System.out.println(geocoderResponse);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Error caught");
		}

		List<GeocoderResult> results = geocoderResponse.getResults();

		try {
		GeocoderResult formaddr = results.get(0);
		List<GeocoderAddressComponent> complist = formaddr.getAddressComponents();
		System.out.println(complist);

		String zip = "00000";
		String plus4 = "000";


		for(int i=0; i<complist.size(); i++) {
			GeocoderAddressComponent thiselement = complist.get(i);
			String stringelement = thiselement.toString();
		   if ((stringelement.contains("postal_code"))){
		        zip = thiselement.getShortName();
		        if (i+1 != complist.size()) {
		   		GeocoderAddressComponent nextelement = complist.get(i+1);
		   		
		   		plus4 = nextelement.getShortName();
		   		i = complist.size();}}
		   		
			}	
		
		System.out.println(zip);
		System.out.println(plus4);
		newkey = Integer.parseInt(zip + plus4);
		System.out.println(newkey);

		return newkey;
		} catch (IndexOutOfBoundsException ob) {
			newkey = 99999;
			return newkey;
		}



		}

}


