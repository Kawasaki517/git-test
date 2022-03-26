package bean;

import org.omg.PortableInterceptor.Interceptor;

public class Person {
    String name;
    Integer id;
    public Person(){}

    public Person(String name, Integer id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    public void hotFIx(){
        System.out.println("Using Hot-Fix");
    }

    public void master(){
        System.out.println("Master commit");
    }
    
    
    public void pull(){
        System.out.println("pull commit");
    }
}
