package com.example;

import java.time.LocalDate;
import java.util.List;

public class Solution {

    static List<Vehicle> vehicleList;

    public static void sddas() {
        vehicleList = Storage.readFile();
    }

    public static void printList() {
        vehicleList.forEach(item -> {
            System.out.println(item.getBrand());
        });
    }

    public static void readContent() {
        vehicleList = Storage.readFile();
    }

    public static void printVehicleList() {
        vehicleList.forEach(vehicle -> {
            System.out.println(vehicle.getBrand());
        });
    }

    public static void printPetrolDatas() {
        System.out.println("\n1. Az összes benzines jármű");
        vehicleList.forEach(vehicle -> {
            if(vehicle.getFuel().equals("benzin")) {
                System.out.printf(
                    "%s %s %d %s %d %s %s\n",
                    vehicle.getPlate(),
                    vehicle.getBrand(),
                    vehicle.getYear(),
                    vehicle.getFuel(),
                    vehicle.getPrice(),
                    vehicle.isClimate() ? "van" : " - ",
                    vehicle.getPermission()
                );
            }
        });
    }


    public static void print1mcheaper() {
        System.out.println("\n2. Az összes 1.000.000 alatti jármű");
        vehicleList.forEach(vehicle -> {
            if(vehicle.getPrice() < 1000000) {
                System.out.printf(
                    "%s %s %d %s %d %s %s\n",
                    vehicle.getPlate(),
                    vehicle.getBrand(),
                    vehicle.getYear(),
                    vehicle.getFuel(),
                    vehicle.getPrice(),
                    vehicle.isClimate() ? "van" : " - ",
                    vehicle.getPermission()
                );
            }
        });
    }


    public static void printMoreThanOneYearPermission() {
        System.out.println("\n3. Az összes jármű amelynek a műszakija 1+ évig jó");
        vehicleList.forEach(vehicle -> {
            if(vehicle.getPermission().isAfter(LocalDate.now().plusMonths(12))) {
                System.out.printf(
                    "%s %s %d %s %d %s %s\n",
                    vehicle.getPlate(),
                    vehicle.getBrand(),
                    vehicle.getYear(),
                    vehicle.getFuel(),
                    vehicle.getPrice(),
                    vehicle.isClimate() ? "van" : " - ",
                    vehicle.getPermission()
                );
            }
        });
    }

    public static void printHondaData() {
        System.out.println("\n4. Az összes Honda jármű");
        vehicleList.forEach(vehicle -> {
            if(vehicle.getBrand().equals("Honda")) {
                System.out.printf(
                    "%s %s %d %s %d %s %s\n",
                    vehicle.getPlate(),
                    vehicle.getBrand(),
                    vehicle.getYear(),
                    vehicle.getFuel(),
                    vehicle.getPrice(),
                    vehicle.isClimate() ? "van" : " - ",
                    vehicle.getPermission()
                );
            }
        });
    }
}