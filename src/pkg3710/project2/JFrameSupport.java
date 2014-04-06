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
        double y = -.0014*(x*x)+.6164*x-93.12;
        y*=-1;
        return (int)y;
    }
    
    public static int curve2to1(int x){
        double y = .0014*(x*x)-.6164*x+7.1197;
        y*=-1;
        return (int)y;
        //BRUHHHHHHHHH
    }
    
    public static int curve1to3(int x){
        double y = -.0003*(x*x)+.2364*x-64.254;
        y *=-1;
        return (int)y;
    }
    
    public static int curve3to1(int x){
        double y = .0003*(x*x)-.2364*x-21.746;
        y *=-1;
        return (int)y;
    }
    
    public static int curve3to2(int x){
        double y = .0014*(x*x)-1.2749*x+236.91;
        y*=-1;
        return (int)y;
    }
    
    public static int curve2to3(int x){
        double y = -.0014*(x*x)+1.2749*x-322.91;
        y*=-1;
        return (int)y;
    }
}

