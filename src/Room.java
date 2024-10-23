public abstract class Room {
    private String name;

    public Room(String name) {
        this.name = name;
    }

    public abstract String getDetails();

    @Override
    public String toString() {
        return "Room: " + name + " - " + getDetails();
    }
}

