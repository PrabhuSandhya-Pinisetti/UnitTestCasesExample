package com.example.unittestcasesexample

import com.example.unittestcasesexample.utils.Helper
import org.junit.Assert.assertEquals
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.Parameterized
import org.junit.runners.Parameterized.Parameters

@RunWith(Parameterized::class)
class ParameterizedExample(val input:String,val expectedValue:Boolean) {
    @Test
    fun test(){
        val res = Helper.isPalindrome(input)
        assertEquals(expectedValue,res)
    }

    companion object{
        @JvmStatic
        @Parameters(name = "{index}:{0} is palindrome - {1}")
        fun data():List<Array<Any>>{
            return listOf(
                arrayOf("hello",false),
                arrayOf("mom",true),
                arrayOf("a",true),
                arrayOf("",true)
            )
        }
    }
}