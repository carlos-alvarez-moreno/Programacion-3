import java.util.Scanner;

public class ejconcatenaciones {
  public static void main(String[]args) {
  Scanner s=new Scanner(System.in);
  int contador=0;
  int suma=0;
  int n;
  String cadena="";
  
    for (int i=1;i<=10;i++){
      System.out.println("Dime un número ");
      n=s.nextInt();
      contador++;
      suma=suma+n;
      numeros=numeros+n+"-";
    }
    System.out.print("Numeros: "+ numeros);
    System.out.print("Numeros: "+ contador);
    System.out.print("Numeros: "+ (double)suma/contador);
  }
}
