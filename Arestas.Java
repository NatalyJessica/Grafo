public class Aresta<X> implements Cloneable {
    private Vertice<X> origem;
    private Vertice<X> destino;
    private X info;

    public Aresta(Vertice<X> origem, Vertice<X> destino, X info) {
        this.origem = origem;
        this.destino = destino;
        this.info = info;
    }

    // Getters e Setters
    public Vertice<X> getOrigem() {
        return origem;
    }

    public void setOrigem(Vertice<X> origem) {
        this.origem = origem;
    }

    public Vertice<X> getDestino() {
        return destino;
    }

    public void setDestino(Vertice<X> destino) {
        this.destino = destino;
    }

    public X getInfo() {
        return info;
    }

    public void setInfo(X info) {
        this.info = info;
    }

    // Método toString para exibir a aresta
    @Override
    public String toString() {
        return "Aresta{" +
                "origem = " + origem +
                ", destino = " + destino +
                ", info = " + info+
                '}';
    }

    // Método equals para comparar duas arestas
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Aresta<X> aresta = (Aresta<X>) obj;
        return origem.equals(aresta.origem) &&
                destino.equals(aresta.destino) &&
                info.equals(aresta.info;
    }

    // Método hashCode para gerar o código hash da aresta
    @Override
    public int hashCode() {
        int result = origem.hashCode();
        result = 13 * result + destino.hashCode();
        result = 13 * result + info.hashCode();
        return result;
    }

    // Método clone para criar uma cópia da aresta
    @Override
    public Aresta<X> clone() {
        try {
            return (Aresta<X>) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(); // Não deveria acontecer, já que implementamos Cloneable
        }
    }
}
