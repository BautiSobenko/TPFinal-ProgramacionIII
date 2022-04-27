package model.ticket.cargaHoraria;

public class Extendida extends CargaHoraria{
  public Extendida() {
    super("EXTENDIDA");
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

  public float calculaPuntaje(CargaHoraria cargaHoraria) {
    return cargaHoraria.match3() * this.getPeso();
  }
}
