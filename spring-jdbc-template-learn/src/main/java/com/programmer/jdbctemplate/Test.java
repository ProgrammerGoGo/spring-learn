package com.programmer.jdbctemplate;

import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;
import java.util.Map;

/**
 * @Author programmerGoGo
 * @Description
 */
public class Test {
    public static void main(String[] args) {
        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        jdbcTemplate.setDataSource(JDBCUtil.getDataSource());
        List<Map<String, Object>> maps = jdbcTemplate.queryForList("select * from pms_brand");
        System.out.println(maps);
    }
}
