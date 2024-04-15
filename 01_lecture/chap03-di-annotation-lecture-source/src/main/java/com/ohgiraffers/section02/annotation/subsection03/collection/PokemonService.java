package com.ohgiraffers.section02.annotation.subsection03.collection;

import com.ohgiraffers.section02.common.Pokemon;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("pokemonServiceCollection")
public class PokemonService {
        private List<Pokemon> pokemonList;

        public PokemonService(List<Pokemon> pokemonList){
            this.pokemonList = pokemonList;

        }

        public void pokemonAttack(){
            for(Pokemon pokemon : pokemonList){
                pokemon.attack();

        }

}

