public class Aviao {
  public Double pesoMaximoSuportado;
  public Vetor cargas;

  public Aviao(Double pesoMaximoSuportado) {
    this.pesoMaximoSuportado = pesoMaximoSuportado;
    this.cargas = new Vetor(10);
  }

  public Double pesoAtual() {
    Double pesoAtual = 0.0;

    for(int i = 0; i < cargas.tamanho(); i++)
      pesoAtual += cargas.buscar(i).getPeso();

    return pesoAtual;
  }

  public void adicionarCarga(Carga carga) {
    if((carga.getPeso() + pesoAtual()) > pesoMaximoSuportado)
      throw new RuntimeException("O avião não suporta esta carga");

    cargas.adicionar(carga);  
  }
}
