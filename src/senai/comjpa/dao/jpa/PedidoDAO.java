package senai.comjpa.dao.jpa;

import senai.comjpa.pojo.Pedido;

public interface PedidoDAO {

	public void incluir(Pedido pedido);
	public Pedido buscarPorId(int id);

}
