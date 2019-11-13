
public class Principal {

	public static void main(String[] args) {
		
		
		
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		Produto produtoA = new Produto(1, "tv", 100);
		Produto produtoB = new Produto(2, "som", 200);
		ProdutoComTamanho produtoTA = new ProdutoComTamanho(3, "sapato", 400, 36);
		Produto produtoC = new Produto(1, "tvdois", 100);
		ProdutoComTamanho produtoTB = new ProdutoComTamanho(3, "sapato", 400, 46);
		
		
		
		carrinho.adicionaProduto(produtoA, 2);
	
		carrinho.adicionaProduto(produtoC, 1);
		carrinho.adicionaProduto(produtoB, 2);
		carrinho.adicionaProduto(produtoTA, 1);
		carrinho.adicionaProduto(produtoTB, 1);
		carrinho.removeProduto(produtoA, 1);
		
		
		carrinho.imprimir();
		double valor = carrinho.valorTotal();
		System.out.println(valor);
		
	}


}
