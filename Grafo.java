
public class Grafo<X> {
    //variaveis
    private ListaSimplesDesordenada<Vertice<X>> vertices;
    private ListaSimplesDesordenada<Aresta<X>> arestas;

    //construtor
    public Grafo() {
        vertices = new ListaSimplesDesordenada<>();
        arestas = new ListaSimplesDesordenada<>();
    }

    //metodo adionar vertece
    public void adicionarVertice(X info) throws Exception{
        //verificação de informação
        if(info == null){
            throw new Exception("Informação ausente");
        }
        //armazena informação na variavel
        Vertice<X> vertice = new Vertice<>(info);
        //guardar vertice na lista ussando metodo da classe lista
        vertices.guardeUmItemNoInicio(vertice);
    }


    //metodo buscar vertice
    public Vertice<X> buscarVertice(X info) throws Exception 
    {
        //verificando se existe informação
        if (info == null) {
            throw new Exception("Informação não pode ser nula");
        }
        //inforamção que vat ser buscada
        Vertice<X> buscaVert = new Vertice<>(info);
    
        //buscando info atraves do metodo da classe lista
        Vertice<X> verticeEncontrada = vertices.buscarItem(buscaVert);
        
        //lança exesseção caso não ache
        if (verticeEncontrada == null) {
            throw new Exception("Vértice não encontrado");
        }
        
        //retornar vertice encontrada
        return verticeEncontrada;
    }
    
    
    
    //metodo para adicioar aresta
    public void adicionarAresta(X infoOrigem, X infoDestino, X info) throws Exception {
        // Verifica se as informações 
        // Verifica se as informações 
if (infoOrigem == null || infoDestino == null || info == null) {
    throw new Exception("Alguma informação está ausente");
}

// Busca  vertice de origem e destino
Vertice<X> origem = buscarVertice(infoOrigem);
Vertice<X> destino = buscarVertice(infoDestino);

// Cria a aresta e adiciona na lista de arestas
Aresta<X> aresta = new Aresta<>(origem, destino, info);

// Verifica se a aresta já existe
if (arestas.tem(aresta)) {
    throw new Exception("Aresta já existe");
}

// Adiciona a aresta à lista de arestas
arestas.guardeUmItemNoInicio(aresta);

    }

    //remover aresta
    public void removerAresta(X infoOrigem, X infoDestino) throws Exception {
        // Verifica se as informações necessárias estão presentes
        if (infoOrigem == null || infoDestino == null) {
            throw new Exception("Informações de origem e destino não podem ser nulas");
        }
    
        // Busca os vértices de origem e destino
        Vertice<X> origem = buscarVertice(infoOrigem);
        Vertice<X> destino = buscarVertice(infoDestino);
    
        // Cria uma nova aresta com as informações fornecidas
        Aresta<X> arestaParaRemover = new Aresta<>(origem, destino, null);
    
        // Itera sobre a lista de arestas para encontrar a aresta completa
        Aresta<X> arestaEncontrada = null;
        for (Aresta<X> aresta : arestas) {
            if (aresta.equals(arestaParaRemover)) {
                arestaEncontrada = aresta;
                break;
            }
        }
    
        // Lança exceção se a aresta não for encontrada
        if (arestaEncontrada == null) {
            throw new Exception("Aresta não encontrada");
        }
    
        // Remove a aresta encontrada
        arestas.removaItemIndicado(arestaEncontrada);
    }
    
    
    

    @Override
    public String toString() {
        return "Grafo {\n" +
               "  Vértices: " + vertices + "\n" +
               "  Arestas: " + arestas + "\n" +
               "}";
    }
    
}
