open class Animal(val food: String, val location: String) {

    open fun makeNoise(){
        println("Издает звуки")
    }
    open fun eat(){
        println("Кушает")
    }
    fun sleep(){
        println("Спит")
    }
}