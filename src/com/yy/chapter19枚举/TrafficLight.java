package com.yy.chapter19Ã¶¾Ù;

enum Siginal{GREEN , YELLOW ,RED}
public class TrafficLight {
    Siginal color = Siginal.RED;
    public void change(){
        switch (color){
            case RED: color =Siginal.GREEN;
                    break;
            case YELLOW: color =Siginal.RED;
                    break;
            case GREEN: color = Siginal.YELLOW;
                    break;

        }
    }
    public String toString(){
        return  "the traffic color is " + color;
    }

    public static void main(String[] args) {
        TrafficLight t= new TrafficLight();
        for(int i=0 ;i< 7 ; i++){
            System.out.println(t);
            t.change();
        }
    }
}
