package hello;

import static java.lang.System.exit;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.efreelearn.dao.UserInfoRepository;
import com.efreelearn.model.UserInfo;

@SpringBootApplication
public class SpringBootConsoleApplication implements CommandLineRunner {

    @Autowired
    DataSource dataSource;

    @Autowired
    private UserInfoRepository customerRepository;



    @Override
    public void run(String... args) throws Exception {

        System.out.println("DATASOURCE = " + dataSource);

        // If you want to check the HikariDataSource settings
        //HikariDataSource newds = (HikariDataSource)dataSource;
        //System.out.println("DATASOURCE = " + newds.getMaximumPoolSize());

        if (args.length <= 0) {
            System.err.println("[Usage] java xxx.jar {insert name email | display}");
        } else {
        	
            if (args[0].equalsIgnoreCase("insert")) {
	                System.out.println("Add customer...");
                String name = args[1];
                String email = args[2];
                SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
                Date date = new Date();
                String id = ""+date.getTime();
                customerRepository.addCustomer(  id,  name,  email);
            }

            if (args[0].equalsIgnoreCase("display")) {
                System.out.println("Display all customers....");
                List<UserInfo> list = customerRepository.findAll();
                list.forEach(x -> System.out.println(x));
            }
            System.out.println("Done!");
        }
        exit(0);
    }
    public static void main(String[] args) throws Exception {
        SpringApplication.run(SpringBootConsoleApplication.class, args);
    }
}