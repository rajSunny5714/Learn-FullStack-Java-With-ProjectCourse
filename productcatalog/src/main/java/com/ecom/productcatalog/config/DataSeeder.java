//package com.ecom.productcatalog.config;
//
//import com.ecom.productcatalog.model.Category;
//import com.ecom.productcatalog.model.Product;
//import com.ecom.productcatalog.repository.CategoryRepository;
//import com.ecom.productcatalog.repository.ProductRepository;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.stereotype.Component;
//
//import java.util.Arrays;
//
//@Component
//public class DataSeeder implements CommandLineRunner {
//    private  final ProductRepository productRepository;
//    private final CategoryRepository categoryRepository;
//
//    public DataSeeder(ProductRepository productRepository, CategoryRepository categoryRepository) {
//        this.productRepository = productRepository;
//        this.categoryRepository = categoryRepository;
//    }
//
//    @Override
//    public void run(String... args) throws Exception {
//        // clear all existing data
//        productRepository.deleteAll();
//        categoryRepository.deleteAll();
//
//        // create category
//        Category electronics = new Category();
//        electronics.setName("Electronics");
//
//        Category clothing = new Category();
//        clothing.setName("Clothing");
//
//        Category home = new Category();
//        home.setName("Home and Kitchen");
//
//        categoryRepository.saveAll(Arrays.asList(electronics, clothing, home));
//
//        // create product
//        Product phone = new Product();
//        phone.setName("Smartphone");
//        phone.setDescription("Latest model smart phone with amazing features");
//        phone.setImageUrl("https://placehold.co/600x400");
//        phone.setPrice(699.99);
//        phone.setCategory(electronics);
//
//        Product laptop = new Product();
//        laptop.setName("HP");
//        laptop.setDescription("Latest model smart HP laptop with amazing features");
//        laptop.setImageUrl("https://placehold.co/600x400");
//        laptop.setPrice(66699.99);
//        laptop.setCategory(electronics);
//
//        Product jacket = new Product();
//        jacket.setName("Winter Jacket");
//        jacket.setDescription("warm and cozy jacket");
//        jacket.setImageUrl("https://placehold.co/600x400");
//        jacket.setPrice(699.99);
//        jacket.setCategory(clothing);
//
//        Product blender = new Product();
//        blender.setName("Blender");
//        blender.setDescription("Home and kitchen appliances");
//        blender.setImageUrl("https://placehold.co/600x400");
//        blender.setPrice(199.99);
//        blender.setCategory(home);
//
//        productRepository.saveAll(Arrays.asList(phone, laptop, jacket, blender));
//    }
//}
package com.ecom.productcatalog.config;

