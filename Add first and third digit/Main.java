#include<stdio.h>
int main()
{
int num,first_digit,third_digit;
  scanf("%d",&num);
  first_digit=num/100;
  third_digit=num%10;
  printf("%d",(first_digit+third_digit));
  return 0;
}