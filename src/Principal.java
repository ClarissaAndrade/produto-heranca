/*
Crie uma classe chamada Produto que deve possuir um nome, um código e um preço. Sobrescreva os métodos equals() e
hashCode() de Object (veja seção sobre esses métodos), de forma a serem considerados iguais instancias de Produto 
que possuam o mesmo código. Crie uma classe chamada ProdutoComTamanho que estenda a classe Produto.
Essa classe deve possuir uma informação adicional de tamanho. Um exemplo seria o tamanho de uma roupa ou a numeração
de um calçado. Método equals() e hashCode() devem ser sobrescritos de forma que um produto com mesmo código e 
tamanhos diferentes são considerados diferentes. Crie uma classe CarrinhoDeCompras que armazene em um atributo
interno do tipo HashMap cada produto adicionado no carrinho e sua respectiva quantidade. O método adicionaProduto()
deve receber a instancia do produto e a quantidade. Caso o produto já exista no HashMap, a quantidade deve ser
somada a que já existe no carrinho. Deve haver também um método removeProduto() que também recebe a instancia do
produto e a quantidade a ser removida. Observe que produtos de tamanhos diferentes devem ser considerados como 
produtos diferentes no carrinho. O carrinho deve possuir um método que calcula o valor total da compra. 

Crie testes com Unit para a classe Produto, para a classe ProdutoComTamanho e para a classe CarrinhoDeCompras.
Os testes de cada classe devem ser colocados em classes separadas e devem estar em um diretório de código diferente
das classes de produção.
*/

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
		System.out.println("O valor total da compra é: " + valor);
		
	}


}
