package NaiveBayes;

import NaiveBayes.NaiveBayes;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static ArrayList<ArrayList<Integer>> training = new ArrayList<>();
    public static ArrayList<ArrayList<Integer>> test = new ArrayList<>();

    public static void main(String[] args) throws FileNotFoundException {
        String f1 = "C:\\Users\\Robert\\Desktop\\assigment 3\\src\\NaiveBayes\\spamLabelled.dat";
        String f2 = "C:\\Users\\Robert\\Desktop\\assigment 3\\src\\NaiveBayes\\spamUnlabelled.dat";

        NaiveBayes n = new NaiveBayes(f1,f2);


    }
}



