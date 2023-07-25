package be.tftic.web2023.demo01_intro

import android.app.Application
import android.util.Log

class DemoApplication : Application() {

    private val message : String = "Demo Application !!!"

    fun getMessage() : String {
        return message
    }

    override fun onCreate() {
        super.onCreate()

        Log.d("ApplicationTFTIC", "Create (●'◡'●)")
    }

    override fun onLowMemory() {
        super.onLowMemory()

        Log.d("ApplicationTFTIC", "Low Memory (╯°□°）╯︵ ┻━┻")
    }
}