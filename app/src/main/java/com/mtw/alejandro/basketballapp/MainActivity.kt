package com.mtw.alejandro.basketballapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    val teamA:Team =  Team()
    val teamB:Team = Team()
    var iMarcadorA : Int = 0
    var iMarcadorB : Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnReset.setOnClickListener{
            // Metodo onclick del boton reset
            teamA.resetPoints()
            teamB.resetPoints()
            Refres()
        }
    }


    fun btn3PAOnClick(view: View): Unit
    {
        teamA.treePointsBasket()
        Refres()
    }

    fun btn2PAOnClick(view: View): Unit
    {
        teamA.twoPointsBasket()
        Refres()
    }

    fun btnFTAOnClick(view: View): Unit
    {
        teamA.onePointsBasket()
        Refres()
    }

    fun btn3PBOnClick(view: View): Unit
    {
        teamB.treePointsBasket()
        Refres()
    }

    fun btn2PBOnClick(view: View): Unit
    {
        teamB.twoPointsBasket()
        Refres()
    }

    fun btnFTBOnClick(view: View): Unit
    {
        teamB.onePointsBasket()
        Refres()
    }

    fun Refres():Unit
    {
        txtScoreA.setText(teamA.totalPoints.toString())
        txtScoreB.setText(teamB.totalPoints.toString())
    }
}
