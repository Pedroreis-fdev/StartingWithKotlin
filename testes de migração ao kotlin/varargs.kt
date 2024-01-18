// vararg se trata de uma variavel com numero de componentes indefinidos desde que eles respeitem a
// ordem(String ou Int ou Double....)

fun main() {
    varargui("joao", "cleber", "marcelo")
    teste("lucas", "junior", "kaique", prefix = 11)
}
// A função varargui recebe uma quantidade variável de argumentos do tipo String e os agrupa em uma
// array chamada "nome".
fun varargui(vararg nome: String) {
    // Inicia um loop for, iterando sobre cada elemento da array "nome".
    for (nomes in nome) {
        // Imprime cada elemento da array "nome" em uma nova linha.
        println(nomes)
    }
}
// A função teste recebe uma quantidade variável de argumentos do tipo String e os agrupa em uma
// array chamada "nome".
fun teste(vararg nomes: String, prefix: Int) {
    // Inicia um loop for, iterando sobre cada elemento da array "nomes".
    for (parametro in nomes) {
        println("[$prefix] + $parametro")
    }
}
