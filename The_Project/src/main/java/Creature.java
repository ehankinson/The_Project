public class Creature {
    protected int hp;
    protected int dps;
    protected int range;
    protected int posX;
    protected int posY;
    protected int moveSpeed;
    protected int size;

    public Creature(int hp, int dps, int range, int posX, int posY, int moveSpeed, int size){
        this.hp = hp;
        this.dps = dps;
        this.range = range;
        this.posX = posX;
        this.posY = posY;
        this.moveSpeed = moveSpeed;
        this.size = size;
    }

    public int getHp() {
        return hp;
    }

    public int getDps() {
        return dps;
    }

    public int getRange() {
        return range;
    }

    public int getPosX() {
        return posX;
    }

    public int getPosY() {
        return posY;
    }

    public int getMoveSpeed() {
        return moveSpeed;
    }

    public int getSize() {
        return size;
    }
}
