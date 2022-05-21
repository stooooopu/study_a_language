var information = {
    // jason = "key" : "value"
    "name" : "Jeong Ji Yoo",
    "age" : 30,
    "address" : "대덕구 홍도로",
    "isMarri" : false
}; //jason : information를 전송

var age = information.age;

// if(age>=30) {
//     console.log("30이상입니다")
// }else {console.log("30미만입니다")}
// console.log(information);

// 상수
const PI = 3.14;
//배열
var array = [1,3,4,5,10];
// console.log(array[0]);

for (var i=0; i<array.length; i++){
    if(array[i]%2==0){
        console.log('짝수는'+array[i]+'입니다');
    }
}

var max = 0;
for (var i=0; i<array.length; i++){
    if(max<array[i]){
        max=array[i];
    }
}
console.log("최댓값은"+max+'입니다');