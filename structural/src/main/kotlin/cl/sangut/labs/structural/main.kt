package cl.sangut.labs.structural

import cl.sangut.labs.structural.adapter.toEUPlug
import cl.sangut.labs.structural.adapter.toUsbTypeC
import cl.sangut.labs.structural.facade.startFromConfiguration
import cl.sangut.labs.structural.adapter.*
import cl.sangut.labs.structural.bridge.*
import cl.sangut.labs.structural.composite.Squad
import cl.sangut.labs.structural.decorator.DefaultStarTrekRepository
import cl.sangut.labs.structural.decorator.LoggingGetCaptain
import cl.sangut.labs.structural.decorator.StarTrekRepository
import cl.sangut.labs.structural.decorator.ValidatingAdd
import cl.sangut.labs.structural.facade.Server.Companion.withPort
import cl.sangut.labs.structural.flyweight.TansanianSnail
import cl.sangut.labs.structural.proxy.CatImage
import java.io.FileNotFoundException
import java.util.stream.Stream

fun main() {
    /* 1. Decorator Pattern */
    val starTrekRepository = DefaultStarTrekRepository()
    val withValidating = ValidatingAdd(starTrekRepository)
    val withLoggingAndValidating =
        LoggingGetCaptain(withValidating)

    withLoggingAndValidating["USS Enterprise"]

    try {
        // Throws an exception: Kathryn Janeway name is longer than 15 characters!
        withLoggingAndValidating["USS Voyager"] = "Kathryn Janeway"
    } catch (e: IllegalStateException) {
        println(e)
    }

    println(withLoggingAndValidating is LoggingGetCaptain) // This is our top level decorator, no problem here
    println(withLoggingAndValidating is StarTrekRepository) // This is the interface we implement, still no problem
    // println(withLoggingAndValidating is ValidatingAdd) // We wrap this class, but compiler cannot validate it
    // println(withLoggingAndValidating is DefaultStarTrekRepository) // We wrap this class, but compiler cannot validate it

    /* 2. Adapter Pattern */

    // This code won't work
    /*
    cellPhone(
        // Type mismatch: inferred type is UsbMini but UsbTypeC was expected
        charger(
            // Type mismatch: inferred type is USPlug but EUPlug was expected
            usPowerOutlet()
        )
    )*/

    cellPhone(
        charger(
            usPowerOutlet().toEUPlug()
        ).toUsbTypeC()
    )


    val l = listOf("a", "b", "c")

    streamProcessing(l.stream())

    val s = (Stream.generate { 42 }).toList()
    println(s)

    // Using an adapter in the wrong way may cause your program to never stop!
    // For example:
    /*
    println("Collecting elements")
    collectionProcessing(s.toList())
    */

    /* 3. Bridge Pattern */

    val stormTrooper = StormTrooper(
        Rifle(),
        RegularLegs()
    )
    val flameTrooper = StormTrooper(
        Flamethrower(),
        RegularLegs()
    )
    val scoutTrooper = StormTrooper(
        Rifle(),
        AthleticLegs()
    )

    println(listOf(stormTrooper, flameTrooper, scoutTrooper))

    /* 4. Composite Pattern */
    val bobaFett = StormTrooper(
        Rifle(),
        RegularLegs()
    )

    val squad = Squad(
        listOf(
            bobaFett.copy(),
            bobaFett.copy(),
            bobaFett.copy()
        )
    )

    squad.attackRebel(1, 2)

    val secondSquad = Squad(
        bobaFett.copy(),
        bobaFett.copy(),
        bobaFett.copy()
    )

    /* 5. Facade Pattern */

    try {
        val server = withPort(0).startFromConfiguration("/path/to/config")
    } catch (e: FileNotFoundException) {
        println("If there was a file and a parser, it would have worked")
    }

    /* 6. Flyweight Pattern */
    // Flyweight allows us to create much more objects that otherwise possible
    val snails = List(10_000) {
        TansanianSnail()
    }

    /* 7. Proxy Pattern */
    val cat = CatImage(
        "https://i.chzbgr.com/full/9026714368/hBB09ABBE/i-will-has-attention",
        "https://i.chzbgr.com/full/9026714368/hBB09ABBE/i-will-has-attention"
    )

    println(cat.image.size)
    println(cat.image.size)
}