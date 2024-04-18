
package CrearArchivoTextoYDirectorio;

import java.io.File;

public class ClaseFile {
    
    public static void main(String[] args) { //ruta absoluta: todo.
        File archivo=new File("prueba.txt"); //ruta relativa: debe estar dentro del proyecto

        if(archivo.exists()){ //si el archivo existe
            System.out.println("El archivo si existe");
            System.out.println("Ruta absoluta: "+archivo.getAbsolutePath());//retorna la ruta absoluta
            System.out.println("Es un archivo? "+archivo.isFile());//retorna booleano. si es archivo.
            System.out.println("Se puede leer? "+archivo.canRead());// retorna booleano. si se puede leer.
        }
        else{
            System.out.println("No existe");
        }
    }
}
