#include<stdio.h>
int main()
{
  int n,r,h,g;
  scanf("%d",&n);
  r=n%10;
  h=n/10;
  g=h+r;
  printf("%d",g);
  return 0;
}