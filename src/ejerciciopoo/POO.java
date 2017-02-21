package ejerciciopoo;

import ch.aplu.turtle.Turtle;

/**
 *
 * @author Equipo
 */
public class POO {
   private  Turtle joe;
   
   public POO(){
     this.joe =  new Turtle(); 
   }
   
   public void cuadrado(){
       for(int i=0;i<4;i++){
      joe.fd(20);
      joe.rt(90);
   } 
   }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       POO e = new POO();
       e.dibujar();
    }
    
}
