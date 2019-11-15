
package proyecto;

/**
 *
 * @author Luis
 */
public class GeneroPelicula {
   private String genero;
    public GeneroPelicula(){
        genero=new String();
    }
     public GeneroPelicula(String genero){
         this.genero=genero;
    }
      public GeneroPelicula(GeneroPelicula generoPelicula){
          this.genero=generoPelicula.genero;
    }
    @Override
	public boolean equals(Object objeto) {
		if(objeto==null)return false;
		if(!(objeto instanceof Director))
			return false;
		GeneroPelicula generoPelicula=(GeneroPelicula)objeto;
		return genero.equals(generoPelicula.genero);
	}
    public void destruir(){
        if(genero!=null)
            genero=null;
        System.gc();
    }
    /*public void clasificar(Pelicula pelicula){
        pelicula.agregarGenero();
    }
    public void clasificar(AdministradorDeFicha ficha){
        ficha.pelicula.agregarGenero();
    }*/
    public void setGenero(String genero){
        this.genero=genero;
    }
    
    public String getGenero(){
        return genero;
    }
     @Override
	public String toString() {
		return genero;
    }
}
