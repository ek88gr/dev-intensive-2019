package ru.skillbranch.devintensive.models

import java.util.Date

data class User(
    val id: String,
    var firstName: String?,
    var lastName: String?,
    var avatar: String?,
    var rating: Int = 0,
    var respect: Int = 0,
    var lastVisit: Date? = Date(),
    var isOnline: Boolean = false
) {
    companion object {
        private var id = 0
        fun makeUser(fullName: String?) : User {
            id++
            var parts: List<String>? = fullName?.split(" ")
            var firstName = parts?.getOrNull(0)
            var lastName = parts?.getOrNull(1)

            return User(id = "$id", firstName = firstName, lastName = lastName, avatar = null)
        }
    }
}