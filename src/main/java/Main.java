import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.MediaType;

public class Main {

	public static void main(String[] args) {
		
		
		Livros livros = ClientBuilder.newClient()
				.target("http://localhost:8080/livraria-virtual")
				.path("livro")
				.request(MediaType.APPLICATION_XML)
				.get(Livros.class);				
		
		livros.getLivros().stream().forEach(l -> System.out.println(l.getTitulo()));

	}

}
