package com.programmer.jdbctemplate;

import com.zaxxer.hikari.HikariDataSource;

import javax.sql.DataSource;
import java.util.Properties;

/**
 * @Author programmerGoGo
 * @Description
 */
public class JDBCUtil {

    private static Properties properties;

    static {
        try {
            properties = new Properties();
            properties.load(JDBCUtil.class.getClassLoader().getResourceAsStream("hikari.properties"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static DataSource getDataSource() {
        HikariDataSource ds = new HikariDataSource();
        ds.setJdbcUrl("jdbc:mysql://localhost:3306/mall");
        ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
        ds.setUsername("root");
        ds.setPassword("root");
        ds.addDataSourceProperty("cachePrepStmts", "true");
        ds.addDataSourceProperty("prepStmtCacheSize", "250");
        ds.addDataSourceProperty("prepStmtCacheSqlLimit", "2048");
        return ds;
    }
}
