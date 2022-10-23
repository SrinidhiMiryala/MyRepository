class Person{
    setName(name){
	    this.name=name;
	}
	getName(){
	return this.name;
	}
}
let andrew=new Person()
andrew.setName("Andrew John")
console.log(andrew.getName())
