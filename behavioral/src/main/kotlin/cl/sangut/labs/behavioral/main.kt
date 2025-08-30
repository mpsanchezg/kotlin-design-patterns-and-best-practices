package cl.sangut.labs.behavioral

import cl.sangut.labs.behavioral.chain_of_responsibility.Request
import cl.sangut.labs.behavioral.chain_of_responsibility.authentication
import cl.sangut.labs.behavioral.chain_of_responsibility.basicValidation
import cl.sangut.labs.behavioral.chain_of_responsibility.finalResponse
import cl.sangut.labs.behavioral.command.Trooper
import cl.sangut.labs.behavioral.command.moveGenerator
import cl.sangut.labs.behavioral.interpreter.select
import cl.sangut.labs.behavioral.iterator.Squad
import cl.sangut.labs.behavioral.mediator.Michael
import cl.sangut.labs.behavioral.mediator.MyCompany
import cl.sangut.labs.behavioral.memento.Manager
import cl.sangut.labs.behavioral.state.Snail
import cl.sangut.labs.behavioral.strategy.OurHero
import cl.sangut.labs.behavioral.strategy.Weapons
import cl.sangut.labs.behavioral.visitor.Container
import cl.sangut.labs.behavioral.visitor.Image
import cl.sangut.labs.behavioral.visitor.Link
import cl.sangut.labs.behavioral.visitor.Page
import cl.sangut.labs.behavioral.visitor.Table
import cl.sangut.labs.behavioral.visitor.collectLinks

fun main() {
    /* 1. Strategy Pattern */
    val hero = OurHero()
    hero.shoot()
    hero.currentWeapon = Weapons::banana
    hero.shoot()

    /* 2. Iterator Pattern */

    val platoon = Squad(
        Trooper(),
        Squad(
            Trooper(),
        ),
        Trooper(),
        Squad(
            Trooper(),
            Trooper(),
        ),
        Trooper()
    )

    val l = listOf<String>()

    l.iterator()

    // For loop range must have an iterator method
    for (trooper in platoon) {
        println(trooper)
    }

    /* 3. State Pattern */

    val snail = Snail()
    snail.seeHero()
    snail.getHit(1)
    snail.getHit(10)

    /* 4. Command Pattern */

    val t = Trooper()

    t.addOrder(moveGenerator(t, 1, 1))
    t.addOrder(moveGenerator(t, 2, 2))
    t.addOrder(moveGenerator(t, 3, 3))

    t.executeOrders()

    t.appendMove(0, 4)
        .appendMove(5, 4)
        .appendMove(5, 8)
        .appendMove(10, 8)
        .executeOrders()

    /* 5. Chain of Responsibility Pattern */

    val req = Request(
        "developer@company.com",
        "Why do we need Software Architects?"
    )
    val chain = basicValidation(authentication(finalResponse()))
    val res = chain(req)

    println(res)

    /* 6. Interpreter Pattern */
    val sql = select("name", "age") {
        from("users") {
            where("age > 25")
        } // Closes from
    } // Closes select

    println(sql) // "SELECT name, age FROM users WHERE age > 25"

    /* 7. Mediator Pattern */
    val productManager = Michael
    val company = MyCompany(productManager)
    company.taskCompleted(true)

    /* 8. Memento Pattern */
    val michael = Manager()
    michael.think("Need to implement Coconut Cannon")
    michael.think("Should get some coffee")
    val memento = michael.saveThatThought()
    with(michael) {
        think("Or maybe tea?")
        think("No, actually, let's implement Pineapple Launcher")
    }
    michael.printThoughts()
    michael.recall(memento)
    michael.printThoughts()

    /* 9. Visitor Pattern */
    val page = Page(
        Container(
            Image,
            Link,
            Image
        ),
        Table,
        Link,
        Container(
            Table,
            Link
        ),
        Container(
            Image,
            Container(
                Image,
                Link
            )
        )
    )

    println(collectLinks(page))

    /* 10. Template Method Pattern */

    /* 11. Observer Pattern */
}
