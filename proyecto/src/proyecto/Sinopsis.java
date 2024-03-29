/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

/**
 *
 * @author luis
 */
public class Sinopsis {
    private String resumen;
    public Sinopsis(){
        resumen = new String();
    }
     public Sinopsis(String resumen){
         this.resumen = resumen;
    }
      public Sinopsis(Sinopsis sinopsis){
          this.resumen=sinopsis.resumen;
    }
    @Override
	public boolean equals(Object objeto) {
		if(objeto==null)return false;
		if(!(objeto instanceof Sinopsis))
			return false;
		Sinopsis sinopsis=(Sinopsis)objeto;
		return resumen.equals(sinopsis.resumen);
	}
    public void destruir(){
        if(resumen!=null)
            resumen=null;
        System.gc();
    }
    public void setSinopsis(String resumen){
        this.resumen=resumen;
    }
    public String getSinopsis(){
        return resumen;
    }
    @Override
	public String toString() {
		return resumen;
    } 
    
}

