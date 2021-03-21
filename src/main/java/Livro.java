

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "livro")
@XmlAccessorType(XmlAccessType.FIELD)
public class Livro {
	
	@XmlAttribute
	private Long id;
	@XmlElement
	private String titulo;
	@XmlElement
	private String isbn;
	@XmlElement
	private String genero;
	@XmlElement
	private Double preco;
	@XmlElement
	private List<Autor> autores = new ArrayList<>();
	
	public Livro() {
		
	}
	
	public Livro(Long id, String titulo, String isbn, String genero, Double preco, String ... nomes) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.isbn = isbn;
		this.genero = genero;
		this.preco = preco;
		for(String nome:nomes) {
			this.autores.add(new Autor(nome));
		}
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public Double getPreco() {
		return preco;
	}
	public void setPreco(Double preco) {
		this.preco = preco;
	}
	public List<Autor> getAutores() {
		return autores;
	}
	public void setAutores(List<Autor> autores) {
		this.autores = autores;
	}
	
}
