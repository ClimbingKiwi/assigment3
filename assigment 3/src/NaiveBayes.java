package NaiveBayes;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class NaiveBayes {

    private final String f1;
    private final String f2;
    public static ArrayList<ArrayList<Integer>> training = new ArrayList<>();
    public static ArrayList<ArrayList<Integer>> test = new ArrayList<>();

    public NaiveBayes(String f1, String f2) {
        this.f1 = f1;
        this.f2 = f2;
        try {
            readDataFiles(f1,f2);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private void readDataFiles(String labed, String unLabelled) throws FileNotFoundException {

        System.out.println("Reading data from file "+labed);

        try {

            Scanner s = new Scanner(new File(labed));

            while (s.hasNext()){
                ArrayList<Integer> email = new ArrayList<>();

                for(int i = 0; i < 13; i++){
                    email.add(s.nextInt());
                }

                this.training.add(email);
            }

            int n = this.training.size();
            System.out.println(n +" emails");

            s.close();
        }
        catch (IOException e) {
            throw new RuntimeException("Data File caused IO exception");
        }

        System.out.println("Reading data from file "+labed);

        try {

            Scanner s = new Scanner(new File(unLabelled));

            while (s.hasNext()){
                ArrayList<Integer> email = new ArrayList<>();

                for(int i = 0; i < 13; i++){
                    email.add(s.nextInt());
                }

                this.test.add(email);
            }

            int n = test.size();
            System.out.println(n +" tests");

            s.close();
        }
        catch (IOException e) {
            throw new RuntimeException("Data File caused IO exception");
        }

    }
}
