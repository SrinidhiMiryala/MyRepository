class Parent{
constructor(age){
console.log("Parent age is "+age)
}
}
class Child extends Parent{
constructor(age){
super(60)
console.log("Child age is "+age)
}
}

let joe=new Child(25)