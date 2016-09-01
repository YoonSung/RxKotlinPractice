package step1

fun main(args: Array<String>) {
    val user = SubscribingUser("test@daum.net")
    println(user.nickname)
    println(user.domain)
    //user.subscriberEmails = emptyArray() cannot access!!
}

class SubscribingUser(val email: String) {
    val nickname: String
        get() {
            return email.substringBefore('@')
        }

    val domain: String 
        get() {
            return email.substringAfter("@")
        }
    
    var subscriberEmails: Array<String> = emptyArray() 
        private set
    
    fun addSubscriber(email: String) {
        subscriberEmails.plus(email)
    }
    
}