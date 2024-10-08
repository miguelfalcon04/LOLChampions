package com.turing.alan.cpifp.data

interface ChampionsRepository {

    fun getChampions(): List<Champion>
    fun readOne(id:Int):Champion

}