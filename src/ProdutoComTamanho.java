
public class ProdutoComTamanho extends Produto {

	
	private int tamanho;


	public ProdutoComTamanho(int codigo, String nome, double preco, int tamanho) {
		super(codigo, nome, preco);
		this.tamanho = tamanho;
	}


	public int getTamanho() {
		return tamanho;
	}


	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + tamanho;
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProdutoComTamanho other = (ProdutoComTamanho) obj;
		if (tamanho != other.tamanho)
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "ProdutoComTamanho [codigo=" + super.getCodigo() + ", nome=" + super.getNome() + ", preco=" + super.getPreco() + ", tamanho = " + tamanho + "]";
	}

	
	
	
	
	
	
	
	
	
	
	
}
