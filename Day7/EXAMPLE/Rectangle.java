package EXAMPLE;

class Rectangle extends Shape{
    float perimeter; // Variable to store perimeter value
    float length = 10; // Variable to store length

    /**
     * Implement the abstract method to calculate the perimeter
     *
     * @param width a float variable storing width
     * @return void
     */

    @Override
    void calculate(float width){
        perimeter = 2 * (length + width);
        System.out.println("Perimeter of the Rectangle is: " + perimeter);
    }
}
