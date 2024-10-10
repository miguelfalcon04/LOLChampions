package com.turing.alan.cpifp.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import coil.load
import com.turing.alan.cpifp.R
import com.turing.alan.cpifp.data.ChampionsRepository
import com.turing.alan.cpifp.data.InMemoryChampionsRepository
import com.turing.alan.cpifp.databinding.FragmentChampionLoreBinding
import okhttp3.internal.concurrent.Task

class ChampionLoreFragment : Fragment() {
    private  val repository: ChampionsRepository = InMemoryChampionsRepository.getInstance()
    private val args: ChampionLoreFragmentArgs by navArgs()
    private lateinit var binding: FragmentChampionLoreBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentChampionLoreBinding.inflate(
            inflater,
            container,
            false
        )
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val championId = args.championId
        val champion = repository.readOne(championId)
        binding.championLore.text = champion.lore
        binding.championName.text = champion.name
        binding.championTitle.text = champion.title
        binding.championImage.load(champion.imageUrl)
    }

}