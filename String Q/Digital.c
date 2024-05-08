#include<stdio.h>

int num( int n){
    int sum=0;
    int l=0;
    while(n>0){
         l=n%10;
         sum=sum+l;
        n/=10;
    }
        if(sum<10){
        return (sum);
        }
    else{
        return num(sum);
    }
}
int main()
{
    int a;
    printf("Enter te number\n");
    scanf("%d",&a);
    int result=num(a);
    printf("th result is %d",result);
}