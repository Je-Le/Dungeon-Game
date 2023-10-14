class Monster(
    private var hp: Int = 0,
    val strength: Int = 0,
    val name: String = ""
) {

    fun damage(
        damageHp: Int
    ){

        println()
        println("$name получил урон: $damageHp")
        hp -= damageHp
        if (isDead()){
            println("$name убит")
        }else {
            println("Осталось hp: $hp")
        }

    }

    fun attack(
        player: Player
    ){

        println()
        println("Вас ударил $name")
        player.damage(
            this
        )

    }

    fun isDead():Boolean {

        return hp <= 0

    }

}