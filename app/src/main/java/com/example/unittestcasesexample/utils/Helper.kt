package com.example.unittestcasesexample.utils

object Helper {
    fun isPalindrome(input:String):Boolean{
        val  reversedString = input.reversed()
        return input == reversedString
    }
}

