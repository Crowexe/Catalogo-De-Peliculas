
package proyecto;
/**
 *
 * @author Ximena
 */

public class Director extends Artista{
    private String nombre;
    
    public Director(){
        this("audiovisual","X");
    }
     public Director(String disciplina,String nombre){
         super(disciplina);
         this.nombre=nombre;
    }
      public Director(Director director){
          super(director);
          this.nombre=director.nombre;
    }
    public void crear(Pelicula pelicula){
        crear();
        switch(pelicula.getGeneroPelicula().getGeneroPelicula()){
            case "terror":
                System.out.println("Estoy creando una obra audiovisual de terror");
                break;
            case "comedia":
                System.out.println("Estoy creando una obra audiovisual de comedia");
                break;
            case "romance":
                System.out.println("Estoy creando una obra audiovisual de romance");
                break;
            default :
                System.out.println("No puedo crear esa obra audiovisual");
                break;
        }
    }
    @Override
	public boolean equals(Object objeto) {
		if(objeto==null)return false;
		if(!(objeto instanceof Director))
			return false;
		Director director=(Director)objeto;
		return nombre.equals(director.nombre);
	}
    public void destruir(){
        if(nombre!=null)
            nombre=null;
        System.gc();
    }
    public void trabajaEn(Pelicula pelicula){
            
        System.out.println("El"+nombre+"trabaja en"+pelicula.mostarTitulo());
            
    }
    public void trabajaEn(Estudio estudio){
            System.out.println("El"+nombre+"trabaja en"+estudio.mostrarNombre());
    }
     @Override
	public String toString() {
		return nombre;
    } 
}
