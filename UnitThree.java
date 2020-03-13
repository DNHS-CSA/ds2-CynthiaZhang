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
        // SKILL 2C
        System.out.println("SKILL 2B");
        System.out.println("Consider the following code segment:");
        System.out.println("String first = new String(\"duck\");\nString second = new String(\"duck\");\nString third = new String (\"goose\");\nif (first == second)\n{\n  System.out.print(\"A\");\n}\nelse if (second == third)\n{\n System.out.print(\"B\");\n}\nelse if (first.equals(second))\n{\n  System.out.print(\"C\");\n}\nelse if (second.equals(third))\n{\n  System.out.print(\"D\");\n}\nelse\n{\n  System.out.print(\"E\");\n}");
        System.out.println("What is printed as a result of executing the code segment?\n");
        System.out.println("SOLUTION");
        System.out.println("  When the code is run..." + questionTwo());
        System.out.println("ANSWER: C");
        System.out.println("-------------------------------------\n");
        
        // SKILL 4C
        System.out.println("SKILL 4C");
        System.out.println("Consider the following code segment. Assume that variables x and y have been declared as int variables and have been assigned integer values.");
        System.out.println("I.\n\nint result = 0;\nif (x>y)\n{\n  result = x - y;\n  System.out.print(result);\n}\nelse if (x<y)\n{\n  result = y-x;\n  System.out.print(result);\n}\nelse\n{\n  System.out.print(result);\n}");
        System.out.println("II.\n\n if (x<y)\n{\n  System.out.print(y-x);\n}\nelse\n{\n  System.out.print(x-y);\n}");
        System.out.println("Which of the following correctly compares the outputs of the two code segments.");
        System.out.println("SOLUTION");
        System.out.println("When I runs for x=1, y=2... " + questionThreeI(1,2));
        System.out.println("When II runs for x=1, y=2... " + questionThreeII(1,2));
        System.out.println("When I runs for x=2, y=1... " + questionThreeI(2,1));
        System.out.println("When II runs for x=2, y=1... " + questionThreeII(2,1));
        System.out.println("When I runs for x=1, y=1... " + questionThreeI(1,1));
        System.out.println("When II runs for x=1, y=1... " + questionThreeII(1,1));
        System.out.println("Therefore, the answer is: \"Code segment I and code segment II produce the same output for all values of x and y\"\n\n");
        //SKILL 4C 2
        System.out.println("SKILL 4C 2");
        System.out.println("In the following expression, j, k, and m are properly declared and initialized int variables.");
        System.out.println("!((j == k) && (k > m))");
        System.out.println("Which of the following is equivalent to the expression above?");
        System.out.println("SOLUTION");
        System.out.println(" (j != k) || (k <= m)");
        System.out.println(" One of De Morgan's laws says that !(A && B) is equivalent to !A || !B .");
        System.out.println(" For example, \"I don't like both apples and oranges\" is the same as \"I don't like apples, or I don't like oranges.\"");
        System.out.println("-------------------------------------\n");
    }
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
    public static String questionTwo()
    {
        String first = new String("duck");
        String second = new String("duck");
        String third = new String("goose");
        if (first == second)
        {
            return "A";
        }
        else if (second == third)
        {
            return "B";
        }
        else if (first.equals(second))
        {
            return "C";
        }
        else if (second.equals(third))
        {
            return "D";
        }
        else
        {
            return "E";
        }
    }
    public static int questionThreeI(int x, int y)
    {
        int result = 0;
        if (x > y)
        {
            result = x - y;
            return result;
        }
        else if (x<y)
        {
            result = y - x;
            return result;
        }
        else
        {
            return result;
        }
    }
    public static int questionThreeII(int x, int y)
    {
        int result = 0;
        if (x<y)
        {
            return y-x;
        }
        else
        {
            return x-y;
        }
    }
}