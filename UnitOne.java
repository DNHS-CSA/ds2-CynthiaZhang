public class UnitOne
{
    public static void main(String args[])
    {
        System.out.println("************* UNIT ONE *************");
        // SKILL 2A
        System.out.println("SKILL 2A");
        System.out.println("Which of the following arithmetic expression evalutes to 1?\n I. 2/5%3 \n II. 2/(5%3) \n III. 2/5+1 \n");
        System.out.println("SOLUTION");
        System.out.println("I = " + 2/5%3 + "\nII = " + 2/(5%3) + "\nIII = " + 2/5+1);
        System.out.println("ANSWER: II and III only");
        System.out.println("");
        System.out.println("-------------------------------------\n");
        // SKILL 2B
        System.out.println("SKILL 2B");
        System.out.println("Consider the following code segment: \n double d = 0.25; \n int i = 3; \n double diff = d - i; \n System.out.print((int)diff-0.5);");
        System.out.println("What is printed as a result of executing the code segment?\n");
        System.out.println("SOLUTION");
        double d = 0.25;
        int i =3;
        double diff = d -i;
        System.out.println((int)diff - 0.5);
        System.out.println("-------------------------------------\n");
        // SKILL 5B
        System.out.println("SKILL 5B");
        System.out.println("Consider the following code segment, which is intended to display 6.0");
        System.out.println(" double fact1 = 1/2; \n double fact2 = 3*4; \n double product = fact1 * fact2; \n System.out.println(product);");
        System.out.println("Which of the following best describes the error, if any, in the code segment?\n");
        System.out.println("SOLUTION");
        System.out.println("When the code runs...");
        double fact1 = 1/2;
        double fact2 = 3*4;
        double product = fact1 * fact2;
        System.out.println(" " + product); //space added for readability
        System.out.println("If the numerator of 1/2 is cast as a double...");
        fact1 = (double)1/2; //defining variables again
        fact2 = 3*4;
        product = fact1 * fact2;
        System.out.println(" " + product);
        System.out.println("Therefore the answer is: \"Either the numerator or the denominator of the fraction 1 / 2 should be cast as double\"\n\n");
        System.out.println("************** END OF UNIT ONE **************\n");
    }
}
//