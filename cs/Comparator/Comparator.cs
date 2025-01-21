namespace Comparator;
public class Comparator 
{
    public string? Result { get;  private set; }

    public void Compare(int a, int b) 
    {
        if (a < b)
        {
            Result = "less than";
        }
        if (a > b)
        {
            Result = "greater than";
        }
    }

}