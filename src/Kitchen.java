import java.util.HashMap;
import java.util.Map;

public class Kitchen extends Room {
    private Map<Equipment, Boolean> equipment;

    public Kitchen(String name) {
        super(name);
        this.equipment = new HashMap<>();

        this.equipment.put(Equipment.COFFEE_MACHINE, true);
        this.equipment.put(Equipment.WATER_DISPENSER, true);
        this.equipment.put(Equipment.FRIDGE, true);
    }

    public void setEquipment(Equipment equipmentType, boolean available) {
        equipment.put(equipmentType, available);
    }

    @Override
    public String getDetails() {
        StringBuilder details = new StringBuilder();
        details.append("Kitchen with equipment: ");
        for (Map.Entry<Equipment, Boolean> entry : equipment.entrySet()) {
            if (entry.getValue()) {
                details.append(entry.getKey()).append(", ");
            }
        }
        return details.toString();
    }
}