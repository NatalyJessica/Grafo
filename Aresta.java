public class Aresta<X> {
    private Vertice<X> origem;
    private Vertice<X> destino;
    private X info;

    public Aresta(Vertice<X> origem, Vertice<X> destino, X info) {
        this.origem = origem;
        this.destino = destino;
        this.info = info;
    }

    public Vertice<X> getOrigem() {
        return origem;
    }

    public Vertice<X> getDestino() {
        return destino;
    }

    public X getInfo() {
        return info;
    }

    public void setInfo(X info) {
        this.info = info;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Aresta<?> aresta = (Aresta<?>) obj;
        return origem.equals(aresta.origem) && destino.equals(aresta.destino) && info.equals(aresta.info);
    }

    @Override
    public int hashCode() {
        return origem.hashCode() ^ destino.hashCode() ^ info.hashCode();
    }

    @Override
    public String toString() {
        return "Aresta{" + "origem=" + origem + ", destino=" + destino + ", info=" + info + '}';
    }
}
