package no.hvl.dat110;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class AngryMain {

    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("assets/angryWojak.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}