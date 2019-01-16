package com.sp01;

public class CellPhone
{
    Email email;
    public String name;

    public void run()
    {
        System.out.println("--->"+name+"<-----");
        email.send();
        email.receive();
    }

    public Email getEmail() {
        return email;
    }

    public void setEmail(Email email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
