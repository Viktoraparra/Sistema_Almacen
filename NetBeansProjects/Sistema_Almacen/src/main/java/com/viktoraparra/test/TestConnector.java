package com.viktoraparra.test;

import com.viktoraparra.connectors.ConnectorMySQL;
import java.sql.Connection;

public class TestConnector {
    public static void main(String[] args) {
        Connection conn = ConnectorMySQL.getConnection();
    }
}
