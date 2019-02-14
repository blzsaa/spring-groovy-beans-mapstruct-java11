package hu.blzsaa

import groovy.transform.EqualsAndHashCode
import groovy.transform.ToString

@ToString(includeNames=true)
@EqualsAndHashCode
class Car {
    int numberOfDoors
    String model
    String brand
    boolean automatic
    double price
}