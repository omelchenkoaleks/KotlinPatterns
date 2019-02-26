package com.omelchenkoaleks.patterns

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

/**
 * Единственная цель паттерна - создать единственный экземпляр в приложении,
 * без возможности создания второго экземпляра данного класса...
 * Главный плюс - возможность получить данные из этого класса из любой точки приложения...
 * Минус - приложение начинает обрастать сильными связанностями и неявными зависимостями...
 */
class MainActivity : AppCompatActivity() {
    private val TAG = MainActivity::class.java.simpleName

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tankArray = ArrayList<Tankable>()
        tankArray.add(T34(100, 100, 100, "Drug"))
        tankArray.add(Pantera(100, 100))

        tankArray.forEach {
            it.getFuelValue()
            it.getFuelValue()
            if (it is Amorable) {
                it.die()
            }
        }


        btn_start.setOnClickListener{ startSingleton() }
        btn_add_player.setOnClickListener { addPlayer() }
        btn_start_new_screen.setOnClickListener { updateActivtiy()}
    }

    private fun updateActivtiy() {
        startActivity(Intent(applicationContext, MainActivity::class.java))
    }

    private fun addPlayer() {
        GameConfig.getInstance().addWaitingGamers()
    }

    private fun startSingleton() {
        GameConfig.getInstance().printConfig()
    }


}
