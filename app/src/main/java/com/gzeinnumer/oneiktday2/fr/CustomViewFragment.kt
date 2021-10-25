package com.gzeinnumer.oneiktday2.fr

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import android.viewbinding.library.fragment.viewBinding
import com.gzeinnumer.oneiktday2.R
import com.gzeinnumer.oneiktday2.databinding.FragmentCustomViewBinding

class CustomViewFragment : Fragment(R.layout.fragment_custom_view) {

    private val binding: FragmentCustomViewBinding by viewBinding()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }
}