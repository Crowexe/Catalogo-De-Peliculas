
package proyecto;
/**
 *
 * @author Alejandro
 */
public class Titulo {
    private String nombre;
    public Titulo(){
        nombre=new String();
    }
     public Titulo(String nombre){
         this.nombre=nombre;
    }
      public Titulo(Titulo titulo){
          this.nombre=titulo.nombre;
    }
    @Override
	public boolean equals(Object objeto) {
		if(objeto==null)return false;
		if(!(objeto instanceof Titulo))
			return false;
		Titulo titulo=(Titulo)objeto;
		return nombre.equals(titulo.nombre);
	}
    public void destruir(){
        if(nombre!=null)
            nombre=null;
        System.gc();
    }
    /*public void setTitulo(Pelicula pelicula){
        pelicula.agregarTitulo();
    }
        public void setTitulo(AdministradorDeFicha ficha){
            ficha.pelicula.agregarTitulo();    
        }
    */
     public void setTitulo(String Titulo){
        this.nombre=nombre;
    }
    
    public String getTitulo(){
        return nombre;
    }
     @Override
	public String toString() {
		return nombre;
    } 
    
}
