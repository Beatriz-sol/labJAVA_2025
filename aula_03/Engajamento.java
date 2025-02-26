import java.util.Scanner;

public class Engajamento {
    public static void main (String[]args) {

    Scanner entrada = new Scanner (System.in);

    
    System.out.print("Qual numero de publicações analisadas: ");

    int publicacao = entrada.nextInt();
    int totalCurtida = 0;


    for (int i = 1; i <= publicacao;i++ ){
        
        System.out.printf("Curtidas de publicação #%d: ",i);
        int curtida = entrada.nextInt();
        totalCurtida = totalCurtida + curtida;
        if(curtida>=100){

            System.out.println("Publicação popular!!!");

        }
         else{

            System.out.println("Publicação com poucas curtidas");

         }

         double mediaCurtida = (double) totalCurtida / publicacao;
         System.out.printf("media de curtidas =%.1f\n",mediaCurtida);
         System.out.printf("numero de publicações = %d\n",publicacao);
        }
    //quantidade de curtidas

    

    entrada.close();

    }
    
}

//analisar quantidade de publicações
//cada publicação e quantidade de curtidas
//verificar se a quantidade de curtidas é =>100; se sim publicação popular se não puvlicação com poucas curtidas
//apresentar media de curtidas das publicações
//quantidade total de publicações analisadas