/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package version1;

/**
 *
 * @author User
 */
public class MyPoint {
    private int x;
    private int y;

    //SETTERS
    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    //GETTERS
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    //MAIN METHODS
    public double getDistance(){
        return Math.hypot(this.x, this.y);
    }
    
    public double getDistance(MyPoint point){
        return Math.hypot(point.x-this.x, point.y-this.y);
    }
    
    public double getDistance(int x, int y){
        return Math.hypot(x-this.x, y-this.y);
    }
    
    public int getQuadrant(){
        int quad=0;
        if(this.x > 0 && this.y >0) quad = 1;
        else if(this.x<0 && this.y>0) quad = 2;
        else if(this.x <0 && this.y <0) quad = 3;
        else if(this.x >0 && this.y<0) quad = 4;
        else if(this.y == 0) quad = 5;
        else if(this.x == 0) quad = 6;
        
        return quad;
    }
    
    public double getAngle(){
        double angle = Math.toDegrees(Math.atan((double)this.y/this.x));
        int quad = this.getQuadrant();
        if(quad < 5){
            if(quad == 3) angle += 180;
            else angle += quad*90;
        }
        
        return angle;
//        return slope;
    }
    
    public void displayPoint(){
        System.out.println("("+this.x+","+this.y+")");
    }

    @Override
    public String toString() {
        return "("+this.x+","+this.y+")"; //To change body of generated methods, choose Tools | Templates.
    }

    public MyPoint(){
        this.x = 0;
        this.y = 0;
    }
    
    public MyPoint(int x, int y){
        this.x = x;
        this.y = y;
    }
}
