package br.com.carstore.model;

public class Car
{
    private String id;

    private String name;

    public Car() {}

    public Car(String name) { this.name = name; }

    public Car(String id, String name) { this.id = id; this.name = name;}

    public String getId() { return id; }



    public String getName() { return name; }

    public void setName(String name) { this.name = name; }
}
