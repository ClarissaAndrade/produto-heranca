import static org.junit.jupiter.api.Assertions.*;

import java.util.Map;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TesteProduto {

	@Test
	void testeProdutosComMesmoCodigoSaoIguais() {
		
		Produto produtoA = new Produto(1, "tvDeLed", 400);
		Produto produtoB = new Produto(1, "tvDePlasma", 300);
		
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		
		carrinho.adicionaProduto(produtoA, 3);
		carrinho.adicionaProduto(produtoB, 2);
		
		Map<Produto, Integer> map = carrinho.contarProdutos();
		Assertions.assertEquals(5, map.get(produtoA));
		
	}

}
