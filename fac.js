function fac(a){
    if(a==1||a==0){
        return 1;
    }
    else 
    return a*fac(a-1);
}
console.log(fac(4));