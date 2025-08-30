package cl.sangut.labs.behavioral.command

typealias Command = () -> Unit

val moveGenerator = fun(
    t: Trooper,
    x: Int,
    y: Int
): Command {
    return fun() {
        t.move(x, y)
    }
}
