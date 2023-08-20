import javax.swing.*;
import java.util.Scanner;

public class CalculoMedia {


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double x, y, w, z;
        System.out.println("Digite a primeira nota: ");
        x = s.nextDouble();

        System.out.println("Digite a segunda nota: ");
        y = s.nextDouble();

        System.out.println("Digite a terceira nota: ");
        w = s.nextDouble();

        System.out.println("Digite a quarta nota: ");
        z = s.nextDouble();

        double media = (x+y+w+z)/4;

        System.out.println("A sua média final é: "+ media);
        if (media >=7){
            System.out.println("Parabéns, você foi aprovado");
        } else if (media >=5 && media <7) {
            System.out.println("Você está de recuperação");
        }
        else {
            System.out.println("Nos vemos no próximo período");
        }

    }
}
