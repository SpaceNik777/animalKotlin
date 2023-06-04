fun main(args: Array<String>) {
    val vet = Vet()
    val animals = arrayOf(
        Cat("Леопольд", "рыба", "приют"),
        Dog("Шарик", "мясо", "вольер"),
        Horse("Волкодав", "Морковь", "Конюшня")
    )
    for (animal in animals){
        vet.treatAnimal(animal)
    }
    animals[0].eat()
    animals[1].makeNoise()
}