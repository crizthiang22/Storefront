package com.example.storefront.demo.customer;
import jakarta.persistence.*;
import static jakarta.persistence.GenerationType.SEQUENCE;

@Entity (name = "customer")
@Table
public class customer {

        @Id
        @SequenceGenerator(
                name = "customer_sequence",
                sequenceName = "customer_sequence",
                allocationSize = 1
        )
        @GeneratedValue (
                strategy = SEQUENCE,
                generator = "customer_sequence"

        )
        @Column(
                name ="id",
                updatable = false
        )
        private int id;

        @Column(
                name = "name",
                nullable = false,
                columnDefinition = "TEXT"
        )
        private String name;

        @Column (name ="age")
        private int age;

        @Column(
                name ="email",
                columnDefinition = "TEXT",
                nullable = false

        )
        private String email;

        @Column(
                name ="userName",
                nullable = false,
                unique = true
        )
        private String userName;


    public customer(String name,
                    int age,
                    String email,
                    String userName,
                    int id) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.userName = userName;
        this.id = id;
    }

    public customer() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public String getUserName() {
        return userName;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "customer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", userName='" + userName + '\'' +
                ", id=" + id +
                '}';
    }
}
