import 'dart:io';
class arith{
  double a=0;
  void input(){
    print('Enter number');
    a=double.parse(stdin.readLineSync()!);
  }
  void display(){
    print(a);
  }
  arith operator + (arith a1){
    arith a2=new arith();
    a2.a=a1.a+a;
    return a2;
  }
  arith operator - (arith a1){
    arith a2=new arith();
    a2.a=a1.a-a;
    return a2;
  }
  arith operator * (arith a1){
    arith a2=new arith();
    a2.a=a1.a*a;
    return a2;
  }
  arith operator / (arith a1){
    arith a2=new arith();
    a2.a=a1.a/a;
    return a2;
  }
}
void main(){
  arith a1=new arith();
  arith a2=new arith();
  arith a3=new arith();
  a1.input();
  a2.input();
  print('Enter one of these + - / *');
  String ? b=stdin.readLineSync();
  switch(b){
    case '+':
    a3=a1+a2;
    break;
    case '-':
    a3=a1-a2;
    break;
    case '*':
    a3=a1*a2;
    break;
    case '+':
    a3=a1/a2;
    break;
    default:
    print('no match to your selection');
    break;
  }
  a3.display();
}