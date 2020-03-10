import java.util.Scanner;
public class main
{
    public static void menu()
    {
        int choice;
        do
        {
            System.out.println("|-------MAIN MENU-------|");
            System.out.println("| 0. Exit               |");
            System.out.println("| 1. Unit 1             |");
            System.out.println("|-----------------------|");
            Scanner s = new Scanner(System.in);
            System.out.print("| Choose option: ");
            choice = s.nextInt();
            switch (choice)
            {
                case 0:
                    break;
                case 1:
                    UnitOne.main(null);
                    break;
            }
        }
        while (choice != 0);
    }
}