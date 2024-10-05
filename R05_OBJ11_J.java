import java.util.*;

public class R05_OBJ11_J
{
    public static void main(String[] args)
    {
        // Now, n attacker cant replace the function table as follows due to the final keyword that treats it as a constant:
        // FunctionTable.m_functions = new_table; XXXXX
    }
}

class FunctionTable
{
    public static final FuncLoader m_functions;
}