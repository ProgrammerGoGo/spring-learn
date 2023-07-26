package com.programmer.jdbctemplate;

import com.zaxxer.hikari.HikariDataSource;

import javax.sql.DataSource;
import java.util.Properties;

/**
 * @Author programmerGoGo
 * @Description
 */
public class JDBCUtil {

    // private static Properties properties;

    // static {
    //     try {
    //         properties = new Properties();
    //         properties.load(JDBCUtil.class.getClassLoader().getResourceAsStream("hikari.properties"));
    //     } catch (Exception e) {
    //         e.printStackTrace();
    //     }
    // }

    /**
    * 获取数据库连接池 Hikari
    **/
    public static DataSource getDataSource() {
        // 方式1
        // HikariDataSource ds = new HikariDataSource();
        // ds.setJdbcUrl("jdbc:mysql://localhost:3306/mall");
        // ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
        // ds.setUsername("root");
        // ds.setPassword("root");
        // ds.addDataSourceProperty("cachePrepStmts", "true");
        // ds.addDataSourceProperty("prepStmtCacheSize", "250");
        // ds.addDataSourceProperty("prepStmtCacheSqlLimit", "2048");

        // 方式2
        // HikariConfig config = new HikariConfig();
        // config.setJdbcUrl("jdbc:mysql://localhost:3306/mall");
        // config.setUsername("root");
        // config.setPassword("11111111");
        // config.addDataSourceProperty("cachePrepStmts", "true");
        // config.addDataSourceProperty("prepStmtCacheSize", "250");
        // config.addDataSourceProperty("prepStmtCacheSqlLimit", "2048");
        
        // HikariDataSource ds = new HikariDataSource(config);

        // 方式3
        // Properties props = new Properties();
        // props.setProperty("dataSourceClassName", "org.postgresql.ds.PGSimpleDataSource");
        // props.setProperty("dataSource.user", "root");
        // props.setProperty("dataSource.password", "11111111");
        // props.setProperty("dataSource.databaseName", "mall");
        // props.put("dataSource.logWriter", new PrintWriter(System.out));
        
        // HikariConfig config = new HikariConfig(props);
        // HikariDataSource ds = new HikariDataSource(config);

        // 方式4
        HikariConfig config = new HikariConfig("/some/path/hikari.properties");
        HikariDataSource ds = new HikariDataSource(config);

        // properties
        // dataSourceClassName=org.postgresql.ds.PGSimpleDataSource
        // dataSource.user=test
        // dataSource.password=test
        // dataSource.databaseName=mydb
        // dataSource.portNumber=5432
        // dataSource.serverName=localhost
        return ds;
    }
}
