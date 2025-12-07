package src;
import src.Estruturas_de_Dados.Vetor.Vetor;
import src.Estruturas_de_Dados.Arvores.*;
public class Main{
    public static void main(String[] args ){
        Vetor vetor = new Vetor();

        /*vetor.inserirApend(3);
        vetor.inserirApend(98);
        vetor.inserirApend(4);
        vetor.inserirApend(9);
        vetor.inserirApend(54);
        vetor.inserirApend(32);
        vetor.inserirApend(76);
        vetor.inserirApend(25);

        vetor.bubbleSort();
    
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
        arvore.inserir(6);*/

        int tamanho = 100; // Opções: 100, 1000, 10000 
        
        int[] dados = GeradorDeDados.gerarInversamenteOrdenado(tamanho); 
        
        System.out.println("=== TESTANDO COM " + tamanho + " ELEMENTOS ===");

        long somaTempoVetor = 0, somaTempoAb = 0, somaTempoAVL = 0;
        long somaBuscaVetor = 0, somaBuscaArvoreB = 0, somaBuscaAVL = 0;
        long somaOrdenacao = 0;

        for (int i = 0; i < 5; i++) {
            
            //Vetor

            long inicio = System.nanoTime(); 
            for (int val : dados) vetor.inserirApend(val); 
            somaTempoVetor += (System.nanoTime() - inicio); 

            somaBuscaVetor += medirBusca(vetor, null, dados); 
            
            inicio = System.nanoTime();
            vetor.mergeSort();
            somaOrdenacao += (System.nanoTime() - inicio);

            //Árvore Binaria
            ArvoreBinaria ArvoreBinaria = new ArvoreBinaria();
            
            inicio = System.nanoTime();
            for (int val : dados) ArvoreBinaria.inserir(val);
            somaTempoAb += (System.nanoTime() - inicio);

            somaBuscaArvoreB += medirBusca(null, ArvoreBinaria, dados);

            //ArvoreAVL
            ArvoreAVL arvoreAVL = new ArvoreAVL();
            
            inicio = System.nanoTime();
            for (int val : dados) arvoreAVL.inserir(val);
            somaTempoAVL += (System.nanoTime() - inicio);

            somaBuscaAVL += medirBusca(null, arvoreAVL, dados);
        }

        
        System.out.println("\n--- RESULTADOS MÉDIOS (5 execuções) ---");
        System.out.println("VETOR Inserção: " + (somaTempoVetor / 5) + " ns");
        System.out.println("VETOR Busca:    " + (somaBuscaVetor / 5) + " ns");
        System.out.println("VETOR Ordenação:" + (somaOrdenacao / 5) + " ns");
        System.out.println("--------------------------------");
        System.out.println("ABB Inserção:   " + (somaTempoAb / 5) + " ns");
        System.out.println("ABB Busca:      " + (somaBuscaArvoreB / 5) + " ns");
        System.out.println("--------------------------------");
        System.out.println("AVL Inserção:   " + (somaTempoAVL / 5) + " ns");
        System.out.println("AVL Busca:      " + (somaBuscaAVL / 5) + " ns");
    }

    
    public static long medirBusca(Vetor v, Arvore a, int[] dados) {
        long inicio = System.nanoTime();
        int meio = dados[dados.length / 2];
        int fim = dados[dados.length - 1];
        int inexistente = -50; 

        if (v != null) {
            v.buscaSequencial(dados[0]);
            v.buscaSequencial(fim);
            v.buscaSequencial(meio);
            v.buscaSequencial(inexistente);
        } else { 
            a.buscar(dados[0]);
            a.buscar(fim);
            a.buscar(meio);
            a.buscar(inexistente);
        }
        return System.nanoTime() - inicio;
        
    }

    
}