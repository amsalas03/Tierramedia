package tierraMedia;

import java.io.*;
import java.util.*;

public class Archivo {

	public LinkedList leerusuario() {
		LinkedList<Usuario> listausuarios = new LinkedList<Usuario>();
		try {
			FileReader input = new FileReader("Usuarios.txt");
			BufferedReader bufInput = new BufferedReader(input);

			String line;

			line = bufInput.readLine();

			while (line != null) {
				String[] datos;

				datos = line.split(",");
				Usuario u = new Usuario(datos[0], Integer.parseInt(datos[1]), Integer.parseInt(datos[2]));
				listausuarios.add(u);

				line = bufInput.readLine();
			}
			bufInput.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return listausuarios;
	}

	public LinkedList leeratracciones() {
		LinkedList<Atraccion> lista = new LinkedList<Atraccion>();
		try {
			FileReader input = new FileReader("Atracciones.txt");
			BufferedReader bufInput = new BufferedReader(input);

			String line = bufInput.readLine();

			while (line != null) {
				String[] dato;
				dato = line.split("_");

				Atraccion at = new Atraccion(dato[0], Double.parseDouble(dato[1]), Double.parseDouble(dato[2]),
						Integer.parseInt(dato[3]));
				lista.add(at);

				line = bufInput.readLine();
			}
			bufInput.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return lista;
	}

	public LinkedList leerpromociones() {
		LinkedList<Promociones> lista = new LinkedList<Promociones>();
		try {
			FileReader input = new FileReader("Promociones.txt");
			BufferedReader bufInput = new BufferedReader(input);

			String line = bufInput.readLine();

			while (line != null) {
				String[] data;
				data = line.split(",");
				String[] atracciones = null;
				
				if(data[3]=="porcentual") {
					
					for(int i=0; i<Integer.parseInt(data[3]); i++) {
						atracciones[i]=data[i+3];
					}
					
					PromocionPorcentual pp = new PromocionPorcentual(data[0], data[1],Integer.parseInt(data[2]),atracciones, Double.parseDouble(data[3]));
					lista.add(pp);
				} 
				else {
					if(data[3]=="absoluta") {
						
					}
				}
				
				/*Atraccion at = new Atraccion(dato[0], Double.parseDouble(dato[1]), Double.parseDouble(dato[2]),
						Integer.parseInt(dato[3]));*/
				

				line = bufInput.readLine();
			}
			bufInput.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return lista;
	}
}
