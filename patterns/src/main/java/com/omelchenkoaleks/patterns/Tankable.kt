package com.omelchenkoaleks.patterns

interface Tankable {
    fun shoot()
    fun move()
    fun die()
    fun getFuelValue(): Int
    fun getHealhtValue(): Int
}