package servicio;
import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;
import modelo.Cliente;


public class ClienteServicio extends Cliente{
	
	private List<Cliente> listaCliente = new ArrayList<Cliente>();
	
	
	//constructor
	public ClienteServicio() {
		
	}
	
	public ClienteServicio(String runCliente, String nombreCliente, String apellidoCliente,
			String aniosCliente, String categoriaCliente, List<Cliente>listaCliente) {
		super(runCliente,nombreCliente, apellidoCliente,aniosCliente,categoriaCliente);
		this.listaCliente = listaCliente;
	}

	  //getter	
		public List<Cliente> getListaCliente() {
			return listaCliente;
		}
	    //setter
		public void setListaCliente(List<Cliente> listaCliente) {
			this.listaCliente = listaCliente;
		}
		
	private String comparacion;
	private String opcion;
	private String runEditar;
	private int aux;
	private boolean runEncontrado;
	private String opcionEditar;
	
	Scanner teclado = new Scanner(System.in);
	Scanner teclado2 = new Scanner(System.in);
	Scanner teclado3 = new Scanner(System.in);
	
	
	//metodo de negocios
	public void listarClientes() {
		
		for (int i = 0; i < listaCliente.size(); i++) {
			
			System.out.println(listaCliente.get(i));
		}
	}
	
	
		public void agregarCliente() {
			//Scanner teclado = new Scanner(System.in);
			Cliente cliente = new Cliente();
			
			try {
				System.out.print("Ingrese run del cliente: \n");
				cliente.setRunCliente(teclado.nextLine());
				System.out.print("Ingrese nombre del cliente: \n");
				cliente.setNombreCliente(teclado.nextLine());
				System.out.print("Ingrese apellido del cliente: \n");
				cliente.setApellidoCliente(teclado.nextLine());
				System.out.print("Ingrese años como cliente: \n");
				cliente.setAniosCliente(teclado.nextLine());
				cliente.setCategoriaCliente("Activo");
				listaCliente.add(cliente);
							
			}catch(Exception e) {
				System.out.print("error \n");
			}
			
		}
	
		public void editarCliente() {
			
			try {
				
			
				System.out.println("--------------------------------------------");
				System.out.println("Seleccione que desea hacer: ");
				System.out.println("1->Cambiar el estado del cliente: ");
				System.out.println("2->Editar los datos ingresados del cliente: ");
				opcion = teclado.nextLine();
			
				if(opcion.equals("1")) {
					
					System.out.println("Ingrese RUN del cliente a editar: ");
					runEditar = teclado2.nextLine();
								
					for (int i = 0; i < listaCliente.size(); i++) {
					
						Cliente c = listaCliente.get(i);
				
						if(c.getRunCliente().equals(runEditar)) {
							aux = i;
							runEncontrado = true;
							break;
						}else {
							runEncontrado = false;
						}
					}
				
					if(runEncontrado== true) {
						System.out.print("\n");
						System.out.println("El estado actual es: "+listaCliente.get(aux).getCategoriaCliente()+"\n");
								//clienteServicio.getListaCliente().get(aux).getCategoriaCliente()+"\n");
						System.out.print("\n");
						System.out.println("1->Si desea cambiar el estado del cliente a inactivo: ");
						System.out.println("2->Si desea cambiar el estado del cliente a activo: ");
						opcion = teclado.nextLine();
				
						if(opcion.equals("1")) {
							//clienteServicio.getListaCliente().get(aux).setCategoriaCliente("Inactivo");
							listaCliente.get(aux).setCategoriaCliente("Inactivo");
							System.out.println("El estado del cliente ha sido cambiado a Inactivo");
						}else if(opcion.equals("2")) {
							//clienteServicio.getListaCliente().get(aux).setCategoriaCliente("Activo");
							listaCliente.get(aux).setCategoriaCliente("Activo");
							System.out.println("El estado del cliente ha sido cambiado a Activo");
						}else {
							System.out.println("Opcion ingresada no valida");
						}
					}else {
						System.out.println("El rut ingresado no es valido");
					}
				
				
				
				}else if(opcion.equals("2")) {
				
					System.out.println("Ingrese RUN del cliente a editar: ");
					runEditar = teclado2.nextLine();
				
					for (int i = 0; i < listaCliente.size(); i++) {
						
						//comparacion = clienteServicio.getListaCliente().get(i).getRunCliente().toString();
				         Cliente c = listaCliente.get(i);
				
						if(c.getRunCliente().equals(runEditar)) {
							aux = i;
							runEncontrado = true;
							break;
						}else {
							runEncontrado = false;
						}
					}
				
					if(runEncontrado== true) {
						System.out.println("1->El RUN es: "+
								//clienteServicio.getListaCliente().get(aux).getRunCliente());
								listaCliente.get(aux).getRunCliente());
						System.out.println("2->El nombre es: "+
								//clienteServicio.getListaCliente().get(aux).getNombreCliente());
								listaCliente.get(aux).getNombreCliente());
						System.out.println("3->El apeliido es: "+
								//clienteServicio.getListaCliente().get(aux).getApellidoCliente());
								listaCliente.get(aux).getApellidoCliente());
						System.out.println("4->Los años son: "+
								//clienteServicio.getListaCliente().get(aux).getAniosCliente());
								listaCliente.get(aux).getAniosCliente());
					
						System.out.println("Ingrese opcion a editar de los datos del cliente: ");
						opcion = teclado.nextLine();
				
						if(opcion.equals("1")) {
							System.out.println("Ingrese nuevo RUN del cliente: ");
							opcionEditar = teclado3.nextLine();
							//clienteServicio.getListaCliente().get(aux).setRunCliente(opcionEditar);
							listaCliente.get(aux).setRunCliente(opcionEditar);
							System.out.println("El rut del cliente ha sido cambiado");
						
						}else if(opcion.equals("2")) {
							System.out.println("Ingrese nuevo nombre del cliente: ");
							opcionEditar = teclado3.nextLine();
							//clienteServicio.getListaCliente().get(aux).setNombreCliente(opcionEditar);
							listaCliente.get(aux).setNombreCliente(opcionEditar);
							System.out.println("El nombre del cliente ha sido cambiado");
							
						}else if(opcion.equals("3")) {
							System.out.println("Ingrese nuevo apellido del cliente: ");
							opcionEditar = teclado3.nextLine();
							//clienteServicio.getListaCliente().get(aux).setApellidoCliente(opcionEditar);
							listaCliente.get(aux).setApellidoCliente(opcionEditar);
							System.out.println("El apellido del cliente ha sido cambiado");
						}else if(opcion.equals("4")) {
							System.out.println("Ingrese años del cliente: ");
							opcionEditar = teclado3.nextLine();
							//clienteServicio.getListaCliente().get(aux).setAniosCliente(Integer.parseInt(opcionEditar));
							//clienteServicio.getListaCliente().get(aux).setAniosCliente(opcionEditar);
							listaCliente.get(aux).setAniosCliente(opcionEditar);
							System.out.println("El año del cliente ha sido cambiado");
						}else {
							System.out.println("Opcion ingresada no es valida ");
						}
					}else {
						System.out.println("El rut ingresado no es valido");
					}
				
				}else {
					System.out.println("Opcion ingresada no es valida ");
				}
			
			}catch (Exception e) {
				System.out.print("Error al editar \n");
			}
		}
		
	
	@Override
	public String toString() {
		return "ClienteServicio [listaCliente=" + listaCliente + "\n]";
	}
	
	
}
