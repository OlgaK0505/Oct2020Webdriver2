

public class Phone {

    String brand;
    String[] arr1;



    public Phone(String brand) {
        this.brand = brand;
    }


    public String getOs() {
        String[] androidBrands = {"samsung", "lg", "motorolla"};
        String[] iosBrands = {"iphone 5", "iphone 6", "iphone 11", "iphone 12", "iphone 12 pro"};
        boolean android = false;
        boolean ios = false;

        //int i;

        for (int i = 0; i < androidBrands.length; i++)
            if (this.brand == androidBrands[i]) {
                android = true;
                return ("android");
            }

        if (!android) {
            for (int i = 0; i < iosBrands.length; i++)
                if (this.brand == iosBrands[i]) {
                    ios = true;
                    return ("ios");
                }
        }

        return ("not found");

//            ios = Arrays.stream(this.iosBrands).anyMatch(this.modelBrand::equals);
    }
}
