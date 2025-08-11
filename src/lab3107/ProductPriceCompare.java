package lab3107;

import java.util.*;


class Product {
 double price;
 String name;

 public Product(double price, String name) {
     this.price = price;
     this.name = name;
 }

 @Override
 public String toString() {
     return name + "_" + price;
 }
}


class ProductComparator implements Comparator<Product> {
 public int compare(Product p1, Product p2) {
     if (Double.compare(p1.price, p2.price) == 0) {

         return p1.name.compareTo(p2.name);
     } else {
      
         return Double.compare(p1.price, p2.price);
     }
 }
}

public class ProductPriceCompare {
 public static void main(String[] args) {
     List<Product> products = new ArrayList<>();

     products.add(new Product(900, "A"));
     products.add(new Product(900, "Aa"));
     products.add(new Product(1000, "Ball"));
     products.add(new Product(1000, "iPhone"));
     products.add(new Product(500, "Camera"));

     Collections.sort(products, new ProductComparator());

     for (Product p : products) {
         System.out.println(p);
     }
 }
}