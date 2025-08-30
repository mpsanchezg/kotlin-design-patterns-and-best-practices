package cl.sangut.labs.behavioral.state

sealed interface Mood {
    // Some abstract methods here, like draw(), for example
}

data object Still : Mood {

}

data object Aggressive : Mood

data object Retreating : Mood

data object Dead : Mood

/*
sealed class Mood {
    // Some abstract methods here, like draw(), for example
}

data object Still : Mood()

data object Aggressive : Mood()

data object Retreating : Mood()

data object Dead : Mood()*/