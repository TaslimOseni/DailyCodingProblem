/*
This problem was asked by Bloomberg.
Determine whether there exists a one-to-one character mapping from one string s1 to another s2.
For example, given s1 = abc and s2 = bcd, return true since we can map a to b, b to c, and c to d.
Given s1 = foo and s2 = bar, return false since the o cannot map to two characters.
*/

class A176 {

    fun hasOneToOneMapping(s1: String, s2: String) : Boolean {

        // if the strings are not the same length, one-to-one mapping cannot exist
        if(s1.length != s2.length) return false


        /*
        Let me explain the technique I used below.
        The goal was to make sure that no character was repeated.
        To do that, I performed a check for every character in s1:
        If a character 'c' has only one occurrence in s1, the length-difference between s1 and s1.remove(c) would be 1.
        If it is more than 1, then there is obviously a multiple occurrence.
         */
        else s1.forEach { if (s1.length - (s1.replace("$it", "")).length > 1) return@hasOneToOneMapping false }

        return true
    }

}