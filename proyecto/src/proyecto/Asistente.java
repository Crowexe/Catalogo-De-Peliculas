
package proyecto;
/**
 *
 * @author Luis
 */

public class Asistente {
    private Fichero fichero;
	
	public Asistente()
	{
		this.fichero = new Fichero();
	}
	public Asistente(String nombre)
	{
        	this.fichero = fichero;
	}
	public Asistente(Asistente asistente)
	{
        	this.fichero = asistente.fichero;
	}
    	@Override
		public boolean equals(Object objeto) 
		{
			if(objeto==null)return false;
			if(!(objeto instanceof Asistente))
			return false;
			Asistente asistente=(Asistente)objeto;
			return fichero.equals(asistente.fichero);
		}
		public void destruir()
		{	
			if(fichero != null)
			{
				fichero.destruir();
			}
        		System.gc();
    		}
        public void agregarDatos(Pelicula pelicula){
            pelicula.agregarDato();
        
        }
        public void agregarDatos(Fichero ficha){
            ficha.pelicula.agregarDato();
        
        }
        
        @Override
		public String toString() 
		{
			return " ";
    		} 
}
