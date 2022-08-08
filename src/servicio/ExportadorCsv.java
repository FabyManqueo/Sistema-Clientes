package servicio;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import modelo.Cliente;


public class ExportadorCsv extends Exportador {
	
	private String fileName;
	//private List<Cliente> listaCliente;
	
	ArrayList<Exportador>listaExportar=new ArrayList<>();
	
	public void exportar(ClienteServicio clienteServicio,String fileName) throws IOException {
	
		//crear carpeta
		//File carpeta =new File("src/miCarpetaPersonal");
		File carpeta =new File("C:\\Users\\ing_f\\OneDrive\\Escritorio");
		if (!carpeta.exists()) {
			try {
				carpeta.mkdirs();
			}catch (Exception e) {
				e.printStackTrace();
			}
			
		}
         
		//crear archivos
		//File archivo = new File(carpeta,"clientes.csv");
		File archivo = new File(carpeta,fileName+".csv");
		if (!archivo.exists()) {
			try {
				archivo.createNewFile();
			}catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		try {
			
				FileWriter escribeArchivo = new FileWriter(archivo);
				BufferedWriter memoriaArchivo = new BufferedWriter(escribeArchivo);
				for (Iterator iterator = ((clienteServicio.getListaCliente())).iterator(); iterator.hasNext();) {
					Cliente cliente =(Cliente) iterator.next();
					memoriaArchivo.write(cliente.getRunCliente()+","+cliente.getNombreCliente()+","+cliente.getApellidoCliente()+
							","+cliente.getApellidoCliente()+","+cliente.getAniosCliente()+","+cliente.getCategoriaCliente());
					memoriaArchivo.newLine();
				}
				System.out.println("Datos del cliente exportados correctamente en formato csv."); 
			    memoriaArchivo.close();
				
				
		}catch(NumberFormatException ex){
			throw new NumberFormatException(ex.getMessage());
		}
	}
		

}
