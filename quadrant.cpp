#include<iostream>
using namespace std;
int main(){
    int x,y;
    cin>>x>>y;
    if((-1000<=x && x<=1000 && x!=0)&&(-1000<=y && y<=1000 && y!=0)){
        if(x>0){
            if(y>0)
               cout << "1" ;
            else
               cout << "4";
        }
        else{
            if(y>0)
               cout << "2";
            else
               cout << "3";
        }
    }
       
}