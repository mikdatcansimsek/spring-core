package yte.intern.springcore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class InjectionTest {

    public ComponenTest componenTest;
    public BeanTest beanTest;

    @Autowired
    public InjectionTest(ComponenTest componenTest, BeanTest beanTest) {
        this.componenTest = componenTest;
        this.beanTest = beanTest;
    }

    public void print(){
        beanTest.print();
        componenTest.print();
    }
}
