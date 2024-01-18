fun main() {
    var sla: String? = null // posso utilizar String? para aceitar nulo, chamado sintaxe
    //sla = null  // atribuir para nulo, porém necessita da interrogação no tipo da variável

    nulo("marcia")
}

fun nulo(talvezstring: String?) {
    var resultado: String
    if (talvezstring != null && talvezstring.length > 0) {
        resultado = "O tamanho dessa String eh ${talvezstring.length}"
    } else {
        resultado = "essa variável é nula ou vazia"
    }
    println(resultado)
}
