package com.example.lab8;


import static org.junit.jupiter.api.Assertions.assertEquals;


//import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomListTest {
    private CustomList list;
    /**
     * create a mocklist for my citylist
     * @return
     */
    public CustomList MockCityList(){
        list = new CustomList(null,new ArrayList<>());
        return list;
    }

    @Test
    public void addCityTest(){
        list = MockCityList();
        int listSize = list.getCount();
        list.addCity(new City("Estevan", "SK"));
        assertEquals(list.getCount(),listSize + 1);
    }
    @Test
    public void deleteCityTest(){
        list = MockCityList();
        int listSize = list.getCount();
        City deleting = new City("Estevan", "SK");
        list.addCity(deleting);
        list.deleteCity(deleting);
        assertEquals(list.getCount(),0);
    }
//    @Test
//    public void hasCityTest(){
//        list = MockCityList();
//        int listSize = list.getCount();
//        City city = new City("Estevan", "SK");
//        list.addCity(city);
//        assertEquals(list.hasCity(city), true);
//    }

    @Test
    public void countCityTest(){
        list = MockCityList();
        int listSize = list.getCount();
        City city = new City("Estevan", "SK");
        list.addCity(city);
        list.countCity(city);
        assertEquals(list.getCount(),1);
    }

}
