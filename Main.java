public class Main {
    public static void main(String[] args) {
        try {
            // Criação do grafo
            Grafo<String> grafo = new Grafo<>();

            // Adicionando vértices
            grafo.adicionarVertice("A");
            grafo.adicionarVertice("B");
            grafo.adicionarVertice("C");

            grafo.adicionarAresta("A","B", "1");
            grafo.adicionarAresta("A","B", "2");

            System.out.println(grafo);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
