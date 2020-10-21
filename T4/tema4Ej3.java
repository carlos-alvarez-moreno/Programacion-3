public class tema4Ej3 {
  public static void main (String []args) {
    
    String dia;
    
    System.out.println("Introduce un número entre 1 y 7");
    int n = Integer.parseInt(System.console().readLine());
    
    switch (n) {
      case 1:
      dia= "el primer dia es el lunes";
      break;
      case 2:
      dia= "el segundo dia es el martes";
      break;
      case 3:
      dia= "el tercer dia es el miercoels";
      break;
      case 4:
      dia= "el cuarto dia es el jueves";
      break;
      case 5:
      dia= "el quinto dia es el viernes";
      break;
      case 6:
      dia= "el sexto dia es el sabado";
      break;
      case 7:
      dia= "el séptimo dia es el domingo";
      break;
      default:
      dia = ("Te he dicho que el numero debe ser entre 1 y 7, prueba de nuevo");
    }
    System.out.println(dia);
  }
}
