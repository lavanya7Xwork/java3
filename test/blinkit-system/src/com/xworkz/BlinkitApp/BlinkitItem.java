package com.xworkz.BlinkitApp;
import com.xworkz.BlinkitApp.Blinkit.ReadItem;
import com.xworkz.BlinkitApp.Blinkit.*;

public class BlinkitItem {
    public static  void main(String arg[]) {

        BlinkitItem.getAllItems();
        boolean items=BlinkitItem.updateItems("Energy drinks","Mimosa");
        Blinkit.getAllItems();
        Blinkit.deleteItem("singani");
        Blinkit.getAllItems();
    }
}
