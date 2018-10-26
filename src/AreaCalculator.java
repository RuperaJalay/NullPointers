import java.util.Scanner;
public class AreaCalculator {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the choice");
        System.out.println("1.Area of Circle\n2.Area of Rectangle\n3.Area of Triangle");
        int vaLue = sc.nextInt();
        switch(vaLue) {
            case 1:
                System.out.println("Enter the radius to find area of circle");
                double A = sc.nextDouble();
                double x = area(A);
                System.out.println(x);
                break;

            case 2:
                System.out.println("Enter the value of two sides");
                double B = sc.nextDouble();
                double C = sc.nextDouble();
                double y = area(B,C);
                System.out.println(y);
                break;


            case 3:
                System.out.println("Enter the value of height and base");
                long D = sc.nextLong();
                long e = sc.nextLong();
                float R = area(D,e);
                System.out.println(R);
                break;


            default:
                System.out.println("Invalid Choice\n");
        }

        }


    private static double area(double radius){
        //To find the area of the circle//
        double are;
        double pi = 3.14159;

        if(radius < 0)
        {
            return -1;
        }
        else
        {
             are = radius * radius * pi;
            return are;
        }

    }

    private static double area(double x, double y){
        //it used to calculate the area of the Rectangle//

        double rec_are;

        if(x <  0 || y < 0){
            return  -1;
        }
        else
        {
            rec_are = x * y;
            return rec_are;
        }
    }

    private static float area(long b, long h){
       //b is a base && h is a height.It is used to find the area of the triangle//
        if(b < 0 || h < 0){
            return -1;
        }
        else
        {
            return (float) (b * h) / 2;
        }
    }
}
