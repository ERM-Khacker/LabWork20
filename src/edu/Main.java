package edu;
//6.Создать класс Main
public class Main {
/*•  Создать psvm
•  Создать экземпляры классов XmlData, BinaryData, NumericData ()
•  В качестве id передать инкрементное значение счетчика ID_COUNTER*/
    public static void main(String[] args) {
        XmlData xmlData = new XmlData(DocumentProcessorUtil.ID_COUNTER++);
        BinaryData binaryData = new BinaryData(DocumentProcessorUtil.ID_COUNTER++);
        NumericData numericData = new NumericData(DocumentProcessorUtil.ID_COUNTER++);

        /*•  Подготовить данные для объектов:
        XmlData – “ <?xml version="1.0"?><Tests>qwerty</Tests>”
        BinaryData – получить массив байт из тестовой строки «Данные в байтах»
        NumericData – любое число например Double d = 123.456789;*/
        String xmlData2 = "<?xml version=\"1.0\"?><Tests>qwerty</Tests>";
        byte[] binaryData2 = "Данные в байтах".getBytes();
        Byte[] bytes = new Byte[binaryData2.length];
        int count = 0;
        for (Byte aByte : binaryData2) {
            bytes[count++] = aByte;
        }

        Double d = 123.456789;

        //•  С помощью метода DocumentProcessorUtil.build() объединить данные с обьектом
        DocumentProcessorUtil.build(xmlData, xmlData2);
        DocumentProcessorUtil.build(numericData, d);
        DocumentProcessorUtil.build(binaryData, bytes);

/*        С помощью метода DocumentProcessorUtil. convert(); преобразовать
          первоначальные объекты в StringData
       •  Вывести данные из всех полученных StringData на экран.*/
        System.out.println(DocumentProcessorUtil.convert(xmlData));
        System.out.println(DocumentProcessorUtil.convert(numericData));
        System.out.println(DocumentProcessorUtil.convert(binaryData));



    }
}
