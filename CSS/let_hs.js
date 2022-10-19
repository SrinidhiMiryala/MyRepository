hs=new Set([10,40,20,40," ",4.5])
console.log(hs)
hs.add(54)
console.log(hs)
hs.delete(20)
console.log(hs)
console.log(hs.values())

for(let i of hs){
	console.log(i)
}