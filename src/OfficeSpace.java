public class OfficeSpace  extends Room {
    private int desks;

    public OfficeSpace(String name, int desks) {
        super(name);
        this.desks = desks;
    }

    @Override
    public String getDetails() {
        return "Office with " + desks + " desks";
    }
}