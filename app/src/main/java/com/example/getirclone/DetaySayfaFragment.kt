package com.example.getirclone

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.navArgs
import com.example.getirclone.databinding.FragmentDetaySayfaBinding


class DetaySayfaFragment : Fragment() {

    private lateinit var tasarim:FragmentDetaySayfaBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        tasarim = DataBindingUtil.inflate(inflater,R.layout.fragment_detay_sayfa, container, false)


        val b:DetaySayfaFragmentArgs by navArgs()

        val gelenSecenek = b.secenekNesne

        tasarim.imageViewDetay.setImageResource(resources.getIdentifier(gelenSecenek.secenek_resim_adi,"drawable",requireContext().packageName))

        tasarim.textViewSecenek.text=gelenSecenek.secenek_adi

        return tasarim.root
    }

}