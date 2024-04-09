package Part3;

public class MazeGame {
    public static void main(String[] argv) {
        createMaze(new SimpleMazePrototypeFactory());
        createMaze(new FancyMazePrototypeFactory());
    }

    private static Maze createMaze(MazePrototypeFactory factory) {
        Maze aMaze = new Maze();
        Room r1 = factory.makeRoom();
        Room r2 = factory.makeRoom();
        DoorWall d = new DoorWall(r1, r2);

        aMaze.addRoom(r1);
        aMaze.addRoom(r2);

        r1.setSide(Direction.NORTH, d);
        r1.setSide(Direction.EAST, factory.makeWall());
        r1.setSide(Direction.SOUTH, factory.makeWall());
        r1.setSide(Direction.WEST, factory.makeWall());
        r2.setSide(Direction.NORTH, factory.makeWall());
        r2.setSide(Direction.EAST, factory.makeWall());
        r2.setSide(Direction.SOUTH, d);
        r2.setSide(Direction.WEST, factory.makeWall());

        return aMaze;
    }
}
