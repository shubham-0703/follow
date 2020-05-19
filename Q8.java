import java.util.*;
class Arm
{
    void check()
    {
        System.out.println("Enter the no. for armstrong");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int temp=a;
        int sum=0;
        int rem;
        int ant;
        while(a>0)
        {
          rem=a%10;
          sum=sum+(rem*rem*rem);
          a=a/10;
        }
        if(sum==temp)
        {
            System.out.println("No. is Armstrong");
        }
        else
        {
            System.out.println("No. is not Armstrong");
        }
    }
    public static void main(String[] arsg)
    {
        Arm A=new Arm();
        A.check();
    }
}