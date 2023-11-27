/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pwo.lab09.builder;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
/**
 *
 * @author kacpe
 */
public class TxtPic3 {
    private char background;
    private char foreground;
    private int size;
    private String fileName;
    private String art;

    public TxtPic3() {
        art = "";
        getUserInput();
    }

    private void getUserInput() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter background character: ");
        background = scanner.next().charAt(0);

        System.out.print("Enter foreground character: ");
        foreground = scanner.next().charAt(0);

        System.out.print("Enter size: ");
        size = scanner.nextInt();

        System.out.print("Enter file name: ");
        fileName = scanner.next();
    }

    private void genArt() {
        for (int i = 0; i < size; i++) {
            int count = i + 1;
            int start = (size - count) / 2;
            for (int j = 0; j < size; j++) {
                if (j < start || count == 0) art += background;
                else {
                    art += foreground;
                    count--;
                }
            }
            art += "\n";
        }
    }

    private void toFile() throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
        writer.write(art);
        writer.close();
    }

    public boolean save() {
        genArt();
        try {
            toFile();
        } catch (IOException ex) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        TxtPic3 txtPic3 = new TxtPic3();
        txtPic3.save();
    }
}
