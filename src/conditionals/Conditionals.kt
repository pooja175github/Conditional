package conditionals

fun main(args: Array<String>) {
    var age: Int = 19
    if (age < 18) {
        println("You can not register")
    } else if (age < 21) {
        println("Well may be you can register")
    } else if (age < 27) {
        println("You should be able to register")
    } else {
        println("You are good to go")
    }

}