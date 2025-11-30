import java.lang.Math;
public class Circle1 {
    Point cp;
    double  radius;
    Circle1(int x, int y, double length){
        this.cp = new Point(x, y);
        this.radius = length;
    }
    public int CompareTo(Circle1 other){
        if(this.radius > other.radius){
            return 1;
        }else if(this.radius == other.radius){
            return 0;
        }else{
            return -1;
        }
    }
    public boolean contains(Point p){
        double d = cp.distance(p);
        if(d > radius){
            return true;
        }else{
            return false;
        }
    }
    /*public boolean contains(Circle1 c){
        
    }*/
    public String toString(){
        return String.format("Center:%s; Radius=%.2f%n",cp,radius);
    }
    
    public static void main(String[] args){
        Circle1 c1 = new Circle1(1,4,7);
        Circle1 c2 = new Circle1(3,0,8);
        Circle1 c3 = new Circle1(1,9,5);
        System.out.print(c1);
        System.out.print(c2);
        System.out.print(c3);
        int a1 = c1.CompareTo(c2);
        int a2 = c1.CompareTo(c3);
        int a3 = c2.CompareTo(c3);
        boolean res = c2.contains(c1.cp);
        if(res == true){
            System.out.print("c2 包含 c1 的圓心");
        }else{
            System.out.print("c2 不包含 c1 的圓心");
        }
    } 
}

class Point {
    int x;
    int y;
    Point(int x1, int y1){
        this.x = x1;
        this.y = y1;
    }
    Point(){
        Point point = new Point(0, 0);
    }
    public double distance(Point p){
        double tmpX = (double) Math.pow((this.x - p.x), 2);
        double tmpY = (double) Math.pow((this.y - p.y), 2);
        double distance = Math.sqrt(tmpX+tmpY);
        return distance;
    }
}

public class meow{
    
}
