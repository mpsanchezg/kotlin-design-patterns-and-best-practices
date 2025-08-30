package cl.sangut.labs.behavioral.command

open class Trooper {
    private val orders = mutableListOf<Command>()
    private val undoableOrders = mutableListOf<Pair<Command, Command>>()

    fun addOrder(order: Command) {
        this.orders.add(order)
    }

    fun executeOrders() {
        while (orders.isNotEmpty()) {
            val order = orders.removeFirst()
            order() // Compile error for now
        }
    }

    fun appendMove(x: Int, y: Int): Trooper = apply {
        orders.add(moveGenerator(this, x, y))
        undoableOrders.add(moveGenerator(this, x, y) to moveGenerator(this, -x, -y))
    }

    // More code here
    fun move(x: Int, y: Int) {
        println("Moving to $x:$y")
    }
}