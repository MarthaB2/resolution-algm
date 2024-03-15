package com.mbarra.exercises.exercisethree;

public class Contact {

    private String name;
    private int phone;

    public String getName() {
        return name;
    }

    public Contact(String name, int phone) {
        this.name = name;
        this.phone = phone;
    }

    public Contact(String name) {
        this.name = name;
        this.phone = 0;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", phone=" + phone +
                '}';
    }

    public int equals(Contact c){

        if(this.name.trim().equalsIgnoreCase(c.getName().trim())){
            return 1;
        }

        return 0;

    }


}
