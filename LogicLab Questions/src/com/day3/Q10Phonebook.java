package com.day3;

import java.util.Scanner;

public class Q10Phonebook {
    static String names[] = new String[100];
    static String phones[] = new String[100];
    static int contactCount = 0;
    
    public static boolean isValidPhone(String phone) {
        if(phone.length() != 10) {
        	return false;
        }
        for(int i = 0; i < phone.length(); i++) {
            if(!Character.isDigit(phone.charAt(i))) {
            	return false;
            }
        }
        return true;
    }
    
    public static void add(String parts[]) {
        if(parts.length < 3) {
            System.out.println("Incorrect input.");
            return;
        }
        String name = parts[1];
        String phone = parts[2];
        if(isValidPhone(phone)) {
        	if(contactCount >= 100) {
                System.out.println("Phonebook is full!");
                return;
            }
            names[contactCount] = name;
            phones[contactCount] = phone;
            contactCount++;
            System.out.println("Added: " + name);
        } 
        else {
            System.out.println("Invalid Phone.");
        }
    }
    
    public static void delete(String parts[]) {
        if(parts.length < 2) {
            System.out.println("Incorrect input.");
            return;
        }
        if(contactCount == 0) {
            System.out.println("Phonebook is already empty.");
            return;
        }
        String name = parts[1];
        for(int i = 0; i < contactCount; i++) {
            if(names[i].equalsIgnoreCase(name)) {
            	for(int j = i; j < contactCount-1; j++) {
                    names[j] = names[j + 1];
                    phones[j] = phones[j + 1];
                }
                contactCount--;
                System.out.println("Deleted: " + name);
                return;
            }
        }
        System.out.println("Contact not found.");
    }
    
    public static void find(String parts[]) {
        if(parts.length < 2) {
            System.out.println("Incorrect input.");
            return;
        }
        if(contactCount == 0) {
            System.out.println("Phonebook is empty. Add contact to find.");
            return;
        }
        boolean found = false;
        String nameSub = parts[1].toLowerCase();
        for(int i = 0; i < contactCount; i++) {
            if(names[i].toLowerCase().contains(nameSub)) {
            	System.out.print(names[i] + " (" + phones[i] + ")");
                found = true;
            }
        }
        if(!found) {
        	System.out.println("No matches found.");
        }
    }
    
    public static void list() {
        if(contactCount == 0) {
            System.out.println("Phonebook is empty.");
            return;
        }
        for (int i = 0; i < contactCount; i++) {
        	System.out.print(names[i] + " (" + phones[i] + ")");
            if(i < contactCount - 1) {
            	System.out.print(", ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
        	System.out.println("---Phonebook---");
        	System.out.println("ADD name phone\nDEL name\nFIND substring\nLIST\nEXIT");
        	System.out.print("Enter your choice: ");
            String input = sc.nextLine();
            if(input.isEmpty()) {
            	continue;
            }
            String parts[] = input.split(" ");
            String command = parts[0].toUpperCase();
            if(command.equals("EXIT")) {
            	System.out.println("Goodbye!!!");
            	break;
            }
            switch(command) {
                case "ADD":
                    add(parts);
                    break;
                case "DEL":
                    delete(parts);
                    break;
                case "FIND":
                    find(parts);
                    break;
                case "LIST":
                    list();
                    break;
                default:
                    System.out.println("Invalid command. Please try again");
                    continue;
            }
        }
        sc.close();
    }
}