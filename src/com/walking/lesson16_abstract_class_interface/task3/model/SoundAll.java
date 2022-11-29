package com.walking.lesson16_abstract_class_interface.task3.model;

interface SoundAll {
    default void soundAll(Animal[] animals) {
        for (Animal animal : animals) {
            animal.sound();
        }
    }

}
