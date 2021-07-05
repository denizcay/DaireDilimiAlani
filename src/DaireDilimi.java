import java.util.Scanner;
public class DaireDilimi {
    public static void main(String[] args) {
        System.out.print("Dairenin yarıçapını giriniz:");
        Scanner imput= new Scanner(System.in);
        double r = imput.nextDouble();
        System.out.print("Daire diliminin açısını giriniz:");
        double aci = imput.nextDouble();
        double alan = (3.14*r*r*aci)/360;
        System.out.println("Daire diliminin alanı:" + alan);
    }
}
