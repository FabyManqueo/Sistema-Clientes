package servicio;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ArchivoServicio {
	
public void cargarDatos() throws IOException{

		//Leer el archivo
		//FileReader leerArchivo = new FileReader(fileName);
	     FileReader leerArchivo = new FileReader("src/miCarpetaBruja/clientes.txt");
		BufferedReader memoriaLectura = new BufferedReader(leerArchivo);
		
		//Lee solo la primera linea del archvo
		/*System.out.println("El contenido del archivo es:");
		System.out.println(memoriaLectura.readLine());
		*/
		
		//Lee todo el archivo
		String contenidoArchivo = memoriaLectura.readLine();
		while(contenidoArchivo != null) {
			System.out.println(contenidoArchivo);
			contenidoArchivo = memoriaLectura.readLine();
		}
		memoriaLectura.close();
    }

}
