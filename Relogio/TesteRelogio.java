public class TesteRelogio {

    public static void main(String[] args) throws InterruptedException {

        RelogioDigital relogio = new RelogioDigital(23, 59, 57);

        System.out.println("Horário inicial: " + relogio.getHorario());

        System.out.println("\nMudança de horario:");
        
        int i = 0;
        
        while (i < 3) {

            Thread.sleep(100);

            relogio.tick();

            System.out.println("Horário atual: " + relogio.getHorario());

            i = i + 1;
        }
    }
}
