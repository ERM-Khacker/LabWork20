package edu;
/*4.  Создать класс NumericData
        •  Отнаследовать классы от AbstractData
        •  Для всех классов создать константное значение с типом (из enum-а Type)
        •  Для всех классов добавить поля data (но для каждого с разным типом)
        • NumericData – абстрактный числовой тип (Number)
        •  Реализовать интерфейс Storable<класс>*/
public class NumericData extends AbstractData implements Storable<Number> {
    Type type = Type.NUM;
    private Number NumericData;

    public NumericData(long id) {
        super(id);
    }
/*8.  Реализовать этот метод во всех дочерних классах. Метод должен правильно
    преобразовать хранящееся данные в строковый вид.*/
    @Override
    String convertToString() {
        return String.valueOf(NumericData);
    }

    @Override
    public Number read() {
        return NumericData;
    }

    @Override
    public void write(Number data) {
        this.NumericData = data;
    }

    @Override
    public Type getType() {
        return type;
    }
}
