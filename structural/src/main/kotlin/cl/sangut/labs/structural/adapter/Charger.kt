package cl.sangut.labs.structural.adapter

fun charger(plug: EUPlug): UsbMini {
    return object : UsbMini {
        override val hasPower = if (plug.hasPower == "YES")
            PowerState.TRUE else PowerState.FALSE
    }
}
