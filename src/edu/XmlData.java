package edu;
/*4.  Создать класс XmlData.
        •  Отнаследовать классы от AbstractData
        •  Для всех классов создать константное значение с типом (из enum-а Type)
        •  Для всех классов добавить поля data (но для каждого с разным типом)
        • XmlData – строка с xml
        •  Реализовать интерфейс Storable<класс>*/
public class XmlData extends AbstractData implements Storable<String> {
    private String XmlData;
    Type type = Type.XML;

    public XmlData(long id) {
        super(id);
    }
/*8.  Реализовать этот метод во всех дочерних классах. Метод должен правильно
    преобразовать хранящееся данные в строковый вид.*/
    @Override
    String convertToString() {
        return String.valueOf(XmlData);
    }

    @Override
    public String read() {
        return XmlData;
    }

    @Override
    public void write(String data) {
       this.XmlData = data;
    }

    @Override
    public Type getType() {
        return type;
    }
}
