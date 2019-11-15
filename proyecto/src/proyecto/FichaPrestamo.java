
package proyecto;
/**
 *
 * @author Luis
 */
public class FichaPrestamo {
    private Pelicula pelicula;
    private String nombrePrestado;
    private String fecha;
    
    public FichaPrestamo(){
        pelicula=new Pelicula();
        nombrePrestado=new String();
        fecha=new String();
    }
     public FichaPrestamo(Pelicula pelicula,String nombrePrestado,String fecha){
         this.pelicula=pelicula;
         this.nombrePrestado=nombrePrestado;
         this.fecha=fecha;
         
    }
      public FichaPrestamo(FichaPrestamo fichaPrestamo){
         this.pelicula=fichaPrestamo.pelicula;
         this.nombrePrestado=fichaPrestamo.nombrePrestado;
         this.fecha=fichaPrestamo.fecha;
      } 
    @Override
        public boolean equals(Object objeto) 
        {
                if(objeto==null)return false;
                if(!(objeto instanceof FichaPrestamo))
                        return false;
                FichaPrestamo ficha = (FichaPrestamo)objeto;
                return pelicula.equals(ficha.pelicula)&&nombrePrestado.equals(ficha.nombrePrestado)
                        &&fecha.equals(ficha.fecha);
        }
	public void destruir(){
        	if(pelicula!=null) pelicula.destruir();
                if(nombrePrestado!=null)  nombrePrestado=null;
                if(fecha!=null) fecha=null;
       		System.gc();
    	}
        
    /*public void generarFicha(Pelicula pelicula){
        System.out.println("La"+pelicula.mostarTitulo()+"se le presto a"+nombrePrestado);
    }
    public void generarFicha(AdministradorDeFicha ficha){
         System.out.println("la"+ficha.pelicula.toString()+"se le preseto a"+nombrePrestado);
    }*/
     	@Override
        public String toString(){
			return " ";
		}       
    
      
}
