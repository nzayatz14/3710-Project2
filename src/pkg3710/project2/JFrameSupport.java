/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkg3710.project2;

/**
 *
 * @author nzayatz14
 */
public class JFrameSupport {
    public static int curve1to2(int x){
        double y = -.0017*(x*x)+.5362*x-61.69;
        y*=-1;
        return (int)y;
    }
    
    public static int curve2to1(int x){
        double y = .0017*(x*x)-.5362*x-24.31;
        y*=-1;
        return (int)y;
        //BRUHHHHHHHHH
    }
    
    public static int curve1to3(int x){
        double y = -.0003*(x*x)+.1848*x-49.882;
        y *=-1;
        return (int)y;
    }
    
    public static int curve3to1(int x){
        double y = .0003*(x*x)-.1848*x-36.118;
        y *=-1;
        return (int)y;
    }
    
    public static int curve3to2(int x){
        double y = .0011*(x*x)-.8856*x+117;
        y*=-1;
        return (int)y;
    }
    
    public static int curve2to3(int x){
        double y = -.0011*(x*x)+.8856*x-203;
        y*=-1;
        return (int)y;
    }
}

