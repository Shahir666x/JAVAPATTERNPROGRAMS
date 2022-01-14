class pattern5
{
    public static void main(String args[])
    {
        int m =1;
        int i =1;
        while(i<=5)
        {
            int j=4;
            while(j>=i)
            {
                System.out.print(" ");
                j--;
            }
            int k=1;
            while(k<=i)
            {
                System.out.print(m);
                m++;
                k++;
            }
            m=1;
            System.out.println();
            i++;
        }
    }
}