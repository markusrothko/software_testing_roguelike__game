package rougelikeclasses;

class Thing {

    protected int x;
    protected int y;
    protected String type;
    protected boolean blocked;

    public Thing(String name, int xPos, int yPos) {
        this.type = name;
        this.x = xPos;
        this.y = yPos;
        this.blocked = false;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String getType() {
            return type;
    }

    public boolean isBlocked() { return blocked; }
}
