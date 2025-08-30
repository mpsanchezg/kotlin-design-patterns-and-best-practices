package cl.sangut.labs.structural.adapter

fun USPlug.toEUPlug(): EUPlug {
    val hasPower = if (this.hasPower == 1) "YES" else "NO"
    return object : EUPlug {
        // Transfer power
        override val hasPower = hasPower
    }
}

fun UsbMini.toUsbTypeC(): UsbTypeC {
    val hasPower = this.hasPower == PowerState.TRUE
    return object : UsbTypeC {
        override val hasPower = hasPower
    }
}
