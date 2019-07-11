#include<stdio.h>
int main()
{
  int n,r,t,y,g;
  scanf("%d",&n);
  r=n%10000;
  t=r%1000;
  y=t%100;
  g=y/10;
  printf("%d",g);
  return 0;
}