package senai.comjpa.dao.jpa;
import senai.comjpa.dao.jpa.ClienteDAO;
import senai.comjpa.pojo.Cliente;

public class ClienteJPADAO extends JPAAbstract<Cliente> implements ClienteDAO {
	
//	@Override
//	public Cliente incluir(Cliente cliente) {
//		super.incluir(cliente);
//		return cliente;
//	}
	
	
	@Override
	public String getEntityName() {
		return "Cliente";
	}

}
