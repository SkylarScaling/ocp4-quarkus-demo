package org.acme;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello-resteasy")
public class GreetingResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello()
    {
        String greeting = System.getenv("GREETING");
        if (greeting != null && !greeting.isEmpty())
        {
            return greeting;
        }
        return "Hello RESTEasy";
    }
}