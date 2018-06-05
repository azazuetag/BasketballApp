package com.mtw.alejandro.basketballapp

class Team {
    var totalPoints: Int = 0

    init{
        // Constructor
    }

    fun treePointsBasket(){
        totalPoints += 3
    }

    fun twoPointsBasket(){
        totalPoints +=2
    }

    fun onePointsBasket(){
        totalPoints++;
    }

    fun resetPoints(){
        totalPoints = 0;
    }

}