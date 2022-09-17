package javaStream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java8Stream {
    static class Product {
        int id;
        String name;
        float price;

        public Product(int id, String name, float price) {
            this.id = id;
            this.name = name;
            this.price = price;
        }
    }

    public static void main(String[] args) {
        List<Product> productsList = new ArrayList<>();
        //Adding Products
        productsList.add(new Product(1, "HP Laptop", 25000f));
        productsList.add(new Product(2, "Dell Laptop", 30000f));
        productsList.add(new Product(3, "Lenevo Laptop", 28000f));
        productsList.add(new Product(4, "Sony Laptop", 28000f));
        productsList.add(new Product(5, "Apple Laptop", 90000f));
        List<Float> productPriceList = new ArrayList<Float>();
        for (Product product : productsList) {

            // filtering data of list
            if (product.price < 30000) {
                productPriceList.add(product.price);    // adding price to a productPriceList
            }

        }
        System.out.println(productPriceList);   // displaying data

//        find price greater than 27000
        System.out.println(productsList.stream()
                .filter(p -> p.price > 27000)
                .map(p -> p.price)
                .collect(Collectors.toList()));

//        find the element which is factor of 5
        Stream.iterate(1, element -> element + 1)
                .filter(element -> element % 5 == 0)
                .limit(5)
                .forEach(System.out::println);

//        print name of the product which is equal to 30000
        productsList.stream()
                .filter(price -> price.price == 30000)
                .forEach(product -> System.out.println(product.name));

//        reduce the data into smaller part and printing on the bases of the iteration
        Float reduce = productsList.stream()
                .map(product -> product.price)
                .reduce(0.0f, Float::max);
        System.out.println(reduce);

//        sum of the list and then printing the data
        Double collect = productsList.stream().mapToDouble(product -> product.price).sum();
        System.out.println(collect);

    }
}