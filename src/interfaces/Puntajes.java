package interfaces;



public interface Puntajes {
  /**
   * Define metodo que devuelve el valor del resultado de
   * cada DatoDeEmpleo del empleado en relacion con cada
   * DatoDeEmpleo del empleador. (Se produce un matcheo de datos)
   * Esto se se aplica tanto para match1, match2, match3
   * @return Valor de coincidencia, float
   */
  float match1();
  float match2();
  float match3();
}
