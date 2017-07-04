package senai.comjpa.dao.jpa;

import senai.comjpa.pojo.Cidade;

public interface CidadeDAO {

	public void incluir(Cidade cidade);
	public Cidade buscarPorId(int id);
}
