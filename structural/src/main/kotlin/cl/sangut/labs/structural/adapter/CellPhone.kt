package cl.sangut.labs.structural.adapter

fun cellPhone(chargeCable: UsbTypeC) {
    if (chargeCable.hasPower) {
        println("I've Got The Power!")
    } else {
        println("No power")
    }
}
