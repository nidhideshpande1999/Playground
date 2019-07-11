#include <stdio.h>
int main() {
int n,r,s=0,t;
  scanf("%d",&n);
  t=n;
  while(n>0)
  {
    r=n%10;
    s=s+r*r*r;
    n=n/10;}
  if(t==s)
    printf("Armstrong Number");
  else
        printf("Not an Armstrong Number");
	return 0;
}