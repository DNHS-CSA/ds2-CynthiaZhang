public class UnitThree
{
    public static void main(String args[])
    {
        // SKILL 4A
        System.out.println("SKILL 2A");
        System.out.println("String weather;\nif (tempt<= 31)\n{\n  weather = \"cold\";\n}\nelse\n{\n  weather = \"cool\";\n}\nif (temp >= 51)\n{\n  weather = \"moderate\";\n}\nelse\n{\n  weather = \"warm\";\n}\nSystem.out.print(weather);");
        System.out.println("Which of the following test cases can be used to show that the code does NOT work as intended?");
        System.out.println("  I. temp = 30\n II. temp = 51\nIII. temp = 60\n");
        System.out.println("SOLUTION");
        System.out.println("  When temp = 30..." + temperature(30));
        System.out.println("  When temp = 51..." + temperature(51));
        System.out.println("  When temp = 60..." + temperature(60));
        System.out.println("ANSWER: I only\n");
        System.out.println("-------------------------------------\n");
        /* // SKILL 2B
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
    */}
    public static String temperature(int temp)
    {
        String weather;
        if (temp<= 31)
        {
            weather = "cold";
        }
        else
        {
            weather = "cool";
        }
        if (temp >= 51)
        {
            weather = "moderate";
        }
        else
        {
            weather = "warm";
        }
        return weather;
    }
}