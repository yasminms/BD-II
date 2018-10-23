import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity @Table(name="cliente")
public class Cliente {
	
	@OneToMany(mappedBy = "cliente")
	private List<Pedido> pedidos;
	@Id @Column(name = "CodCliente", columnDefinition="int(4)", nullable = false) @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer codCliente;
	@Column(name = "Nome", length = 100, nullable = false)
	private String nome;
	@Column(name = "Endereco", nullable = false)
	private String endereco;
	@Column(name = "Cidade", length = 60, nullable = false)
	private String cidade;
	@Column(name = "Cep", length = 11, nullable = false)
	private String cep;
	@Column(name = "Uf", columnDefinition="CHAR(2)", nullable = false)
	private String uf;
	@Column(name = "Ie", length = 12, nullable = false)
	private String ie;
	
	public Integer getCodCliente() {
		return codCliente;
	}
	public void setCodCliente(Integer codCliente) {
		this.codCliente = codCliente;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getUf() {
		return uf;
	}
	public void setUf(String uf) {
		this.uf = uf;
	}
	public String getIe() {
		return ie;
	}
	public void setIe(String ie) {
		this.ie = ie;
	}

}
