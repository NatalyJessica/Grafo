import java.util.*;

public class Grafo<X> {
    private ListaSimplesDesordenada<Vertice<X>> vertices;
    private ListaSimplesDesordenada<Aresta<X>> arestas;

    public Grafo() {
        vertices = new ListaSimplesDesordenada<>();
        arestas = new ListaSimplesDesordenada<>();
    }

    public void adicionarVertice(X info) throws Exception {
        Vertice<X> vertice = new Vertice<>(info);
        vertices.guardeUmItemNoFinal(vertice);
    }

    public void adicionarAresta(X origemInfo, X destinoInfo, X info) throws Exception {
        Vertice<X> origem = encontrarVertice(origemInfo);
        Vertice<X> destino = encontrarVertice(destinoInfo);
        if (origem == null || destino == null) {
            throw new Exception("Vértice não encontrado");
        }
        Aresta<X> aresta = new Aresta<>(origem, destino, info);
        arestas.guardeUmItemNoFinal(aresta);
    }

    public void removerVertice(X info) throws Exception {
        Vertice<X> verticeParaRemover = encontrarVertice(info);
        if (verticeParaRemover == null) {
            throw new Exception("Vértice não encontrado");
        }

        // Remove todas as arestas que têm o vértice para remover como origem ou destino
        ListaSimplesDesordenada<Aresta<X>> arestasParaRemover = new ListaSimplesDesordenada<>();
        for (Aresta<X> aresta : arestas) {
            if (aresta.getOrigem().equals(verticeParaRemover) || aresta.getDestino().equals(verticeParaRemover)) {
                arestasParaRemover.guardeUmItemNoFinal(aresta);
            }
        }
        for (Aresta<X> aresta : arestasParaRemover) {
            arestas.removaItemIndicado(aresta);
        }

        // Remove o vértice da lista de vértices
        vertices.removaItemIndicado(verticeParaRemover);
    }

    private Vertice<X> encontrarVertice(X info) {
        try {
            for (Vertice<X> vertice : vertices) {
                if (vertice.getInfo().equals(info)) {
                    return vertice;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public String toString() {
        return "Grafo [Vertices: " + vertices + ", Arestas: " + arestas + "]";
    }
}
