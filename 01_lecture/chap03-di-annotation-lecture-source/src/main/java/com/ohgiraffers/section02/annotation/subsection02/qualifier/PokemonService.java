package com.ohgiraffers.section02.annotation.subsection02.qualifier;

import com.ohgiraffers.section02.common.Pokemon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("pokemonServiceQualifier")
public class PokemonService {

    /* @Qualifier 어노테이션은 여러 개의 빈 객체 중에서 특정 빈 객체를 이름으로 지정하는 언토테이션인다.
    * @Primaru 어노테이션과 @Qualifier 어노테이션이 함께 쓰였을때 @Qualifier 가 우선한다.*/

    /*1. 필드 주입 방식*/
//    @Autowired
//    @Qualifier("squirtle")
    private Pokemon pokemon;
//
//    public PokemonService(Pokemon pokemon){
//        this.pokemon = pokemon;
//    }
//
//    public void  pokemonAttack(){
//        pokemon.attack();
//    }

    /*2. 생성자 주입*/

    @Autowired
    public PokemonService(@Qualifier("squirtle") Pokemon pokemon){
        this.pokemon = pokemon;
    }

    public void pokemonAttack(){
        pokemon.attack();
    }

}