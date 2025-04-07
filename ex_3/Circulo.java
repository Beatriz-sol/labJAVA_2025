public class Circulo {
    double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public void calcularArea() {
        double calcularArea = Math.PI * raio * raio;
        System.out.println("A área do círculo é: " + calcularArea);
    }

    public void calcularPerimetro() {
        double calcularPerimetro = 2 * Math.PI * raio;
        System.out.println("O perímetro do círculo é: " + calcularPerimetro);
    }
}