public class AreaCalculator {
    public static void main(String [] args){
        double x = area(8.5);
        System.out.println(x);
    }

    private static double area(double radius){
        //To find the area of the circle
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

}
