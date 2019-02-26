package com.omelchenkoaleks.patterns

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.view.View
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

        btn_start.setOnClickListener{ startSingleton() }
        btn_add_player.setOnClickListener { addPlayer() }
        btn_start_new_screen.setOnClickListener { updateActivtiy()}
    }

    private fun updateActivtiy() {
        onRestart()
        Log.e(TAG, "onRestart")
    }

    private fun addPlayer() {
        GameConfig.getInstance().addWaitingGamers()
    }

    private fun startSingleton() {
        GameConfig.getInstance().printConfig()
    }


}
