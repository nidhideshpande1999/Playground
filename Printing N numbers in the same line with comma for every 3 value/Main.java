#include <stdio.h>
int main() {
	int n,i,m=3;
  scanf("%d",&n);
  for(i=1;i<=n;i++)
  {
    printf("%d",i);
    if(i%m==0 && i!=n)
      printf(",");
  }
	return 0;
}