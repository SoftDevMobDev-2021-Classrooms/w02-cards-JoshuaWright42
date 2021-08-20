package com.example.demoforclass

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Switch
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val flip = findViewById<Switch>(R.id.flip)

        var card = Card(Suit.HEARTS, Rank.ACE)
        update(card, flip.isChecked)

        flip.setOnClickListener {
            update(card, flip.isChecked)
        }

        val random = findViewById<Button>(R.id.random)
        random.setOnClickListener {
            card = Card()
            update(card, flip.isChecked)
        }

    }

    fun update(card: Card, flipped: Boolean)
    {
        card.flipped = flipped
        val rankSuit = findViewById<TextView>(R.id.rank_suit)
        rankSuit.text = card.getDetails()
    }
}