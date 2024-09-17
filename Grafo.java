
public class Grafo<X> {
    //variaveis
    private ListaSimplesDesordenada<Vertice<X>> vertices;
    private ListaSimplesDesordenada<Aresta<X>> arestas;

    //construtor
    public Grafo() {
        vertices = new ListaSimplesDesordenada<>();
        arestas = new ListaSimplesDesordenada<>();
    }

    public void adicionarVertice(X info) throws Exception {
        // Verifica se a informação está presente
        if (info == null) {
            throw new Exception("Informação ausente");
        }
    
        // Cria o novo vértice
        Vertice<X> novoVertice = new Vertice<>(info);
    
        // Verifica se o vértice já existe
        if (vertices.tem(novoVertice)) {
            throw new Exception("Vertice já existe");

        }
    
        // Adiciona o novo vértice à lista
        vertices.guardeUmItemNoInicio(novoVertice);
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

    // Método para remover um vértice
    public void removerVertice(X info) throws Exception {
        // Verifica se a informação está presente
        if (info == null) {
            throw new Exception("Informação ausente");
        }

        // Busca o vértice para verificar se ele existe
        Vertice<X> verticeRemover = buscarVertice(info);

        // Verifica se o vértice foi encontrado
        if (verticeRemover == null) {
            throw new Exception("Vértice não encontrado");
        }

        // Remove todas as arestas que estão associadas a este vértice (origem ou destino)
        for (Aresta<X> aresta : arestas) {
            if (aresta.getOrigem().equals(verticeRemover) || aresta.getDestino().equals(verticeRemover)) {
                arestas.removaItemIndicado(aresta); 
            }
        }

        // Remove o vértice da lista de vértices
        vertices.removaItemIndicado(verticeRemover);
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

    // Método para buscar uma aresta entre dois vértices
    public Aresta<X> buscarAresta(X infoOrigem, X infoDestino) throws Exception {
        // Verifica se as informações necessárias estão presentes
        if (infoOrigem == null || infoDestino == null) {
            throw new Exception("Informações de origem e destino não podem ser nulas");
        }

        // Busca os vértices de origem e destino
        Vertice<X> origem = buscarVertice(infoOrigem);
        Vertice<X> destino = buscarVertice(infoDestino);

        // Verifica se os vértices foram encontrados
        if (origem == null || destino == null) {
            throw new Exception("Vértice de origem ou destino não encontrado");
        }

        // Cria uma nova aresta para comparação (não importa o "info" no momento da busca)
        Aresta<X> arestaBuscada = new Aresta<>(origem, destino, null);

        // Itera sobre a lista de arestas para encontrar a aresta que conecta os dois vértices
        for (Aresta<X> aresta : arestas) {
            if (aresta.equals(arestaBuscada)) {
                return aresta; // Retorna a aresta encontrada
            }
        }

        // Lança exceção se a aresta não for encontrada
        throw new Exception("Aresta não encontrada entre os vértices fornecidos");
    }

    // Método para remover uma aresta entre dois vértices
    public void removerAresta(X infoOrigem, X infoDestino) throws Exception {
        // Verifica se as informações necessárias estão presentes
        if (infoOrigem == null || infoDestino == null) {
            throw new Exception("Informações de origem e destino não podem ser nulas");
        }

        // Busca os vértices de origem e destino
        Vertice<X> origem = buscarVertice(infoOrigem);
        Vertice<X> destino = buscarVertice(infoDestino);

        // Verifica se os vértices foram encontrados
        if (origem == null || destino == null) {
            throw new Exception("Vértice de origem ou destino não encontrado");
        }

        // Itera sobre a lista de arestas para encontrar a aresta correspondente
        Aresta<X> arestaRemover = null;
        for (Aresta<X> aresta : arestas) {
            if (aresta.getOrigem().equals(origem) && aresta.getDestino().equals(destino)) {
                arestaRemover = aresta;
                break; // Interrompe a iteração assim que a aresta é encontrada
            }
        }

        // Verifica se a aresta foi encontrada
        if (arestaRemover == null) {
            throw new Exception("Aresta não encontrada entre os vértices fornecidos");
        }

        // Remove a aresta da lista
        arestas.removaItemIndicado(arestaRemover);
    }

    @Override
    public String toString() {
        return "Grafo {\n" +
               "  Vértices: " + vertices + "\n" +
               "  Arestas: " + arestas + "\n" +
               "}";
    }
    
}
