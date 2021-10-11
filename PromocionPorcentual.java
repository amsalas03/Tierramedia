package tierraMedia;

import java.util.LinkedList;

public class PromocionPorcentual extends Promociones{
	double porcentaje;

	public PromocionPorcentual(String nombre, String tipo, int cantAtracciones, String[] atracciones, double porcentaje) {
		super(nombre, tipo, cantAtracciones, atracciones);

		this.porcentaje=porcentaje;
	}
	
	
	public double CalcularCostoFinal(LinkedList<Atraccion> atraccion) {
		
		return costo=super.CalcularCostoFinal(atraccion)*porcentaje;
	}

	
	

}
