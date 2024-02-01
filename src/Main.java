//Importing Scanner
import java.util.Scanner;

class Main {
    public static void main(String[] args)throws InterruptedException {
        //DECLARE VARIABLES
        double length, width, height, volume, surfaceArea;

        // INITIALIZE SCANNER
        Scanner keyboard = new Scanner(System.in);

        //Printing a statement asking the user for the length
        System.out.println("What is the length (in cm): ");
        //Storing the input from the user in the length variable
        length = keyboard.nextDouble();
        //Acknowleding the users input
        System.out.println("The length you entered is " + length + " cm.");
        //Create a delay in milliseconds (note: 1000 milliseconds = 1 sec)
        Thread.sleep(3000); //3 second delay (3000 milliseconds)
        //clear the screen
        System.out.print("\033[H\033[2J");
        System.out.flush();

        //Printing a statement asking the user for the width
        System.out.println("What is the width (in cm): ");
        //Storing the input from the user in the width variable
        width = keyboard.nextDouble();
        //Acknowleding the users input
        System.out.println("The width you entered is " + width + " cm.");
        //Create a delay in milliseconds (note: 1000 milliseconds = 1 sec)
        Thread.sleep(3000); //3 second delay (3000 milliseconds)
        //clear the screen
        System.out.print("\033[H\033[2J");
        System.out.flush();

        //Printing a statement asking the user for the height
        System.out.println("What is the height (in cm): ");
        //Storing the input from the user in the width variable
        height = keyboard.nextDouble();
        //Acknowleding the users input
        System.out.println("The width you entered is " + height + " cm.");
        //Create a delay in milliseconds (note: 1000 milliseconds = 1 sec)
        Thread.sleep(3000); //3 second delay (3000 milliseconds)
        //clear the screen
        System.out.print("\033[H\033[2J");
        System.out.flush();

        //Calculating the volume and storing it in the volume variable
        volume=length*width*height;

        //Calculating the surface area and storing it in the surfaceArea variable
        surfaceArea = (2*length*width)+(2*length*height)+(2*height*width);

        //Printing a statement telling the user the volume of the cuboid
        System.out.println("The volume of the cuboid is " + volume + " cm^3.");
        //Printing a cosmetic spacing
        System.out.println();
        //Printing a statement telling the user the surface area of the cuboid
        System.out.println("The surface area of the cuboid is " + surfaceArea + " cm^2.");
    }
}