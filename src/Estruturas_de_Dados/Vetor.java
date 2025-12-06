package src.Estruturas_de_Dados;
public class Vetor {
    private int[] vetor;

    int tamanho = 0;

    public Vetor(){
        vetor = new int[4];
    }
    
    public void inserirApend(int numero){
        
        int capacidade = vetor.length;
        
        if(tamanho < capacidade){
            vetor[tamanho] = numero;
            tamanho++;
        }else{
            int[] vetorNovo = new int[2*capacidade];
            for(int i = 0; i < vetor.length; i++){
                vetorNovo[i] = vetor[i];
            }
            this.vetor = vetorNovo;
            inserirApend(numero);
        }
    }

     public int buscaBinaria(int alvo) {
        return buscaBinaria(alvo, 0, vetor.length -1);
    }

    private int buscaBinaria(int alvo, int inicio, int fim){
        int meio;
        meio = (inicio + fim) / 2;
        if(alvo == vetor[meio]){
            return meio;
        }else if(inicio >= fim){
            return -1;
        }else if(alvo > vetor[meio]){
            return buscaBinaria(alvo, meio + 1 , fim);
        }else{
            return buscaBinaria(alvo, inicio,meio -1);
        }
    }

    public void imprimirVetor(){
        System.out.print("[ ");
        for(int i = 0; i < vetor.length; i++ ){
            System.out.print(vetor[i]  + " ");
        }
        System.out.println("]");
    }

    public int []getVetor(){
        return vetor;
    }        

    public void setVetor(int[] vetor){
        this.vetor = vetor; 
    }

}