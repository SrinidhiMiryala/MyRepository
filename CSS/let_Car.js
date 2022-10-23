class Car{
start(){
console.log("Starts with a key")
}
}
class BMW extends Car{
BMWFeature(){
console.log("BMW is expensive")
}
}
let b=new BMW()
b.start()
b.BMWFeature()