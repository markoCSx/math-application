public class MathApp {
    public static void main(String[] args) {

        // Question 1:
        // declare variables here
        // then code solution
        // then use System.out.println() to display results
        // ex: System.out.println("The answer is " +

        //Step 1

        //1. Create two variables to represent the salary for Bob and Gary, name them
        //bobSalary and garySalary. Create a new variable named
        //highestSalary. Determine which salary is greater using Math.max() and
        //store the answer in highestSalary. Set the initial salary variables to any value
        //you want. Print the answer (i.e "The highest salary is ...")

        int bobSalary = 40_000;
        int garySalary = 45_000;
        int highestSalary;
        highestSalary =  Math.max(bobSalary, garySalary);
        System.out.println("The highest salary is " + highestSalary);

        //2. Find and display the smallest of two variables named carPrice and
        //truckPrice. Set the variables to any value you want

        float carPrice = 20_000.0f;
        float truckPrice = 30_000.0f;
        float cheaperVehicle;
        cheaperVehicle = Math.min(carPrice, truckPrice);
        System.out.println("The least expensive vehicle costs " + cheaperVehicle);

        //3. Find and display the area of a circle whose radius is 7.25

        float circleRadius = 7.25f;
        float circleArea;
        circleArea = (float)(3.14 * (Math.pow(circleRadius, 2)));
        System.out.println("The area of a circle with the radius 7.25 is " + circleArea);

        //4. Find and display the square root of a variable after it is set to 5.0

        circleRadius = 5.0f;
        System.out.println(Math.pow(circleRadius, 2));

        //5. Find and display the distance between the points (5, 10) and (85, 50)

        //double distanceTwoPoints = Math.sqrt((Math.pow((85-5), 2)) + (Math.pow((50-10), 2)));
        System.out.println("The distance between the two points (5, 10) and (85, 50) is " + Math.sqrt((Math.pow((85-5), 2)) + (Math.pow((50-10), 2))));

        //6. Find and display the absolute (positive) value of a variable after it is set to -3.8

        double negativeNumber = -3.8;
        System.out.println(negativeNumber * -1);

        //7. Find and display a random number between 0 and 1

        System.out.println(Math.random());
    }
}
