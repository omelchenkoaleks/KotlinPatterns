package com.omelchenkoaleks.patterns

class Pantera(val heakth: Int, val fuel: Int): Tankable {
    override fun getHealhtValue(): Int {
        return heakth
    }

    override fun shoot() {

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