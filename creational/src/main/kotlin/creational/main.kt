package main.kotlin.creational

fun main() {
    /*
    /* 1. Singleton */
    // Example usage of the singleton Logger
    val logger = Logger
    logger.log("Application started")

    // Example usage of the NoMoviesList
    val moviesList = NoMoviesList
    if (moviesList.isEmpty()) {
        logger.log("No movies available")
    } else {
        logger.log("Movies available: ${moviesList.joinToString()}")
    }

    // Example usage of the NoMoviesListEmpty
    val emptyMoviesList = NoMoviesListEmpty
    if (emptyMoviesList.isEmpty()) {
        logger.log("No movies available in the empty list")
    }

    /* 2. Factory Method */
    // Example usage of the factory method to create a chess piece
    val queen = createPiece("qa5")
    println(queen)

    /* 3. Abstract Factory */
    // Example usage of the Parser to create a server configuration
    val environment = Parser.server(listOf("port: 8080", "environment: production"))
    println(environment)

    /* 4. Builder Pattern */
    withoutBuilderExample()
    builderExample()
    fluentExample()
    applyExample()
    defaultsExample()

    /* 5. Prototype Pattern */
    val originalUser = User("admin1", Role.ADMIN, setOf("READ", "WRITE", "DELETE"))
    allUsers += originalUser
    createUser("admin2", Role.ADMIN)
    println(allUsers)

    /* 6. Static Factory Method */
    Server.withPort(8080) */
}

