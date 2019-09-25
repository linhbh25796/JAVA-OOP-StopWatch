package controller;

import model.StopWatch;

import java.time.LocalTime;
import java.util.Random;

public class InitTime {
    StopWatch stopWatch;

    public InitTime(StopWatch stopWatch) {
        this.stopWatch = stopWatch;
    }

    public void start() {
        LocalTime time = LocalTime.now();
        stopWatch.setStartTime(time);
    }

    public void stop() {
        LocalTime time = LocalTime.now();
        stopWatch.setEndTime(time);
    }

    public static void getElapsedTime() {
        long start, end;

        start = System.currentTimeMillis();
        /////////////////
        int[] array = new int[100000];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100000);
        }
        for (int i = 0; i < array.length; i++) {
            int min = array[i];
            int minId = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    minId = j;
                }
            }
            int temp = array[i];
            array[i] = min;
            array[minId] = temp;
        }
        /////////////////
        end = System.currentTimeMillis();
        System.out.println("Time Millis: " + (end - start));
    }

    public static void main(String[] args) {
        getElapsedTime();
    }

}
