fun main(args: Array<String>) {

    val monsters = arrayOf(
        Monster(
            50,
            10,
            "Nephor"
        ),
        Monster(
            1,
            1,
            "Pharid"
        )

    )
    val player = Player(
        name = "Akhmed",
        strength = 5,
        level = 1
    )
    val dungeon = Dungeon(
        player,
        monsters
    )
    val store = Store(
        player
    )

    var isGameGoing = true

    while (isGameGoing){
        player.fullHeal()

        showUserChoice()
        val userChoice = readln().toInt()

        when (userChoice){

            1 -> {
                store.start()
            }

            2 -> {
                dungeon.start()
            }

        }

    }

}

fun showUserChoice(){

    println("Куда пойдете:")
    println("1.В магазин:")
    println("2.В подземелье")

}