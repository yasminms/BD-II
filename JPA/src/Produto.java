import java.math.BigDecimal;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity  @Table(name="produto")
public class Produto {
	
	@OneToMany(mappedBy = "produto")
	private List<ItemPedido> itensPedidos;
	@Id @Column(name = "CodProduto", columnDefinition="int(4)", nullable = false) @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer codProduto;
	@Column(name = "Descricao", length = 100, nullable = false)
	private String descricao;
	@Column(name = "ValorUnitario", precision = 10, scale = 2, nullable = false)
	private BigDecimal valorUnitario;
	
	
	public List<ItemPedido> getItensPedidos() {
		return itensPedidos;
	}
	public void setItensPedidos(List<ItemPedido> itensPedidos) {
		this.itensPedidos = itensPedidos;
	}
	public Integer getCodProduto() {
		return codProduto;
	}
	public void setCodProduto(Integer codProduto) {
		this.codProduto = codProduto;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public BigDecimal getValorUnitario() {
		return valorUnitario;
	}
	public void setValorUnitario(BigDecimal valorUnitario) {
		this.valorUnitario = valorUnitario;
	}
	
	
}
