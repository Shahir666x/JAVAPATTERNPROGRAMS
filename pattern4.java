class pattern4
{
    public static void main(String args[])
    {   int m=1;
        int i=1;
        while(i<=5)
        {
            int j=5;
            while(j>=i)
            {
                System.out.print(m);
                m++;
                j--;
            }
            m=1;
            i++;
            System.out.println();
        }
    }
}