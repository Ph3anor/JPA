package senai.comjpa.pojo;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
public class Cliente {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String nome;
	@ManyToOne(cascade=CascadeType.PERSIST)
	private Cidade cidade;
	@ManyToOne(cascade=CascadeType.PERSIST)
	private Pedido pedido;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Cidade getCidade() {
		return cidade;
	}
	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}
	public Pedido getPedido() {
		return pedido;
	}
	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nome=" + nome + ", cidade=" + cidade
				+ "]";
	}
	
}
