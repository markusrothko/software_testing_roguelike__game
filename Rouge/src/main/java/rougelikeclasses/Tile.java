package rougelikeclasses;

public class Tile extends Thing {

    public Tile(String name, int x, int y){
        super(name,x,y);
        if(name.toLowerCase().equals("mountain")||name.toLowerCase().equals("water")){
            blocked = true;
        }


    }



}
