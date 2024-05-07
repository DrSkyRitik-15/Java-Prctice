#include<iostream>
#include<vector>



using namespace std;


int main(){
vector<int> A(5);
cout<<"\nSize of = "<<A.size()<<endl;//5
for (int i = 0; i < A.size(); i++)
{
    A[i]=i;
    // cin>>A[i];
}
for (int i = 0; i < A.size(); i++)
{
    cout<<A[i]<<" ";
    
}
cout<<"\nPush back ho raha hai"<<endl;
for (int i = 5; i <10; i++)
{
// isme pichhe se jude ga  
    A.push_back(i);                      	
}
cout<<"\nAfter push back Size of = "<<A.size()<<endl;//10
for (int i = 0; i < A.size(); i++)
{
    cout<<A[i]<<" ";
    
}
A.pop_back();
A.pop_back();//pichhe se delete kar dega eek

cout<<"\nAfter pop back Size of = "<<A.size()<<endl;//8
for (int i = 0; i < A.size(); i++)
{
    cout<<A[i]<<" ";
    
}

// another way usin pointer
vector<int>::iterator V ; // A.begin()        int *V=&A
V=A.begin();
while (V!=A.end())
{
    cout<<"\n pointer V "<<*V<<endl;
    V++;
}
cout<<"Aftter the term = ";
V=A.begin();
for(int i = 0; i < 3; i++) // use a counter variable instead of V
    {
       
         V++;
    }
    A.insert(V,99);
V=A.begin();
for(int i = 0; i < A.size(); i++) // use a counter variable instead of V
    {
         cout<<A[i]<<"\t"<<endl;
         V++;
    }
// V=A.begin();
cout<<"kjhggfdfdgfhgjhkj = ";
cout<<A[5];

    return 0;
}