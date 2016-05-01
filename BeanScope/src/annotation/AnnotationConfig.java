package annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 *
 * @author Yasin_Pathan
 */
@Configuration
public class AnnotationConfig {
    
    @Bean(name="adderBean")
    @Scope(value="prototype")
    public AnnotationAdder getAdder(){
        AnnotationAdder aa = new AnnotationAdder();
        aa.setNum1(25);
        aa.setNum2(25);
        return aa;
    }
    
}
