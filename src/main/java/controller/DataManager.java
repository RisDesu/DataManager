/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.DataList;
import view.Menu;


/**
 *
 * @author HP
 */
public class DataManager extends Menu<String>{
    private DataList list= new DataList();
    public DataManager(String title, String[] s){
        super(title, s);
    }
    
    @Override
    public void execute(int n) {
        switch (n) {
            case 1:
                list.checkInputPhone();
                list.checkInputEmail();
                list.checkInputDate();
                break;

            case 2:
                System.exit(0);        
        }
    }
}

