import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
	// Prompt user to repeat an action and keep doing that til they quit
        boolean done = false;
        Scanner in = new Scanner(System.in);

        String continueYN = "";
        String trash = "";

        double rawVal = 0;
        double doubledVal = 0;

        double rawCval = 0;
        double calcFval = 0;

        do
        {
            System.out.print("Enter the raw value: ");
            if(in.hasNextDouble())
            {
                rawVal = in.nextDouble();
                in.nextLine(); //Clear the buffer of the newline
                doubledVal = doubleYourFun(rawVal);
                System.out.println("The doubled val is: " + doubledVal);
            }
            else
            {
                trash = in.nextLine();
                System.out.println("Enter a valid number not \"" + trash + "\"");
            }

            System.out.print("Enter the raw Celsius value: ");
            if(in.hasNextDouble())
            {
                rawCval = in.nextDouble();
                in.nextLine(); //Clear the buffer of the newline
                calcFval = CtoF(rawCval);
                System.out.println("The Fahrenheit is: " + calcFval);
            }
            else
            {
                trash = in.nextLine();
                System.out.println("Enter a valid number not \"" + trash + "\"");
            }

            System.out.print("Continue [Y/N]: ");
            continueYN = in.nextLine();
            if (continueYN.equalsIgnoreCase("N"))
            {
                done = true;
            }
        }while(!done);
    }
    //Static methods go here
    private static double doubleYourFun(double val2double)
    {
        double retVal = 2 * val2double;

        return retVal;
    }
        private static double CtoF(double cVal)
        {
            // F = C * 1.8 + 32
            return cVal * 1.8 + 32;
        }
}
