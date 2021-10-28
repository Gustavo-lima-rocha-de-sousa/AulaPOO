import java.math.BigDecimal;

public class ExecutarTeste {
	
	public static void main(String[] args) {
		
		Produto produto1 = new Produto();
		produto1.setId(1L);
		produto1.setNome("Modulo Orienta��o Objeto");
		produto1.setValor(BigDecimal.valueOf(100));
		
		Produto produto2 = new Produto();
		produto2.setNome("M�dulo de Spring Boot API Rest");
		produto2.setId(2L);
		produto2.setValor(BigDecimal.valueOf(200));
		
		Produto produto3 = new Produto();
		produto3.setId(3L);
		produto3.setNome("Modulo De Angular 8");
		produto3.setValor(BigDecimal.valueOf(200));
		
		Produto produto4 = new Produto();
		produto4.setId(4L);
		produto4.setNome("Modulo De Hibernate");
		produto4.setValor(BigDecimal.valueOf(300));
		
		
		Venda venda = new Venda();
		venda.setDescricaoVenda("Venda Curso Forma��o Java");
		venda.setEnderecoEntrega("Entrega Via E-mail");
		venda.setId(10L);
		venda.setNomeCliente("Gustavo Lima");
		//venda.setValorTotal(BigDecimal.valueOf(197.00));
		
		venda.getListaProdutos().add(produto1);
		venda.getListaProdutos().add(produto2); /*N�o Consigo Fazer Valida��es*/
		venda.addProduto(produto3);/*Posso Fazer Valida��es Antes de Adcionar na Lista*/
		venda.addProduto(produto4);
				
		System.out.println("Valor da variavel total venda: " + venda.getvalorTotal());
				
	}
}
