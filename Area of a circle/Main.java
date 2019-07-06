#include <stdio.h>
#include <math.h>
#define PI 3.14
 
void main()
{
    float radius, area;
    scanf("%f", &radius);
  radius=radius/2;
    area = PI * pow(radius, 2);
    printf("%.2f\n", area);
}