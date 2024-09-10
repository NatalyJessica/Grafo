public class Main {
    public static void main(String[] args) {
        try {
            // Criação do grafo
            Grafo<String> grafo = new Grafo<>();

            // Adicionando vértices
            grafo.adicionarVertice("A");
            grafo.adicionarVertice("B");
            grafo.adicionarVertice("C");

            grafo.adicionarAresta("A","B", "A-B");
            grafo.adicionarAresta("B","C", "B-C");
            System.out.println(grafo);
            grafo.removerAresta("A","B");
            System.out.println(grafo);
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
