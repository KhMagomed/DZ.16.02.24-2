import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class BonusServiceTest {


    @Test
    void shouldCalculateForRegisteredAndUnderLimit() {
        BonusService service = new BonusService();

        // подготавливаем данные:
        int amount = 10000;
        boolean registered = true;
        int expected = 300;

        // вызываем целевой метод:
        int actual = service.calculate(amount, registered);

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateForRegisteredAndOverLimit1() {
        BonusService service = new BonusService();

        // подготавливаем данные:
        int amount = 1_000_000;
        boolean registered = true;
        int expected = 500;

        // вызываем целевой метод:
        int actual = service.calculate(amount, registered);

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateForRegisteredAndOverLimit2() {
        BonusService service = new BonusService();

        // подготавливаем данные:
        int amount = 1_000_000;
        boolean registered = false;
        int expected = 500;

        // вызываем целевой метод:
        int actual = service.calculate(amount, registered);

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateForRegisteredAndOverLimit3() {
        BonusService service = new BonusService();

        // подготавливаем данные:
        int amount = 1_000;
        boolean registered = false;
        int expected = 10;

        // вызываем целевой метод:
        int actual = service.calculate(amount, registered);

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
    }
    @Test
    void shouldCalculateForRegisteredAndOverLimit4() {
        BonusService service = new BonusService();

        // подготавливаем данные:
        int amount = 1000;
        boolean registered = false;
        int expected = 10;


        // вызываем целевой метод:
        int actual = service.calculate(amount, registered);

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
    }
}