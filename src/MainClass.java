import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class MainClass {
    public static void main(String[] args) {
        Feeding feeding = new Feeding();
        feeding.addCats(
                new Cat("Barsik", 5),
                new Cat("Myrzik", 10),
                new Cat("SnowFlake", 20),
                new Cat("Garfield", 60),
                new Cat("Felix", 15));
        feeding.addFood(100);
        feeding.startFeeding();
        feeding.printFeedingResult();
    }
}
