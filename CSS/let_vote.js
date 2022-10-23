class Person{
constructor(name){
this.name=name;
}
details(){
console.log(this.name+" Eligible to vote")
}
}
let anjali=new Person("Anjali Sharma")
anjali.details()