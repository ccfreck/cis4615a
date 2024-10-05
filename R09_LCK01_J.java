import java.util.*;

public class R09_LCK01_J
{
    private final String lock = new String("LOCK");

    public static void main(String[] args)
    {
        synchronized(lock)
        {
            // ...
        }
    }
}