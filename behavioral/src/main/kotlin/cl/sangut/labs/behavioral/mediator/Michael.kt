package cl.sangut.labs.behavioral.mediator

object Michael : ProductManager {
    private val kenny = Kenny(this)
    private val brad = Brad(this)

    override fun isAllGood(majorRelease: Boolean): Boolean {
        if (!kenny.isEating() && !kenny.isSleeping()) {
            println(kenny.doesMyCodeWork())
        } else if (!brad.isEating() && !brad.isSleeping()) {
            println(brad.doesMyCodeWork())
        }
        return true
    }
}
