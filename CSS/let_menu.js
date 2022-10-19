let menu=()=>console.log("1.Idly 2.Dosa 3.Vada")
let placeOrder=order=>console.log("order given is"+order)
let serveFood=()=>{return "Idly"}
let payBill=amount=>{
console.log("Amount given is "+amount)
return "Paid"
}
menu()
placeOrder("Idly")
console.log("Food served is "+serveFood())
console.log("Bill "+payBill(50))