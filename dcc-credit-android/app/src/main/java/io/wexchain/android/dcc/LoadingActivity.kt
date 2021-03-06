package io.wexchain.android.dcc

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import io.reactivex.Single
import io.reactivex.android.schedulers.AndroidSchedulers
import io.wexchain.android.common.atLeastCreated
import io.wexchain.android.common.navigateTo
import io.wexchain.auth.R
import java.util.concurrent.TimeUnit

class LoadingActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_loading)
        delayedStart()
    }

    private fun delayedStart() {
        Single.timer(1500, TimeUnit.MILLISECONDS)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe { _->
                    atLeastCreated {
                        navigateTo(HomeActivity::class.java)
                    }
                }
    }
}
