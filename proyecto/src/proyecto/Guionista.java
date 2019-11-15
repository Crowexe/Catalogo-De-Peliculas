
package proyecto;
/**
 *
 * @author Ximena
 */
public class Guionista extends Artista{
     private String nombre;
    public Guionista(){
        this("conceptual","X");
        nombre=new String();
    }
     public Guionista(String disciplina,String nombre){
         super(disciplina);
         this.nombre=nombre;
    }
      public Guionista(Guionista guionista){
          super(guionista);
          this.nombre=guionista.nombre;
    }
      
    public void crear(Pelicula pelicula){
        crear();
        switch(pelicula.getGeneroPelicula().getGeneroPelicula()){
            case "terror":
                System.out.println("Estoy creando un guion de terror");
                break;
            case "comedia":
                System.out.println("Estoy creando un guion de comedia");
                break;
            case "romance":
                System.out.println("Estoy creando un guion de romance");
                break;
            default :
                System.out.println("No puedo crear ese guion");
                break;
        }
    }
    
    
    @Override
	public boolean equals(Object objeto) {
		if(objeto==null)return false;
		if(!(objeto instanceof Guionista))
			return false;
		Guionista guionista=(Guionista)objeto;
		return nombre.equals(guionista.nombre);
	}
    public void destruir(){
        if(nombre!=null)
            nombre=null;
        System.gc();
    }
    public void escribirGuion(Pelicula pelicula){
        pelicula.agregarGuionista();
    }
    public void escribirGuion(AdministradorDeFicha ficha){
       ficha.pelicula.agregarGuionista();
    }
    
    
     @Override
	public String toString() {
		return nombre;
    }
}
