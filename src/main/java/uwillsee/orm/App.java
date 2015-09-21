package uwillsee.orm;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.github.jetqin.orm.annotation.EnableOrmConfiguration;

/**
 * Hello world!
 *
 */
@Configuration
@ComponentScan(basePackages={"uwillsee.orm.*","com.github.jetqin.configuration*"})
@EnableOrmConfiguration(packageToScan="uwillsee.orm.domain",showSql=false,enableCache=true)
@PropertySource("classpath:application.properties")
public class App 
{
	
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
}
