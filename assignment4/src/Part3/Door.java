package Part3;

public class Door extends DoorWall {
    private boolean isOpen;

    public Door(Room r1, Room r2) {
        super(r1, r2);
        this.isOpen = false; // Doors are initially closed
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void open() {
        isOpen = true;
    }

    public void close() {
        isOpen = false;
    }

    // Additional methods specific to Door class if needed
}
