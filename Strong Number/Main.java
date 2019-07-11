#include <stdio.h>
int main() {
	int i,on,n,ld,s,f;
  scanf("%d",&n);
  on=n;
  s=0;
  while(n>0)
  {
    ld=n%10;
    f=1;
    for(i=1;i<=ld;i++)
      f=f*i;
    s=s+f;
    n=n/10;
  }
  if(s==on)
    printf("Yes");
  else
     printf("No");
    
	return 0;
}