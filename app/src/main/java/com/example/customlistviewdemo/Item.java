package com.example.customlistviewdemo;

public class Item {
String animalName;//String are stored as String
int animalImage;//Images are stored in an Android Studio as A Integer.

public Item(String animalName,int animalImage){
    this.animalName=animalName;
    this.animalImage=animalImage;

}
public String getAnimalName(){
    return animalName;
}
public int getAnimalImage(){
    return animalImage;
}

}
