package springlifecyclexmlinteranno;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

// Spring life cycle using annotation
public class Example {
    private String subject;

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Example(){
        super();
    }

    @Override
    public String toString() {
        return "Example{" +
                "Example='" + subject + '\'' +
                '}';
    }
    @PostConstruct
    public void init(){
        System.out.println("init method of annotation");
    }
    @PreDestroy
    public void destroy(){
        System.out.println("destroy method of annotation");
    }
}
