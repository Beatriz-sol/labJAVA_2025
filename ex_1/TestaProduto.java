public class TestaProduto {
    
    public static void main(String[] args) {
        
        Produto a1 = new Produto("shampoo", 15, 100); 
        
        System.out.println("O produto é: " + a1.nome);
        System.out.println("A quantidade é: " + a1.quantidade);
        System.out.println("O valor do produto é: " + a1.preco);
        System.out.println("Valor com desconto de 10%: R$" + a1.AplicarDesconto(10));
        System.out.println("Valor total sem desconto: R$" + a1.CalcularValorTotal());
    }
}