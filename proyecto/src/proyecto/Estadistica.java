
package proyecto;

/**
 *
 * @author Luis
 */
public class Estadistica {
    private String calificacion;
    public Estadistica(){
        calificacion=new String();
    }
     public Estadistica(String calificacion){
         this.calificacion = calificacion;
    }
      public Estadistica(Estadistica estadistica){
          this.calificacion=estadistica.calificacion;
    }
    @Override
	public boolean equals(Object objeto) {
		if(objeto==null)return false;
		if(!(objeto instanceof Estadistica))
			return false;
		Estadistica estadistica=(Estadistica)objeto;
		return calificacion.equals(estadistica.calificacion);
	}
    public void destruir(){
        if(calificacion!=null)
            calificacion=null;
        System.gc();
    }
   public void generarEstadistica(Pelicula pelicula){
       pelicula.mostrarEstadistica();
   }
   public void generarEstadistica(AdministradorDeFicha ficha){
        ficha.pelicula.mostrarEstadistica();
   }
     @Override
	public String toString() {
		return calificacion;
    } 
}
