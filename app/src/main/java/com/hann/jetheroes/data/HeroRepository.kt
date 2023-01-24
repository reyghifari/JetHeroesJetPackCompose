package com.hann.jetheroes.data

import com.hann.jetheroes.model.Hero
import com.hann.jetheroes.model.HeroesData

class HeroRepository {

    fun getHeroes():List<Hero>{
        return HeroesData.heroes
    }

    fun SearchHeroes(query: String):List<Hero>{
        return HeroesData.heroes.filter {
            it.name.contains(query, ignoreCase = true)
        }
    }
}