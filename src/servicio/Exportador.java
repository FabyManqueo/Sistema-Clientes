package servicio;
import java.util.List;

import modelo.Cliente;
public abstract class Exportador {
	
	private String fileName;
	private List<Cliente> listaCliente;
	
	
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public List<Cliente> getListaCliente() {
		return listaCliente;
	}
	public void setListaCliente(List<Cliente> listaCliente) {
		this.listaCliente = listaCliente;
	}
	
	

}
