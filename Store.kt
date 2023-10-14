class Store(
    val player: Player
){

    private val plusHp = 10
    private val plusStrength = 5

    fun start(){
        var isStoreGoing = true

        while (isStoreGoing){

            showUserChoices()
            val userChoice = readln().toInt()

            isStoreGoing = action(userChoice)

        }

    }

    private fun showUserChoices(){

        println()
        println("Что будете брать:")
        println("1. +$plusHp к максимальному здоровью")
        println("2. +$plusStrength к силе")
        println("3.Покинуть магазин")

    }

    private fun action(
        action: Int
    ): Boolean {
        return when(action){

            1 -> {
                upgradeHealth()
                true
            }

            2 -> {
                upgradeStrength()
                true
            }

            3 -> {
                false
            }

            else -> {
                true
            }

        }
    }

    private fun upgradeHealth(){

        println()
        if (player.getCoins(5)){
            player.setMaxHp(
                plusHp
            )
        }

    }

    private fun upgradeStrength(){

        println()
        if (player.getCoins(5)){
            player.upStrength(
                plusStrength
            )
        }


    }

}