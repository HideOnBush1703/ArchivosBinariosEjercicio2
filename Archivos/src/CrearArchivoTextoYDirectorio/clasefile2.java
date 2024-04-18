
package CrearArchivoTextoYDirectorio;

import java.io.File;

public class clasefile2 {
    
    public static void main(String[] args) {
        File directorio=new File("carpetaPrueba");
        if(directorio.exists()){
            System.out.println("El directorio si existe");
            System.out.println("Ruta Absoluta: "+directorio.getAbsolutePath());
            System.out.println("Es un directorio? "+directorio.isDirectory());
            System.out.println("Se puede leer? "+directorio.canRead());
        }
        else{
            System.out.println("No existe");
        }
    }
}
