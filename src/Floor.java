import java.util.ArrayList;
import java.util.List;

public class Floor {
    private int floorNumber;
    private List<Room> rooms;

    public Floor(int floorNumber) {
        this.floorNumber = floorNumber;
        this.rooms = new ArrayList<>();
    }

    public void addRoom(Room room) {
        rooms.add(room);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Floor ").append(floorNumber).append(": ").append(rooms.size()).append(" rooms\n");
        for (Room room : rooms) {
            sb.append(room.toString()).append("\n");
        }
        return sb.toString();
    }
}
