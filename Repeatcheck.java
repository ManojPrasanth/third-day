import java.util.*;

class Repeatcheck
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
String str1=s.nextLine();
String str2=s.nextLine();
int temp1[]=new int[str1.length()];
int temp2[]=new int[str2.length()];
int k=-1,count1=0,count2=0;
for(int i=0;i<str1.length()-1;i++)
{
	for(int j=i+1;j<str1.length();j++)
	{
		if(str1.charAt(i)==str1.charAt(j))
		{
			temp1[++k]=i;
			temp1[++k]=j;
			count1+=2;
		}
	}
}
k=-1;
for(int i=0;i<str2.length()-1;i++)
{
	for(int j=i+1;j<str2.length();j++)
	{
		if(str2.charAt(i)==str2.charAt(j))
		{
			temp2[++k]=i;
			temp2[++k]=j;
			count2+=2;
		}
	}
}

for(int i=0;i<=count1;i++)
{	
	if(temp1[i]==temp2[i])
	{
		count1--;
	}
}
if(count1==0)
System.out.println("TRUE");
else
System.out.println("FALSE");
}
}