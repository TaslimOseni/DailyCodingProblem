/*
This problem was asked by Airbnb.
Given a linked list and a positive integer k, rotate the list to the right by k places.
For example, given the linked list 7 -> 7 -> 3 -> 5 and k = 2, it should become 3 -> 5 -> 7 -> 7.
Given the linked list 1 -> 2 -> 3 -> 4 -> 5 and k = 3, it should become 3 -> 4 -> 5 -> 1 -> 2.
*/

class A177 {

    fun rotate(list: List<Int>, rotateBy: Int) : List<Int> {

        // declare new list and initialize with dummy values [0]
        val res = MutableList(list.size) { 0 }

        // fill up new list by rotating old list
        for(i in list.indices) { if((i - rotateBy) < 0) { res[i] = list[(list.size) + (i - rotateBy)] } else { res[i] = list[i - rotateBy]} }

        // return new list
        return res
    }

}
