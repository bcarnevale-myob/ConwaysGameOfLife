package World;

import java.util.ArrayList;

public class World {

    private final ArrayList<ArrayList<Cell>> world;

    public World(int height, int width) {
        this.world = new ArrayList<ArrayList<Cell>>(height);
        for(int x = 0; x < height; x++) {
            world.add(new ArrayList<>(width));
            for(int y = 0; y < width; y++) {
                world.get(x).add(new DeadCell());
            }
        }
    }

    public boolean isEmpty() {
        boolean isDead = true;
        for(int x = 0; x < world.size(); x++) {
            for(int y = 0; y < world.get(x).size(); y++) {
                if(world.get(x).get(y) instanceof AliveCell) {
                    isDead = false;
                }
            }
        }
        return isDead;
    }

    public int getHeight() {
        return this.world.size();
    }

    public int getWidth() {
        return this.world.get(0).size();
    }

    public void setLiveCell(int x, int y) {
        this.world.get(x).set(y, new AliveCell());
    }

    public void setDeadCell(int x, int y) {
        this.world.get(x).set(y, new DeadCell());
    }
}

/*
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
}*/
