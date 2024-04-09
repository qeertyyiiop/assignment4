package Part3;

import java.util.HashMap;
import java.util.Map;

public abstract class MazePrototypeFactory {
    private Map<Integer, Room> prototypeRooms = new HashMap<>();

    public abstract Room makeRoom();

    public void registerRoom(int roomNo, Room room) {
        prototypeRooms.put(roomNo, room);
    }

    public Room getRoomPrototype(int roomNo) {
        return prototypeRooms.get(roomNo);
    }
}
