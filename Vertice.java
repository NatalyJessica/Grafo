public class Vertice<X> implements Cloneable 
{
    private X info;

    public Vertice(X info) {
        this.info = info;
    }

    // Getter e Setter para o dado
    public X getInfo() {
        return info;
    }

    public void setInfo(X info) {
        this.info = info;
    }

    // Método toString para exibir o vértice
    @Override
    public String toString() {
        return "Vertice{" +
                "info =" + info +
                '}';
    }

    // Método equals para comparar dois vértices
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Vertice<X> vertice = (Vertice<X>) obj;
        return info.equals(info);
    }

    // Método hashCode para gerar o código hash do vértice
    @Override
    public int hashCode() {
        return info.hashCode();
    }

    // Método clone para criar uma cópia do vértice
    @Override
    public Vertice<X> clone() {
        try {
            return (Vertice<X>) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(); // Não deveria acontecer, já que implementamos Cloneable
        }
    }
}
