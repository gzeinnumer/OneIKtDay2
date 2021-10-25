package com.gzeinnumer.oneiktday2.fr

import android.os.Bundle
import android.view.View
import android.viewbinding.library.fragment.viewBinding
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.gzeinnumer.oneiktday2.databinding.FragmentJavaCVBinding

//todo 19
class JavaCVFragment : Fragment(com.gzeinnumer.oneiktday2.R.layout.fragment_java_c_v) {

    private val binding: FragmentJavaCVBinding by viewBinding()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //todo 22
        initDR1();
        initDR2();
    }

    //todo 23
    private fun initDR1() {
        val listString = ArrayList<String>()
        listString.add("Satu")
        listString.add("Dua")
        listString.add("Tiga")
        listString.add("Empat")

        binding.dr1.setItemList(listString).setOnCheckedChangeListener { item ->
            Toast.makeText(requireContext(),"$item", Toast.LENGTH_SHORT).show()
        }
    }

    private fun initDR2() {
        val listString = ArrayList<ExampleModel>()
        listString.add(ExampleModel(1,"M", "Padang"))
        listString.add(ExampleModel(2,"Fadli", "Sumatera"))
        listString.add(ExampleModel(3,"Zein", "Jakarta"))
        listString.add(ExampleModel(4,"GZeinNumer", "Android Programmer"))

        binding.dr2.setItemList(listString).setOnCheckedChangeListener { item ->
            Toast.makeText(requireContext(),"$item", Toast.LENGTH_SHORT).show()
        }
    }

    data class ExampleModel(val id: Int, val name: String,val address: String) {

        override fun toString(): String {
            return "$id - $name - $address"
        }
    }
    //end todo 23
}