public class Vertice<X> {
    private X info;

    public Vertice(X info) {
        this.info = info;
    }

    public X getInfo() {
        return info;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vertice<?> vertice = (Vertice<?>) o;
        return info.equals(vertice.info);
    }

    @Override
    public int hashCode() {
        return info.hashCode();
    }

    @Override
    public String toString() {
        return "{"  + info + '}';
    }
}

/* 
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
        return "{"  + info + '}';
    }
}
*/