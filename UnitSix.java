public class UnitSix
{
    public static void main(String args[])
    {
        System.out.println("************* UNIT SIX *************");
        System.out.println("Consider the following code segment.");
        System.out.println("    int[] arr = {10, 20, 30, 40, 50};");
        System.out.println("    for(int x = 1; x < arr.length - 1; x++)");
        System.out.println("    {");
        System.out.println("        arr[x + 1] = arr[x] + arr[x + 1];");
        System.out.println("    }");
        System.out.println("Which of the following represents the contents of arr after the code segment has been executed?");
        int[] arr = {10, 20, 30, 40, 50};
        System.out.println("After running, arr contains:");
        for(int x = 1; x < arr.length - 1; x++)
        {
            arr[x + 1] = arr[x] + arr[x + 1];
        }
        for (int x : arr)
        {
            System.out.print(x + " ");
        }
        System.out.println("\nTherefore, answer is {10, 20, 50, 90, 140}");
        System.out.println("************** END OF UNIT SIX **************\n");
    }
}