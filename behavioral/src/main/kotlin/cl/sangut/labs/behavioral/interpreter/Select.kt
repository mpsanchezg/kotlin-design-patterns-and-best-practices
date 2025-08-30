package cl.sangut.labs.behavioral.interpreter

fun select(vararg columns: String, from: SelectClause.() -> Unit):
        SelectClause {
    return SelectClause(*columns).apply(from)
}
