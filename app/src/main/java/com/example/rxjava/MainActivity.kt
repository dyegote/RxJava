package com.example.rxjava

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import io.reactivex.rxjava3.core.Observable
import io.reactivex.rxjava3.core.Observer
import io.reactivex.rxjava3.disposables.Disposable

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


    private fun simpleOperation(){

        val observable: Observable<String> = Observable.create<String>{
            Log.d(TAG, "Observable - Thread: ${Thread.currentThread().name}")
            it.onNext("Hola")
            it.onNext("Recodigo")
            it.onNext("Fin")
            it.onComplete()
        }

    }

    val observer = object: Observer<String>{
        override fun onSubscribe(d: Disposable) {
            TODO("Not yet implemented")
        }

        override fun onNext(t: String) {
            TODO("Not yet implemented")
        }

        override fun onError(e: Throwable) {
            TODO("Not yet implemented")
        }

        override fun onComplete() {
            TODO("Not yet implemented")
        }


    }

    companion object{
        private const val TAG = "MainActivity"
    }
}