//* */ bubble sort in acending order

class bubblesort
{
    public static void main(String[] args)
    {
        int[] a ={45,78,35,69,75,255};

        int temp;
        for(int i =0; i<a.length;i++)
        {
             int flag=0;

            for(int j=0;j<a.length-1;j++)
            {
                if(a[j]>a[j+1])
                {
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                    flag=1;


                }
            }
            if(flag==0)
            {
                break;
            }
        }
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]+ " ");
        }
    }
}


