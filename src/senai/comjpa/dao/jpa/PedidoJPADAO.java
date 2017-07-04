package senai.comjpa.dao.jpa;
import senai.comjpa.pojo.Pedido;

public class PedidoJPADAO extends JPAAbstract<Pedido> implements PedidoDAO {


	@Override
	public String getEntityName() {
		return "Pedido";
	}
}
