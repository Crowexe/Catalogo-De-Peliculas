
package proyecto;
/**
 *
 * @author Alejandro
 */

public class Miniatura {
    private String imagen;
    private String path;
    private int ancho;
    private int alto;
    public Miniatura(){
        imagen="";
        path="";
        ancho=100;
        alto=150;
    }
     public Miniatura(String imagen, String path, int ancho,int alto){
         this.imagen=imagen;
         this.path=path;
         this.ancho=ancho;
         this.alto=alto;
    }
      public Miniatura(Miniatura miniatura){
          this.imagen=miniatura.imagen;
          this.path=miniatura.path;
          this.ancho=miniatura.ancho;
          this.alto=miniatura.alto;
    }
    @Override
	public boolean equals(Object objeto) {
		if(objeto==null)return false;
		if(!(objeto instanceof Miniatura))
			return false;
		Miniatura miniatura=(Miniatura)objeto;
		return imagen.equals(miniatura.imagen);
	}
    public void destruir(){
        if(imagen!=null)
            imagen=null;
        System.gc();
    }
    public void setMiniatura(Pelicula pelicula){
        pelicula.agregarMiniatura();
    }
    public void setMiniatura(Fichero ficha){
        ficha.pelicula.agregarMiniatura();
    }
     @Override
	public String toString() {
		return imagen;
    } 
    
}
