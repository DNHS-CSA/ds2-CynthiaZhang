public class Gadget
{
    private static int status = 0;
    public Gadget()
    {
        status = 10;
    }
    public static void setStatus(int s)
    {
        status = s;
    }
    public int getStatus()
    {
        return status;
    }
}