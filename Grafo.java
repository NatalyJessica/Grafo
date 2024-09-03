import java.util.*;

public class Grafo<X> {
    private ListaSimplesDesordenada<Vertice<X>> vertices;
    private ListaSimplesDesordenada<Aresta<X>> arestas;

    public Grafo() {
        vertices = new ListaSimplesDesordenada<>();
        arestas = new ListaSimplesDesordenada<>();
    }

    public void adicionarVertice(X info) throws Exception{
        Vertice<X> novo = new Vertice<>(info);
        vertices.guardeUmItemNoInicio(novo);
    }

    public Vertice<X> buscarVertesse(X info){
        //verificar se tem informação
        if(info == null)
            System.out.printl("Informação ausente");
        No<Vertice<X>> atual = this.vertices.getPrimeiro();
        while(atual != null){
          Vertice<X> v = atual.getInfo();
            if(v.getinfo().equals(info)){
                return v;
            }

            atual= atual.getProx();
        }

        return null;
    }

    public void adicionarAresta(Vertece<X> o, Vertece<X> d, X i){
        if(o == null || d == null || i == null){
            System.out.printl("Alguma informação está ausente");
        }
        Vertice<X> origem = encontrarVertice(origemInfo);
        Vertice<X> destino = encontrarVertice(destinoInfo);
        if (origem == null || destino == null){
            throw new Exception("Vértice não encontrado");
        } 
        
        Aresta<X> aresta = new Aresta<>(origem, destino, i);
        arestas.guardeUmItemNoInicio(aresta):
            
    }

    @Override
    public String toString() {
        return "Grafo [Vertices: " + vertices + " Arestas: " + arestas + "]";
    }
}
