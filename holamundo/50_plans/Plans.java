import java.util.Scanner;

public class Plans {

public static void main(String[] args) {

    Scanner teclado = new Scanner(System.in);

    String[][] miArray = new String[25][8];

    inicializaaceros(miArray);

    planes(miArray, "Hola", 13, 3);

    mostrarArray(miArray);

    }

    public static void inicializaaceros(String[][] miArray){

        for (int f=0; f< miArray.length; f++) {

            for (int c=0; c< miArray[0].length; c++) {

                miArray[0][0] = "  Horas   ";
                miArray[0][1] = "  Lunes   ";
                miArray[0][2] = "  Martes  ";
                miArray[0][3] = " Miercoles ";
                miArray[0][4] = "  Jueves  ";
                miArray[0][5] = " Viernes  ";
                miArray[0][6] = "  Sabado  ";
                miArray[0][7] = " Domingo  ";
                miArray[f][c] = " nothing  ";
                miArray[f][0] = "" + f;
                
            }
        }
    }

    public static void mostrarArray(String[][] miArray) {
        for (int f=0; f< miArray.length; f++) {
            for (int c=0; c< miArray[0].length; c++) {
                System.out.print(miArray[f][c]);
                System.out.print(" ");
            }
            System.out.println("");
        }
    }

    public static void planes(String[][] miArray, String plan, int hora, int dia){
        miArray[hora][dia] = plan;
    }
}