
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import javax.json.*;
//import javax.json.stream.JsonParser;
import javax.json.stream.JsonParser;
import javax.json.stream.JsonParser.Event;

public class ItunesAPILogic {
	
	   // Calling API call to Check the Itunes APP
	   public int itunesAPICall(ItuneAPIDetails details) throws IOException{		  
			//Building URL
		   String address = "https://itunes.apple.com/search?"+details.getKey()+"="+details.getVal();
			URL url = new URL(address);
			System.out.println(address);
			// reading the contents of the the API call
			BufferedReader so = new BufferedReader(new InputStreamReader(url.openStream()));
			//Iterating JSON 
			JsonParser parser = Json.createParser(so);
			Event event = parser.next(); // START_OBJECT
			event = parser.next();       // KEY_NAME
			event = parser.next();       // VALUE_STRING
			so.close();
			int totalcount = Integer.parseInt(parser.getString());        
			//return the count of records found by the API
			return totalcount;
		
	   }
	   
	   public ItunesAPILogic()
		{
			
		}
}
