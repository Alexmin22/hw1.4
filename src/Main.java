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
        byte personAge = 19;

        if (personAge >= 18) {
            System.out.println("человеку 18 или больше лет");
        } else {
            System.out.println("Вы еще несовершеннолетний, немного подождите...");
        }
    }

    public static void task2 () {
        System.out.println("Задача 2");
        short tempInStreet = 10;
        if (tempInStreet <= 5) {
            System.out.println("На улице " +tempInStreet+ " градусов, нужно надеть шапку");
        } else {
            System.out.println("На улице " +tempInStreet+ " градусов, можно идти без шапки");
        }

    }

    public static void task3 () {
        System.out.println("Задача 3");
        int yourSpeed = 60;
        int permittedSpeed = 60;
        if (yourSpeed > permittedSpeed) {
            System.out.println("Если скорость " + yourSpeed + ", то придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + yourSpeed + ", можно ездить спокойно");
        }

    }

    public static void task4 () {
        System.out.println("Задача 4");
        byte agePerson = 33;

        boolean child = agePerson >= 2 && agePerson <= 6;
        boolean schoolboy = agePerson >= 7 && agePerson < 18;
        boolean student = agePerson >= 18 && agePerson < 24;
        boolean newBirth = agePerson <= 0 && agePerson < 2;
        if (child) {
            System.out.println("Если возраст человека равен " + agePerson + " Вам нужно ходить в детский сад");
        }
        if (schoolboy) {
            System.out.println("Если возраст человека равен " + agePerson + " Вам нужно ходить в школу");
        }
        if (student) {
            System.out.println("Если возраст человека равен " + agePerson + " Вам нужно ходить в унивеситет");
        }
        if (newBirth) {
            System.out.println("Если возраст человека равен " + agePerson + " Как ты сюда попал?))");
        } else {
            System.out.println("Если возраст человека равен " + agePerson + " Вам нужно ходить на работу");
        }
    }

        public static void task5 () {
        System.out.println("Задача 5");
        byte ageChild = 5;

        boolean cantRide = ageChild < 5 && ageChild > 0;
        boolean onlyWithAnAdult = ageChild >= 5 && ageChild <= 14;

        if (cantRide) {
            System.out.println("Если возраст ребенка равен " + ageChild + ", то ему нельзя кататься на аттракционе");
        } else if (onlyWithAnAdult) {
            System.out.println("Если возраст ребенка равен " + ageChild +
                    ", то ему можно кататься на аттракционе в сопровождении взрослого");
        } else {
                System.out.println("Если возраст ребенка равен " + ageChild +
                        ", то ему можно кататься на аттракционе без сопровождения взрослого");
        }
    }

    public static void task6 () {
        System.out.println("Задача 6");
        byte trainCapacity = 102;
        byte seatsOnTheTrain = 60;

        int occupiedOnTheTrain = 2;

       if (occupiedOnTheTrain >= seatsOnTheTrain && occupiedOnTheTrain >=trainCapacity) {
           System.out.println("Извините места закончились");
       } else if (occupiedOnTheTrain >= seatsOnTheTrain && occupiedOnTheTrain < trainCapacity) {
            System.out.println("Есть стоячие места");
        } else {
            System.out.println("Есть сидячие места");
        }
    }

    public static void task7 () {
        System.out.println("Задача 7");

        int one = 200;
        int two = 201;
        int three = 200;
        int largeNumb = 1;

        if (one > two) {
            if (one > three) {
                largeNumb = one;
            } else {
                largeNumb = three;
            }
        }   else if (two > one) {
            if (two > three) {
                largeNumb = two;
            } else {
                largeNumb = three;
            }
        } else if (one == two && two == three) {
            largeNumb = three;
        }

        System.out.println("Максимальное число здесь это " + largeNumb);
    }
}