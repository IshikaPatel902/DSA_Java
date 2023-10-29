package basic_java_program;
//    circle,       Square,rhombus,         rectangle,Parallelogram,
//  triangle, Isosceles Triangle,Equilateral Triangle,      Trapezium

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        float r,    a,d1,d2,    l,w,b,h,   base,height,  ta,tb,th,tarea,plus;
        System.out.println("------------AREA OF---------------");
        System.out.println("\nEnter radius of circle");
        r=in.nextFloat();
        System.out.println("Circle:"+(3.14*r*r));

        System.out.println("\nEnter sides of square");
        a=in.nextFloat();
        System.out.println("Square:"+(a*a));

        System.out.println("\nEnter diagonal(d1 & d2) of Rhombus");
        d1=in.nextFloat();
        d2=in.nextFloat();
        System.out.println("Rhombus"+(0.5*d1*d2));

        System.out.println("\nEnter length and weidth of rectangle");
        l=in.nextFloat();
        w=in.nextFloat();
        System.out.println("Rectangle:"+(l*w));

        System.out.println("\nEnter base and verticel height of Parallelogram");
        b=in.nextFloat();
        h=in.nextFloat();
        System.out.println("Parallelogram"+(b*h));

        System.out.println("\nEnter base and verticel height of triangle");
        base=in.nextFloat();
        height=in.nextFloat();
        System.out.println("Triangle"+(0.5*base*height));
        //System.out.println("Isosceles Triangle"+(0.5*base*height));
        System.out.println("Equilateral Triangle"+(0.43*base*base));

        System.out.println("\nEnter base and verticel height of trapezium");
        ta=in.nextFloat();
        tb=in.nextFloat();
        th=in.nextFloat();
        plus=ta+tb;
        tarea = (float) (0.5*plus*th);
        System.out.println("trapezium"+tarea);

    }
}
