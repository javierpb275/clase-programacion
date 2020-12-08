import java.util.Scanner;

public class Capicua {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int[] number= new int [6]  ;


        for (int i = 0; i < number.length; i++) {

        System.out.println("Give number " + i);
        number[i] = teclado.nextInt();

        }

        //Esto comprueba si un numero es capicua o no:
         int counter = 1;
         boolean capicua = false;

         for (int i = 0; i < (number.length / 2); i++) {

            capicua = false;

            if (number[i] == number[number.length - counter]) {
                capicua = true;
                counter++;
            }

         }

         if (capicua) {
             System.out.println("Es capicua");

         }  else {
             System.out.println("No es capicua");
         }

    }

}