package com.generation;
import java.util.Scanner;

public class Codigo4 {//1
	//se le agrego public static main para que se ejecute la funcion.
	public static void main (String[] args) {//2
    Scanner s = new Scanner(System.in); //se le agrega System.in para tener la entrada del sistema
    
    System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
    String j1 = s.nextLine();
    
    System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijeras): ");
    Scanner s2 = new Scanner(System.in);//se le agraga System.in pra tener la entreda del sistema.
    String j2 = s.nextLine();
    //Si la condicion j1 es igual a j2 se imprime el empate
    if (j1 == j2) {//3
      System.out.println("Empate");
    } //cierre llave 3
    //de lo contrario  no se cumple la condicion if el entero g sera igual 2
    else {//4
    
      int g = 2;
      switch(j1) {//5
        case "piedra":
          if (j2 == "tijeras") { //6
            g = 1;
          }//cierre llave 6

        case "papel":
          if (j2 == "piedra") {//7
            g = 1;
          }//cierre llave 7
          break;
        case "tijera":
          if (j2.equals("papel")){//8
            g = 1;
          }// cierre llave 8
          break;
        default:
      }//cierre llave 5
      System.out.println("Gana el jugador " + g);
    }//cierre llave 4
  
     
	}//cierre llave 2
}//cierre llave 1
