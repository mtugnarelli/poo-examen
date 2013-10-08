
public class Examen {

	private int puntos = 1;
	
	private double nota = 0.0;
	
	private int puntosCorregidos = 0;
	
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
	
	/**
	 * post: devuelve el valor de la nota correspondiente al Examen a partir de las
	 *       correcciones hechas sobre el mismo.
	 */
	public double calcularNota() {
		
		return nota;
	}
	
	/**
	 * pre : correccion está en el rango [0,100] y representa el porcentaje de corrección 
	 *       que tiene un punto del examen que aún no ha sido registrado, por ejemplo:
	 *       
	 *        0 : MAL
	 *       50 : REGULAR
	 *       100: EXCELENTE
	 *       
	 * post: acumula la corrección de un nuevo punto.
	 */
	public void corregirPunto(double correccion) {
		
		double valorDeCadaPunto = 10 / puntos;
		
		nota = nota + valorDeCadaPunto * (correccion / 100);
		
		puntosCorregidos = puntosCorregidos + 1;
	}
	
	/**
	 * post: devuelve la cantidad de puntos que tiene el Examen.
	 */
	public int contarPuntos() {
		
		return puntos;
	}
	
	/**
	 * post: devuelve la cantidad de puntos del Examen que ya han sido corregidos.
	 */
	public int contarPuntosCorregidos() {
		
		return puntosCorregidos;
	}
}
