package model.ticket.Locacion;

public class HomeOfiice extends Locacion{
  public HomeOfiice() {
    super("HOME_OFFICE");
  }

  public float match1() {
    return 1F;
  }

  public float match2() {
    return -1F;
  }

  public float match3() {
    return 1F;
  }

  public float calculaPuntaje(Locacion locacion) {
    return locacion.match1() * this.getPeso();
  }
}