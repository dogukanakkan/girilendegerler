import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int toplam = 0;

        while (true) {
            System.out.print("Bir sayı girin (Programı sonlandırmak için -1 girin): ");
            int sayi = scanner.nextInt();

            if (sayi == -1) {
                break;
            }

            if (sayi % 2 == 0 && sayi % 4 == 0) {
                toplam += sayi;
            }
        }

        System.out.println("Girilen çift ve 4'ün katı olan sayıların toplamı: " + toplam);
    }

    }
