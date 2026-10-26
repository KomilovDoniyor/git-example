//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main { //Object, Objects, Record, Sealed
    public static void main(String[] args) {
//        Food food = new Food();
//        food.print();
        Food.createId();
        //

        RecordClass recordClass = new RecordClass(null, 10.0);
        System.out.println(recordClass);

        LanguageType languageType = LanguageType.UZ;
        OrderStatus[] values = OrderStatus.values();
        for (OrderStatus value : values) {
            System.out.println(value);
            System.out.println(value.ordinal());
            switch (languageType) {
                case UZ -> value.getNameUz();
                case RU -> value.getNameRu();
                case EN -> value.getNameEn();
            }
        }

        double multiply = MultiplyOperation.ADD.multiply(3, 2);
        System.out.println(multiply);
    }
}