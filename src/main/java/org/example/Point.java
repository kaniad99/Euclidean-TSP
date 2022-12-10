package org.example;


//test
public class Point {
    private final int id;
    private final double x;
    private final double y;
    private boolean visited;
    public Point(int vid, double vx, double vy){
        this.id=vid;
        this.x = vx;
        this.y = vy;
    }

    public Point(int vid, double vx, double vy, boolean vVisited) {
        this.id=vid;
        this.x = vx;
        this.y = vy;
        this.visited = vVisited;
    }

    double getX(){
        return this.x;
    }
    double getY(){
        return this.y;
    }
    int getId(){
        return this.id;
    }


    void showPoint(){
        System.out.println("ID"+"["+this.id+"]"+"("+this.x+","+this.y+")");
    }
    void showPoint2(){
        System.out.print("("+this.x+","+this.y+")");
    }

    @Override
    public String toString() {
        return "Point{" +
                "id=" + id +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}
