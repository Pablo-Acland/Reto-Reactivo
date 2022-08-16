package co.com.sofka.retoreactivo.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Objects;
import java.util.UUID;

@Document(collection = "auto")
public class Auto {


    @Id
    private String id = UUID.randomUUID().toString().substring(0, 10);
    private String modelo;
    private String color;
    private String marca;


    public Auto() {
    }

    public Auto(String id, String modelo, String color, String marca) {
        this.id = id;
        this.modelo = modelo;
        this.color = color;
        this.marca = marca;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }


    @Override
    public String toString() {
        return "Auto{" +
                "id='" + id + '\'' +
                ", modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                ", marca='" + marca + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Auto auto = (Auto) o;
        return Objects.equals(id, auto.id) && Objects.equals(modelo, auto.modelo) && Objects.equals(color, auto.color) && Objects.equals(marca, auto.marca);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, modelo, color, marca);
    }
}
