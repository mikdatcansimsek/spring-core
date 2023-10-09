package yte.intern.springcore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DependencyInjectionTest {
    @Autowired
    public FieldInjectionBean fieldInjectionBean;

    public SetterInjectionBean setterInjectionBean;

    public ConstructorInjectionBean constructorInjectionBean;

    @Autowired
    public DependencyInjectionTest(ConstructorInjectionBean constructorInjectionBean){
        this.constructorInjectionBean = constructorInjectionBean;
    }

    public void print(){
        fieldInjectionBean.print();
        setterInjectionBean.print();
        constructorInjectionBean.print();

    }

    @Autowired
    public void setSetterInjectionBean(SetterInjectionBean setterInjectionBean) {
        this.setterInjectionBean = setterInjectionBean;
    }
}
