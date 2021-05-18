package com.example.getirclone

import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.fragment_profil.view.*


class ProfilFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        val tasarim = inflater.inflate(R.layout.fragment_profil, container, false)

        tasarim.toolbarProfil.title="BanaBiGetir"
        tasarim.toolbarProfil.setTitleMargin(10,10,10,10)
        tasarim.toolbarProfil.setTitleTextColor(Color.GREEN)

        (activity as AppCompatActivity).setSupportActionBar(tasarim.toolbarProfil)

        return tasarim
    }


}