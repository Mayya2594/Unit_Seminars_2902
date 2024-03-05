package hw;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.*;

class VehicleTest {

    private Car car;
    private Motorcycle motorcycle;
    @BeforeEach
    void setup() {
        car = new Car("Mazda", "CX-5", 2023);
        motorcycle = new Motorcycle("BMW", "F 850 GS", 2023);
    }

    @Test
    void carInstanceOfVehicle() {
        assertInstanceOf(Vehicle.class, car);
    }

    @Test
    void carHasFourWheels() {
        assertThat(car.getNumWheels()).isEqualTo(4);
    }

    @Test
    void motorcycleHasFourWheels() {
        assertThat(motorcycle.getNumWheels()).isEqualTo(2);
    }

    @Test
    void carSpeedIs60AtTestDrive() {
        car.testDrive();
        assertThat(car.getSpeed()).isEqualTo(60);
    }

    @Test
    void motorcycleSpeedIs75AtTestDrive() {
        motorcycle.testDrive();
        assertThat(motorcycle.getSpeed()).isEqualTo(75);
    }

    @Test
    void carSpeedIs0AtPark() {
        car.testDrive();
        car.park();
        assertThat(car.getSpeed()).isEqualTo(0);
    }

    @Test
    void motorcycleSpeedIs0AtPark() {
        motorcycle.testDrive();
        motorcycle.park();
        assertThat(motorcycle.getSpeed()).isEqualTo(0);
    }
}