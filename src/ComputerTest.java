import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class ComputerTest {
    public static void main(String[] args) {
        ArrayList<Computer> computers = new ArrayList<>();

        computers.add(new Computer("Asus", 2.5, 16));
        computers.add(new Computer("HP", 2.2,2));
        computers.add(new Computer("HP", 2.2,4));
        computers.add(new Computer("HP", 2.0,8));

        Collections.sort(computers);
        for (Computer computer : computers) {
            System.out.println(computer);
        }

    }
}
