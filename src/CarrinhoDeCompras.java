import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CarrinhoDeCompras {
	
		List<Produto> lista = new ArrayList<>();
		
		
		public void adicionaProduto(Produto produto, int quantidade) {
			
			for (int i = 1; i <= quantidade; i++) {
				lista.add(produto);		
			}		
		}
	
		public void removeProduto (Produto produto, int quantidade) {
			for (int i = 1; i <= quantidade; i++) {
				lista.remove(produto);		
			}		
		}
	
		public Map<Produto, Integer> contarProdutos() {
        Map<Produto, Integer> map = new HashMap<Produto, Integer>();
        
        	for (Produto produto : lista) {
            int frequency = Collections.frequency(lista, produto);
            map.put(produto, frequency);
        	} 
	
        	return map;
		}
		
		public void imprimir() {
			Set<Produto> chaves = contarProdutos().keySet();
			for (Produto chave : chaves)
			{
				if(chave != null)
					System.out.print(chave + " - Quantidade: ");
					System.out.println(contarProdutos().get(chave));
		}
	}	
	
		public double valorTotal() {
			Map<Produto, Integer> map = contarProdutos();			
			Set<Produto> chaves = contarProdutos().keySet();
			double valorTotal = 0;
			for (Produto chave : chaves)
			{
				if(chave != null) {
					double precoProduto = chave.getPreco();
					int quantidade = map.get(chave);
					valorTotal = precoProduto * quantidade;
				}
			}
			return valorTotal;
			
		}

}
