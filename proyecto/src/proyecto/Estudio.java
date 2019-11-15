
package proyecto;
/**
 *
 * @author Alejandro
 */

public class Estudio {
    private String nombre;
    public Estudio(){
        nombre=new String();
    }
     public Estudio(String nombre){
         this.nombre=nombre;
    }
      public Estudio(Estudio estudio){
          this.nombre=estudio.nombre;
    }
    @Override
	public boolean equals(Object objeto) {
		if(objeto==null)return false;
		if(!(objeto instanceof Estudio))
			return false;
		Estudio estudio=(Estudio)objeto;
		return nombre.equals(estudio.nombre);
	}
    public void destruir(){
        if(nombre!=null)
            nombre=null;
        System.gc();
    }
    public String mostrarNombre(){
           return nombre;
    }
    public void producir(Pelicula pelicula){
        pelicula.agregarEstudio();
    }
    public void producir(AdministradorDeFicha ficha){
        ficha.pelicula.agregarEstudio();
        
    }
     @Override
	public String toString() {
		return nombre;
    } 
    
}
