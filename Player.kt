import kotlin.math.max

class Player(
    val name: String,
    private var strength: Int = 1,
    private var hp: Int = 100,
    private var level: Int = 1,
    private var coins: Int = 1
) {

    private var maxHP = 100

    fun setMaxHp(
        hpPlus: Int
    ){

        maxHP += hpPlus

    }

    fun getCoins(
        count: Int
    ): Boolean {

        println()
        return if (coins - count < 0){
            println("У вас недостаточно денег")
            true
        }else {
            coins -= count
            false
        }

    }

    fun upStrength(
        point: Int
    ){
        println()
        strength += point
        showStrength()

    }

    fun attack(
        targetMonster: Monster
    ) {

        println()
        println("Вы ударили ${targetMonster.name}")
        targetMonster.damage(
            strength
        )

    }

    fun upLevel(
        levelPlus: Int
    ){
        println()
        level += levelPlus
        println("Ваш уровень поднят до: ${level}")
    }

    fun damage(
        monster: Monster
    ){

        println()
        hp -= monster.strength
        showHealth()

    }

    fun heal(
        healPercent: Int
    ){

        println("Вы вылечена на $healPercent")
        if (healPercent + hp > maxHP){
            fullHeal()
        }else {
            hp += healPercent
            showHealth()
        }

    }

    fun fullHeal(){

        println("Вы вылечены")
        hp = maxHP
        showHealth()

    }

    private fun showHealth(){
        println()
        println("Ваше здоровье: $hp")
    }

    private fun showStrength(){
        println()
        println("Ваша сила: $strength")

    }

}