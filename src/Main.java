import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
     Scanner giris = new Scanner(System.in);

     double alan,u,a,b,c;

        System.out.println("1.Kenarı Giriniz: ");
        a = giris.nextInt();
        System.out.println("2.Kenarı Giriniz: ");
        b = giris.nextInt();
        System.out.println("3.Kenarı Giriniz: ");
        c = giris.nextInt();

        u = (a+b+c)/2;
        alan = u*(u-a)*(u-b)*(u-c);
        System.out.println("Üçgenin Alanı = "+alan+"\'dir!");
        }
}