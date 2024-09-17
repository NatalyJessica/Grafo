public class Main {
    public static void main(String[] args) {
        try {
            // Criação do grafo
            Grafo<String> grafo = new Grafo<>();

            // Adicionando vértices
            grafo.adicionarVertice("A");
            grafo.adicionarVertice("B");
            grafo.adicionarVertice("C");
            grafo.adicionarVertice("D");
            grafo.adicionarVertice("E");
            System.out.println("Adiconou Vertice");
            System.out.println(grafo);
            //Adiconar aresta
            grafo.adicionarAresta("A","B", "A-B");
            grafo.adicionarAresta("B","C", "B-C");
            grafo.adicionarAresta("E","A", "E-A");
            System.out.println("Aresta adicionada");
            System.out.println(grafo);
            //buscar vertice
            Vertice<String> vtBusca = grafo.buscarVertice("C");
            System.out.println("Achou vertice: " + vtBusca);
            //busca aresta
            Aresta<String> arBusca = grafo.buscarAresta("A", "B");
            System.out.println("Achou Aresta: "+ arBusca);
            //remove vertice
            grafo.removerVertice("D");
            System.out.println("Removeu Vertice");
            //remove aresta
            grafo.removerAresta("A","B");
            System.out.println("Removeu aresta");


            System.out.println(grafo);
            
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
