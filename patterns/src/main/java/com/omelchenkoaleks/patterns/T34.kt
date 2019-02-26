package com.omelchenkoaleks.patterns

class T34(private val health: Int, val fuel: Int, val armor: Int, val title: String) : Tankable, Amorable{
    override fun getHealhtValue(): Int {
        return health
    }

    override fun getAmorable(): Int {
        return armor
    }

    override fun shoot() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun move() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun die() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getFuelValue(): Int {
        return fuel
    }

}