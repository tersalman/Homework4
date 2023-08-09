public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();

    }

    public static void task1 () {
        System.out.println("Задача 1");
         int age =5;
         if (age >= 18) {
             System.out.println("он совершеннолетний");
         } else {
             System.out.println("он не достиг совершеннолетия, нужно немного подождать");
         }
    }
    public static void task2 () {
        System.out.println("Задача 2");
        int airTemperature = -23;
        if (airTemperature < 5) {
            System.out.println("На улице " + airTemperature +  " градусов, нужно надеть шапку");
        } else {
            System.out.println("На улице " + airTemperature +  " градусов, можно идти без шапки");
        }
    }

    public static void task3 () {
        System.out.println("Задача 3");
         int carSpeed = 60;
         if (carSpeed > 60) {
             System.out.println("Если скорость " + carSpeed + " то придется заплатить штраф");
         } else {
             System.out.println("Если скорость " + carSpeed + " можно ездить спокойно");
         }
    }

    public static void task4 () {
        System.out.println("Задача 4");
        int per1 = 1;
        int per2 = 3;
        int per3 = 10;
        int per4 = 21;
        int per5 = 666;
        if (per1 < 2) {
            System.out.println("Если возраст человека равен " + per1 + " то ему пора спать.");
        }
        if (per2 >2 && per2<6) {
            System.out.println("Если возраст человека равен " + per2 + " то ему нужно ходить в детский сад.");
        }
        if (per3 >=6 && per3 <18) {
            System.out.println("Если возраст человека равен " + per3 + " то ему нужно ходить в школу.");
        }
        if (per4 >=18 && per4 <60) {
            System.out.println("Если возраст человека равен " + per4 + " то его место в университете.");
        }
        if (per5 >60) {
            System.out.println("Если возраст человека равен " + per5 + " то он может отдохнуть.");
        }
    }
    public static void task5 () {
        System.out.println("Задача 5");
        short per = 7;

        boolean havingParents = true;
        if (per <5) {
            System.out.println("Если возраст ребенка равен " + per + " то ему нельзя кататься на аттракционе.");
        } else if (per>=5&&per<14&&havingParents==true) {
            System.out.println("Если возраст ребенка равен " + per + " ему ожно кататься на аттракционе в сопровождений взрослого.");
        } else if (per>=5&&per<14&&havingParents==false) {
            System.out.println("Если возраст ребенка равен " + per + " ему нельзя кататься на аттракционе без сопровождений взрослого.");
        }else {
            System.out.println("Если возраст ребенка равен " + per + " то ему можно кататься на аттракционе.");
        }


    }
    public static void task6 () {
        System.out.println("Задача 6");
        int wagonCapacity = 102;
        int perInWagon = 666;
        int seatingPlace = 60;
        int standingPlace = wagonCapacity - seatingPlace;
        if (perInWagon<seatingPlace){
            System.out.println("в вагоне есть сидячие и стоячие места");
        }else if (perInWagon>=seatingPlace && perInWagon<wagonCapacity) {
            System.out.println("в вагоне есть только стоячие места");
        } else {
            System.out.println("в вагоне нет мест");
        }


    }

    public static void task7 () {
        System.out.println("Задача 7");
        int one = 1;
        int two = 2;
        int three = 3;
        if (one>two&&one>three){
            System.out.println("one");
        }
        if (two>one&&two>three){
            System.out.println("two");
        }
        if (three>two&&three>one){
            System.out.println("three");
        }

    }

}