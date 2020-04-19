import java.util.ArrayList;
public class UnitSeven
{
    public static void main(String args[])
    {
        System.out.println("**************** UNIT SEVEN ****************");
        System.out.println("Consider the following statement, which is intended to create an ArrayList named numbers that can be used to store Integer values.");
        System.out.println("ArrayList<Integer> numbers = /* missing code */;");
        System.out.println("Which of the following can be used to replace /* missing code */ so that the statement works as intended?");
        System.out.println("    I.  new ArrayList()");
        System.out.println("   II.  new ArrayList<Integer>");
        System.out.println("  III.  new ArrayList<Integer>()");
        
        ArrayList<Integer> numbers = new ArrayList();
        ArrayList<Integer> numbers1 = new ArrayList<Integer>();
        
        System.out.println("I and III do not produce an error. Therefore the answer is I and III only.");
        System.out.println("************** END OF UNIT SEVEN **************\n");
    }
}