let employee={id:666,name:'Mark'};
for(let key in employee){
    console.log(key,employee[key]);
}
/*object interaction using object.keys*/
Object.keys(employee).forEach((key)=>{
    console.log(key,employee[key]);
})
Object.values(employee).forEach((key)=>{
    console.log(key);
})
Object.entries(employee).forEach((arr)=>{
    console.log(arr[0],arr[1]);
})