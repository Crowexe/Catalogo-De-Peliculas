
package proyecto;
/**
 *
 * @author Alejandro
 */
public class Escritor extends Artista{
    private String nombre;
	public Escritor(){
            this("Conceptual","X");
	}
	public Escritor(String disciplina,String nombre)
	{
            super(disciplina);
            this.nombre = nombre;
	}
      	public Escritor(Escritor escritor)
	{
            super(escritor);
            this.nombre = escritor.nombre;
	}
        
        public void crear(Pelicula pelicula){
        crear();
        switch(pelicula.getGeneroPelicula().getGeneroPelicula()){
            case "terror":
                System.out.println("Estoy creando una historia de terror");
                break;
            case "comedia":
                System.out.println("Estoy creando una historia de comedia");
                break;
            case "romance":
                System.out.println("Estoy creando una historia de romance");
                break;
            default :
                System.out.println("No puedo crear esa historia");
                break;
            }
        }
        
    	@Override
		public boolean equals(Object objeto) 
		{
			if(objeto==null)return false;
			if(!(objeto instanceof Escritor))
				return false;
			Escritor escritor = (Escritor)objeto;
			return nombre.equals(escritor.nombre);
		}
	public void destruir()
	{
        	if(nombre!=null) nombre=null;
       		System.gc();
    	}
        public void escribir(Pelicula pelicula){
            pelicula.agregarEscritor();
        }
        public void escribir(Fichero ficha){
            ficha.pelicula.agregarEscritor();
        }
     	@Override
		public String toString()
		{
			return nombre;
		}     
}
