public class Vertice<X> {
    private X info;

    public Vertice(X info) {
        this.info = info;
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
        Vertice<?> vertice = (Vertice<?>) obj;
        return info.equals(vertice.info);
    }

    @Override
    public int hashCode() {
        return info.hashCode();
    }

    @Override
    public String toString() {
        return "Vertice{" + "info=" + info + '}';
    }
}
