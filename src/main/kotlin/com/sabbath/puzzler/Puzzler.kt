package com.sabbath.puzzler

fun main(args: Array<String>) {
    val users = mutableListOf<User>()
    users.add(User("sabbath"))
    users.addAll(Utils.listOfNullUser())
    users.filterNotNull()
    println(users[1].username)
}

class User(val username: String? = null)



