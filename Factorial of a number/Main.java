#include <stdio.h>
int fact(int n);
int main() {
	int t,n;
  scanf("%d",&n);
  t=fact(n);
  printf("%d",t);
}
int fact(int n)
{
  if(n==0)
    return 1;
  else if(n==1)
    return 1;
  else
  return(n*fact(n-1));
}