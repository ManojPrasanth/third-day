import java.util.*;
public class Longestprefix
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int n,j;
n=s.nextInt();
String str[]=new String[100];
for(int i=0;i<n;i++)
{
str[i]=s.next();
}
String long,check;
if(str.length>0)
long=str[0];
for(int i=1;i<str.length;i++)
{
check=str[i];
for(j=0;j<Math.min(long.length(),str[i].length());j++)
{
if(long.charAt(j)!=check.charAt(j))
break;
}
long=str[i].subString(0,j);
}
System.out.println("longest prefix is:"+long);
}
}