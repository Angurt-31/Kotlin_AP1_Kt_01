fun adultSelection(userNameAge: List<User>): List<String>{


    return  userNameAge.asSequence()
        .filter { user -> user.age >=18 }
        .map { user -> user.name }
        .toList()
}