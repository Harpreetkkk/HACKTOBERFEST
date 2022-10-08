import 'dart:io';
int fac(int a){
  if(a==1||a==0)
  return 1;
  else
  return a*fac(a-1);
}
void main(){
  print('Enter number\n');
  int ? a=int.parse(stdin.readLineSync()!);
  int c=fac(a);
  print('$c');
}