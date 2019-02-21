import java.util.*;
import java.io.*;
import java.lang.*;
class Main
{
	public static void main(String[] args) throws java.lang.Exception
	{
		Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		while(t-->0)
		{
			int p=in.nextInt();
			int n=in.nextInt();
			int a[]=new int[1004];
                        a[0]=1;
			for(int i=0;i<n;i++)
			{
				int s=in.nextInt();
				for(int j=p-s;j>=0;j--)
				{
					if(a[j]==1)
						a[j+s]=1;
				}
			}
			if(a[p]==1)
				System.out.println("YES");
			else
				System.out.println("NO");
		}
	}
}

