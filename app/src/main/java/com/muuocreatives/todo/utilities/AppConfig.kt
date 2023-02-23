package com.muuocreatives.todo.utilities

class AppConfig {
    private var APPVERSION: String = "0.1.0-alpha"

    //servers
    private var LOCAL: String = "http://192.168.43.15:8000" //replace with your local dev server IP
    private var LOCALHOST: String = "http://192.168.2.103:8000" //replace with your local dev server IP
    private var LIVE: String = "https://todo.muuocreatives.co.ke" //remote host

    fun getAppVersion(): String{

        return APPVERSION
    }

    fun getServerUrl(type: String): String? {

        var addr = when(type.lowercase()){

            "dev" -> LIVE //change this to LOCAL / LIVE when in dev / production env

            else -> null

        }

        return addr
    }
}