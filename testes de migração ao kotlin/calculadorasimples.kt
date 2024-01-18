import kotlin.io

fun main(){
    
    println("""Bem Vindo
ktcalculator""")

print("digite um numero:")
var num1 = readLine()!!.toDouble();

println("digite um operador:")
var operador = readLine()

println("digite um segundo numero:")
var num2 = readLine()!!.toDouble();


if(operador == "+"){
    return println(soma(num1, num2))
}
else if(operador == "-"){
    return println(subtracao(num1, num2))
}
else if(operador == "*"){
    return println(multiplica(num1, num2))
}
else if(operador == "/"){
    return println(divisao(num1, num2))
}
else{
    return println("Algo deu errado /nprovavelmente seu operador não é valido /nTente usar (+ ou - ou * ou /)")
}

}






fun subtracao(a: Double?, b:Double?){
    var sub: Double = a!! - b!!;
    return println(sub)
};
fun multiplica(a: Double?, b:Double?){
    var multiplicacao: Double = a!! * b!!;
    return println(multiplicacao)
};
fun divisao(a: Double?, b:Double?){
    var div: Double = a!! / b!!;
    return println(div)
};
fun soma(a: Double?, b:Double?){
    var soma: Double = a!!+ b!!;
    return println(soma)
};
