package mil.navy.mtc2.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

import javassist.bytecode.stackmap.TypeData.ClassName;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
//import org.json.simple.*;
//import java.util.logging.Level;
//import java.util.logging.Logger;


@Path("/foo")
public class MessageRestService {

	@GET
	@Path("/bar")
	public Response bluesky() {

		String output = "hello world";
	
		return Response.status(200).entity(output).build();
			
	}
}