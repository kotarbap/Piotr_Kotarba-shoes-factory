package pl.edu.wszib.kotarba.shoeFactory;

import pl.edu.wszib.kotarba.shoeFactory.Builder.ShiftManager;
import pl.edu.wszib.kotarba.shoeFactory.Builder.Shoes;
import pl.edu.wszib.kotarba.shoeFactory.Builder.ShoesBuilder;
import pl.edu.wszib.kotarba.shoeFactory.Facade.Menu;
import pl.edu.wszib.kotarba.shoeFactory.Singleton.Database;

import javax.xml.crypto.Data;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Menu facade = new Menu();
        boolean quit = false;

        while (!quit) {
            System.out.println("\nFabryka butów Piotr Kotarba:");
            System.out.println("1. Wyświetl liste dostepnych butów");
            System.out.println("2. Zleć twoje wymarzone buty do produkcji");
            System.out.println("3. Kup buty z magazynu");
            System.out.println("4. Zakończ");
            System.out.print("\nWybierz działanie: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    facade.showAvailableShoes();
                    break;
                case 2:
                    System.out.print("\nPodaj rozmiar zamawianego buta: ");
                    int size = scanner.nextInt();
                    scanner.nextLine();
                    facade.orderNewShoes(size);
                    break;
                case 3:
                    System.out.print("\nPodaj ID kupowanego buta: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    facade.sellShoes(id);
                    break;
                case 4:
                    quit = true;
                    break;
                default:
                    System.out.println("\nNie ma takiego punktu w Menu. Spróbuj ponownie");
                    break;
            }
        }
        System.out.println("\nDziękujemy za zakupy");
    }
}