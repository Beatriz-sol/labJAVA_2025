import java.util.Scanner;

public class TesteCirculo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o valor do raio: ");
        double raio = entrada.nextDouble();

        Circulo c = new Circulo(raio);
        c.calcularArea();
        c.calcularPerimetro();

        entrada.close();
    }
}