package main.kotlin.creational.prototype

internal val allUsers = mutableListOf<User>()

fun createUser(userName: String, role: Role) {
    for (u in allUsers) {
        if (u.role == role) {
            allUsers += u.copy(name = userName)
            return
        }
    }
    // Handle case that no other user with such a role exists
    allUsers += User(
        name = userName,
        role = role,
        permissions = when (role) {
            Role.ADMIN -> setOf("READ", "WRITE", "DELETE")
            Role.SUPER_ADMIN -> setOf("READ", "WRITE", "DELETE", "MANAGE_USERS")
            Role.REGULAR_USER -> setOf("READ")
        }
    )
}
