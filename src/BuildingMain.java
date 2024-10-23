public class BuildingMain { public static void main(String[] args) {
    Building building = new Building("Central Office");

    Floor firstFloor = new Floor(1);
    Floor secondFloor = new Floor(2);
    Floor thirdFloor = new Floor(3);

    firstFloor.addRoom(new OfficeSpace("Main Office", 20));
    ConferenceRoom confRoomA = new ConferenceRoom("Conference Room A", 10);
    confRoomA.setEquipment(Equipment.TV, true);
    firstFloor.addRoom(confRoomA);
    firstFloor.addRoom(new Kitchen("Main Kitchen"));

    secondFloor.addRoom(new OfficeSpace("Office 1", 10));
    secondFloor.addRoom(new OfficeSpace("Office 2", 10));
    ConferenceRoom confRoomB = new ConferenceRoom("Conference Room B", 8);
    confRoomB.setEquipment(Equipment.VIDEO_PROJECTOR, true);
    secondFloor.addRoom(confRoomB);
    secondFloor.addRoom(new Kitchen("Small Kitchen"));

    ConferenceRoom largeConfRoom = new ConferenceRoom("Large Conference Room", 30);
    largeConfRoom.setEquipment(Equipment.VIDEO_PROJECTOR, true);
    largeConfRoom.setEquipment(Equipment.TELEPRESENCE, true);
    thirdFloor.addRoom(largeConfRoom);

    building.addFloor(firstFloor);
    building.addFloor(secondFloor);
    building.addFloor(thirdFloor);

    System.out.println(building);
}
}