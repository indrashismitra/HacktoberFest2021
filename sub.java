import java.io.*;
 
class Sub
{
static int subtractone(int x)
{
    int m = 1;
 
    // Flip all the set bits
    // until we find a 1
    while (!((x & m) > 0))
    {
        x = x ^ m;
        m <<= 1;
    }
 
    // flip the rightmost
    // 1 bit
    x = x ^ m;
    return x;
}
 
// Driver Code
public static void main (String[] args)
{
    System.out.println(subtractone(47));
}
}