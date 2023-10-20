
import controller.DataManager;
import view.Menu;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */
public class Main {
     public static void main(String[] args) {
        String title = "====== Validate Progaram ======";
        String[] s = new String[]{"Check", "Exit"};
        Menu<String> menu = new DataManager(title, s);
        menu.run();
    }
}