#include <stdio.h>
int main() {
	int num,rev,f,l,c;
  int copy,sum;
  scanf("%d",&num);
  copy=num;
  while(num!=0)
  {
    c=num%10;
    rev=rev*10+c;
    num=num/10;
  }
  f=copy%10;
  l=rev%10;
  sum=l+f;
  printf("%d",sum);
	return 0;
}