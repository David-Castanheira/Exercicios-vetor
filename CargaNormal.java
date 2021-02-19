public class CargaNormal extends Carga {
  
  public CargaNormal(Double peso) {
    super(peso);
  }

  @Override
  public Double getPeso() {
    return peso * 1.05;
  }
}
