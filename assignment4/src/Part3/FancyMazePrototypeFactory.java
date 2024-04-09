package Part3;

public class FancyMazePrototypeFactory extends MazePrototypeFactory {
    private static final Room fancyRoomPrototype = new FancyRoom(0);
    private static final Wall fancyWallPrototype = new FancyWall();

    public Room makeRoom() {
        return fancyRoomPrototype.clone();
    }

    public Wall makeWall() {
        return fancyWallPrototype.clone();
    }
}
