// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASICO, INTERMEDIARIO, AVANÇADO }

class Usuario(val id: Int = 450 , val nome: String = "Tarantino")

data class ConteudoEducacional(var nome: String, val duracao: Int = 60)

data class Formacao(val nome: String, val conteudos: List<ConteudoEducacional>, val nivel: Nivel) {

    val inscritos = mutableListOf<Usuario>()
    
    fun matricular(usuario: Usuario){
        inscritos.add(usuario)
     println("${usuario.nome} foi inscrito!")
    }
}

fun main() {
    val usuario = Usuario()
    val conteudo = ConteudoEducacional("Introdução a Kotlin pela DIO", duracao = 120)
    val formacao = Formacao("Tarantino", listOf(conteudo), Nivel.INTERMEDIARIO)
    formacao.matricular(usuario)
    println("Name: ${usuario.nome}, ID: ${usuario.id}")
    println(formacao)
}
