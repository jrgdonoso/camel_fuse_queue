package cl.komatsu.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.microsoft.sqlserver.jdbc.SQLServerDataSource;

@Configuration
public class SQLDataSource {

    EnviromentVar enviromentVar;

    @Autowired
    public SQLDataSource(EnviromentVar enviromentVar) {
        this.enviromentVar = enviromentVar;
    }

    @Bean
    public SQLServerDataSource dataSourceSql() {
        String host =  this.enviromentVar.getSQLHOST();
        Integer port =  this.enviromentVar.getSQLPORT();
        String dbName =  this.enviromentVar.getSQLDBNAME();
        String user =  this.enviromentVar.getSQLUSER();
        String pass =  this.enviromentVar.getSQLPASS();

        SQLServerDataSource dataSource = new SQLServerDataSource();
        dataSource.setServerName(host);
        dataSource.setPortNumber(port);
        dataSource.setDatabaseName(dbName);
        dataSource.setUser(user);
        dataSource.setPassword(pass);
        return dataSource;
    }

}
