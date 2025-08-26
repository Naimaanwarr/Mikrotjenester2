package no.naima.forelesning2;

import org.springframework.boot.SpringApplication;

public class TestForelesning2Application {

    public static void main(String[] args) {
        SpringApplication.from(Forelesning2Application::main).with(TestcontainersConfiguration.class).run(args);
    }

}
