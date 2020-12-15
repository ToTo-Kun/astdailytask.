#include<iostream>
#include<cstdlib>
using namespace std;

 int main()
 {
 int a;
 int b;
 int c;
 int d;
 int e;
 int sum = 0;
 
cout<<"Enter marks for English\n";
cin>>a;

try{
	if(a < 0) {	
		throw Enter the Marks of the given subject;
	}
}
 catch(int a) {
	cout << " you are not able to pass error message:" << a << endl;
}

cout<<"Enter marks for Maths\n";
cin>>b;

try{
	if(b < 0) {	
		throw Enter the Marks of the given subject;
	}
}
 catch(int b) {
	cout << " you are not able to pass error message:" << b << endl;
}

cout<<"Enter marks for Chemistry\n";
cin>>c;

try{
	if(c < 0) {	
		throw Enter the Marks of the given subject;
	}
}
 catch(int c) {
	cout << " you are not able to pass error message:" << c << endl;
}

cout<<"Enter marks for Physics\n";
cin>>d;

try{
	if(d < 0) {	
		throw Enter the Marks of the given subject;
	}
}
 catch(int d) {
	cout << " you are not able to pass error message:" << d << endl;
}

cout<<"Enter marks for Social Studies\n";
cin>>e;

try{
	if(e < 0) {	
		throw Enter the Marks of the given subject;
	}
}
 catch(int e) {
	cout << " you are not able to pass error message:" << e << endl;
}

sum = (a + b + c + d + c)/5;

cout<<"Average marks scored is"<<sum;
exit(EXIT_FAILURE);


}
