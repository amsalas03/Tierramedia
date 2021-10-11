package tierraMedia;

public class PromocionAbsoluta extends Promociones{
double costoFinal;
	public PromocionAbsoluta(String nombre, String tipo, int cantAtracciones, String[] atracciones, double costoFinal) {
		super(nombre, tipo, cantAtracciones, atracciones);
		this.costoFinal=costoFinal;
	}
	
	public double getCostoFinal() {
		return costoFinal;
	}
	

}
