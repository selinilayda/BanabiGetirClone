package com.example.getirclone

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.example.getirclone.databinding.CardTasarimBinding

data class SeceneklerAdapter(var mContext:Context, var seceneklerListesi:List<Secenekler>):RecyclerView.Adapter<SeceneklerAdapter.CardTasarimTutucu>() {

    inner class CardTasarimTutucu(cardTasarimBinding: CardTasarimBinding) : RecyclerView.ViewHolder(cardTasarimBinding.root){

        var cardTasarim:CardTasarimBinding

        init {
            this.cardTasarim = cardTasarimBinding
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardTasarimTutucu {
        val layoutInflater = LayoutInflater.from(mContext)
        val tasarim= CardTasarimBinding.inflate(layoutInflater,parent,false)
        return CardTasarimTutucu(tasarim)
    }

    override fun onBindViewHolder(holder: CardTasarimTutucu, position: Int) {
        val secenek = seceneklerListesi.get(position)


        holder.cardTasarim.imageViewSecenek.setImageResource(mContext.resources.getIdentifier(secenek.secenek_resim_adi, "drawable",mContext.packageName))
        holder.cardTasarim.textViewSecenekAdi.text=secenek.secenek_adi

        holder.cardTasarim.secenekCardview.setOnClickListener {
            val gecis = AnasayfaFragmentDirections.secenekDetayGecis(secenek)

            Navigation.findNavController(it).navigate(gecis)
        }
    }

    override fun getItemCount(): Int {
        return seceneklerListesi.size
    }
}