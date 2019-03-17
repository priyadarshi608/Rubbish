package sss.dpbuilder.builder;

/**
 * The builder abstraction.
 */
public interface CarBuilder {
    Car build();

    CarBuilder setColor(final String color);

    CarBuilder setWheels(final int wheels);
}
