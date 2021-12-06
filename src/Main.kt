fun log(msg : String?) {
    println(msg)
}

fun main(){

    println("test 1")
    var test1: String? = null;
    println(test1 ?: -1) // if (n != null) println(n) else println("-1")

    println("test 2")
    var test2: String? = null;
    if(test2 != null)
        println("its def not null")
    else
        println(test2)


    println("test 2.1")
    var test21: String? = "bob";
    if(test21 != null)
        println("test 2.1 is def not null")
    else
        println(test21)

    println("test 3")
    var test3: String? = "test3";
    println(test3 ?: -3)

    println("test 4")
    val test4: String? = null
    println(test4?.length) // null doesnt have a length

    println("test 4.1")
    val test41: String? = "bob"
    val test41Length = test41?.length
    println("$test41 is $test41Length characters")

    println("test 4.2")
    val test42: String? = null
    val test42Length = test42?.length // safe call
    //val test42Length = test42!!.length // this would cause a NPE
    println("$test42 is $test42Length characters")

    println("test 5")
    var test5: String? = null;
    log(test5!!) // pass it in directly call. //test5 is null so when we do the println it throws an exception.
    // what we are saying here is that test5!! means test5 is defo not null, but it is so it erorrs.

    println("test 6 never gets called because of the npe above")
}