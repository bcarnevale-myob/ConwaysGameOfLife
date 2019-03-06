package World;

import java.util.ArrayList;

public class World {

    private final Cell[][] world;

    public World(int height, int width) {
        this.world = new Cell[height][width];
        for(int x = 0; x < world.length; x++) {
            for(int y = 0; y < world[x].length; y++) {
                world[x][y] = new DeadCell();
            }
        }
    }

    public boolean isEmpty() {
        boolean isDead = true;
        for(int x = 0; x < world.length; x++) {
            for(int y = 0; y < world[x].length; y++) {
                if(world[x][y] instanceof AliveCell) {
                    isDead = false;
                }
            }
        }
        return isDead;
    }

    public int getHeight() {
        return this.world.length;
    }

    public int getWidth() {
        return this.world[0].length;
    }

    public void setLiveCell(int x, int y) {
        this.world[x][y] = new AliveCell();
    }

    public void setDeadCell(int x, int y) {
        this.world[x][y] = new DeadCell();
    }
}
