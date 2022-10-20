import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Random random=new Random();
        Set<Integer> plenty=new HashSet<>(20);
        for (int i = 0; i <20 ; i++) {
            plenty.add(random.nextInt(1000));
        }
        plenty.removeIf(integer -> integer%2==0);
        System.out.println(plenty);
    }

}