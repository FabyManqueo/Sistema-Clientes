package servicio;

import java.io.BufferedWriter;


import java.io.FileWriter;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import modelo.Cliente;
import servicio.ClienteServicio;


public class ExportadorTxt {
	
	private List<Cliente> listaCliente=new ArrayList<Cliente>();
	
	public ExportadorTxt() {
		//ArrayList<String> listaCliente = new ArrayList<>();
		//listaCliente = new ArrayList<>();
		this.listaCliente = listaCliente;
	}
	
	
	//geterr
	public List<Cliente> getListaCliente() {
		return listaCliente;
	}

    //setter
	public void setListaCliente(List<Cliente> listaCliente) {
		this.listaCliente = listaCliente;
	}

   //metodo de negocio
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
				//File archivo = new File(carpeta,"clientes.txt");
				File archivo = new File(carpeta,fileName+".txt");
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
					
					
					for (Iterator iterator = (clienteServicio.getListaCliente()).iterator(); iterator.hasNext();) {
						Cliente cliente =(Cliente) iterator.next();
						memoriaArchivo.write("Rut cliente: "+cliente.getRunCliente().toString());
						memoriaArchivo.newLine();
						memoriaArchivo.write("Nombre cliente: "+cliente.getRunCliente().toString());
						memoriaArchivo.newLine();
						memoriaArchivo.write("Apellido cliente: "+cliente.getApellidoCliente().toString());
						memoriaArchivo.newLine();
						memoriaArchivo.write("Años de cliente: "+cliente.getAniosCliente().toString());
						memoriaArchivo.newLine();
						memoriaArchivo.write("Categoria: "+cliente.getCategoriaCliente().toString());
						memoriaArchivo.newLine();
						}
						System.out.println("Datos del cliente exportados correctamente en formato txt.");
						
												
				         memoriaArchivo.close();
				
			}catch(NumberFormatException ex){
				throw new NumberFormatException(ex.getMessage());
			}
		}
			
	
}

