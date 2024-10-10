package com.turing.alan.cpifp.data

class InMemoryChampionsRepository private constructor(): ChampionsRepository {

    companion object {
        private var instance: InMemoryChampionsRepository? = null
        fun getInstance(): InMemoryChampionsRepository{
            if(instance == null){
                instance = InMemoryChampionsRepository()
            }
            return instance!!
        }
    }
    private val _champions = mutableListOf(
        Champion(
            1,
            "Ahri",
            "The Nine-Tailed Fox",
            "Innately connected to the latent power of Runeterra, Ahri is a vastaya who can reshape magic into orbs of raw energy.",
            "https://ddragon.leagueoflegends.com/cdn/img/champion/splash/Ahri_0.jpg"
        ),
        Champion(
            2,
            "Yasuo",
            "The Unforgiven",
            "An agile swordsman, Yasuo fights with the power of the wind at his beck and call, turning aside missiles and cutting down foes in the blink of an eye.",
            "https://ddragon.leagueoflegends.com/cdn/img/champion/splash/Yasuo_0.jpg"
        ),
        Champion(
            3,
            "Lux",
            "The Lady of Luminosity",
            "Luxanna Crownguard hails from Demacia, an insular realm where magical abilities are viewed with fear and suspicion.",
            "https://ddragon.leagueoflegends.com/cdn/img/champion/splash/Lux_0.jpg"
        ),
        Champion(
            4,
            "Jinx",
            "The Loose Cannon",
            "A manic and impulsive criminal from Zaun, Jinx lives to wreak havoc without care for the consequences.",
            "https://ddragon.leagueoflegends.com/cdn/img/champion/splash/Jinx_0.jpg"
        ),
        Champion(
            5,
            "Garen",
            "The Might of Demacia",
            "A proud and noble warrior, Garen fights at the head of the Dauntless Vanguard, defending Demacia with all his might and courage.",
            "https://ddragon.leagueoflegends.com/cdn/img/champion/splash/Garen_0.jpg"
        ),
        Champion(
            6,
            "Teemo",
            "The Swift Scout",
            "Undeterred by even the most dangerous and threatening of missions, Teemo scouts the world with boundless enthusiasm and a smile on his face.",
            "https://ddragon.leagueoflegends.com/cdn/img/champion/splash/Teemo_0.jpg"
        )
    )

    override fun getChampions(): List<Champion> {
        // Simplemente retornamos la lista de campeones
        return _champions
    }

    override fun readOne(id: Int): Champion {
        return _champions.single {it.id == id}
    }

}