class pattern3
{
    public static void main(String args[])
    {
        int m = 1;
        for(int i = 1;i<=5;i++)
        {
            for(int j=5;j>=i;j-- )
            {
                System.out.print(m);
                m++;
            }
            m=1;
            System.out.println();
        }
    }
}