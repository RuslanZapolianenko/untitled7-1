package package3;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class Main {

    public static void main(String[] args) throws Exception {

        Price[] prices = new Price[2];

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < prices.length; i++) {

            System.out.println("Enter name of product : ");
            String name = reader.readLine();
            System.out.println("Enter shop name : ");
            String shop_name = reader.readLine();
            System.out.println("Enter the price : ");
            double price = Double.parseDouble(reader.readLine());

            prices[i] = new Price(name, shop_name, price);
        }

        for (int i = 0; i < prices.length; i++) {
            System.out.println(prices[i].toString());
        }

        System.out.println("Enter please your shop name: ");
        String shop_name = reader.readLine();
        int count = 0;
        for (int i = 0; i < prices.length; i++) {
            String name = prices[i].shop_name;

            if (name.equals(shop_name)) {
                System.out.println(prices[i].toString());
                count++;
            } else if (count == 0 & i == prices.length-1) {
                try {
                    throw new Exception("There is no such a shop");

                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }
}

//Создайте проект, используя IntelliJ IDEA. Требуется: Описать класс с именем Price, содержащую следующие поля:
//  название товара;
//  название магазина, в котором продается товар;
//  стоимость товара в гривнах.
// Написать программу, выполняющую следующие действия:
//  ввод с клавиатуры данных в массив, состоящий из двух элементов типа Price (записи должны быть упорядочены
// в алфавитном порядке по названиям магазинов);
//  вывод на экран информации о товарах, продающихся в магазине, название которого введено с клавиатуры
// (если такого магазина нет, вывести исключение).