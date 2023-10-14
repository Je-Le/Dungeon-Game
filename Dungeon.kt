import kotlin.random.Random

class Dungeon(
    private val player: Player,
    private val monsters: Array<Monster>
) {

    fun start(){
        println()
        var isDungeonGoing = true

        while (isDungeonGoing){

            val randomMonster = Random.nextInt(0,monsters.size - 1)
            val monster = monsters[randomMonster]

            showUserChoices()

            val userChoice = readln().toInt()

            isDungeonGoing = action(
                userChoice,
                monster
            )

            monster.attack(
                player
            )


        }

    }

    fun action(
        action: Int,
        monster: Monster
    ): Boolean {

        println()

        return when(action) {

            1 -> {
                player.heal(
                    20
                )

                true
            }

            2 -> {
                player.attack(
                    monster
                )

                !monster.isDead()
            }

            else -> {
                !monster.isDead()
            }
        }

    }

    fun showUserChoices(){

        println()
        println("Что будете делать:")
        println("1.Лечиться")
        println("2.Атаковать")

    }

}