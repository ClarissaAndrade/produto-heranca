import static org.junit.jupiter.api.Assertions.*;

import java.util.Map;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TesteProdutoComTamanho {

	@Test
	void testeProdutosComTamanhosDiferentesSaoDistintos() {
		
		
		Produto produtoA = new ProdutoComTamanho(1, "sapato", 60, 40);
		Produto produtoB = new ProdutoComTamanho(1, "sapato", 60, 42);
		
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		
		carrinho.adicionaProduto(produtoA, 1);
		carrinho.adicionaProduto(produtoB, 1);
		
		Map<Produto, Integer> map = carrinho.contarProdutos();
		Assertions.assertEquals(1, map.get(produtoA));
		Assertions.assertEquals(1, map.get(produtoB));
	}

}
