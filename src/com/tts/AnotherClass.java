package com.tts;

//make a generic class
public class AnotherClass<typeOne, typeTwo> {

    typeOne thingOne;
    typeTwo thingTwo;

    //constructor generated when thingOne/Two were specific data types
//    public AnotherClass(int thingOne, String thingTwo) {
//        this.thingOne = thingOne;
//        this.thingTwo = thingTwo;
//    }
    //constructor generated when thingOne/Two are objects
//    public AnotherClass(Object thingOne, Object thingTwo) {
//        this.thingOne = thingOne;
//        this.thingTwo = thingTwo;
//    }
    //constructor generated when whole class is generic typeOne/Two
    public AnotherClass(typeOne thingOne, typeTwo thingTwo) {
        this.thingOne = thingOne;
        this.thingTwo = thingTwo;
    }


    //getters and setters generated when thingOne/Two were specific data types
//    public int getThingOne() {
//        return thingOne;
//    }
//
//    public void setThingOne(int thingOne) {
//        this.thingOne = thingOne;
//    }
//
//    public String getThingTwo() {
//        return thingTwo;
//    }
//
//    public void setThingTwo(String thingTwo) {
//        this.thingTwo = thingTwo;
//    }

    //getters and setters generated when thingONe/Two are objects
//    public Object getThingOne() {
//        return thingOne;
//    }
//
//    public void setThingOne(Object thingOne) {
//        this.thingOne = thingOne;
//    }
//
//    public Object getThingTwo() {
//        return thingTwo;
//    }
//
//    public void setThingTwo(Object thingTwo) {
//        this.thingTwo = thingTwo;
//    }

    //getter and setters generated when whole class is generic typeOne/Two
    public typeOne getThingOne() {
        return thingOne;
    }

    public void setThingOne(typeOne thingOne) {
        this.thingOne = thingOne;
    }

    public typeTwo getThingTwo() {
        return thingTwo;
    }

    public void setThingTwo(typeTwo thingTwo) {
        this.thingTwo = thingTwo;
    }

}//end AnotherClass class
