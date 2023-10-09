package yte.intern.springcore;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class LifecycleBean {
    @PostConstruct
    public void init(){
        System.out.println("Init içindeyim");
    }
    @PreDestroy
    public void destroy(){
        System.out.println("Destroy içindeyim");
    }

    public LifecycleBean(){
        System.out.println("Constructor içindeyim");
    }

    public void print(){
        System.out.println("Print içindeyim");
    }
}
