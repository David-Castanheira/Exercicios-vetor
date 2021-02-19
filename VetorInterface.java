interface VetorInterface {
  public void adicionar(Carga elemento);
  public void adicionar(int posicao, Carga elemento);
  public void remover(int posicao);
  public Carga buscar(int posicao);
  public int buscar(Carga elemento);
  public int tamanho();
}
