import java.io.*;

class Binput
{
    public static void main (String Arg[])
    {
       //InputStreamReader iobj=new InputStreamReader(System.in);
       //BufferedReader bobj=new BufferedReader(iobj);

       BufferedReader bobj=new BufferedReader(new InputStreamReader(System.in));

       System.out.println("Enter yout name:");
       String name=bobj.readLine();
       
       System.out.println("Welcome:"+name);
    } 
}