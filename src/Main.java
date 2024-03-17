//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int kilo;
        double boy, vucut;
        Scanner girdi2 = new Scanner(System.in);
        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz : " );
        boy = girdi2.nextDouble();
        Scanner girdi = new Scanner(System.in);
        System.out.print("Lütfen kilonuzu giriniz : " );
        kilo = girdi.nextInt();
        vucut = kilo/(boy*boy);
        System.out.print("Vücut kitle İndeksiniz : " +vucut );
    }
}