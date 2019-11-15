package proyecto;
/**
 *
 * @author Ximena
 */


public class Artista{
     //private Actor actor;
     //private Director director;
     //private Guionista guionista;
    private String disciplina;
    
    public void crear(){
        System.out.println("Estoy creando");
    }
    
     public Artista(){
         //actor=new Actor();
         //director=new Director();
         //guionista=new Guionista();
         disciplina="Artista de performance";
     }
     public Artista(String disciplina){
        // this.actor=actor;
         //this.director=director;
         //this.guionista=guionista;
         this.disciplina=disciplina;
     }
     public Artista(Artista artista){
         //this.actor=artista.actor;
         //this.director=artista.director;
         //this.guionista=artista.guionista; 
         this.disciplina=artista.disciplina;
     }
     @Override
	public boolean equals(Object objeto) {
		if(objeto==null)return false;
		if(!(objeto instanceof Artista))
			return false;
		Artista artista=(Artista)objeto;
		return disciplina.equals(artista.disciplina);
	}
     public void destuir(){
             if(disciplina!=null)
                disciplina=null;
            System.gc();
     }
     /*public void setArtista(Pelicula pelicula){
         pelicula.agregarArtista();
     
     }
     public void setArtista(AdministradorDeFicha ficha){
         ficha.pelicula.agregarArtista();     
     }*/
     public String toString() {
            String string;
            string="disciplina:"+disciplina;
            return string;
    }
    
     
}
