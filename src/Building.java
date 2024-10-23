import java.util.ArrayList;
import java.util.List;

public class Building {
    private String name;
    private List<Floor> floors;

    public Building(String name) {
        this.name = name;
        this.floors = new ArrayList<>();
    }

    public void addFloor(Floor floor) {
        floors.add(floor);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Building: ").append(name).append("\n");
        sb.append("Number of floors: ").append(floors.size()).append("\n");
        for (Floor floor : floors) {
            sb.append(floor.toString()).append("\n");
        }
        return sb.toString();
    }
}