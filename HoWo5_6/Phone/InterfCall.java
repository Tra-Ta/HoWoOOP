package HoWo5_6.Phone;

public interface InterfCall {

    default void  call(String phoneNamber){
        System.out.printf("Номер ", phoneNamber," успешно набран, ожидайте соединения...\n" );
    }
}