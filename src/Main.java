package src;
import src.Estruturas_de_Dados.*;
public class Main{
    public static void main(String[] args ){
        Vetor vetor = new Vetor();

        vetor.inserirApend(3);
        vetor.inserirApend(98);
        vetor.inserirApend(4);
        vetor.inserirApend(9);
        vetor.inserirApend(54);
        vetor.inserirApend(32);
        vetor.inserirApend(76);
        vetor.inserirApend(25);

        System.out.println("---------------------------------");
        System.out.println("Buscando o numero 9...");
        System.out.println("O Número alvo se encontra no indice: " + vetor.buscaBinaria(9));
        vetor.imprimirVetor();
        System.out.println("---------------------------------");
    }
}