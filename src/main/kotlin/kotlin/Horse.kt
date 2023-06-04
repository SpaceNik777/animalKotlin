class Horse(val name: String, food: String, location: String): Animal(food, location) {
    override fun makeNoise(){
        println("Ржание!")
    }
    override fun eat(){
        println("Horse eat")
    }
}