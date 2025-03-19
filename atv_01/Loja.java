import java.util.Scanner;

public class Loja {

    public static void main (String [] args){
        Scanner entrada = new Scanner (System.in);

        double [] produto = new double [10];
        
        for(int i = 0; i < produto.length; i++) {
            System.out.printf("%dº valor do produto: ", i+1);
            produto[i] = entrada.nextDouble();
        }
        System.out.println("Aplique o valor do desconto: ");
        double desconto = entrada.nextDouble();


        for ( int i=0; i<produto.length; i++){
            double descontar = produto[i] * (desconto /100);
            produto[i] -= descontar;
            System.out.printf("Produto %d com desconto: R$ %.2f%n", i + 1, produto[i]);









        entrada.close();
        }
    }
    }
    //Você foi contratado para desenvolver um sistema que auxilia na análise de preços de produtos em uma loja de calçados. Seu objetivo é criar um programa em Java que armazene os preços dos produtos da loja, sendo que a loja possui 10 produtos diferentes. Após armazenar os preços, o programa deve solicitar ao usuário um valor de desconto que deve ser aplicado ao valor de todos os produtos. Por fim, apresente os valores dos novos preços.