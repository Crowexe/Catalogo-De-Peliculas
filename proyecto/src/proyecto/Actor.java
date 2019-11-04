
package proyecto;
/**
 *
 * @author Alejandro
 */
public class Actor extends Artista {
    private String nombre;
    public Actor(){
        this("performance","X");
        //nombre=" ";
    }
    public Actor(String disciplina,String nombre){
         super(disciplina);
         this.nombre=nombre;
    }
    public Actor(Actor actor){
          super(actor);
          nombre=actor.nombre;
    }
    public void crear(Pelicula pelicula){
        crear();
        switch(pelicula.getGeneroPelicula().getGeneroPelicula()){
            case "terror":
                System.out.println("Estoy creando un performance de terror");
                break;
            case "comedia":
                System.out.println("Estoy creando un performance de comedia");
                break;
            case "romance":
                System.out.println("Estoy creando un performance de romance");
                break;
            default :
                System.out.println("No puedo crear ese perfomance");
                break;
        }
    }
    @Override
	public boolean equals(Object objeto) {
		if(objeto==null)return false;
		if(!(objeto instanceof Actor))
			return false;
		Actor actor=(Actor)objeto;
		return nombre.equals(actor.nombre);
	}
    public void destruir(){
        destruir();
        if(nombre!=null)
            nombre=null;
        System.gc();
    }
    public void actuar(Pelicula pelicula){
            System.out.println(nombre+"actua en"+pelicula.mostarTitulo());
            
    }
    public void actuar(Estudio estudio){
            System.out.println(nombre+"actua en"+estudio.mostrarNombre());
    }
     @Override
	public String toString() {
		return nombre;
    } 
}
