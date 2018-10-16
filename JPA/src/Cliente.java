import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Cliente {

	@Id
	private Integer CodCliente;
	private String Nome;
	private String Endereco;
	private String Cidade;
	private Integer Cep;
	private String Uf;
	private Integer Ie;

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

	public Integer getCep() {
		return Cep;
	}

	public void setCep(Integer cep) {
		Cep = cep;
	}

	public String getUf() {
		return Uf;
	}

	public void setUf(String uf) {
		Uf = uf;
	}

	public Integer getIe() {
		return Ie;
	}

	public void setIe(Integer ie) {
		Ie = ie;
	}

}
