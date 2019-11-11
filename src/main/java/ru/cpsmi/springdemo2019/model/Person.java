package ru.cpsmi.springdemo2019.model;import com.fasterxml.jackson.annotation.JsonIgnoreProperties;import com.fasterxml.jackson.annotation.JsonProperty;import java.util.Objects;@JsonIgnoreProperties(ignoreUnknown = true)public class Person {    private String id;    private String name;    private String height;    private String weight;    private String gender;    public String getId() {        return id;    }    public String getName() {        return name;    }    public String getHeight() {        return height;    }    public String getWeight() {        return weight;    }    public String getGender() {        return gender;    }    public int getNext() {        return Integer.parseInt(getId()) + 1;    }    @Override    public boolean equals(Object o) {        if (this == o) return true;        if (o == null || getClass() != o.getClass()) return false;        Person person = (Person) o;        return Objects.equals(id, person.id) &&                Objects.equals(name, person.name) &&                Objects.equals(height, person.height) &&                Objects.equals(weight, person.weight) &&                Objects.equals(gender, person.gender);    }    @Override    public int hashCode() {        return Objects.hash(id, name, height, weight, gender);    }    @Override    public String toString() {        return "Person{" +                "id='" + id + '\'' +                ", name='" + name + '\'' +                ", height='" + height + '\'' +                ", weight='" + weight + '\'' +                ", gender='" + gender + '\'' +                '}';    }    public void setId(String id) {        this.id = id;    }    public void setName(String name) {        this.name = name;    }    public void setHeight(String height) {        this.height = height;    }    @JsonProperty("mass")    public void setWeight(String weight) {        this.weight = weight;    }    public void setGender(String gender) {        this.gender = gender;    }}