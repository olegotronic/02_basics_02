fun main() {

    val likes = 1011

    val peoplesPresentation = if (likes % 10 == 1 && likes % 100 != 11) "человеку" else "людям"

    println("Понравилось $likes $peoplesPresentation")

}