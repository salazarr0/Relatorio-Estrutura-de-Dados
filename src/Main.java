package src;
import src.Estruturas_de_Dados.*;
public class Main{
    public static void main(String[] args ){
        Vetor vetor = new Vetor();
        vetor.setVetor(new int[4]); //aqui insere a capacidade do array
        vetor.inserirApend(3);
        vetor.inserirApend(98);
        vetor.inserirApend(4);
        vetor.inserirApend(9);
        vetor.inserirApend(3);
        vetor.inserirApend(98);
        vetor.inserirApend(4);
        vetor.inserirApend(9);
        vetor.imprimirVetor();
    }
}