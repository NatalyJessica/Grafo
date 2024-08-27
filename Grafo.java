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


    @Override
    public String toString() {
        return "Grafo [Vertices: " + vertices + " Arestas: " + arestas + "]";
    }
}
