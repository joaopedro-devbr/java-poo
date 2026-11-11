package application;

// Exercício: Composição - Sistema de pedidos
// Objetivo: Cadastrar clientes, produtos e pedidos,
// utilizando composição, enumerações, listas e cálculo de valores.

import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.Locale;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class Program {

    public static void main(String[] args) throws ParseException {

        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat sdfMoment = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        System.out.println("Enter client data:");
        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Email: ");
        String email = sc.nextLine();

        System.out.print("Birth date (DD/MM/YYYY): ");
        Date birthDate = sdf.parse(sc.nextLine());

        Client client = new Client(name, email, birthDate);

        System.out.println();
        System.out.println("Enter order data:");

        System.out.print("Status: ");
        OrderStatus status = OrderStatus.valueOf(sc.nextLine());

        Order order = new Order(new Date(), status, client);

        System.out.print("How many items to this order? ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= n; i++) {

            System.out.println();
            System.out.println("Enter item #" + i + " data:");

            System.out.print("Product name: ");
            String productName = sc.nextLine();

            System.out.print("Product price: ");
            double productPrice = sc.nextDouble();

            System.out.print("Quantity: ");
            int quantity = sc.nextInt();
            sc.nextLine();

            Product product = new Product(productName, productPrice);

            OrderItem orderItem = new OrderItem(
                    quantity,
                    productPrice,
                    product
            );

            order.addItem(orderItem);
        }

        System.out.println();
        System.out.println("ORDER SUMMARY:");

        System.out.println("Order moment: " + sdfMoment.format(order.getMoment()));
        System.out.println("Order status: " + order.getStatus());

        System.out.println(
                "Client: "
                + order.getClient().getName()
                + " ("
                + sdf.format(order.getClient().getBirthDate())
                + ") - "
                + order.getClient().getEmail()
        );

        System.out.println("Order items:");

        for (OrderItem item : order.getItems()) {
            System.out.println(item);
        }

        System.out.println(
                "Total price: $"
                + String.format(Locale.US, "%.2f", order.total())
        );

        sc.close();
    }
}
