public class Main {
  public static void main(String[] args) {
    Aviao av1 = new Aviao(3500.00);

    Carga c1 = new CargaNormal(3000.00); 
    Carga c2 = new CargaNormal(200.00); 
    Carga c3 = new CargaEmbalada(3000.00); 
    Carga c4 = new CargaEmbalada(150.00); 
    
    av1.adicionarCarga(c1);
    System.out.println(av1.pesoAtual());
    av1.adicionarCarga(c2);
    System.out.println(av1.pesoAtual());
    av1.adicionarCarga(c3);
    System.out.println(av1.pesoAtual());  
    av1.adicionarCarga(c4);
    System.out.println(av1.pesoAtual()); 
    
  }
}
