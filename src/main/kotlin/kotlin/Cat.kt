class Cat(val name: String, food: String, location: String): Animal(food, location) {

    override fun makeNoise(){
        println("Мяу!")
    }
    override fun eat(){
        println("Cat eat")
    }

}