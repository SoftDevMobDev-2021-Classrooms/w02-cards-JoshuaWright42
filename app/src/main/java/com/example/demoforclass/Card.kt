package com.example.demoforclass

import kotlin.random.Random

enum class Suit
{
    HEARTS, DIAMONDS, CLUBS, SPADES
}

enum class Rank
{
    ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING
}

class Card (val suit: Suit, val rank: Rank, var flipped: Boolean = false) {

    constructor(): this (Suit.values()[Random.nextInt(0, 4)], Rank.values()[Random.nextInt(0, 13)])
    {
    }

//    fun flip()
//    {
//        flipped = !flipped;
//    }

    fun getDetails(): String
    {
        if (flipped) return "$rank of $suit"
        return "----"
    }


}