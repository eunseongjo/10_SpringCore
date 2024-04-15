package com.ohgiraffers.section03.properties;

import com.ohgiraffers.common.Beverage;
import com.ohgiraffers.common.Bread;
import com.ohgiraffers.common.Product;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.Date;

@Configuration
@PropertySource("section03/properties/product-info.properties")
public class ContextConfiguration {

    /*치환자(placeholder)문법을 이욯하여 properties에 저장된 key를 입력하면 value에 해당하는 값을 꺼내온다.*/

    @Value("${bread.carpbread.name}")
    private String carpBreadName;

    @Value("${bread.carpbread.price}")
    private int carpBreadPrice;

    @Value("${beverage.milk.name}")
    private String milkName;

    @Value("${beverage.milk.price}")
    private int milkPrice;

    @Value("${beverage.milk.capacity}")
    private int milkCapacity;
    @Bean
    public Product carpBread(){
        return new Bread(carpBreadName,carpBreadPrice, new Date());
    }

    @Bean
    public Product milk(){
        return new Beverage(milkName, milkPrice, milkCapacity);
    }

    @Bean
    public Product water(@Value("${beverage.water.name}") String waterName
            , @Value("${beverage.water.price}") int waterPrice
            , @Value("${beverage.water.capacity}") int waterCapacity){

        return new Beverage( waterName, waterPrice, waterCapacity);
    }
}
