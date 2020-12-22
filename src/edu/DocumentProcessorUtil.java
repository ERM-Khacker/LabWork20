package edu;
/*5.  Создать класс DocumentProcessorUtil
        •  Создать статическое поле ID_COUNTER, для реализации счетчика id*/
public class DocumentProcessorUtil {
    public static int ID_COUNTER;
//•  Создать приватный конструктор.
    private DocumentProcessorUtil() {
    }

/*•  Создать статический метод StringData convert(T data);
    Generic: <T extends AbstractData & Storable>
•  В методе необходимо создать и вернуть экземпляр класса StringData.
•  В качестве id передать инкрементное значение счетчика
•  В качестве значения типа – вызвать метод getType();
•  В качестве значения данных - data*/
    static <T extends AbstractData & Storable> StringData convert(T data) {
        return new StringData(ID_COUNTER++, data.getType(), data);
    }

/*•  Создать статический метод <T> void build(Storable storeObj, T data);
•  Внутри метода «записать» входящие данные в объект storeObj (метод write())*/
    static <T> void build(Storable storeObj, T data) {
        storeObj.write(data);
    }
}
