package General;

import java.io.IOException;

/*import org.apache.http.*;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpUriRequest;*/

public class RestAPI {

/*	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HttpClient httpClient;
		
	    try {
	        // specify the host, protocol, and port
	        HttpHost target = new HttpHost("weather.yahooapis.com", 80, "http");
	        
	        // specify the get request
	        HttpGet getRequest = new HttpGet("/forecastrss?p=80020&u=f");

	        System.out.println("executing request to " + target);

	        HttpResponse httpResponse = httpClient.execute(target, getRequest);
	        HttpEntity entity = httpResponse.getEntity();

	        System.out.println("----------------------------------------");
	        System.out.println(httpResponse.getStatusLine());
	        Header[] headers = httpResponse.getAllHeaders();
	        for (int i = 0; i < headers.length; i++) {
	          System.out.println(headers[i]);
	        }
	        System.out.println("----------------------------------------");

	        if (entity != null) {
	          System.out.println(EntityUtils.toString(entity));
	        }

	      } catch (Exception e) {
	        e.printStackTrace();
	      } finally {
	        // When HttpClient instance is no longer needed,
	        // shut down the connection manager to ensure
	        // immediate deallocation of all system resources
	        httpClient.getConnectionManager().shutdown();
	      }
	    }
	}
*/
}
