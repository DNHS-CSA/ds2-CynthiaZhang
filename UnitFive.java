public class UnitFive
{
    public static void main(String args[])
    {
        System.out.println("************* UNIT FIVE A *************");
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
        //SKILL 5B, AGAIN
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
        System.out.println("\nSOLUTION");
        System.out.println("If the getH method had an int parameter... ");
        Help h1 = new Help(5);
        int x = h1.getH();
        System.out.print(x);
        System.out.println("\nTherefore, the answer is The getH method should have an int parameter.");
        System.out.println("-------------------------------------\n");
        
        
        System.out.println("************* UNIT FIVE B *************");
        // SKILL 1B, AGAIN
        System.out.println("SKILL 1B");
        System.out.println("Consider the following class definition.\n");
        System.out.println("public class WeatherInfo");
        System.out.println("{");
        System.out.println("    private String city;");
        System.out.println("    private int day;");
        System.out.println("    private String weather;");
        System.out.println("    public WeatherInfo(String c, int d, String w)");
        System.out.println("    {");
        System.out.println("        city = c;");
        System.out.println("        day = d;");
        System.out.println("        weather = w;");
        System.out.println("    }");
        System.out.println("    public String changeWeather(String w)");
        System.out.println("    {");
        System.out.println("        /* missing code */");
        System.out.println("    }");
        System.out.println("}");
        System.out.println("Which of the following options should replace /* missing code */ so that the changeWeather method will work as intended?");
        System.out.println("\nSOLUTION");
        System.out.println("When /* missing code*/ is replaced with:...");
        System.out.println("  String prev = weather;");
        System.out.println("  weather = w;");
        System.out.println("  return prev;");
        System.out.println("...the code will work as intended, as demonstrated:");
        System.out.println("WeatherInfo a = new WeatherInfo(\"San Diego\", 13, \"rainy\")");
        WeatherInfo a = new WeatherInfo("San Diego", 13, "rainy");
        System.out.println("weather variable currently: " + a.getWeather());
        System.out.println("After changeWeather is run, prev is " + a.changeWeather("sunny") + " and weather is " + a.getWeather());
        System.out.println("-------------------------------------\n");
        // SKILL 1B, YET AGAIN
        System.out.println("SKILL 1B");
        System.out.println("Consider the following class definition.\n");
        System.out.println("public class BoolTest");
        System.out.println("{");
        System.out.println("    private int one;");
        System.out.println("    public BoolTest(int newOne)");
        System.out.println("    {");
        System.out.println("        one = newOne;");
        System.out.println("    }");
        System.out.println("    public int getOne()");
        System.out.println("    {");
        System.out.println("        return one;");
        System.out.println("    }");
        System.out.println("    public boolean isGreater(BoolTest other)");
        System.out.println("    {");
        System.out.println("        /* missing code */");
        System.out.println("    }");
        System.out.println("}");
        System.out.println("The isGreater method is intended to return true if the value of one for this BoolTest object is greater than the value of one for the BoolTest parameter other, and false otherwise.\nThe following code segments have been proposed to replace /* missing code */.");
        System.out.println("     I. return one > other.one;");
        System.out.println("    II. return one > other.getOne();");
        System.out.println("   III. return getOne() > other.one;");
        System.out.println("\nSOLUTION");
        System.out.println(" When I is run with one = 3 and other is BoolTest b with one = 5...");
        BoolTest b = new BoolTest(3);
        BoolTest c = new BoolTest(5);
        System.out.println(" When I runs... " + b.isGreaterI(b));
        System.out.println(" When II runs... " + b.isGreaterII(b));
        System.out.println(" When III runs... " + b.isGreaterIII(b));
        System.out.println(" All 3 work. Answer is \"I, II, and III\"");
        System.out.println("-------------------------------------\n");
        // SKILL 5A, YET AGAIN
        System.out.println("SKILL 5A");
        System.out.println("Consider the following class definition.\n");
        System.out.println("public class Gadget");
        System.out.println("{");
        System.out.println("    private static int status = 0;");
        System.out.println("    public Gadget()");
        System.out.println("    {");
        System.out.println("        status = 10;");
        System.out.println("    }");
        System.out.println("    public static void setStatus(int s)");
        System.out.println("    {");
        System.out.println("        status = s;");
        System.out.println("    }");
        System.out.println("}");
        System.out.println("The following code segment appears in a method in a class other than Gadget.");
        System.out.println("Gadget a = new Gadget();");
        System.out.println("Gadget.setStatus(3);");
        System.out.println("Gadget b = new Gadget();");
        System.out.println("\nSOLUTION");
        System.out.println("  Gadget d = new Gadget();");
        Gadget d = new Gadget();
        System.out.println("status is currently: " + d.getStatus());
        Gadget.setStatus(3);
        System.out.println("  Gadget.setStatus(3);");
        System.out.println("status is now: " + d.getStatus());
        Gadget e = new Gadget();
        System.out.println("  Gadget e = new Gadget();");
        System.out.println("status is now: " + d.getStatus());
        System.out.println("ANSWER: The code segment creates two Gadget objects a and b. The class Gadget’s static variable status is set to 10, then to 3, and then back to 10.");
        System.out.println("-------------------------------------\n");
        //SKILL 5A
        System.out.println("SKILL 5A");
        System.out.println("Consider the following class definition.\n");
        System.out.println("public class Beverage");
        System.out.println("{");
        System.out.println("    private int numOunces;");
        System.out.println("    private static int numSold = 0;");
        System.out.println("    public Beverage(int numOz)");
        System.out.println("    {");
        System.out.println("        numOunces = numOz;");
        System.out.println("    }");
        System.out.println("    public static void sell(int n)");
        System.out.println("    {");
        System.out.println("        /* implementation not shown */");
        System.out.println("    }");
        System.out.println("}\n");
        System.out.println("Which of the following best describes the sell method’s level of access to the numOunces and numSold variables?");
        System.out.println("\nSOLUTION");
        System.out.println(" This is a conceptual question. Static methods can only access and update static variables (numSold). They cannot access nor update instance variables.");
        System.out.println(" Therefore, the answer is: numSold can be accessed and updated; numOunces cannot be accessed or updated.");
        System.out.println("************** END OF UNIT FIVE **************\n");
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