class Student{
id=101
marks=450
static college="SNIT"
show(){
console.log("Id="+this.id)
console.log("marks="+this.marks)
}
static details(){
console.log("College name="+Student.college);
}
}
let anjali=new Student()
anjali.show()
Student.details()