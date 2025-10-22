import java.util.ArrayList;
import java.util.List;

public class StatisticsDisplay implements Observer {
    private List<String> statistics = new ArrayList<>();

    @Override
    public void update(String message) {
        this.statistics.add(message);
    }

    public void display() {
        System.out.println("Statistics: ");
        for (String stat : statistics) {
            System.out.println(" - " + stat);
        }
    }

}
