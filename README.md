-----

# Análise de Desempenho de Estruturas de Dados em Java

Este repositório contém o trabalho prático da disciplina de Estrutura de Dados, focado na implementação **manual** (sem uso de bibliotecas de coleções do Java) de Vetores, Árvores Binárias de Busca e Árvores AVL, visando a análise comparativa de desempenho.

## 📋 Sobre o Projeto

O objetivo principal deste projeto é comparar a eficiência de diferentes estruturas de dados em operações de **Inserção**, **Busca** e **Ordenação**. A análise foi realizada utilizando métricas de tempo de execução (`System.nanoTime`) em cenários variados:

  * **Tamanhos de Entrada:** 100, 1.000 e 10.000 elementos.
  * **Cenários de Dados:** Aleatórios, Ordenados e Inversamente Ordenados.

## 🚀 Tecnologias Utilizadas

  * **Linguagem:** Java (JDK 8+)
  * **Conceitos:** Manipulação de memória, Recursividade, Complexidade de Algoritmos (Big O).
  * **Ferramentas:** VS Code (ou IDE de preferência), Git.

## ⚙️ Implementações "Do Zero"

Conforme os requisitos do trabalho, **não foram utilizadas** classes como `ArrayList`, `LinkedList` ou `TreeMap`. As seguintes estruturas foram implementadas manualmente:

### 1\. Estruturas de Dados

  * **Vetor Dinâmico:** Implementação baseada em array primitivo com redimensionamento manual (resize).
  * **Árvore Binária de Busca (ABB):** Implementação recursiva padrão.
  * **Árvore AVL:** Árvore balanceada com rotações (Simples e Dupla) automáticas para garantir complexidade $O(\log n)$.

### 2\. Algoritmos

  * **Busca:** Sequencial (Iterativa) e Binária (Recursiva).
  * **Ordenação:** Merge Sort (implementado para vetores).

## 📂 Estrutura do Projeto

O código está organizado nos seguintes pacotes:

```
src/
├── Estruturas_de_Dados/
│   ├── Arvores/
│   │   ├── Arvore.java        # Classe Abstrata (lógica de busca)
│   │   ├── ArvoreBinaria.java # Implementação simples
│   │   ├── ArvoreAVL.java     # Implementação balanceada
│   │   └── No.java            # Elemento da árvore
│   │   
│   └── Vetor/
│       └── Vetor.java         # Vetor dinâmico com MergeSort e Buscas
│
├── GeradorDeDados.java        # Utilitário para criar datasets (Ordenado, Inverso, Aleatório)
└── Main.java                  # Motor de testes e medição de tempo
```

## 🔧 Como Compilar e Executar

Para rodar o projeto, certifique-se de ter o **Java JDK** instalado. Abra o terminal na **raiz do projeto** (a pasta que contém a pasta `src`) e execute os comandos abaixo.

### 1\. Compilação

Compile todos os arquivos `.java` mantendo a estrutura de diretórios:

```bash
javac -d bin src/*.java src/Estruturas_de_Dados/Arvores/*.java src/Estruturas_de_Dados/Vetor/*.java
```

### 2\. Execução

Execute a classe principal informando o `classpath` da pasta `bin`:

```bash
java -cp bin src.Main
```

> **Nota:** Se você estiver usando o VS Code, basta abrir o arquivo `Main.java` e clicar em "Run".

## 📊 Metodologia de Testes

O sistema executa automaticamente os testes seguindo estes passos:

1.  Gera um conjunto de dados (Dataset) único para garantir consistência.
2.  Popula as três estruturas (Vetor, ABB, AVL) com os mesmos dados.
3.  Executa as operações 5 vezes para cada cenário.
4.  Calcula a média aritmética do tempo em **nanossegundos** e exibe no console.

## 📈 Exemplo de Resultados

*Valores aproximados obtidos em ambiente de teste (Celeron 11° geração, 4GB RAM):*

| Cenário (10k elementos) | Vetor (Busca) | AVL (Busca) |
| :--- | :--- | :--- |
| **Aleatório** | \~0.89 ms | \~0.02 ms |
| **Ordenado** | \~0.78 ms | \~0.07 ms |

## ✒️ Autor

  * **Samuel Salazar Barros Guimarães**
  * Curso: Análise e Desenvolvimento de Sistemas 3° período.

-----

*Projeto desenvolvido para a disciplina de Estrutura de Dados - 2025.*
