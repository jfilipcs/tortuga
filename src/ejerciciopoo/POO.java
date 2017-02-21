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
   
   public void triangulo(double a){
       for(int i=0;i<3;i++){
      joe.fd(a);
      joe.rt(120);
   } 
   
   
   public void cuadrado(double a){
       for(int i=0;i<4;i++){
      joe.fd(a);
      joe.rt(90);
   } 
   }
   
   public void pentagono(double a){
       for(int i=0;i<4;i++){
      joe.fd(a);
      joe.rt(72);
   } 
   }
   
   public void hexa(double a){
       for(int i=0;i<4;i++){
      joe.fd(a);
      joe.rt(60);
   } 
   }
   
   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       POO e = new POO();
       e.cuadrado(120);
    }
    
}
