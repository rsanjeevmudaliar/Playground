#include <stdio.h>
int main() {
	int num,sum,c;
  scanf("%d",&num);
  while(num!=0)
  { 
    c=num%10;
    sum=sum+c;
    num=num/10;
  }
  printf("%d",sum);
	return 0;
}