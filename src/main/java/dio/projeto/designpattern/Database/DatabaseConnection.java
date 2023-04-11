package dio.projeto.designpattern.Database;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.batch.BatchProperties;
import org.springframework.jdbc.core.JdbcTemplate;

public class DatabaseConnection implements CommandLineRunner {

    JdbcTemplate jdbcTemplate ;

    @Override
    public void run(String... args) throws Exception {
        jdbcTemplate.execute("create table user(id int not null primary key, name varchar(100), password varchar(10);");


    }
}
