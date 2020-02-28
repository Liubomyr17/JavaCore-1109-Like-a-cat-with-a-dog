package com.company;

/*

1109 Like a cat with a dog
Hide all internal variables of the Cat and Dog class.
Also hide all methods except those with which these classes interact with each other.

Requirements:
1. Cat class variables must be hidden.
2. Dog class variables must be hidden.
3. Cat's getName getter must be private.
4. The getSpeed Cat class getter must be private.
5. The Cat class isDogNear method must be public.
6. The getName getter of the Dog class must be private.
7. The getSpeed getter of the Dog class must be private.
8. The isCatNear method of the Dog class must be public.

 */

import java.io.*;
import java.lang.reflect.Array;
import java.net.URISyntaxException;
import java.nio.file.FileSystemException;
import java.nio.file.attribute.AclFileAttributeView;
import java.rmi.RemoteException;
import java.text.SimpleDateFormat;
import java.util.*;


public class Main {
    public static void main(String[] args) {
    Cat cat = new Cat("Vaska", 5);
    Dog dog = new Dog("Sharik", 4);

    cat.isDogNear(dog);
    dog.isCatNear(cat);
    }
    public static class Cat {
        private String name;
        private int speed;

        public Cat (String name, int speed) {
            this.name = name;
            this.speed = speed;
        }
        private String getName() {
            return name;
        }
        private int getSpeed() {
            return speed;
        }
        public boolean isDogNear(Dog dog) {
            return this.speed > dog.getSpeed();
        }
    }
    public static class Dog {
        private String name;
        private int speed;

        public Dog(String name, int speed) {
            this.name = name;
            this.speed = speed;
        }
        private String getName() {
            return name;
        }
        private int getSpeed() {
            return speed;
        }
        public boolean isCatNear(Cat cat) {
            return this.speed > cat.getSpeed();
        }
    }
}



















