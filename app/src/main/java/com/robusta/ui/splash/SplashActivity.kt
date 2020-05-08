package com.robusta.ui.splash

import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.os.Handler
import androidx.lifecycle.lifecycleScope
import com.robusta.R
import com.robusta.ui.home.ui.HomeActivity

class SplashActivity : AppCompatActivity() {

    init {
        lifecycleScope.launchWhenCreated {
            setContentView(R.layout.activity_splash)
            mDelayHandler = Handler()
            mDelayHandler!!.postDelayed(mRunnable, delay)
        }
    }

    public override fun onDestroy() {
        if (mDelayHandler != null) {
            mDelayHandler!!.removeCallbacks(mRunnable)
        }
        super.onDestroy()
    }

    private val mRunnable: Runnable = Runnable {
        if (!isFinishing) {
            val intent = Intent(applicationContext, HomeActivity::class.java)
            startActivity(intent)
            finish()
        }
    }

    private var mDelayHandler: Handler? = null
    private val delay: Long = 1500
}