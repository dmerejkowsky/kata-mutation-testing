namespace Comparator.Tests;

public class Tests
{
    private Comparator _comparator;
    [SetUp]
    public void Setup()
    {
        _comparator = new Comparator();
    }

    [Test]
    public void TestLessThan()
    {
        _comparator.Compare(1, 2);
        Assert.That(_comparator.Result, Is.EqualTo("less than"));
    }

    [Test]
    public void TestGreaterThan()
    {
        _comparator.Compare(2, 1);
        Assert.That(_comparator.Result, Is.EqualTo("greater than"));
    }
}