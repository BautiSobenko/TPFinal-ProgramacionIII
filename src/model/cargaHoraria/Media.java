package model.cargaHoraria;

public class Media extends CargaHoraria{
  public Media() {
    super("MEDIA");
  }

  public float match1() {
    return 1F;
  }

  public float match2() {
    return -0.5F;
  }

  public float match3() {
    return -1F;
  }

  float calculaPuntaje(CargaHoraria cargaHoraria, int peso) {
    return cargaHoraria.match1() * peso;
  }
}
