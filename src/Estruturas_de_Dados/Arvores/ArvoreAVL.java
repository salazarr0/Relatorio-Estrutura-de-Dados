package src.Estruturas_de_Dados.Arvores;

public class ArvoreAVL extends Arvore {
    
    public ArvoreAVL(){

    }

    @Override
    public String toString(){
        return "------------Árvore AVL--------------";
    };

    //inserção
    @Override
    public void inserir(int valor){
        this.raiz = inserir(this.raiz, valor);

    }
    
    private No inserir(No atual, int valor) {

        if (atual == null) {
            return new No(valor);
        }

        if (valor < atual.valor) {
           
            atual.esquerda = inserir(atual.esquerda, valor);
        } else if(valor > atual.valor) {

            atual.direita = inserir(atual.direita, valor);
        } else {
            
        }
        return balancear(atual);
    }

    //balanceamento
    public int altura(){
        return altura(raiz);
    };
    private int altura (No raiz){
        if(raiz == null){
            return 0;
        }
        int alturaEsq = altura(raiz.esquerda);
        int alturaDir = altura(raiz.direita);
        return Math.max(alturaEsq, alturaDir) + 1;
    }


    private int pegarBalanceamento(No no){
        if (no == null){
            return 0;
        }
        return altura(no.esquerda) - altura(no.direita);
    }

     private No balancear(No raiz){
        int FB = pegarBalanceamento(raiz);

        if(FB > 1){
            if(pegarBalanceamento(raiz.esquerda) >= 0){
                return rotacaoDireita(raiz);
            }else{
                raiz.esquerda = rotacaoEsquerda(raiz.esquerda);
                return rotacaoDireita(raiz);
            }
        }else if(FB < -1){
            if(pegarBalanceamento(raiz.direita) <= 0){
                return rotacaoEsquerda(raiz);
            }else{
                raiz.direita = rotacaoDireita(raiz.direita);
                return rotacaoEsquerda(raiz);
            }
        }
            return raiz;
    }

    //Rotação
    private No rotacaoDireita(No raiz){
        No x, y, z;
        y = raiz;
        x = raiz.esquerda;
        z = x.direita;

        x.direita = y;
        y.esquerda = z;

        return x;
    }

    private No rotacaoEsquerda(No raiz){
        No x, y, z;
        y = raiz;
        x = raiz.direita;
        z = x.esquerda;

        x.esquerda= y;
        y.direita = z;

        return x;
    };
}
