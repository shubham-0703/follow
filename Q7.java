class leap
{
    public static int input(int n)
    {
        if(n%4==0 || n%400==0 && n%100!=0)
        {
            System.out.println("year is leap");
        }
        else
        {
            System.out.println("year is not leap");
        }
        return 0;
    }
    public static void main(String args[])
    {
         leap l=new leap();
         l.input(2013);
    }
}