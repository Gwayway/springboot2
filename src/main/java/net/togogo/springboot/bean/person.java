package net.togogo.springboot.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "person")
public class person {
    @Override
    public String toString() {
        return "person{" +
                "my_name='" + my_name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getMy_name() {
        return my_name;
    }

    public void setMy_name(String my_name) {
        this.my_name = my_name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    private String my_name;
    private Integer age;
}
