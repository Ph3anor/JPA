package senai.comjpa.dao.jpa;

import senai.comjpa.pojo.Estado;

public interface EstadoDAO {

	public void incluir(Estado estado);
	public Estado buscarPorId(int id);
}
