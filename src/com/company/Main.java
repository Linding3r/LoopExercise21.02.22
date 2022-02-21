package com.company;


public class Main {


    public void countDown(){
        for (int counter = 10; counter > -1; counter--){
            System.out.printf(" %5d",counter);
        }
        System.out.println();
    }

    public void countDown1(){
        for (int counter = 0; counter < 10; counter++){
            System.out.printf(" %5d",counter);
        }
        System.out.println();
    }
    public void countDown2(){
        for (int counter = 1; counter < 11; counter++){
            System.out.printf(" %5d",counter);
        }
        System.out.println();
    }
    public void countDown3(){
        for (int counter = 0; counter < 12; counter++){
            System.out.printf(" %5d",counter);
        }
        System.out.println();
    }

    public void countDown4(){
        for (int counter = 1; counter < 20; counter+=2){
            System.out.printf(" %5d",counter);
        }
        System.out.println();
    }
    public void countDown5(){
        for (int counter = 1; counter < 167777216; counter+=counter){
            System.out.printf(" %5d",counter);
        }
        System.out.println();
    }
    public void countDown6(){
        for (int counter = 111; counter < 139; counter+=3) {
            System.out.printf(" %5d",counter);
        }
        System.out.println();
    }
    public void countDown7(){
        for (int counter = 100; counter > 0; counter-=10) {
            System.out.printf(" %5d",counter);
        }
        System.out.println();
    }
    public void countDown8(){
        for (int counter = 999; counter > 0; counter-=11) {
            System.out.printf(" %5d",counter);
        }
        System.out.println();
    }


    public static void main(String[] args) {

        Main prg = new Main();
        prg.countDown();
        prg.countDown1();
        prg.countDown2();
        prg.countDown3();
        prg.countDown4();
        prg.countDown5();
        prg.countDown6();
        prg.countDown7();
        prg.countDown8();
    }
}
