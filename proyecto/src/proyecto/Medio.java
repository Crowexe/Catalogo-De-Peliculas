
package proyecto;
/**
 *
 * @author Luis
 */

public class Medio {
    private String tipo;
    public Medio(){
        tipo=new String();
    }
     public Medio(String tipo){
         this.tipo=tipo;
    }
      public Medio(Medio medio){
          this.tipo=medio.tipo;
    }
    @Override
	public boolean equals(Object objeto) {
		if(objeto==null)return false;
		if(!(objeto instanceof Medio))
			return false;
		Medio medio=(Medio)objeto;
		return tipo.equals(medio.tipo);
	}
    public void destruir(){
        if(tipo!=null)
            tipo=null;
        System.gc();
    }
    
     @Override
	public String toString() {
		return tipo;
    } 
    public String getMedio(){
        return tipo;
    }
    public void setMedio(String tipo){
        this.tipo=tipo;
    }
}
