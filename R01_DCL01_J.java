import java.util.*;

public class R01_DCL01_J
{
    public static void main(String[] args)
    {
        Vector v = new Vector();
        if (v.isEmpty())
        {
            System.out.println("Vector is empty.");
        }
    }
}

class Vector
{
    private int val = 1;

    public boolean isEmpty()
    {
        if (val == 1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}