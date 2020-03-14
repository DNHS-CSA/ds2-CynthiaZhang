public class UnitTwo
{
    public static void main(String args[])
    {
        System.out.println("************* UNIT TWO *************");
        // SKILL 1C
        System.out.println("SKILL 1C");
        System.out.println("Consider the following class declaration.\npublic class Thing\n{\n  private String color;\n\n  public Thing()\n{\n    color = \"Blue\";\n    }\n\n  public Thing(String setColor)\n  {\n    color = setColor;\n  }\n}\n");
        System.out.println("Which of the following code segments, when appearing in a class other than Thing, would create a reference of type Thing with a value of null?");
        System.out.println("SOLUTION");
        System.out.println("  Thing someThing;");
        System.out.println("This does not initialize the variable Thing, and thus the value is null.");
        System.out.println("-------------------------------------\n");
        // SKILL 1B
        System.out.println("SKILL 2B");
        System.out.println("The code segment below is intended to randomly print one of the values 2, 4, 6, or 8 with equal probability.");
        System.out.println(" int val = /*missing code */ ;\n val *= 2; \n System.out.print(val);\"\n");
        System.out.println("SOLUTION");
        int val = (int) (Math.random() * 4 +1);
        val *= 2;
        System.out.println("  AFTER RUNNING: "+val);
        System.out.println("ANSWER: (int) (Math.random() * 4 + 1)");
        System.out.println("************** END OF UNIT TWO **************\n");
    }
}