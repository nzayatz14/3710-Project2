/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//package pkg3710.project2;

/**
 *
 * @author nzayatz14
 */
public class JFrameSupport {
	//arrays to hold the coefficients of the parabolas that the cups will move along when swapping
    private static double a[] = {-.0017,.0017,-.0003,.0003,-.0011,.0011};
    private static double b[] = {.5362,-.5362,.1848,-.1848,.8856,-.8856};
    private static double c[] = {-61.69,-24.31,-49.882,-36.118,-203,117};
    
    //calculates the y value of the given x value along the given curve
    public static int calculateCurve(int curve, int x){
        double y = a[curve]*(x*x)+b[curve]*x+c[curve];
        y*=-1;
        return (int)y;
    }
    
    //find the curve needed to be used based on where the cup is moving from and going to
    //returns the y value of the parabola found for the given x value
    public static int findCurve(int from, int to, int x){
        if(from == 1 && to == 2)
            return calculateCurve(0,x);
        else if(from == 2 && to == 1)
            return calculateCurve(1,x);
        else if(from == 1 && to == 3)
            return calculateCurve(2,x);
        else if(from == 3 && to == 1)
            return calculateCurve(3,x);
        else if(from == 2 && to == 3)
            return calculateCurve(4,x);
        else
            return calculateCurve(5,x);
    }
}
