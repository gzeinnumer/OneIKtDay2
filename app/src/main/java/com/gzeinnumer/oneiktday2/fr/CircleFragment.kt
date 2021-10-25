package com.gzeinnumer.oneiktday2.fr

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import android.viewbinding.library.fragment.viewBinding
import com.gzeinnumer.oneiktday2.R
import com.gzeinnumer.oneiktday2.databinding.FragmentCircleBinding

class CircleFragment : Fragment(R.layout.fragment_circle) {

    private val binding: FragmentCircleBinding by viewBinding()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

}