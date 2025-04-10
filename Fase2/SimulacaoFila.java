class Fila {
    private static final int MAX_SIZE = 100;
    private Integer[] elementos;
    private int inicio, fim, tamanho;
    
    public Fila() {
        elementos = new Integer[MAX_SIZE];
        inicio = 0;
        fim = -1;
        tamanho = 0;
    }
    
    public void enqueue(Integer valor) {
        if (tamanho == MAX_SIZE) {
            System.out.println("Erro: Fila cheia!");
            return;
        }
        fim = (fim + 1) % MAX_SIZE;
        elementos[fim] = valor;
        tamanho++;
    }
    
    public Integer dequeue() {
        if (isEmpty()) {
            System.out.println("Erro: Fila vazia!");
            return null;
        }
        Integer valor = elementos[inicio];
        inicio = (inicio + 1) % MAX_SIZE;
        tamanho--;
        return valor;
    }
    
    public boolean isEmpty() {
        return tamanho == 0;
    }
    
    public int size() {
        return tamanho;
    }
}


class SimulacaoFila {
    public static void main(String[] args) {
      
        int[] duracoes = {30, 60, 120, 480};
        
        for (int duracao : duracoes) {
            System.out.println("\n=== Simulação para " + duracao + " minutos ===");
            executarSimulacao(duracao);
        }
    }
    
    public static void executarSimulacao(int duracao) {
        Fila clientes = new Fila();
        
        
        int clientesAtendidos = 0;
        int tempoEsperaTotal = 0;
        int maiorTempoEspera = 0;
        java.util.Random random = new java.util.Random();
        
        
        for (int minuto = 0; minuto < duracao; minuto++) {
            if (!clientes.isEmpty()) {
                
                int tempoChegada = clientes.dequeue();
                
                
                clientesAtendidos++;
                
                
                int tempoEspera = minuto - tempoChegada;
                tempoEsperaTotal += tempoEspera;
                
                if (tempoEspera > maiorTempoEspera) {
                    maiorTempoEspera = tempoEspera;
                }
            }
            
            
            int k = random.nextInt(3); 
            
            for (int i = 0; i < k; i++) {
                clientes.enqueue(minuto); 
            }
        }
        
        
        System.out.println("Número total de clientes atendidos: " + clientesAtendidos);
        
        double tempoMedioEspera = clientesAtendidos > 0 ? 
                                (double) tempoEsperaTotal / clientesAtendidos : 0;
        
        System.out.println("Tempo médio de espera na fila: " + String.format("%.2f", tempoMedioEspera) + " minutos");
        System.out.println("Maior tempo de espera na fila: " + maiorTempoEspera + " minutos");
        System.out.println("Clientes restantes na fila: " + clientes.size());
        
        // Preencha a tabela com os resultados de cada simulação
        System.out.println("\nDados para tabela:");
        System.out.println("| " + duracao + " | " + clientesAtendidos + " | " + String.format("%.2f", tempoMedioEspera) + " | " +  maiorTempoEspera + " |");
    }
}