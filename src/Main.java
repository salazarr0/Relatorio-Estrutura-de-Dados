package src;
import src.Estruturas_de_Dados.Vetor.Vetor;
import src.Estruturas_de_Dados.Arvores.*;
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

        System.out.println("----------------Busca Binária-----------------");
        System.out.println("Buscando o numero 9...");
        System.out.println("O Número alvo se encontra no indice: " + vetor.buscaBinaria(9));
        vetor.imprimirVetor();
        System.out.println("----------------------------------------------");

        System.out.println("---------------Busca Sequencial------------------");
        System.out.println("Buscando o numero 54...");
        System.out.println("O Número alvo se encontra no indice: " + vetor.buscaSequencial(54));
        vetor.imprimirVetor();
        System.out.println("-------------------------------------------------");
        
        Arvore arvore = new ArvoreAVL();
        arvore.inserir(1);
        arvore.inserir(2);
        arvore.inserir(3);
        arvore.inserir(4);
        arvore.inserir(5);
        arvore.inserir(6);
        
    }
}