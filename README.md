# Ecommerce API

## Framework and Language

> Framework: SpringBoot Language: Java 8

## Data flow

1.  Controller

        1.1 UserController
        - GET/user/id: get an user by id

        1.2 AddressController

        1.3 CartController
        - POST/cart : to place an order in cart
        - GET/cart/id: get an order by id

        1.4 ProductController
        - GET/product/category: get a product by catrgory
        - DELETE/product/id: delete a product by id

2.  Services

        1.1 UserService
        - getUser(Integer userId): get an user by id

        1.2 AddressService

        1.3 CartService
        - placeOrder(Cart cart) : to place an order in cart
        - getCart(Integer orderId): get an order by id

        1.4 ProductService
        - getProductsByCategory: get a product by catrgory
        - deleteProduct(Integer productId): delete a product by id

3.  Repository

        - IUserRepo
        - IAddressRepo
        - ICartRepo
        - IProductRepo

4.  Database Design

        User Model:
                Id:integer
                name:string
                email:string
                password:string
                phoneNumber:string
        Product Model:
                id:integer
                name:string
                price:integer
                description:string
                category:string
                brand:string

        Address Model:
                id:integer
                name:string
                landmark:string
                phoneNumber:string
                zipcode:string
                state:string
                UserID : foreign key mapping

        Order Model:
                id:integer
                userID:integer (foreign key mapping)
                productID:integer(foreign key mapping)
                addressID:integer(foreign key mapping)
                productQuantity:integer

## Data Structure Used in Project

     JPARepository has been used as primay datastructure

## Project Summary

    The Ecommerce API is a comprehensive software solution designed to keep track of products . The system provides a centralized platform that enables  admin to create, read, edit, and delete user and product accounts.
