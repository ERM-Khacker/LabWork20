package edu;
/*3.  Generic в конструкторе.
        •  Создать класс StringData наследующий AbstractData
        •  В классе создать 2 поля:
        Type type; // создать enum c типами (XML,BIN,NUM)
        String data; // данные файла в виде строки
        •  Создать конструктор с полями long id, Type type, T data
        •  Указать Generic для конструктора <T extends AbstractData & Storable>
•  В конструкторе выполнить присвоение полей, а для поля сохранить строковое
        представление пришедшего объекта (toString();)*/
public class StringData extends AbstractData{
    private Type type;
    private String data;

/*9.  В конструкторе класса StringData изменить присвоение данных. Вызывать новый
    метод convertToString(). Примечание из Generic можно убрать Storable*/
    public <T extends AbstractData> StringData(long id, Type type, T data) {
        super(id);
        this.type = type;
        this.data = data.convertToString();
    }

    @Override
    public String toString() {
        return "StringData{" +
                "type=" + type +
                ", data='" + data + '\'' +
                "}";
    }
/*8.  Реализовать этот метод во всех дочерних классах. Метод должен правильно
    преобразовать хранящееся данные в строковый вид.*/
    @Override
    String convertToString() {
        return String.valueOf(data);
    }
}
