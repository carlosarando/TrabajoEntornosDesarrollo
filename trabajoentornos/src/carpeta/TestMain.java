package carpeta;

import javax.swing.JOptionPane;

public class TestMain {

   
    private static String message1;
	private static String message2;

	public static void main(String[] args) {
       
        message1 = "Introduce un tamaño para el array";
        message2 = "Introduce la longitud del password";
		String texto=JOptionPane.showInputDialog(message1);
        int tamanio=Integer.parseInt(texto);
 
        
		texto=JOptionPane.showInputDialog(message2);
        int longitud=Integer.parseInt(texto);
 
       
        Password listaPassword[]=new Password[tamanio];
        boolean fortalezaPassword[]=new boolean[tamanio];
 
 
        contraseniaFuerte(longitud, listaPassword, fortalezaPassword);
   
}

	private static void contraseniaFuerte(int longitud, Password[] listaPassword, boolean[] fortalezaPassword) {
		for(int i=0;i<listaPassword.length;i++){
            listaPassword[i]=new Password(longitud);
            fortalezaPassword[i]=listaPassword[i].esFuerte();
            System.out.println(listaPassword[i].getContrasenia()+" "+fortalezaPassword[i]);
    }
	}
}
