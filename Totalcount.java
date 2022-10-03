import java.util.*;

 class Tile {
    int edgelength;
    int area;
    Tile(){

    }

    Tile(int edgelength){
        this.edgelength=edgelength;
        this.area=edgelength*edgelength;
    }
     int getArea(){
         
        return getArea();
     }
}
 class Floor{
    int length;
    int breadth;
    Floor(int length,int breadth){
        this.length=length;
        this.breadth=breadth;
    }
    void totaltiles(Tile t){
        int  tile_area= t.getArea();
        int floorarea=length*breadth;
        int numberoftiles=floorarea/tile_area;
        System.out.println("Number of tiles="+numberoftiles);
    }
}
public class Totalcount{
    public static void main(String args[])
    {System.out.println("Enter the tile and floor length");
        Scanner s = new Scanner(System.in);
        System.out.println("Enter length of the Tile ");
        int tilelength = s.nextInt();
        Tile t1 =new Tile(tilelength);
        System.out.println("Enter length and width of  the Floor ") ;
        int floorlength = s.nextInt();
        int floorwidth = s.nextInt();
        Floor f = new Floor(floorlength,floorwidth);
        f.totaltiles(t1);
     }
}

