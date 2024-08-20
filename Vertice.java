public class Vertice<T> implements Cloneable {
    private T dado;

    public Vertice(T dado) {
        this.dado = dado;
    }

    // Getter e Setter para o dado
    public T getDado() {
        return dado;
    }

    public void setDado(T dado) {
        this.dado = dado;
    }

    // Método toString para exibir o vértice
    @Override
    public String toString() {
        return "Vertice{" +
                "dado=" + dado +
                '}';
    }

    // Método equals para comparar dois vértices
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vertice<?> vertice = (Vertice<?>) o;
        return dado.equals(vertice.dado);
    }

    // Método hashCode para gerar o código hash do vértice
    @Override
    public int hashCode() {
        return dado.hashCode();
    }

    // Método clone para criar uma cópia do vértice
    @Override
    public Vertice<T> clone() {
        try {
            return (Vertice<T>) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(); // Não deveria acontecer, já que implementamos Cloneable
        }
    }
}
