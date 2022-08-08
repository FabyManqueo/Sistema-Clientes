package servicio;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class ArchivoServicio {
	private String linea=",";
    private String partes[]=null;
    
public void cargarDatos(String fileName1) throws IOException{
     	
	   FileReader leerArchivo = new FileReader(fileName1);
		BufferedReader memoriaLectura = new BufferedReader(leerArchivo);
		
		String contenidoArchivo = memoriaLectura.readLine();
		while(contenidoArchivo != null) {
			partes =contenidoArchivo.split(linea);
			imprimirLinea();
			System.out.println();
			contenidoArchivo = memoriaLectura.readLine();
		}
		memoriaLectura.close();
		linea = null;
		partes=null;
     
    }
  public void imprimirLinea() {
	  for(int i=0;i<partes.length;i++) {
		  System.out.print(partes[i]+"|");
	  }
  }

}
