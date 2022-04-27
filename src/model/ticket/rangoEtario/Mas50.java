package model.ticket.rangoEtario;

public class Mas50 extends RangoEtario{
  public Mas50(){
    super("MAS_50");
  }

  public float match1() {
    return -1F;
  }

  public float match2() {
    return -0.5F;
  }

  public float match3() {
    return 1F;
  }

  public float calculaPuntaje(RangoEtario rango) {
    return rango.match3() * this.getPeso();
  }
}