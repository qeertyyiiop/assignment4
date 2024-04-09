package Part3;

public class Wall {
    private boolean isDestructible;

    public Wall() {
        this.isDestructible = false;
    }

    public boolean isDestructible() {
        return isDestructible;
    }

    public void setDestructible(boolean destructible) {
        isDestructible = destructible;
    }

}