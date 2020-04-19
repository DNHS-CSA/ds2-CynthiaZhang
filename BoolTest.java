public class BoolTest
{
    private int one;
    public BoolTest(int newOne)
    {
        one = newOne;
    }
    public int getOne()
    {
        return one;
    }
    public boolean isGreaterI(BoolTest other)
    {
        return one > other.one;
    }
    public boolean isGreaterII(BoolTest other)
    {
        return one > other.getOne();
    }
    public boolean isGreaterIII(BoolTest other)
    {
        return getOne() > other.one;
    }
}
//