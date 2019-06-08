package com.ucsdextandroid1.kotlinlist;

import android.view.View;

import java.util.Collections;
import java.util.Comparator;

public class JavaUnitTest {
    private String helloWorld() {
        return "Hello World";
    }

    private void doSomething() {
        Collections.sort(Collections.emptyList(), (Comparator<Integer>) (o1, o2) -> 0);
        PropertyDemo demo = new PropertyDemo();

    }
          public class Person {
           private String name;
           private int age;

                   public Person(String name, int age) {
                   this.name = name;
                   this.age = age;
           }

                   public String getName() {
               return name;
          }

               public int getAge() {
                return age;
           }

                   public void setAge(int newAge) {
                this.age = newAge;
                         }
      }
      public class PropertyDemo {
        private int counter;
        private String propertyWithCounter;

        public int getCounter() {
            return counter;
        }

          public String getPropertyWithCounter() {
              return propertyWithCounter;
          }

          public void setPropertyWithCounter(String propertyWithCounter) {
            this.counter = counter;
            this.propertyWithCounter = propertyWithCounter;
          }
      }
}
