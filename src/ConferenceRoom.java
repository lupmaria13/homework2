import java.util.HashMap;
import java.util.Map;

public class ConferenceRoom extends Room {
    private int seats;
    private Map<Equipment, Boolean> equipment;

    public ConferenceRoom(String name, int seats) {
        super(name);
        this.seats = seats;
        this.equipment = new HashMap<>();

        this.equipment.put(Equipment.TV, true);
        this.equipment.put(Equipment.VIDEO_PROJECTOR, false);
        this.equipment.put(Equipment.TELEPRESENCE, false);
    }

    public void setEquipment(Equipment equipmentType, boolean available) {
        equipment.put(equipmentType, available);
    }

    @Override
    public String getDetails() {
        StringBuilder details = new StringBuilder();
        details.append("Conference Room with ").append(seats).append(" seats");
        details.append(", Equipment: ");
        for (Map.Entry<Equipment, Boolean> entry : equipment.entrySet()) {
            if (entry.getValue()) {
                details.append(entry.getKey()).append(", ");
            }
        }
        return details.toString();
    }
}
