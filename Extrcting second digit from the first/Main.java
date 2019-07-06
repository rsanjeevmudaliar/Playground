#include <stdio.h>
int main() 
{
	int num,rev,s,c;
  scanf("%d",&num);
  while(num!=0)
  {
    c=num%10;
    rev=rev*10+c;
    num=num/10;
  }
  s=(rev/10)%10;
  printf("%d",s);
	return 0;
}