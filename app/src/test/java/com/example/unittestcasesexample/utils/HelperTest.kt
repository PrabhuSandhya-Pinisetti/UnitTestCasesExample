package com.example.unittestcasesexample.utils

import org.junit.After
import org.junit.Assert.*

import org.junit.Before
import org.junit.Test

class HelperTest {

    @Before
    fun setUp(){
        println("Runs before every test case")
    }

    @After
    fun tearDown(){
        println("Runs after every test case")
    }

    @Test
    fun `check for palindrome`(){
        val result = Helper.isPalindrome("hi")
        assertEquals(false,result)
    }

    @Test
    fun `inputString expected true`(){
        val result = Helper.isPalindrome("l")
        assertEquals(true,result)
    }
}