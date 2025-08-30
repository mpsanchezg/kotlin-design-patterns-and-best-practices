package cl.sangut.labs.structural.facade

class Server private constructor(port: Int) {
    companion object {
        fun withPort(port: Int): Server {
            return Server(port)
        }
    }
}
