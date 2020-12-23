

public class Phone {

    String brand;

    public Phone(String brand) {
        this.brand = brand;
    }


    public String getOs() {
        String[] androidBrands = {"samsung", "lg", "motorolla"};
        String[] iosBrands = {"iphone 5", "iphone 6", "iphone 11", "iphone 12", "iphone 12 pro"};

        for (int i = 0; i < androidBrands.length; i++)
            if (this.brand == androidBrands[i]) return ("android");
        for (int i = 0; i < iosBrands.length; i++)
            if (this.brand == iosBrands[i]) return ("ios");
        return ("not found");

//            ios = Arrays.stream(this.iosBrands).anyMatch(this.brand::equals);
    }
}
