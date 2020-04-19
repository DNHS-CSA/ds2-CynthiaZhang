public class UnitFour
{
    public static void main(String args[])
    {
        System.out.println("************* UNIT FOUR *************");
        // SKILL 5C
        System.out.println("SKILL 5C");
        System.out.println("Consider the following code segment.\n");
        System.out.println("int n = 6;\nfor (int i - 1; i<n; i = i + 2\n{\n  System.out.print(i + \" \");\n}");
        System.out.println("Which of the following best explains how changing i < n to i <= n in line 2 will change the result?");
        System.out.println("SOLUTION");
        System.out.println("When the code segment is run... " + Segment());
        System.out.println("When i < n is changed to i <= n... " + Segment2());
        System.out.println("ANSWER: II and III only");
        System.out.println("");
        System.out.println("************** END OF UNIT FOUR **************\n");
    }
    public static String Segment()
    {
        int n = 6;
        String a = "";
        for (int i = 1; i < n; i = i + 2)
        {
            a += (i + " ");
        }
        return a;
    }
    public static String Segment2()
    {
        int n = 6;
        String a = "";
        for (int i = 1; i <= n; i = i + 2)
        {
            a += (i + " ");
        }
        return a;
    }
}
//