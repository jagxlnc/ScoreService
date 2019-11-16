package com.ibm;
 
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Application;

 
@ApplicationPath("rest")
@Path("service")
public class Service extends Application {
 
	@GET
	@Path("getScore/")
	@Produces("text/plain")
    @Consumes("text/plain")
	public String getString(@QueryParam("ssn") String ssn) {
		Score score = new Score();
		int myscore = score.getRandomNumberInRange(300, 850);
		return "Your Score for SSN : " + ssn + " is " + myscore;
	}
	
}