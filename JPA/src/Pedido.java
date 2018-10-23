import java.sql.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity  @Table(name="pedido")
public class Pedido {
	
	@OneToMany(mappedBy = "pedido")
	private List<ItemPedido> itensPedidos;
	@Id @Column(name = "CodPedido", columnDefinition = "int(4)", nullable = false) @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer codPedido;
	@Column(name = "PrazoEntrega", columnDefinition = "date", nullable = false)
	private Date prazoEntrega;
	@Column(name = "DataPedido", columnDefinition = "date", nullable = false)
	private Date dataPedido;
	@ManyToOne @JoinColumn(name = "CodCliente", nullable = false, columnDefinition = "int(4)")
	private Cliente cliente;
	@ManyToOne @JoinColumn(name = "CodVendedor", nullable = false, columnDefinition = "int(4)")
	private Cliente vendedor;
	
	public List<ItemPedido> getItensPedidos() {
		return itensPedidos;
	}
	public void setItensPedidos(List<ItemPedido> itensPedidos) {
		this.itensPedidos = itensPedidos;
	}
	public Integer getCodPedido() {
		return codPedido;
	}
	public void setCodPedido(Integer codPedido) {
		this.codPedido = codPedido;
	}
	public Date getPrazoEntrega() {
		return prazoEntrega;
	}
	public void setPrazoEntrega(Date prazoEntrega) {
		this.prazoEntrega = prazoEntrega;
	}
	public Date getDataPedido() {
		return dataPedido;
	}
	public void setDataPedido(Date dataPedido) {
		this.dataPedido = dataPedido;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Cliente getVendedor() {
		return vendedor;
	}
	public void setVendedor(Cliente vendedor) {
		this.vendedor = vendedor;
	}
	
}
