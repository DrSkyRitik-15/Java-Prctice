#include<stdio.h>

int main()
{
  int num;
  scanf("%d",&num);

  if(num < 10)
  {
    printf("The number should have at least two digits.\n");
    return 1;
  }

  int largest = -1;
  int secondLargest = -1;

  while(num > 0)
  {
    int digit = num % 10;
    num /= 10;

    if(digit > largest)
    {
      secondLargest = largest;
      largest = digit;
    }
    else if(digit > secondLargest && digit < largest)
    {
      secondLargest = digit;
    }
  }

  if(secondLargest == -1)
  {
    printf("There is no second largest digit.\n");
  }
  else
  {
    printf("The second largest digit is %d.\n", secondLargest);
  }

  return 0;
}