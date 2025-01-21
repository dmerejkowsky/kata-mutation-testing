namespace Comparator;

class Program 
{
  static void Main() 
    {
        var comparator = new Comparator();
        comparator.Compare(1, 1);
        Console.WriteLine(comparator.Result!.ToUpper());
    }
}
