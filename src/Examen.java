
public class Examen {

	private int puntos = 1;
	
	/**
	 * pre : puntosTotales es mayo a cero e indica la cantidad de puntos (items) con los
	 *       que contará el Examen.
	 * post: el Examen cuenta con tantos puntos (items) como puntosTotales, ninguno de los cuales está
	 *       corregido aún.
	 */
	public Examen(int puntosTotales) {
		
		if (puntosTotales > 0) {
			
			puntos = puntosTotales;
		}
	}
}
