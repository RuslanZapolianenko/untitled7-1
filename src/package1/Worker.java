package package1;

public class Worker implements Comparable <Worker> {
    String fio;
    String post;
    String year;

    public Worker(String fio, String post, String year) {
        this.fio = fio;
        this.post = post;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "fio='" + fio + '\'' +
                ", post='" + post + '\'' +
                ", year='" + year + '\'' +
                '}';
    }

    @Override
    public int compareTo(Worker o) {
        return this.fio.compareTo(o.fio);
    }
}
//Создайте проект, используя IntelliJ IDEA. Требуется: Описать класс с именем Worker, содержащую следующие поля:
//  фамилия и инициалы работника;
//  название занимаемой должности;
//  год поступления на работу.
//Написать программу, выполняющую следующие действия:
//  ввод с клавиатуры данных в массив, состоящий из пяти элементов типа Worker (записи должны быть упорядочены
// по алфавиту);
//  если значение года введено не в соответствующем формате выдает исключение.
//  вывод на экран фамилии работника, стаж работы которого превышает введенное значение.