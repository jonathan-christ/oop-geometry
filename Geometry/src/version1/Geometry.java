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
public class Geometry {
    public static void main(String[] args) {
        MyPoint point = new MyPoint();
        MyPoint point2 = new MyPoint();
        
        point.setX(-5);
        point.setY(-10);
        System.out.println(point.getQuadrant());
        point.displayPoint();
        point2.displayPoint();
        
        System.out.println(point);
        
        System.out.println(point.getDistance());
        
        System.out.println(point.getDistance(point2));
        
        System.out.println(point.getDistance(0,0));
        
        System.out.println(point.getAngle());
    }
    
}
