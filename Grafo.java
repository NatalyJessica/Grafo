import java.util.*;

public class Grafo<X> {
    private ListaSimplesDesordenada<Vertice<X>> vertices;
    private ListaSimplesDesordenada<Aresta<X>> arestas;

    public Grafo() {
        vertices = new ListaSimplesDesordenada<>();
        arestas = new ListaSimplesDesordenada<>();
    }

    public void adicionarVertice(X info) throws Exception{
        if(info == null){
            throw new Exception("Informação ausente");
        }
        Vertice<X> vertice = new Vertice<>(info);
        vertices.guardeUmItemNoInicio(vertice);
    }

    public Vertice<X> buscarVertice(X info) throws Exception {
        if (info == null) {
            throw new Exception("Informação ausente");
        }
    
        Vertice<X> achouVertice = new Vertice<>(info);
    
        // Verifica se o vértice existe na lista de vértices
        if (vertices.tem(achouVertice)) {
            // Percorre a lista para encontrar o vértice e retorná-lo
            No atual = vertices.getPrimeiro(); // Acesso ao primeiro nó da lista
            while (atual != null) {
                Vertice<X> vertice = atual.getInfo();
                if (vertice.equals(achouVertice)) {
                    return vertice;
                }
                atual = atual.getProx();
            }
        }
    
        return null;
    }
    

    public void adicionarAresta(Vertice<X> origemInfo, Vertice<X> destinoInfo, X info)throws Exception{
        if(origemInfo == null || destinoInfo == null || info == null){
            System.out.println("Alguma informação está ausente");
        }
        Vertice<X> origem = buscarVertice(origemInfo);
        Vertice<X> destino = buscarVertice(destinoInfo);
        if (origem == null || destino == null){
            throw new Exception("Vértice não encontrado");
        } 
        
        Aresta<X> aresta = new Aresta<>(origem, destino, info);
        arestas.guardeUmItemNoInicio(aresta);
            
    }

    @Override
    public String toString() {
        return "Grafo [Vertices: " + vertices + " Arestas: " + arestas + "]";
    }
}
