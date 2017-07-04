package senai.comjpa.dao.jpa;
import senai.comjpa.dao.jpa.CidadeDAO;
import senai.comjpa.pojo.Cidade;

public class CidadeJPADAO  extends JPAAbstract<Cidade> implements CidadeDAO {
	@Override
	public String getEntityName() {
		return "Cidade";
	}
}
