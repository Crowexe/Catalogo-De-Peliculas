
package proyecto;

/**
 *
 * @author Luis
 */
public class Estadistica {
    private int calificacion;
    public Estadistica(){
        calificacion = 0;
    }
     public Estadistica(int calificacion){
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
		return calificacion==estadistica.calificacion;
	}
    public void destruir(){
        if(calificacion!=0)
            calificacion=0;
        System.gc();
    }
    public void setEstadistica(int calificacion){
        this.calificacion=calificacion;
    }
    
    public int getEstadistica(){
        return calificacion;
    }
   /*public void generarEstadistica(Pelicula pelicula){
       pelicula.mostrarEstadistica();
   }
   public void generarEstadistica(AdministradorDeFicha ficha){
        ficha.pelicula.mostrarEstadistica();
   }*/
     @Override
	public String toString() {
                switch(calificacion){
                    case 1: 
                        return "Muy mala";
                        
                    case 2: 
                        return "Mala";
                            
                    case 3: 
                        return "Media";
                      
                    case 4: 
                        return "Buena";
                    
                    case 5: 
                        return "Muy buena";
                    
                    default: 
                        return "No es parte de la escala";
                    
                }
    } 
}
