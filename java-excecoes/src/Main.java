import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true) {
            try {
                Scanner inpu = new Scanner(System.in);
                System.out.print("Digite sua idade : ");
                int idade = inpu.nextInt();
                System.out.println(idade);
                break;
            } catch (InputMismatchException e) {
                System.out.println("idade tem que se um numero inteiro");
            }
            finally {
                System.out.println("confirmar");
            }
        }
    }

}