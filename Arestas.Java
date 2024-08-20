public class Aresta<T> implements Cloneable {
    private Vertice<?> origem;
    private Vertice<?> destino;
    private T dado;

    public Aresta(Vertice<?> origem, Vertice<?> destino, T dado) {
        this.origem = origem;
        this.destino = destino;
        this.dado = dado;
    }

    // Getters e Setters
    public Vertice<?> getOrigem() {
        return origem;
    }

    public void setOrigem(Vertice<?> origem) {
        this.origem = origem;
    }

    public Vertice<?> getDestino() {
        return destino;
    }

    public void setDestino(Vertice<?> destino) {
        this.destino = destino;
    }

    public T getDado() {
        return dado;
    }

    public void setDado(T dado) {
        this.dado = dado;
    }

    // Método toString para exibir a aresta
    @Override
    public String toString() {
        return "Aresta{" +
                "origem=" + origem +
                ", destino=" + destino +
                ", dado=" + dado +
                '}';
    }

    // Método equals para comparar duas arestas
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aresta<?> aresta = (Aresta<?>) o;
        return origem.equals(aresta.origem) &&
                destino.equals(aresta.destino) &&
                dado.equals(aresta.dado);
    }

    // Método hashCode para gerar o código hash da aresta
    @Override
    public int hashCode() {
        int result = origem.hashCode();
        result = 31 * result + destino.hashCode();
        result = 31 * result + dado.hashCode();
        return result;
    }

    // Método clone para criar uma cópia da aresta
    @Override
    public Aresta<T> clone() {
        try {
            return (Aresta<T>) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(); // Não deveria acontecer, já que implementamos Cloneable
        }
    }
}
