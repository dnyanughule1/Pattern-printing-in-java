*      *
**    **
***  ***
********
********
***  ***
**    **
*      *
butterfly pattern

class Pattern
{
    public static void main(String[] args)
    {
        int n=4;
        //upper half code
        for(int i=1;i<=n;i++) //outer loop
        {
            for(int j=1;j<=i;j++) //inner loop for *
            {
                System.out.print("*");
            }
            int space= 2 * (n-i); 
            for(int j=1;j<=space;j++) //loop for space
            {
                System.out.print(" ");
            }

            for(int j=1;j<=i;j++) //for remaining *
            {
                System.out.print("*");
            }
            System.out.println();
        }
        //lowe half code
        for(int i=n;i>=1;i--) // he fkt ulat kel
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            int space= 2 * (n-i);
            for(int j=1;j<=space;j++)
            {
                System.out.print(" ");
            }

            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
}


   *   
  ***  
 ***** 
*******
*******
 ***** 
  ***  
   *  


class Pattern
{
    public static void main(String[] args)
    {
        int space;
        int n=4;
        //outer loop
       for(int i=1;i<=n;i++)
       {
        for(int j=1;j<=(n-i);j++) //for space
        {
            System.out.print(" ");
        }
        for(int j=1;j<=i;j++) //first upper half
        {
            System.out.print("*");
        }
        for(int j=2;j<=i;j++) //2nd half upper
        {
            System.out.print("*");
        }
        System.out.println();
       }
      for(int i=n;i>=1;i--) // same code above (below half)
       {
        for(int j=1;j<=(n-i);j++)
        {
            System.out.print(" ");
        }
        for(int j=1;j<=i;j++)
        {
            System.out.print("*");
        }
        for(int j=2;j<=i;j++)
        {
            System.out.print("*");
        }
        System.out.println();
       }
      
    }
} 


    
    1
   212
  32123
 4321234
543212345


class Pattern
{
    public static void main(String[] args)
    {
        int space;
        int n=5;
       for(int i=1;i<=n;i++)
       {
        //spaces
        space=n-i;
        for(int j=1;j<=space;j++)
        {
            System.out.print(" ");
        }
        //1st half
        for(int j=i;j>=1;j--)
        {
            System.out.print(j);
        }
        //2nd half
        for(int j=2;j<=i;j++)
        {
            System.out.print(j);
        }
        System.out.println();

       }
    }
}




1 
0 1
1 0 1
0 1 0 1
1 0 1 0 1


class Pattern
{
    public static void main(String[] args)
    {
        int n=5;
        int num=1,sum;
        for(int i=1;i<=n;i++) //outer loop
        {
            for(int j=1;j<=i;j++) //inner loop
            {
                sum=i+j;

                if(sum%2==0) //row,column sum even or odd
                {
                    System.out.print("1 ");
                }
                else
                {
                    System.out.print("0 ");
                }
            }
            System.out.println(); // row change
        }
    }
}


