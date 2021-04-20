package net.javaguides.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import net.javaguides.springboot.model.Product;

import net.javaguides.springboot.repository.ProductRepository;

@SpringBootApplication
public class SpringbootBackendApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootBackendApplication.class, args);
    }

    @Autowired
    private ProductRepository productRepository;

    @Override
    public void run(String...args) throws Exception {
        this.productRepository.save(new Product("Laptop", "Ramesh Chopra", "ramesh121@gmail.com"));
        this.productRepository.save(new Product("Mouse", "Suresh raina", "Sureshrr@gmail.com"));
        this.productRepository.save(new Product("Keyboard", "Sunil Rathore", "Rathore694552@gmail.com"));
        this.productRepository.save(new Product("LED", "Sunil Rathore", "Rathore694552@gmail.com"));
        this.productRepository.save(new Product("Monitor", "Sujay Verma", "Sujay454@gmail.com"));
        this.productRepository.save(new Product("Joystick", "Monika Rathore", "Mrathore4522@gmail.com"));
        this.productRepository.save(new Product("Tubelight", "Shreya Patil", "Shreyahn45@gmail.com"));
        this.productRepository.save(new Product("Speaker", "Ankita Singh", "Singhan5@gmail.com"));
    }
}
