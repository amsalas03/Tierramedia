package tierraMedia;

import java.io.*;
import java.util.*;

public class Archivo {

	public LinkedList leerusuario() {
		LinkedList <Usuario>listausuarios = new LinkedList<Usuario>();
		try {
			FileReader input = new FileReader("C:/Users/SMI/eclipse-workspace/Tierra Media/Usuarios.txt");
			BufferedReader bufInput = new BufferedReader(input);

			String line;

			line = bufInput.readLine();

			while (line != null) {
				String[] datos;

				datos = line.split(",");
				Usuario u = new Usuario(datos[0],Integer.parseInt(datos[1]),Integer.parseInt(datos[2]));
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
		LinkedList <Atraccion>lista = new LinkedList<Atraccion>();
		try {
			FileReader input = new FileReader("C:/Users/SMI/eclipse-workspace/Tierra Media/Atracciones.txt");
			BufferedReader bufInput = new BufferedReader(input);

			String line;

			line = bufInput.readLine();

			while (line != null) {
				String[] datos;

				datos = line.split(".");
				Atraccion u = new Atraccion(datos[0],Integer.parseInt(datos[1]),Integer.parseInt(datos[2]),Integer.parseInt(datos[3]));
				lista.add(u);

				line = bufInput.readLine();
			}
			bufInput.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return lista;
	}
}
