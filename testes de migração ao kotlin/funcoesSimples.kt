fun teste(message: String){
    println(message) //função de print padrão
};
fun withprefix(name: String, prefix: String = "sla"){   //função com prefixo ou seja um prefixo inicial e uma string sem retorno explicito mas com um print
    println("[$prefix] $name")
}
fun soma(x: Double, y: Double):Double { //função que recebe x e y como double e retorna a soma sem armazenar em variaveis//
      return x + y
}
fun multiplicacao(x: Int, y: Int) = x*y //inline function, int sempre com I maiusculo


fun main(){
    teste(message = "oi kotlin");
    withprefix(name = "cleiton")
    println(soma(25.2, 52.5))
    println(multiplicacao(5, 10))

}