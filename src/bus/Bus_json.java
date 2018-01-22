package bus;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

public class Bus_json {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//1. create a client
		
	Client client= ClientBuilder.newClient();
		
//2. Set a target to client
		
	WebTarget target= client.target("https://data.smartdublin.ie/cgi-bin/rtpi/realtimebusinformation?stopid=184&format=json");	
		
//3. Get Response
		
		System.out.println(
			target.request(MediaType.APPLICATION_JSON).get(String.class)	
				
				);	
		
	}

}
