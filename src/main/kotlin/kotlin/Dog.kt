class Dog(val name: String, food: String, location: String): Animal(food, location) {

    override fun makeNoise(){
        println("Гав-гав!")
    }
    override fun eat(){
        println("Dog eat")
    }
}