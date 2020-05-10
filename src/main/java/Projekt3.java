import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Projekt3 {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("Lista Klientów z pliku clients.txt: ");

        Scanner in = new Scanner(new File("src/main/clients.txt"));

        List<String> clients = new ArrayList<String>();

        while (in.hasNextLine()) {
            clients.add(in.nextLine());
        }

        for (int i = 0; i < clients.size(); i++) {
            System.out.println(" - " + clients.get(i));
        }
        in.close();
    }
}
