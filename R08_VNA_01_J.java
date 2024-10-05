import java.util.*;

public final class Helper
{
    private final int n;

    public Helper(int n)
    {
        this.n = n;
    }
    // ...
}

final class Foo
{
    private Helper helper;

    public synchronized Helper getHelper()
    {
        return helper;
    }
    public synchronized void setHelper(int num)
    {
        helper = new Helper(num);
    }
}