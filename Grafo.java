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
            System.out.println("Informação ausente");
        }
        Vertice<X> vertice = new Vertice<>(info);
        vertices.guardeUmItemNoInicio(vertice);
    }

    public Vertice<X> buscarVertice(X info){
        //verificar se tem informação
        if(info == null){
            System.out.println("Informação ausente");
        }

        No<Vertice<X>> atual = vertices.getPrimeiro();
        while(atual != null){
          Vertice<X> v = atual.getInfo();
            if(v.getInfo().equals(info)){
                return v;
            }

            atual= atual.getProx();
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
