package com.fahim.jetpackinfostore.staritn

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.animation.Animation
import android.view.animation.ScaleAnimation
import android.widget.ImageView
import com.fahim.jetpackinfostore.R
import java.lang.Exception

//class Loader(context: Context, attributeSet: AttributeSet) :
//    ConstraintLayout(context, attributeSet) {
//
//    init {
//        try {
//            val view = LayoutInflater.from(context).inflate(R.layout.loader_primary, this)
//            val scaleAnim = ScaleAnimation(
//                1f,
//                2f,
//                1f,
//                2f,
//                Animation.RELATIVE_TO_SELF,
//                0.5f,
//                Animation.RELATIVE_TO_SELF,
//                0.5f
//            )
//
//            scaleAnim.repeatMode = Animation.REVERSE
//            scaleAnim.duration = 750
//            scaleAnim.repeatCount = Animation.INFINITE
//            view.findViewById<ImageView>(R.id.image).startAnimation(scaleAnim)
//        } catch (e: Exception) {
//            e.printStackTrace()
//        }
//    }
//}