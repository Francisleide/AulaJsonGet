package facade;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


import model.Pessoa;

@Path("/pessoas")
@Produces({MediaType.APPLICATION_JSON, 
	MediaType.APPLICATION_XML})

@Consumes(MediaType.APPLICATION_JSON)
public class PessoaFacade {
	static List<Pessoa> pessoas = new ArrayList<Pessoa>();
			
	static{
		pessoas.add(new Pessoa("Fran", 26, "123456789"));
	}
	
	@GET
	public List<Pessoa> getPessoas(){
		return pessoas;
	}
}
