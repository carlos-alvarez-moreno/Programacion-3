public class AreaRectangulo {
  public static void main (String [] args) {
    System.out.println("Calculadora aerea rectangulo");
    System.out.println("Escribe los cm de la base");
    double base = Double.parseDouble(System.console().readLine());
    System.out.println("Escribe los la altura en cm");
    double altura = Double.parseDouble(System.console().readLine());
    System.out.println("El area del rectangulo es " + (base * altura) + "cm");
  }
}
  
