package senai.comjpa.dao.jpa;

import senai.comjpa.pojo.Estado;
import senai.comjpa.pojo.Cidade;
import senai.comjpa.pojo.Cliente;
import senai.comjpa.pojo.Pedido;
import senai.comjpa.dao.jpa.DAOFactory;

public class RunnerJPA {
	
	public static void main(String[] args) {
		Estado sc = new Estado();
//		sc.setId(1);
		sc.setNome("Santa Catarina");
		sc.setUf("SC");

		Cidade joi = new Cidade();
//		joi.setId(1);
		joi.setEstado(sc);
		joi.setNome("Joinville");

		Cliente eu = new Cliente();
//		eu.setId(1);
		eu.setCidade(joi);
		eu.setNome("Thiago");
		
		Pedido order = new Pedido();
//		order.setId(1);
		order.setNome("Livro");
		order.setCliente(eu);
		String pedido = "Pedido: "+order;
		
		
	

		// Cliente DAO Busca
		PedidoDAO pedidoDAO = (PedidoDAO) DAOFactory.getInstanceOf(PedidoDAO.class);
		// Inclui o registro cliente e automaticamente já cadastra cliente e
		// estado
		pedidoDAO.incluir(order);

		System.out.println(pedido);
//		Pedido gravado = PedidoDAO.buscarPorId(1);
		// imprime os dados do cliente
//		System.out.println(gravado);
	}
}