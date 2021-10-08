package tierraMedia;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Archivo a = new Archivo();
		LinkedList<Usuario> usuarios = new LinkedList<Usuario>();
		usuarios = a.leerusuario();
		
		LinkedList<Atraccion> atracciones = new LinkedList<Atraccion>();
		atracciones = a.leeratracciones();

		for (Usuario u : usuarios) {

			System.out.println(u.getnombre());

		}
		
		System.out.println(atracciones.size());
		
	}
}