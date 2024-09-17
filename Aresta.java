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
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Aresta<?> aresta = (Aresta<?>) obj;
        return this.origem.equals(aresta.origem) && this.destino.equals(aresta.destino);
    }
    

    @Override
    public int hashCode() {
        // Calcula hash code considerando que info pode ser nulo
        int result = origem.hashCode();
        result = 31 * result + destino.hashCode();
        result = 31 * result + (info != null ? info.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Aresta{" + "origem=" + origem + ", destino=" + destino + ", info=" + info + '}';
    }
}


/*public class Aresta<X> {
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
        
        // Checa se as informações são iguais, considerando que info pode ser nulo
        boolean infoEquals = (info == null && aresta.info == null) || (info != null && info.equals(aresta.info));
        
        return origem.equals(aresta.origem) && destino.equals(aresta.destino) && infoEquals;
    }
    
    @Override
    public int hashCode() {
        // Calcula hash code considerando que info pode ser nulo
        int result = origem.hashCode();
        result = 31 * result + destino.hashCode();
        result = 31 * result + (info != null ? info.hashCode() : 0);
        return result;
}
    

  
}
*/