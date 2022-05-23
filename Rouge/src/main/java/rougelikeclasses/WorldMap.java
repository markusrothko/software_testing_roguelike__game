package rougelikeclasses;

import java.lang.reflect.Array;
import java.util.*;

public class WorldMap {


    private int height;
    private int width;
    private static final int MAX_HEIGHT = 1000;
    private static final int MAX_WIDTH = 1000;
    private static final int MIN_HEIGHT = 500;
    private static final int MIN_WIDTH = 500;
    private Random rand = new Random();
    public Creature player;
    public Set<Creature> creatures;
    protected Tile[][] map;

    public WorldMap(Creature player, int width, int height) {
        if (height > MAX_HEIGHT || height < MIN_HEIGHT || width > MAX_WIDTH || width < MIN_WIDTH) {
            throw new IllegalArgumentException("World map size out of bounds");
        }
        this.player = player;
        this.height = height;
        this.width = width;
        map = new Tile[width][height];
        creatures = new HashSet<>();
        fillMap();

    }




    public void fillMap() {
        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                if(x==0||x==width-1||y==0||y==height-1)
                    map[x][y] = new Tile("Mountain",x,y);
                else{
                    int tileType = rand.nextInt(10)+1;
                    switch(tileType){
                        case 1: case 2: case 3: case 4:
                            map[x][y] = new Tile("Grass",x,y);
                            break;
                        case 5: case 6: case 7: case 8:
                            map[x][y] = new Tile("Forest",x,y);
                            break;
                        case 9:
                            map[x][y] = new Tile("Mountain",x,y);
                            break;
                        case 10:
                            map[x][y] = new Tile("Water",x,y);
                            break;
                    }
                }

            }
        }
    }

    public boolean simulateCombat(Character pl, Creature enemy){
        while (pl.getHealth()>0 && enemy.getHealth()>0){
            enemy.setHealth(enemy.getHealth()-pl.getStrength());
            pl.subtractHealth(enemy.getStrength());
        }

        if(pl.getHealth()>0)
            return true;
        else
            return false;
    }

        public int getHeight () {
            return height;
        }

        public int getWidth () {
            return width;
        }

        public void playerMove(int dx, int dy) {
            int oldX = player.getX();
            int oldY = player.getY();
            Tile tile = map[oldX + dx][oldY + dy];
            if(tile.isBlocked() != true) {
                player.move(dx, dy);
            } else {
                String envType = tile.getType();
                System.out.printf("Can't walk through %s silly!", envType);
            }
        }

}


