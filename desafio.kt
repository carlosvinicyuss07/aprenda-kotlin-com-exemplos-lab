// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASICO, INTERMEDIARIO, AVANCADO }

data class Usuario(val nome: String, val email: String)

data class ConteudoEducacional(val nome: String, val duracao: Int = 60, val nivelDoConteudo: Nivel)

data class Formacao(val nome: String, val conteudos: List<ConteudoEducacional>, val nivelDaFormacao: Nivel) {

    val inscritos = mutableListOf<Usuario>()
    
    fun matricular(usuario: Usuario) {
        inscritos.add(usuario)
    }
}

fun main() {
    val usuario1 = Usuario("Claúdio", "claudio.w@email.com")
    val usuario2 = Usuario("José", "jose.fxp@email.com")
    val usuario3 = Usuario("Maria", "m123.santos@email.com")
    
    val matematica1 = ConteudoEducacional(nome = "Matematica I", nivelDoConteudo = Nivel.BASICO)
    val matematica2 = ConteudoEducacional(nome = "Matematica II", nivelDoConteudo = Nivel.INTERMEDIARIO)
    val matematica3 = ConteudoEducacional(nome = "Matematica III", nivelDoConteudo = Nivel.AVANCADO)
    
    val listaDeConteudos = listOf(matematica1, matematica2, matematica3)
    
    val formacao = Formacao("Licenciatura em Matemática", listaDeConteudos, Nivel.AVANCADO)
    formacao.matricular(usuario1)
    formacao.matricular(usuario2)
    formacao.matricular(usuario3)
    
    println(formacao.inscritos)
    
}
