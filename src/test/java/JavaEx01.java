import org.testng.annotations.Test;

public class JavaEx01 {

    @Test
    public void test01001() {
        Phone myphone = new Phone("lg"); //create
        String osDevice = myphone.getOs();
        System.out.println(osDevice);

        myphone.brand = "iphone 12 pro";
        osDevice = myphone.getOs();
        System.out.println(osDevice);

        myphone.brand = "iphone 122 pro";
        osDevice = myphone.getOs();
        System.out.println(osDevice);

    }
}
