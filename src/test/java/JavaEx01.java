import org.testng.annotations.Test;

public class JavaEx01 {

    @Test
    public void test01001() {
        Phone myphone = new Phone("lg");
        String osDevice = myphone.getOs();
        System.out.println(osDevice);

        Phone myphone1 = new Phone("iphone 12 pro");
        String osDevice1 = myphone1.getOs();
        System.out.println(osDevice1);

        Phone myphone2 = new Phone("iphone 122 pro");
        String osDevice2 = myphone2.getOs();
        System.out.println(osDevice2);
    }
}
