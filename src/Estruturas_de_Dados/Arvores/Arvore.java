package src.Estruturas_de_Dados.Arvores;

public abstract class Arvore{

    protected No raiz;

    public Arvore(){
        
    }

    public String toString(){
        return "------------Árvore--------------";
    };

    public void inserir(int valor){
        if(this.raiz == null){
            this.raiz = new No (valor);
        }else{
            inserir(raiz, valor);
        }

    }

    private void inserir(No atual, int valor) {
        if (valor < atual.valor) {
            if(atual.esquerda != null){
                inserir(atual.esquerda, valor);
            }else{
                atual.esquerda = new No(valor);
            }
        } else if(valor > atual.valor) {
            if(atual.direita != null){
                inserir(atual.direita, valor);
            }else{
                atual.direita = new No(valor);
            }
        }
    }

   
    public No buscar(int valor){
        return buscar(this.raiz, valor);
    }

    private No buscar(No atual, int valor){
        if (atual == null) {
            return null;
        }else if (valor == atual.valor) {
            return atual;
        }else if (valor < atual.valor) {
            return buscar(atual.esquerda, valor);
        } else {
            return buscar(atual.direita, valor);
        }
    }
}