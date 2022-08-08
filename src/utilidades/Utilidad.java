package utilidades;
 
public class Utilidad {
	
	
    public Utilidad() {
		
	}
	
	public void limpieza() {
	
	}
	
	public static void tiempoEsperar(int segundos){
        try {
            Thread.sleep(segundos * 1000);
         } catch (Exception e) {
            System.out.println(e);
         }
    }  
	
	 public void limpiarPantalla() {
			try {
			    String operatingSystem = System.getProperty("os.name");
			       if(operatingSystem.contains("Windows")){ 
			           new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();  
			       }else {
				       new ProcessBuilder("clear").inheritIO().start().waitFor();
			       }
			}catch(Exception e){
		        System.out.println(e);
			}
	 }  
        
    
}

