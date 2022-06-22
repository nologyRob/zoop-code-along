package com.company;
/**
 * FOCUSING ON CLASS SYNTAX
 *
 * ANIMAL CLASS RESPONSIBLE FOR:
 * - STORING NAME
 * - STORING TYPE
 * - STORING & GETTING ID
 * - STORING & GETTING & SETTING ISTAME
 * - STORING & GETTING & SETTING HAPPINESS
 *  - HAPPINESS CANNOT GO ABOVE 100
 *  - IF HAPPINESS GOES ABOVE 50 THE ANIMAL IS TAME
 * - PETTING THE ANIMAL
 * - GIVING THE ANIMAL A TREAT
 * - GETTING THE ANIMALS INFORMATION
 */

public class Animal {
    // ADD FIELDS TO AN OBJECT
    // ACCESS-MODIFIER -- TYPE -- FIELD NAME

    public String name;
    public String type;

    public Animal(String name, String type) {
        this.name = name;
        this.type = type;
    }
}
