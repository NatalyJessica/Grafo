public class Grafo<V, A> {
    private ListaSimplesDesordenada<Vertice<X>> vertices;
    private ListaSimplesDesordenada<Aresta<X>> arestas;

    public Grafo() {
        this.vertices = new ListaSimplesDesordenada<>();
        this.arestas = new ListaSimplesDesordenada<>();
    }

    public void adicionarVertice(X info) throws Exception {
        Vertice<X> vertice = new Vertice<>(info);
        if (!vertices.tem(vertice))
            vertices.guardeUmItemNoFinal(vertice);
    }

    public void adicionarAresta(X origemInfo, X destinoInfo, X info) throws Exception {
        Vertice<X> origem = new Vertice<>(origemInfo);
        Vertice<X> destino = new Vertice<>(destinoInfo);
        if (!vertices.tem(origem) || !vertices.tem(destino))
            throw new Exception("Vértices não encontrados");

        Aresta<X> aresta = new Aresta<>(origem, destino, info);
        if (!arestas.tem(aresta))
            arestas.guardeUmItemNoFinal(aresta);
    }

    public void removerVertice(X info) throws Exception {
        Vertice<V> vertice = new Vertice<>(info);
        if (!vertices.tem(vertice))
            throw new Exception("Vértice não encontrado");

        vertices.removaItemIndicado(vertice);

        ListaSimplesDesordenada<Aresta<X>> arestasARemover = new ListaSimplesDesordenada<>();
        for (int i = 0; i < arestas.getQuantidade(); i++) {
            Aresta<X> aresta = arestas.recupereItemDoInicio();
            if (aresta.getOrigem().equals(vertice) || aresta.getDestino().equals(vertice)) {
                arestasARemover.guardeUmItemNoFinal(aresta);
            }
        }

        for (int i = 0; i < arestasARemover.getQuantidade(); i++) {
            arestas.removaItemIndicado(arestasARemover.recupereItemDoInicio());
        }
    }

    public void removerAresta(X origemInfo, X destinoInfo, X info) throws Exception {
        Vertice<X> origem = new Vertice<>(origemInfo);
        Vertice<X> destino = new Vertice<>(destinoInfo);
        Aresta<X> aresta = new Aresta<>(origem, destino, info);
        arestas.removaItemIndicado(aresta);
    }

    public boolean temVertice(X info) throws Exception {
        Vertice<V> vertice = new Vertice<>(info);
        return vertices.tem(vertice);
    }

    public boolean temAresta(X origemInfo, X destinoInfo, X info) throws Exception {
        Vertice<X> origem = new Vertice<>(origemInfo);
        Vertice<X> destino = new Vertice<>(destinoInfo);
        Aresta<X> aresta = new Aresta<>(origem, destino, info);
        return arestas.tem(aresta);
    }


    @Override
    public String toString() {
        return "Grafo [Vertices: " + vertices + ", Arestas: " + arestas + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Grafo<X> grafo = (Grafo<X>) obj;
        return vertices.equals(grafo.vertices) && arestas.equals(grafo.arestas);
    }

    @Override
    public int hashCode() {
        return vertices.hashCode() ^ arestas.hashCode();
    }
}
