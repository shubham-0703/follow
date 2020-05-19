class smallest
{
    public static int input(int a[] , int total)
    {
        int temp;
        for(int i=0; i<=total; i++)
        {
            for(int j=i+1; j<total; j++)
            {
                if(a[i]>a[j])
                {
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        return a[0];
    }
    public static void main(String[] arsj)
    {
      int a1[]={12,16,2,10,1};  
	  int a2[]={14,96,79,17,43,12,55};  
System.out.println("Smallest: "+input(a1,5));  
System.out.println("Smallest: "+input(a2,7)); 
    }
}