package com.example.myapplication

val length = 3

var is3Str = false
var endCondition = ""
var userInput = ""

var answer = ""
var strike = 0
var ball = 0
var temp = -1
var msg = ""
var option = ""

fun makeRandom():String{
    val nums = (1..9).toList().shuffled().take(3)
    val str = nums.joinToString("")
    return str
}

fun evaluate(user:String):String{
    strike = 0
    ball = 0

    // 숫자만 맞는 경우 - ball
    // 자릿수도 맞는 경우 - strike
    for (idx in 0 until length) {
        ballOrStrike(idx, user)
    }
    if (strike == 3){
        msg = "3스트라이크"
        println(msg)
    }
    else if (strike==0 && ball==0) msg = "낫싱"
    else if (strike == 0) msg = ball.toString() + "볼"
    else if (ball == 0) msg = strike.toString() + "스트라이크"
    else msg = ball.toString() + "볼 " + strike.toString() + "스트라이크"

    println(msg)
    return msg
}

fun theEnd(is3strike:Boolean):String {
    if (is3strike) {
        option = readLine()!!
        if (option == "1") {
            //main()
            return "Continue"
        } else {
            println("종료합니다.")
            return "End"
        }
    }
    return ""
}

fun ballOrStrike(i:Int, u:String):Unit{
    if (u[i] in answer){
        if (u[i] == answer[i]) strike++
        else ball++
    }
}
