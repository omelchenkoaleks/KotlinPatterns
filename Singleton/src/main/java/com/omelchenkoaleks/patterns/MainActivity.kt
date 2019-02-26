package com.omelchenkoaleks.patterns

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

/**
 * единственная цель паттерна - создать единственный экземпляр в приложении
 * без возможности создания второго экземпляра данного класса...
 * Главный плюс - возможность получить данные из этого класса из любой точки приложения...
 */
class MainActivity : AppCompatActivity() {
    private val TAG = MainActivity::class.java.simpleName

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
