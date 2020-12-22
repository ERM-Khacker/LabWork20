package edu;

import java.util.Arrays;

/*4.  Создать класс BinaryData
        •  Отнаследовать классы от AbstractData
        •  Для всех классов создать константное значение с типом (из enum-а Type)
        •  Для всех классов добавить поля data (но для каждого с разным типом)
        • BinaryData – массив байтов
        •  Реализовать интерфейс Storable<класс>*/
public class BinaryData extends AbstractData implements Storable<Byte[]> {
    Type type = Type.BIN;
    private Byte[] binaryData;

    public BinaryData(long id) {
        super(id);
    }
/*8.  Реализовать этот метод во всех дочерних классах. Метод должен правильно
    преобразовать хранящееся данные в строковый вид.*/
    @Override
    String convertToString() {
        return Arrays.toString(binaryData);
    }

    @Override
    public Byte[] read() {
        return binaryData;
    }

    @Override
    public void write(Byte[] data) {
        this.binaryData = data;
    }

    @Override
    public Type getType() {
        return type;
    }
}
