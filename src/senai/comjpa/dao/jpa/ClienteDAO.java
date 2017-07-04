package senai.comjpa.dao.jpa;

import senai.comjpa.pojo.Cliente;

public interface ClienteDAO {

	public void incluir(Cliente cliente);
	public Cliente buscarPorId(int id);
}
