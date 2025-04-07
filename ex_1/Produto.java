public class Produto {
    
    String nome;
    double preco;
    int quantidade;
    
    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }
    
    public double CalcularValorTotal() {
        return preco * quantidade;
    }
    
    public double AplicarDesconto(double percentual) {
        double total = CalcularValorTotal();
        double valorDesconto = total * (percentual / 100);
        return total - valorDesconto;
    }
}