import org.testng.annotations.Test;

public class JavaEx01 {

    @Test
    public void test01001() {
        Phone myPhone = new Phone("lg"); //create
        String osDevice = myPhone.getOs();
        System.out.println(osDevice);

        myPhone.brand = "iphone 12 pro";
        osDevice = myPhone.getOs();
        System.out.println(osDevice);

        myPhone.brand = "iphone 122 pro";
//        System.out.println(myPhone.deviceBrand()); //check value brand
        osDevice = myPhone.getOs();
        System.out.println(osDevice);

        myPhone.ring();

    }
}
