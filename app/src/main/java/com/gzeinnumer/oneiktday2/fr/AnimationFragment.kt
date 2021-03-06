package com.gzeinnumer.oneiktday2.fr

import android.animation.AnimatorSet
import android.animation.ObjectAnimator
import android.animation.PropertyValuesHolder
import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import android.viewbinding.library.fragment.viewBinding
import com.gzeinnumer.oneiktday2.R
import com.gzeinnumer.oneiktday2.databinding.FragmentAnimationBinding

//todo 6
class AnimationFragment : Fragment(R.layout.fragment_animation) {

    private val binding: FragmentAnimationBinding by viewBinding()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //todo 15
        binding.buttonAnimation.setOnClickListener {
//            animateParalel()
//            rotate()
//            translate()
//            scaling()
//            fader()
            colorizer()
        }
    }

    //todo 16
    private fun rotate() {
        val animator = ObjectAnimator
            .ofFloat(binding.imageView, View.ROTATION, -360f, 0f)
        animator.duration = 1000
        animator.start()
    }

    private fun translate() {
        val animator = ObjectAnimator
            .ofFloat(binding.imageView, View.TRANSLATION_X, 200f)
        animator.repeatCount = 3
        animator.repeatMode = ObjectAnimator.REVERSE
        animator.start()
    }

    private fun scaling() {
        val scaleSize = 0.3f
        val scaleX = PropertyValuesHolder
            .ofFloat(View.SCALE_X, scaleSize)
        val scaleY = PropertyValuesHolder
            .ofFloat(View.SCALE_Y, scaleSize)
        val animator = ObjectAnimator
            .ofPropertyValuesHolder(binding.imageView, scaleX, scaleY)
        animator.repeatCount = 5
        animator.repeatMode = ObjectAnimator.REVERSE
        animator.start()
    }

    private fun fader() {
        val animator = ObjectAnimator
            .ofFloat(binding.imageView, View.ALPHA, 0f)
        animator.repeatCount = 3
        animator.repeatMode = ObjectAnimator.REVERSE
        animator.start()
    }

    private fun colorizer() {
        val animator = ObjectAnimator.ofArgb(
            binding.root,
            "backgroundColor", Color.WHITE, Color.RED
        )
        animator.setDuration(500)
        animator.repeatCount = 1
        animator.repeatMode = ObjectAnimator.REVERSE
        animator.start()
    }

    private fun animateParalel() {
        val animRotate360 = ObjectAnimator.ofFloat(binding.imageView, View.ROTATION, -360f, 0f)
        animRotate360.repeatCount = 1
        animRotate360.repeatMode = ObjectAnimator.REVERSE

        val animTranlateRight = ObjectAnimator.ofFloat(
            binding.imageView, View.TRANSLATION_X,
            (((binding.root.width / 2)).toFloat())
        )
        animTranlateRight.repeatCount = 1
        animTranlateRight.repeatMode = ObjectAnimator.REVERSE

        val scaleSize = 0.3f
        val scaleX = PropertyValuesHolder.ofFloat(View.SCALE_X, scaleSize)
        val scaleY = PropertyValuesHolder.ofFloat(View.SCALE_Y, scaleSize)
        val animScaleDown = ObjectAnimator.ofPropertyValuesHolder(binding.imageView, scaleX, scaleY)
        animScaleDown.repeatCount = 1
        animScaleDown.repeatMode = ObjectAnimator.REVERSE

        val animSet = AnimatorSet()
        animSet.playTogether(animRotate360, animTranlateRight, animScaleDown)
        animSet.duration = 500
        animSet.start()
    }
    //end todo 16
}