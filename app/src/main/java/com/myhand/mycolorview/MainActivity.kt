package com.myhand.mycolorview

import android.graphics.Color
import android.graphics.Paint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setListener()
    }

    private fun setListener(){
        val clickView: List<View> =
            listOf(boxOne, boxTwo, boxThree, boxFour, boxFive,
                cyanBtn, magentaBtn, yellowBtn, blackBtn)
        for (item in clickView){
            item.setOnClickListener{ changeColor(it) }
        }
    }

    private fun changeColor(view: View){
        when (view.id){
            R.id.cyanBtn -> {
                boxOne.setBackgroundColor(Color.CYAN)
                boxTwo.setBackgroundColor(Color.CYAN)
                boxThree.setBackgroundColor(Color.CYAN)
                boxFour.setBackgroundColor(Color.CYAN)
                boxFive.setBackgroundColor(Color.CYAN)
            }
            R.id.magentaBtn -> {
                boxOne.setBackgroundColor(Color.MAGENTA)
                boxTwo.setBackgroundColor(Color.MAGENTA)
                boxThree.setBackgroundColor(Color.MAGENTA)
                boxFour.setBackgroundColor(Color.MAGENTA)
                boxFive.setBackgroundColor(Color.MAGENTA)
            }
            R.id.yellowBtn -> {
                boxOne.setBackgroundColor(Color.YELLOW)
                boxTwo.setBackgroundColor(Color.YELLOW)
                boxThree.setBackgroundColor(Color.YELLOW)
                boxFour.setBackgroundColor(Color.YELLOW)
                boxFive.setBackgroundColor(Color.YELLOW)
            }
            R.id.blackBtn -> {
                boxOne.setBackgroundColor(Color.BLACK)
                boxOne.setTextColor(Color.WHITE)
                boxTwo.setBackgroundColor(Color.BLACK)
                boxTwo.setTextColor(Color.WHITE)
                boxThree.setBackgroundColor(Color.BLACK)
                boxThree.setTextColor(Color.WHITE)
                boxFour.setBackgroundColor(Color.BLACK)
                boxFour.setTextColor(Color.WHITE)
                boxFive.setBackgroundColor(Color.BLACK)
                boxFive.setTextColor(Color.WHITE)
            }
            else -> {
                boxOne.setBackgroundColor(Color.DKGRAY)
                boxTwo.setBackgroundColor(Color.DKGRAY)
                boxThree.setBackgroundColor(Color.DKGRAY)
                boxFour.setBackgroundColor(Color.DKGRAY)
                boxFive.setBackgroundColor(Color.DKGRAY)
            }
        }
    }
}
