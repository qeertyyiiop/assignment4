package Part3;

public class SimpleMazePrototypeFactory extends MazePrototypeFactory {
    private static final Room simpleRoomPrototype = new Room(0);
    private static final Wall simpleWallPrototype = new Wall();

    public Room makeRoom() {
        return simpleRoomPrototype.clone();
    }

    public Wall makeWall() {
        return simpleWallPrototype.clone();
    }
}
