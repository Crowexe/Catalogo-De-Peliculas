
package proyecto;

import java.io.Serializable;
import java.util.LinkedList;
/**
 *
 * @author Ximena
 */
//insertar aquí método "get pelicula" 
public class AdministradorDeFicha implements Serializable {
    private Pelicula pelicula;
    private LinkedList<FichaDeDato> listaDePeliculas;
    
    public AdministradorDeFicha(){
         pelicula=new Pelicula();
         listaDePeliculas=new LinkedList();
     }
     public AdministradorDeFicha(Pelicula pelicula,LinkedList<FichaDeDato> listaDePeliculas){
         this.pelicula=pelicula;
         this.listaDePeliculas=listaDePeliculas;
     }
     public AdministradorDeFicha(AdministradorDeFicha administradorDeFicha){
         this.pelicula=administradorDeFicha.pelicula;
         this.listaDePeliculas=administradorDeFicha.listaDePeliculas;
     }
     @Override
	public boolean equals(Object objeto) {
		if(objeto==null)return false;
		if(!(objeto instanceof AdministradorDeFicha))
			return false;
		AdministradorDeFicha administradorDeFicha=(AdministradorDeFicha)objeto;
		return pelicula.equals(administradorDeFicha.pelicula);
	}
    public void crearFicha(FichaDeDato ficha){
        System.out.println("agregando ficha");  
    }
     public void crearFicha(FichaPrestamo ficha){
         System.out.println("agregando ficha");    
    }
     public void destruir(){
             if(pelicula!=null)
                pelicula.destruir();
            System.gc();
     }
}
