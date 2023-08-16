package strategy_pattern_sample_v2.model;

import lombok.Data;
import strategy_pattern_sample_v2.method.ChangeClother;

@Data
public abstract class Person {
    private String name;
    private int age;
    private String clother;

    ChangeClother changeClother = new ChangeClother() {
        @Override
        public void changeClother() {
            System.out.println("Người này đang không mặc gì !!! ");
        }
    };

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getClother() {
        return clother;
    }

    public void setClother(String clother) {
        this.clother = clother;
    }

    public ChangeClother getChangeClother() {
        return changeClother;
    }

    public void setChangeClother(ChangeClother changeClother) {
        this.changeClother = changeClother;
    }
}
