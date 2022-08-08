package vista;

import java.util.Scanner;

import modelo.Cliente;
import servicio.ArchivoServicio;
import servicio.ClienteServicio;
import servicio.ExportadorCsv;
import servicio.ExportadorTxt;
import utilidades.Utilidad;


public class Menu {
	boolean comparacion =false;
	
	public Menu() {
		
	}

public void mostrarMenu() {
	Scanner teclado = new Scanner(System.in);
	Scanner leer = new Scanner(System.in);
	String opc ="";
	Cliente cliente = new Cliente();
	ClienteServicio clienteServicio = new ClienteServicio();
	ExportadorCsv exportadorcsv = new ExportadorCsv();
	ExportadorTxt exportadortxt = new ExportadorTxt();
	ArchivoServicio archivoServicio = new ArchivoServicio();
	Utilidad utilidad = new Utilidad();
	String fileName1="C:\\Users\\ing_f\\OneDrive\\Escritorio\\DBClientes.csv";
	String fileName="clientes";
	
	do {
		comparacion = false;
		System.out.print("\n");
		System.out.print("----------------------------\n");
		System.out.print("         MENU\n");
		System.out.print("----------------------------\n");
		System.out.print("1->Lista Clientes \n");
		System.out.print("2->Agregar Clientes \n");
		System.out.print("3->Editar Clientes \n");
		System.out.print("4->Cargar Datos \n");
		System.out.print("5->Exportar datos \n");
		System.out.print("6->Salir \n");
		System.out.print("----------------------------\n");
		System.out.print("");
	
		try {
			System.out.print("Ingrese una opcion: ");
			opc = leer.nextLine();
			
	
			if(opc.equals("1")) {
				
				try {
					System.out.print("\n");
					System.out.println("LISTANDO CLIENTES.... ");
					System.out.print("\n");
					utilidad.tiempoEsperar(2);
					
					clienteServicio.listarClientes();
					
				} catch (Exception e) {
					
				}
				
				
			}else if(opc.equals("2")) {
			
				try {
					clienteServicio.agregarCliente();
					
					System.out.println("Ingresando cliente.... ");
					utilidad.tiempoEsperar(2);
					System.out.println("Cliente ingresado con exito ");
					System.out.print("-----------------------------------\n");
					utilidad.tiempoEsperar(1);

				
				}catch(NumberFormatException  e) {
					throw new NumberFormatException(e.getMessage());
				}
				
				
			}else if(opc.equals("3")) {
				try {
					clienteServicio.editarCliente();
					//cliente.editarLista();
				} catch (Exception e) {
					System.out.printf("Error, intente otra vez \n",e.getMessage());
				}
				
				
			}else if(opc.equals("4")) {
				try {
					archivoServicio.cargarDatos(fileName1);
				} catch (Exception e) {
					System.out.printf("Error, intente otra vez \n",e.getMessage());
				}
				
				
			}else if(opc.equals("5")) {
				try {
					
					
					System.out.println("-------------Exportar Datos-------------- ");
					System.out.println("Seleccione el formato a exportar");
					System.out.println("1- Formato csv");
					System.out.println("2- Formato txt");
					System.out.println("Ingrese una Opcion para exportar");
					System.out.println("---------------------------------------- ");
					int opcExportar;
					opcExportar=teclado.nextInt();
					
					if (opcExportar==1) {
						exportadorcsv.exportar(clienteServicio,fileName);
					}else if(opcExportar==2){
					    exportadortxt.exportar(clienteServicio,fileName);

					}
					
				} catch (Exception e) {
					System.out.printf("Error, intente otra vez \n",e.getMessage());
				}
				
				
			}else if(opc.equals("6")) {
				try {
					System.out.printf("Abandonando el sistema de clientes... \n");
					utilidad.tiempoEsperar(3);
					System.out.printf("Acaba de salir del sistema \n");
					utilidad.tiempoEsperar(3);
					System.exit(1);
					
					
				} catch (Exception e) {
					System.out.printf("Error, intente otra vez \n",e.getMessage());
				}
				
				
			}else if(opc != "1" || opc !="2" || opc !="3" || opc!="4" || opc!="5" || opc!="6") {
				try {
					System.out.printf("Opcion ingresada no valida \n");
				} catch (Exception e) {
					System.out.printf("Error, intente otra vez \n",e.getMessage());
				}
			}
		}catch(Exception e) {
			System.out.printf("Error, intente otra vez \n",e.getMessage());
		
		}
		
	} while (comparacion ==false);

	}
}
