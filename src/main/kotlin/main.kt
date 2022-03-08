fun main() {

    val likes = 1031

    val peoplesPresentation = if (likes % 10 == 1) "человеку" else "людям"

    println("Понравилось $likes $peoplesPresentation")

}