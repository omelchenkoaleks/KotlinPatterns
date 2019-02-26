package com.omelchenkoaleks.patterns;

import android.util.Log;

/*
    Некий описательный объект, который хранит справочную информацию...
    Один раз сохранился, инициализировался и дальше раздает информацию всем остальным...
 */
public class GameConfig {
    private static GameConfig instance = null;
    private String TAG = GameConfig.class.getSimpleName();
    private int latency = 1000;
    private int waitingGamers = 0;
    private int heroesPull = 150;
    private String title = "";

    // private = создать экземпляр случайно ниоткуда нельзя будет...
    private GameConfig() {} // Empty constructor

    public static GameConfig getInstance() {
        if (instance == null) {
            instance = new GameConfig();
        }
        return instance;
    }

    public void printConfig() {
        Log.e(TAG, "======================= START CONFIG ========================");
        Log.e(TAG, "current latency" + this.latency);
        Log.e(TAG, "current players waiting" + this.waitingGamers);
        Log.e(TAG, "current heroes pull" + this.heroesPull);
        Log.e(TAG, "current game title" + this.title);
        Log.e(TAG, "======================= END CONFIG ===========================");
    }

    public void addWaitingGamers() {
        this.waitingGamers += 1;
        Log.e(TAG, "gamer added");
        Log.e(TAG, "current players waiting " + this.waitingGamers);
    }

    public int getLatency() {
        return latency;
    }

    public void setLatency(int latency) {
        this.latency = latency;
    }

    public int getWaitingGamers() {
        return waitingGamers;
    }

    public void setWaitingGamers(int waitingGamers) {
        this.waitingGamers = waitingGamers;
    }

    public int getHeroesPull() {
        return heroesPull;
    }

    public void setHeroesPull(int heroesPull) {
        this.heroesPull = heroesPull;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
