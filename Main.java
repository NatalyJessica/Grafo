public class Main {
    public static void main(String[] args) {
        try {
            // Criação do grafo
            Grafo<String> grafo = new Grafo<>();

            // Adicionando vértices
            grafo.adicionarVertice("A");
            grafo.adicionarVertice("B");
            grafo.adicionarVertice("C");

            System.out.println(grafo);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
