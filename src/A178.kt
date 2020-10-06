import kotlin.random.Random

/*
This problem was asked by Two Sigma.
Alice wants to join her school's Probability Student Club. Membership dues are computed via one of two simple probabilistic games.
The first game: roll a die repeatedly. Stop rolling once you get a five followed by a six. Your number of rolls is the amount you pay, in dollars.
The second game: same, except that the stopping condition is a five followed by a five.
Which of the two games should Alice elect to play? Does it even matter? Write a program to simulate the two games and calculate their expected value.
*/

class A178 {

    fun rollDice() {

        // declared booleans to check if each game has been won
        var hasWonGame1 = false
        var hasWonGame2 = false


        // declared int to monitor the number of rolls it takes for each game to be won
        var countForGame1 = 0
        var countForGame2 = 0

        // last dice number; initialized as 0
        var lastDiceNumber = 0

        // This loop runs till both games are won
        while (!hasWonGame1 || !hasWonGame2) {

            // thrown dice number
            val thrownNumber = Random.nextInt(1, 7)

            // if any of the games has not been won, update the counter
            // It is important that the counters are updated before the boolean checkers
            if(!hasWonGame1) countForGame1++
            if(!hasWonGame2) countForGame2++


            // decide if any of the games is won and update boolean
            if(lastDiceNumber == 5 && thrownNumber == 6) hasWonGame1 = true
            if(lastDiceNumber == 5 && thrownNumber == 5) hasWonGame2 = true

            // update the last dice number
            lastDiceNumber = thrownNumber

        }

        // print out result
        println("The first game costs \$$countForGame1\nThe second game costs \$$countForGame2")

    }

}
