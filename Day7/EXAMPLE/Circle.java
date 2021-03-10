package EXAMPLE;

class Circle extends Shape{
    float area; // Variable to store area of a circle
    /**
     * Implement the abstract method to calculate area of circle
     *
     * @param rad a float variable storing value of radius
     * @return void
     */
    @Override
    void calculate(float rad){
        area = getPI() * rad * rad;
        System.out.println("Area of circle is: " + area);
    }
}

