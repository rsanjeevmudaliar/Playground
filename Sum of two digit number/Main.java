#include<stdio.h>
int main()
{
int num,sum_of_digits;
  scanf("%d",&num);
  sum_of_digits=(num%10)+(num/10);
  printf("%d",sum_of_digits);
  return 0;
}