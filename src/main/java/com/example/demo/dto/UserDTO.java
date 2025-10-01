package com.example.demo.dto;

import jakarta.validation.constraints.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

import org.hibernate.validator.constraints.*;

import java.util.Date;

public class UserDTO {

    @NotNull(message = "Name cannot be null")
    @NotBlank(message = "Name cannot be blank")
    //@Size(min = 3, max = 20, message = "Name must be between 3 and 20 characters")
    private String name;

    @Email(message = "Invalid email")
    private String email;

    @Pattern(regexp = "^(\\+91)?[6789]\\d{9}$", message = "Invalid Indian phone number")
    private String phone;

    @Min(value = 18, message = "Age must be at least 18")
    @Max(value = 60, message = "Age must be at most 60")
    private int age;

    @Positive(message = "Salary must be positive")
    @DecimalMin(value = "1000.00", message = "Salary must be >= 1000.00")
    @DecimalMax(value = "99999.99", message = "Salary must be <= 99999.99")
    private double salary;

    @Past(message = "Date of birth must be in the past")
    private Date dob;

    @Future(message = "Expiry date must be in the future")
    private Date expiryDate;

    @URL(message = "Website must be valid")
    private String website;

    @CreditCardNumber(message = "Invalid credit card , 16 digit is must")
    private String creditCard;

    @Digits(integer = 6, fraction = 2, message = "Formatted salary invalid")
    private double formattedSalary;

    
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    public double getSalary() { return salary; }
    public void setSalary(double salary) { this.salary = salary; }

    public Date getDob() { return dob; }
    public void setDob(Date dob) { this.dob = dob; }

    public Date getExpiryDate() { return expiryDate; }
    public void setExpiryDate(Date expiryDate) { this.expiryDate = expiryDate; }

    public String getWebsite() { return website; }
    public void setWebsite(String website) { this.website = website; }

    public String getCreditCard() { return creditCard; }
    public void setCreditCard(String creditCard) { this.creditCard = creditCard; }

    public double getFormattedSalary() { return formattedSalary; }
    public void setFormattedSalary(double formattedSalary) { this.formattedSalary = formattedSalary; }
}
