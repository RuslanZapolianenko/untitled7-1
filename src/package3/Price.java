package package3;

public class Price {
    String name;
    String shop_name;
    double price;

    public Price(String name, String shop_name, double price) {
        this.name = name;
        this.shop_name = shop_name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Price{" +
                "name='" + name + '\'' +
                ", shop_name='" + shop_name + '\'' +
                ", price=" + price +
                '}';
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