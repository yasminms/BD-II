import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity @Table(name="cliente")
public class Cliente {

	@Id @Column(columnDefinition="INT(4)", nullable = false) @GeneratedValue
	private Integer CodCliente;
	@Column(length = 100, nullable = false)
	private String Nome;
	@Column(nullable = false)
	private String Endereco;
	@Column(length = 60, nullable = false)
	private String Cidade;
	@Column(length = 11, nullable = false)
	private String Cep;
	@Column(columnDefinition="CHAR(2)", nullable = false)
	private String Uf;
	@Column(length = 12, nullable = false)
	private String Ie;

	public Cliente() {
		super();
	}

	public Integer getCodCliente() {
		return CodCliente;
	}

	public void setCodCliente(Integer codCliente) {
		CodCliente = codCliente;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public String getEndereco() {
		return Endereco;
	}

	public void setEndereco(String endereco) {
		Endereco = endereco;
	}

	public String getCidade() {
		return Cidade;
	}

	public void setCidade(String cidade) {
		Cidade = cidade;
	}

	public String getCep() {
		return Cep;
	}

	public void setCep(String cep) {
		Cep = cep;
	}

	public String getUf() {
		return Uf;
	}

	public void setUf(String uf) {
		Uf = uf;
	}

	public String getIe() {
		return Ie;
	}

	public void setIe(String ie) {
		Ie = ie;
	}

}
