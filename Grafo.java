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
            throw new IllegalArgumentException("Informação não pode ser nula");
        }
    
        Vertice<X> verticeBuscado = new Vertice<>(info);
    
        // Utiliza o método 'buscarItem' para buscar o vértice na lista
        Vertice<X> verticeEncontrado = vertices.buscarItem(verticeBuscado);
    
        if (verticeEncontrado == null) {
            throw new NoSuchElementException("Vértice não encontrado");
        }
    
        return verticeEncontrado;
    }
    
    
    

    public void adicionarAresta(X infoOrigem, X infoDestino, X infoAresta) throws Exception {
        // Verifica se as informações fornecidas são válidas
        if (infoOrigem == null || infoDestino == null || infoAresta == null) {
            throw new Exception("Alguma informação está ausente");
        }
    
        // Busca os vértices de origem e destino no grafo
        Vertice<X> origem = buscarVertice(infoOrigem);
        Vertice<X> destino = buscarVertice(infoDestino);
    
        // Se não encontrar os vértices, lança uma exceção
        if (origem == null) {
            throw new Exception("Vértice de origem não encontrado");
        }
        if (destino == null) {
            throw new Exception("Vértice de destino não encontrado");
        }
    
        // Cria a aresta e adiciona à lista de arestas
        Aresta<X> aresta = new Aresta<>(origem, destino, infoAresta);
    
        // Verifica se a aresta já existe
        if (arestas.tem(aresta)) {
            throw new Exception("Aresta já existe no grafo");
        }
    
          // Adiciona a aresta à lista de arestas
        arestas.guardeUmItemNoInicio(aresta);
    }
    

    @Override
    public String toString() {
        return "Grafo [Vertices: " + vertices + " Arestas: " + arestas + "]";
    }
}
