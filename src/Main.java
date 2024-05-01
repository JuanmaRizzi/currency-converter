import com.alura.currencyconverter.model.Connection;
import com.alura.currencyconverter.model.ConvertionRates;
import com.alura.currencyconverter.model.OptionMenu;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Connection con = new Connection();

        OptionMenu optionMenu = new OptionMenu();


        ConvertionRates convertionRates =  con.toConnect();

            optionMenu.menu();










}}