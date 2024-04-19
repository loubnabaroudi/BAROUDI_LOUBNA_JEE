package ma.fs.university;

import ma.fs.university.entities.Product;
import ma.fs.university.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class UniversityApplication implements CommandLineRunner {
    @Autowired
    private ProductRepository productRepository;

    public static void main(String[] args) {
        SpringApplication.run(UniversityApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        productRepository.save(new Product(1, "computer", 4300,3));
        productRepository.save(new Product(2, "printer", 1200,4));
        productRepository.save(new Product(3, "smart phone", 3200,32));
        List<Product> products = productRepository.findAll();
        products.forEach(p ->{
            System.out.println(p.toString());
        });

        System.out.println("--------------------------------------------");

        List<Product> productList = productRepository.findByNameContains("C");
        productList.forEach(p ->{
            System.out.println(p);
        } );

        System.out.println("--------------------------------------------");

        List<Product> productList2 = productRepository.search("%C%");
        productList2.forEach(p ->{
            System.out.println(p);
        } );


        System.out.println("--------------------------------------------");

        List<Product> productList3 = productRepository.findByPriceGreaterThan(3000);
        productList3.forEach(p ->{
            System.out.println(p);
        } );


    }
}
