import java.math.BigDecimal;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity @Table(name="vendedor")
public class Vendedor {
	
	@OneToMany(mappedBy = "vendedor")
	private List<Pedido> pedidos;
	@Id @Column(name = "CodVendedor", columnDefinition="INT(4)", nullable = false) @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer codVendedor;
	@Column(name = "Nome", length = 45, nullable = false)
	private String nome;
	@Column(name = "SalarioFixo", precision = 10, scale = 2, nullable = false)
	private BigDecimal salarioFixo;
	@Column(name = "FaixaComissao", columnDefinition = "enum('A','B','C','D')")
	private FaixaComissao faixaComissao;
	
	public Integer getCodVendedor() {
		return codVendedor;
	}
	public void setCodVendedor(Integer codVendedor) {
		this.codVendedor = codVendedor;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public List<Pedido> getPedidos() {
		return pedidos;
	}
	public void setPedidos(List<Pedido> pedidos) {
		this.pedidos = pedidos;
	}
	public BigDecimal getSalarioFixo() {
		return salarioFixo;
	}
	public void setSalarioFixo(BigDecimal salarioFixo) {
		this.salarioFixo = salarioFixo;
	}
	public FaixaComissao getFaixaComissao() {
		return faixaComissao;
	}
	public void setFaixaComissao(FaixaComissao faixaComissao) {
		this.faixaComissao = faixaComissao;
	}
}
