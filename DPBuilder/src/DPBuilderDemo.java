import sss.dpbuilder.builder.Car;
import sss.dpbuilder.builder.CarBuilder;
import sss.dpbuilder.builder.CarBuilderImpl;

public class DPBuilderDemo {

    public static void main(final String[] arguments) {
        final CarBuilder carBuilder = new CarBuilderImpl();

        carBuilder.setWheels(4)
        .setColor("Red")
        .build();

    }
}
