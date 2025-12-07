package src.Estruturas_de_Dados.Vetor;
public class Vetor {
    private int[] vetor;

    protected int tamanho = 0;

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

    //busca
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
    
    public int buscaSequencial(int alvo){
       for(int i = 0; i < this.tamanho; i++){
            if(vetor[i] == alvo ){
                return i;
            }
       }
       return -1;
    }

    //Ordenação
    public void bubbleSort(){
        int key;
        for(int i = 0; i < this.tamanho; i++){
            for(int j = 0; j < this.tamanho - 1 - i; j++){
                if(vetor[j] > vetor[j + 1]){
                   key = vetor[j] ;
                   vetor[j] = vetor[j + 1];
                   vetor[j +  1] = key;
                }
            }
        }
    }

    public void mergeSort() {
        
        if (this.tamanho > 0) {
            mergeSort(0, this.tamanho - 1);
        }
    }

    private void mergeSort(int inicio, int fim) {
        if (inicio < fim) {
            int meio = (inicio + fim) / 2;

            mergeSort(inicio, meio);

            mergeSort(meio + 1, fim);

            merge(inicio, meio, fim);
        }
    }

    private void merge(int inicio, int meio, int fim) {

        int n1 = meio - inicio + 1;
        int n2 = fim - meio;

        int[] esquerda = new int[n1];
        int[] direita = new int[n2];

        for (int i = 0; i < n1; ++i) {
            esquerda[i] = this.vetor[inicio + i];
        }
        for (int j = 0; j < n2; ++j) {
            direita[j] = this.vetor[meio + 1 + j];
        }

        int i = 0, j = 0;

        int k = inicio;

        while (i < n1 && j < n2) {
            if (esquerda[i] <= direita[j]) {
                this.vetor[k] = esquerda[i];
                i++;
            } else {
                this.vetor[k] = direita[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            this.vetor[k] = esquerda[i];
            i++;
            k++;
        }

        while (j < n2) {
            this.vetor[k] = direita[j];
            j++;
            k++;
        }
    }

    //imprimir
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