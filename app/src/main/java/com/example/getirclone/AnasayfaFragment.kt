package com.example.getirclone

import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.getirclone.databinding.FragmentAnasayfaBinding


class AnasayfaFragment : Fragment() {

    private lateinit var tasarim:FragmentAnasayfaBinding
    private lateinit var seceneklerListesi:ArrayList<Secenekler>
    private lateinit var adapter: SeceneklerAdapter


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        tasarim = DataBindingUtil.inflate(inflater,R.layout.fragment_anasayfa, container, false)

        tasarim.rvsecenek.layoutManager = StaggeredGridLayoutManager(4,StaggeredGridLayoutManager.VERTICAL)

        val s1= Secenekler(1,"Yeni Ürünler","yeniurunler")
        val s2= Secenekler(2,"İndirimler","indirimler")
        val s3= Secenekler(3,"Damacana","damacana")
        val s4= Secenekler(4,"Su & İçecek","suicecek")
        val s5= Secenekler(5,"Meyve & Sebze","meyvesebze")
        val s6= Secenekler(6,"Fırından","firindan")
        val s7= Secenekler(7,"Temel Gıda","atistirmalik")
        val s8= Secenekler(8,"Atıştırmalık","temelgida")
        val s9= Secenekler(9,"Dondurma","dondurma")
        val s10= Secenekler(10,"Yiyecek","yiyecek")
        val s11= Secenekler(11,"Süt & Kahvaltı","sutkahvalti")
        val s12= Secenekler(12,"Fit & Form","fitform")
        val s13= Secenekler(13,"Kişisel Bakım","kisiselbakim")
        val s14= Secenekler(14,"Ev Bakım","evbakim")
        val s15= Secenekler(15,"Ev & Yaşam","evyasam")
        val s16= Secenekler(16,"Teknoloji","teknoloji")
        val s17= Secenekler(17,"Evcil Hayvan","evcilhayvan")
        val s18= Secenekler(18,"Bebek","bebek")
        val s19= Secenekler(19,"Cinsel Sağlık","cinselsaglik")
        val s20= Secenekler(20,"Giyim","giyim")

        seceneklerListesi = ArrayList()
        seceneklerListesi.add(s1)
        seceneklerListesi.add(s2)
        seceneklerListesi.add(s3)
        seceneklerListesi.add(s4)
        seceneklerListesi.add(s5)
        seceneklerListesi.add(s6)
        seceneklerListesi.add(s7)
        seceneklerListesi.add(s8)
        seceneklerListesi.add(s9)
        seceneklerListesi.add(s10)
        seceneklerListesi.add(s11)
        seceneklerListesi.add(s12)
        seceneklerListesi.add(s13)
        seceneklerListesi.add(s14)
        seceneklerListesi.add(s15)
        seceneklerListesi.add(s16)
        seceneklerListesi.add(s17)
        seceneklerListesi.add(s18)
        seceneklerListesi.add(s19)
        seceneklerListesi.add(s20)

        adapter = SeceneklerAdapter(requireContext(),seceneklerListesi)
        tasarim.rvsecenek.adapter = adapter



        tasarim.toolbarAnasayfa.title="BanaBiGetir"
        tasarim.toolbarAnasayfa.setTitleMargin(10,10,10,10)
        tasarim.toolbarAnasayfa.setTitleTextColor(Color.GREEN)

        (activity as AppCompatActivity).setSupportActionBar(tasarim.toolbarAnasayfa)



        return tasarim.root
    }

}