public class Main {
    public static void main(String[] args) {
        try {
            // Criação do grafo
            Grafo<String> grafo = new Grafo<>();

            // Adicionando vértices
            grafo.adicionarVertice("A");
            grafo.adicionarVertice("B");
            grafo.adicionarVertice("C");

            // Adicionando arestas
            grafo.adicionarAresta("A", "B", "Aresta1");
            grafo.adicionarAresta("B", "C", "Aresta2");
            grafo.adicionarAresta("C", "A", "Aresta3");

            // Exibindo o grafo
            System.out.println("Grafo inicial:");
            System.out.println(grafo);

            // Verificando se o grafo tem um vértice
            System.out.println("O grafo contém o vértice 'A'? " + grafo.temVertice("A"));

            // Verificando se o grafo tem uma aresta
            System.out.println("O grafo contém a aresta de 'A' para 'B' com informação 'Aresta1'? " + grafo.temAresta("A", "B", "Aresta1"));

            // Removendo um vértice
            grafo.removerVertice("B");

            // Exibindo o grafo após a remoção de um vértice
            System.out.println("\nGrafo após remover o vértice 'B':");
            System.out.println(grafo);

            // Removendo uma aresta
            grafo.removerAresta("C", "A", "Aresta3");

            // Exibindo o grafo após a remoção de uma aresta
            System.out.println("\nGrafo após remover a aresta de 'C' para 'A':");
            System.out.println(grafo);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
