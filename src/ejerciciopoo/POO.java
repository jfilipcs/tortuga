package ejerciciopoo;

import ch.aplu.turtle.Turtle;

/**
 *
 * @author Equipo
 */
public class POO {
   private final  Turtle joe;
   
   public POO(){
     this.joe =  new Turtle(); 
   }
   
   public void triangulo(double a){
      joe.speed(5000);
      joe.rt(30);
       for(int i=0;i<3;i++){
      joe.fd(a);
      joe.rt(120);
   }
       joe.rt(-30);
   }
   
   public void cuadrado(double a){
      joe.speed(5000);
       for(int i=0;i<4;i++){
      joe.fd(a);
      joe.rt(90);
   } 
   }
   
   public void rectangulo(double a,double b){
      joe.speed(5000);
       for(int i=0;i<2;i++){
      joe.fd(a);
      joe.rt(90);
      joe.fd(b);
      joe.rt(90);
   } 
   }
   
   public void pentagono(double a){
      joe.speed(5000);
       for(int i=0;i<5;i++){
      joe.fd(a);
      joe.rt(72);
   } 
   }
   
   public void hexa(double a){
      joe.speed(5000);
       for(int i=0;i<6;i++){
      joe.fd(a);
      joe.rt(60);
   } 
   }
   
   public void posicionar(double a, double b){
       
    joe.setPos(a, b);
   }
   
   
   
   
   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       POO e = new POO();
       e.cuadrado(50);
       e.posicionar(0,50);
       e.triangulo (50);
       e.posicionar(10,0);
       e.rectangulo(20,10);
       e.posicionar(25,25);
       e.hexa(10);
       e.posicionar(200,500);
    }
    
}
