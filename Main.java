import java.util.Scanner;

class Main {
    void main()
    {
        Scanner in = new Scanner(System.in);
        int birthMonth = 0;

        IO.print("Enter your birth month [1-12]: ");

        if(in.hasNextInt()) {
            birthMonth = in.nextInt();
            in.nextLine(); //clear the newline from the bugger

            if (birthMonth >= 1 && birthMonth <=12)
            {
                IO.println("You said your birth month is " + birthMonth);

            }
            else
            {
                IO.println("You said your birth month is " + birthMonth);
                IO.println("That is invalid, choose [1-12].");
                System.exit(0);
            }
        }
    }

}
