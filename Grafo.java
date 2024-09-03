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

    @Override
    public String toString() {
        return "Grafo [Vertices: " + vertices + " Arestas: " + arestas + "]";
    }
}
