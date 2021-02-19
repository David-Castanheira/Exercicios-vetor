public class CargaEmbalada extends Carga {
  
  public CargaEmbalada(Double peso) {
    super(peso);
  }

  @Override
  public Double getPeso() {
    return peso * 1.2;
  }
}
