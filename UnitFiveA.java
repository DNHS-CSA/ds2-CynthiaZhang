public class UnitFiveA
{
    public static void main(String args[])
    {
        System.out.println("************* UNIT FIVE *************");
        // SKILL 1B
        System.out.println("SKILL 1B");
        System.out.println("The Thing class below will contain a String attribute, a constructor, and the helper method, which will be kept internal to the class.\n");
        System.out.println("public class Thing\n{\n  /* missing code */\n}\n}");
        System.out.println("Which of the following replacements for /* missing code */ is the most appropriate implementation of the class?");
        System.out.println("SOLUTION");
        System.out.println("private String str;");
        System.out.println("public Thing(String s)");
        System.out.println("{ /* implementation not shown */ }");
        System.out.println("private void helper()");
        System.out.println("{ /* implementation not shown */ }");
        System.out.println("When the code segment is run... ");
        System.out.println("When i < n is changed to i <= n... ");
        System.out.println(" str is private because it should not be accessible outside of the class.");
        System.out.println(" The constructor is public so that objects can be made outside of the class.");
        System.out.println(" The helper method should be private to keep it internal to the class.");
        System.out.println("");
        System.out.println("-------------------------------------\n");
        // SKILL 5B
        System.out.println("SKILL 5B");
        System.out.println("Consider the following class declaration. \n");
        System.out.println("public class Student");
        System.out.println("{");
        System.out.println("    private String name;");
        System.out.println("    private int age;");
        System.out.println("    public Student(String n, int a)");
        System.out.println("    {");
        System.out.println("        name = n;");
        System.out.println("        age = a;");
        System.out.println("    }");
        System.out.println("    public boolean isOlderThan5()");
        System.out.println("    {");
        System.out.println("        if (age > 5)");
        System.out.println("        {");
        System.out.println("            return true;");
        System.out.println("        }");
        System.out.println("    }");
        System.out.println("}\n");
        System.out.println("SOLUTION");
        System.out.println("The code segment doesn't compile. However, when a return statement for when age is less than or equal to 5, it does.");
        System.out.println("Running fixed code with age = 3... "+ isOlderThan5(3));
        System.out.println(" ANSWER: The isOlderThan5 method is missing a return statement for the case when age is less than or equal to 5.");
        System.out.println("");
        System.out.println("-------------------------------------\n");
        //SKIL 5B, AGAIN
        System.out.println("SKILL 5B");
        System.out.println("Consider the following class. \n");
        System.out.println("public class Help");
        System.out.println("{");
        System.out.println("    private int h;");
        System.out.println("    public Help(int newH)");
        System.out.println("    {");
        System.out.println("        h = newH;");
        System.out.println("    }");
        System.out.println("    public double getH()");
        System.out.println("    {");
        System.out.println("        return h;");
        System.out.println("    }");
        System.out.println("}");
        System.out.println("The getH method is intended to return the value of the instance variable  h.   The following code segment shows an example of creating and using a Help object.\n");
        System.out.println("Help h1 = new Help(5);");
        System.out.println("int x = h1.getH();");
        System.out.println("System.out.println(x);\n");
        System.out.println("Which of the following statements best explains why the getH method does not work as intended?");
        System.out.println("SOLUTION");
        System.out.println("If the getH method had an int parameter... ");
        Help h1 = new Help(5);
        int x = h1.getH();
        System.out.print(x);
        System.out.println("\nTherefore, the answer is The getH method should have an int parameter.");
        System.out.println("-------------------------------------\n");
    }
    public static boolean isOlderThan5(int age)
    {
        boolean x = true;
        if (age > 5)
        {
            x = true;
        }
        else if (age <= 5)
        {
            x = false;
        }
        return x;
    }
}