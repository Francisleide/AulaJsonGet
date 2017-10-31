package rest;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

@Path("/pessoa")
public class PessoaRest {

	@GET
	public String executaGet(){
		return "Testando GET";
	}
	
	@POST
	public String executaPOST(){
		return "Testando o POST";
	}
}
