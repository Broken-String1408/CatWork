import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Feeding {
   private final List<Cat> cats = new ArrayList<>();

   private final Plate plate = new Plate(0);

    public void addCats(Cat... cats){
        this.cats.addAll(Arrays.asList(cats));
    }
    public void startFeeding(){
        for (Cat cat: cats) {
            if(cat.isSated()) continue;
            if(cat.getAppetite() <= plate.getFood()){
                cat.setSated(true);
                plate.setFood(plate.getFood() - cat.getAppetite());
            }

        }
    }
    public void addFood(int food){
        plate.setFood(plate.getFood() + food);
    }
    public void printFeedingResult(){
        StringBuilder stringBuilder = new StringBuilder();
        for (Cat cat: cats) {
            stringBuilder.setLength(0);
            stringBuilder.append(cat.getName());
            if(cat.isSated()){
                stringBuilder.append(" наелся и спит.");
            }
            else {
                stringBuilder.append(" всё ещё голоден.");
            }
            System.out.println(stringBuilder);
        }
    }
}