import com.ecom.productcatalog.model.Category;
import com.ecom.productcatalog.model.Product;
import com.ecom.productcatalog.repository.CategoryRepository;
import com.ecom.productcatalog.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class DataSeeder implements CommandLineRunner {

    private final ProductRepository productRepository;
    private final CategoryRepository categoryRepository;

    public DataSeeder(ProductRepository productRepository, CategoryRepository categoryRepository) {
        this.productRepository = productRepository;
        this.categoryRepository = categoryRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        // Clear existing data
        productRepository.deleteAll();
        categoryRepository.deleteAll();

        // Create categories
        Category electronics = new Category();
        electronics.setName("Electronics");

        Category clothing = new Category();
        clothing.setName("Clothing");

        Category home = new Category();
        home.setName("Home and Kitchen");

        categoryRepository.saveAll(Arrays.asList(electronics, clothing, home));

        List<Product> products = new ArrayList<>();

        // -----------------------------
        // Electronics Products (30+)
        // -----------------------------
        products.addAll(Arrays.asList(
                createProduct("Smartphone", "Latest smartphone with advanced features", "https://placehold.co/600x400", 699.99, electronics),
                createProduct("HP Laptop", "High-performance laptop for work and gaming", "https://placehold.co/600x400", 66699.99, electronics),
                createProduct("Bluetooth Headphones", "Wireless headphones with noise cancellation", "https://placehold.co/600x400", 1999.99, electronics),
                createProduct("Smartwatch", "Track your fitness and notifications", "https://placehold.co/600x400", 4999.99, electronics),
                createProduct("DSLR Camera", "Capture stunning photos and videos", "https://placehold.co/600x400", 45999.99, electronics),
                createProduct("Gaming Console", "Next-gen gaming experience", "https://placehold.co/600x400", 39999.99, electronics),
                createProduct("Wireless Mouse", "Ergonomic design with fast response", "https://placehold.co/600x400", 899.99, electronics),
                createProduct("Mechanical Keyboard", "RGB backlight and tactile feedback", "https://placehold.co/600x400", 3499.99, electronics),
                createProduct("Power Bank", "10000mAh fast charging", "https://placehold.co/600x400", 1299.99, electronics),
                createProduct("Tablet", "Portable and powerful tablet", "https://placehold.co/600x400", 15999.99, electronics),
                createProduct("4K Smart TV", "Ultra HD with HDR support", "https://placehold.co/600x400", 45999.99, electronics),
                createProduct("Bluetooth Speaker", "Loud and clear sound", "https://placehold.co/600x400", 1999.99, electronics),
                createProduct("Drone", "Capture aerial shots", "https://placehold.co/600x400", 49999.99, electronics),
                createProduct("Portable Projector", "Mini projector for home and travel", "https://placehold.co/600x400", 7999.99, electronics),
                createProduct("External Hard Drive", "2TB storage capacity", "https://placehold.co/600x400", 5999.99, electronics),
                createProduct("VR Headset", "Immersive gaming and entertainment", "https://placehold.co/600x400", 24999.99, electronics),
                createProduct("Car Dash Cam", "Full HD recording for vehicles", "https://placehold.co/600x400", 4999.99, electronics),
                createProduct("Fitness Tracker", "Track your health and activity", "https://placehold.co/600x400", 1999.99, electronics),
                createProduct("Home Security Camera", "Monitor your home remotely", "https://placehold.co/600x400", 3999.99, electronics),
                createProduct("Smart Light Bulb", "Control lights with your phone", "https://placehold.co/600x400", 599.99, electronics),
                createProduct("Wireless Charger", "Fast charging for phones", "https://placehold.co/600x400", 1499.99, electronics),
                createProduct("Electric Shaver", "Rechargeable grooming device", "https://placehold.co/600x400", 2599.99, electronics),
                createProduct("Laptop Cooling Pad", "Keeps your laptop cool", "https://placehold.co/600x400", 899.99, electronics),
                createProduct("HDMI Cable", "High-speed cable for displays", "https://placehold.co/600x400", 299.99, electronics),
                createProduct("USB Flash Drive", "64GB storage capacity", "https://placehold.co/600x400", 499.99, electronics),
                createProduct("Microwave Oven", "Compact and powerful", "https://placehold.co/600x400", 7999.99, electronics),
                createProduct("Air Conditioner", "Cool your room fast", "https://placehold.co/600x400", 34999.99, electronics),
                createProduct("Induction Cooktop", "Energy-efficient cooking", "https://placehold.co/600x400", 3499.99, electronics),
                createProduct("Electric Kettle", "Boil water quickly", "https://placehold.co/600x400", 1499.99, electronics),
                createProduct("Hair Dryer", "Powerful and compact", "https://placehold.co/600x400", 999.99, electronics)
        ));

        // -----------------------------
        // Clothing Products (30+)
        // -----------------------------
        products.addAll(Arrays.asList(
                createProduct("Winter Jacket", "Warm and cozy jacket", "https://placehold.co/600x400", 1999.99, clothing),
                createProduct("Summer T-Shirt", "Comfortable cotton t-shirt", "https://placehold.co/600x400", 499.99, clothing),
                createProduct("Jeans", "Stylish denim jeans", "https://placehold.co/600x400", 1299.99, clothing),
                createProduct("Formal Shirt", "Elegant formal shirt", "https://placehold.co/600x400", 999.99, clothing),
                createProduct("Hoodie", "Casual warm hoodie", "https://placehold.co/600x400", 1499.99, clothing),
                createProduct("Sweater", "Knitted wool sweater", "https://placehold.co/600x400", 1799.99, clothing),
                createProduct("Leather Jacket", "Premium leather jacket", "https://placehold.co/600x400", 5999.99, clothing),
                createProduct("Sneakers", "Comfortable daily sneakers", "https://placehold.co/600x400", 2499.99, clothing),
                createProduct("Cap", "Stylish cotton cap", "https://placehold.co/600x400", 499.99, clothing),
                createProduct("Scarf", "Soft winter scarf", "https://placehold.co/600x400", 399.99, clothing),
                createProduct("Running Shoes", "Lightweight running shoes", "https://placehold.co/600x400", 2999.99, clothing),
                createProduct("Gym Shorts", "Comfortable gym shorts", "https://placehold.co/600x400", 699.99, clothing),
                createProduct("Sports Jacket", "Windproof and comfortable", "https://placehold.co/600x400", 3499.99, clothing),
                createProduct("Beanie", "Warm winter beanie", "https://placehold.co/600x400", 299.99, clothing),
                createProduct("Polo Shirt", "Classic style polo shirt", "https://placehold.co/600x400", 999.99, clothing),
                createProduct("Cargo Pants", "Durable cargo pants", "https://placehold.co/600x400", 1599.99, clothing),
                createProduct("Denim Jacket", "Stylish denim jacket", "https://placehold.co/600x400", 2999.99, clothing),
                createProduct("Slip-on Shoes", "Easy wear slip-on shoes", "https://placehold.co/600x400", 1499.99, clothing),
                createProduct("Socks Pack", "Pack of 5 pairs", "https://placehold.co/600x400", 499.99, clothing),
                createProduct("Winter Gloves", "Warm gloves for winter", "https://placehold.co/600x400", 599.99, clothing),
                createProduct("Raincoat", "Waterproof raincoat", "https://placehold.co/600x400", 1999.99, clothing),
                createProduct("Formal Pants", "Elegant formal pants", "https://placehold.co/600x400", 1299.99, clothing),
                createProduct("Hiking Boots", "Durable boots for hiking", "https://placehold.co/600x400", 3499.99, clothing),
                createProduct("Flip Flops", "Casual beach flip flops", "https://placehold.co/600x400", 399.99, clothing),
                createProduct("Yoga Pants", "Comfortable yoga pants", "https://placehold.co/600x400", 999.99, clothing),
                createProduct("Blazer", "Smart formal blazer", "https://placehold.co/600x400", 4999.99, clothing),
                createProduct("Tracksuit", "Sporty tracksuit set", "https://placehold.co/600x400", 2999.99, clothing),
                createProduct("Cardigan", "Cozy knitted cardigan", "https://placehold.co/600x400", 1799.99, clothing),
                createProduct("Windbreaker", "Lightweight windbreaker jacket", "https://placehold.co/600x400", 1599.99, clothing)
        ));

        // -----------------------------
        // Home & Kitchen Products (30+)
        // -----------------------------
        products.addAll(Arrays.asList(
                createProduct("Blender", "High-speed blender for smoothies", "https://placehold.co/600x400", 1999.99, home),
                createProduct("Microwave Oven", "Compact microwave oven", "https://placehold.co/600x400", 4999.99, home),
                createProduct("Air Fryer", "Healthy cooking appliance", "https://placehold.co/600x400", 5999.99, home),
                createProduct("Coffee Maker", "Automatic coffee machine", "https://placehold.co/600x400", 3999.99, home),
                createProduct("Dinner Set", "12-piece ceramic dinner set", "https://placehold.co/600x400", 2999.99, home),
                createProduct("Cookware Set", "Non-stick cookware set", "https://placehold.co/600x400", 6999.99, home),
                createProduct("Electric Kettle", "Fast boiling kettle", "https://placehold.co/600x400", 1499.99, home),
                createProduct("Vacuum Cleaner", "Powerful home vacuum", "https://placehold.co/600x400", 7999.99, home),
                createProduct("Toaster", "2-slice toaster", "https://placehold.co/600x400", 999.99, home),
                createProduct("Juicer", "Fresh juice extractor", "https://placehold.co/600x400", 1999.99, home),
                createProduct("Rice Cooker", "Cook perfect rice every time", "https://placehold.co/600x400", 2499.99, home),
                createProduct("Dishwasher", "Automatic dishwasher", "https://placehold.co/600x400", 19999.99, home),
                createProduct("Blender Bottle", "Portable blender bottle", "https://placehold.co/600x400", 799.99, home),
                createProduct("Food Processor", "Chop, slice, and blend easily", "https://placehold.co/600x400", 4999.99, home),
                createProduct("Electric Grill", "Indoor electric grill", "https://placehold.co/600x400", 2999.99, home),
                createProduct("Pressure Cooker", "Fast pressure cooking", "https://placehold.co/600x400", 1999.99, home),
                createProduct("Water Purifier", "Clean drinking water", "https://placehold.co/600x400", 7999.99, home),
                createProduct("Stand Mixer", "Powerful kitchen stand mixer", "https://placehold.co/600x400", 6999.99, home),
                createProduct("Slow Cooker", "Perfect stews and soups", "https://placehold.co/600x400", 2999.99, home),
                createProduct("Electric Oven", "Bake and roast easily", "https://placehold.co/600x400", 8999.99, home),
                createProduct("Hand Blender", "Compact blender for small tasks", "https://placehold.co/600x400", 1299.99, home),
                createProduct("Sandwich Maker", "Quick sandwiches at home", "https://placehold.co/600x400", 999.99, home),
                createProduct("Ice Cream Maker", "Homemade ice cream", "https://placehold.co/600x400", 3999.99, home),
                createProduct("Electric Mixer", "For baking and cooking", "https://placehold.co/600x400", 2499.99, home),
                createProduct("Bread Maker", "Fresh homemade bread", "https://placehold.co/600x400", 6999.99, home),
                createProduct("Coffee Grinder", "Grind coffee beans easily", "https://placehold.co/600x400", 1499.99, home),
                createProduct("Induction Cooktop", "Energy-efficient cooking", "https://placehold.co/600x400", 3499.99, home),
                createProduct("Electric Kettle", "Boil water quickly", "https://placehold.co/600x400", 1499.99, home),
                createProduct("Food Steamer", "Steam vegetables and seafood", "https://placehold.co/600x400", 2999.99, home)
        ));

        // Save all products
        productRepository.saveAll(products);
    }

    private Product createProduct(String name, String description, String imageUrl, double price, Category category) {
        Product p = new Product();
        p.setName(name);
        p.setDescription(description);
        p.setImageUrl(imageUrl);
        p.setPrice(price);
        p.setCategory(category);
        return p;
    }
}
