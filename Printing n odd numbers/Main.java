#include <stdio.h>
int main() {
	int i;
  int p=1;
  scanf("%d",&i);
  for(int n=1;n<=i;n++)
  {
    printf("%d\n",p);
    p+=2;
  }
	return 0;
}