public class Vetor {
    private int[] vetor;
    
    public int []getVetor(){
        return vetor;
    }        

    public void setVetor(int[] vetor){
        this.vetor = vetor; 
    }

    public void imprimirVetor(){
        System.out.print("[ ");
        for(int i = 0; i < vetor.length; i++ ){
            System.out.print(vetor[i]  + " ");
        }
        System.out.println("]");
    }
}