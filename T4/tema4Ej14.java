public class tema4Ej14 {
  public static void main (String[]args) {
    System.out.println("Introduce un número entero");
    int n = Integer.parseInt(System.console().readLine());
    
    if ((n%2)==0){
      System.out.print("El número introducido es par");
        for (i=1;i<=10;i++){
          int contador=contador+1;
          System.out.println(n*contador);
        }
          
      } else { 
      System.out.print("El número introducido es impar");
    }
    
    
     
  }
}
