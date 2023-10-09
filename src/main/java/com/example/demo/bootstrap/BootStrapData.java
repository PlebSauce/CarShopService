package com.example.demo.bootstrap;

import com.example.demo.domain.OutsourcedPart;
import com.example.demo.domain.Part;
import com.example.demo.domain.Product;
import com.example.demo.repositories.OutsourcedPartRepository;
import com.example.demo.repositories.PartRepository;
import com.example.demo.repositories.ProductRepository;
import com.example.demo.service.OutsourcedPartService;
import com.example.demo.service.OutsourcedPartServiceImpl;
import com.example.demo.service.ProductService;
import com.example.demo.service.ProductServiceImpl;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

/**
 *
 *
 *
 *
 */
@Component
public class BootStrapData implements CommandLineRunner {

    private final PartRepository partRepository;
    private final ProductRepository productRepository;

    private final OutsourcedPartRepository outsourcedPartRepository;

    public BootStrapData(PartRepository partRepository, ProductRepository productRepository, OutsourcedPartRepository outsourcedPartRepository) {
        this.partRepository = partRepository;
        this.productRepository = productRepository;
        this.outsourcedPartRepository=outsourcedPartRepository;
    }

    @Override
    public void run(String... args) throws Exception {

       /*
        OutsourcedPart o= new OutsourcedPart();
        o.setCompanyName("Western Governors University");
        o.setName("out test");
        o.setInv(5);
        o.setPrice(20.0);
        o.setId(100L);
        outsourcedPartRepository.save(o);
        OutsourcedPart thePart=null;
        List<OutsourcedPart> outsourcedParts=(List<OutsourcedPart>) outsourcedPartRepository.findAll();
        for(OutsourcedPart part:outsourcedParts){
            if(part.getName().equals("out test"))thePart=part;
        }

        System.out.println(thePart.getCompanyName());
        */
        if (partRepository.count()==0) {
            OutsourcedPart part1 = new OutsourcedPart();
            part1.setCompanyName("Paint and Body");
            part1.setName("Black Paint");
            part1.setInv(5);
            part1.setPrice(25.0);
            part1.setId(111L);
            outsourcedPartRepository.save(part1);

            OutsourcedPart part2 = new OutsourcedPart();
            part2.setCompanyName("Decal Store");
            part2.setName("Striped Decal");
            part2.setInv(2);
            part2.setPrice(50.0);
            part2.setId(1032L);
            outsourcedPartRepository.save(part2);

            OutsourcedPart part3 = new OutsourcedPart();
            part3.setCompanyName("Wheel-n-Deal");
            part3.setName("Off-road Wheels");
            part3.setInv(8);
            part3.setPrice(200.0);
            part3.setId(98L);
            outsourcedPartRepository.save(part3);

            OutsourcedPart part4 = new OutsourcedPart();
            part4.setCompanyName("Finishing Touches");
            part4.setName("Matte Finish");
            part4.setInv(10);
            part4.setPrice(5.0);
            part4.setId(1099L);
            outsourcedPartRepository.save(part4);

            OutsourcedPart part5 = new OutsourcedPart();
            part5.setCompanyName("Seats and Car Interior Hardware");
            part5.setName("Leather Seats");
            part5.setInv(1);
            part5.setPrice(100.0);
            part5.setId(99L);
            outsourcedPartRepository.save(part5);
        }
        /*List<OutsourcedPart> outsourcedParts=(List<OutsourcedPart>) outsourcedPartRepository.findAll();
        for(OutsourcedPart part:outsourcedParts){
            System.out.println(part.getName()+" "+part.getCompanyName());
        }
        */
        /*
        Product bicycle= new Product("bicycle",100.0,15);
        Product unicycle= new Product("unicycle",100.0,15);
        productRepository.save(bicycle);
        productRepository.save(unicycle);
        */
        if (productRepository.count() == 0) {
            Product octane = new Product("octane", 1050.0, 17);
            Product fennec = new Product("fennec", 2000.0, 1);
            Product scarab = new Product("scarab", 1360.0, 3);
            Product gizmo = new Product("gizmo", 805.0, 6);
            Product merc = new Product("merc", 1800.0, 10);

            productRepository.save(octane);
            productRepository.save(fennec);
            productRepository.save(scarab);
            productRepository.save(gizmo);
            productRepository.save(merc);
        }

        System.out.println("Started in Bootstrap");
        System.out.println("Number of Products"+productRepository.count());
        System.out.println(productRepository.findAll());
        System.out.println("Number of Parts"+partRepository.count());
        System.out.println(partRepository.findAll());

    }
}
