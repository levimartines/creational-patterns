package br.com.cod3r.singleton.connectionPool.singleton;

import java.util.ArrayList;
import java.util.List;

public class ConnectionPool {

    private final static int POOL_SIZE = 2;
    private static final ConnectionPool singleton = new ConnectionPool();
    private final List<Connection> connectionsPool;

    public static ConnectionPool getInstance() {
        return singleton;
    }

    private ConnectionPool() {
        System.out.println("Creating Connection Pool");
        connectionsPool = new ArrayList<>();
        for (int i = 0; i < POOL_SIZE; i++) {
            connectionsPool.add(new Connection());
        }
    }

    public Connection getConnection() {
        Connection availableConnection = null;
        for (Connection conn : connectionsPool) {
            if (!conn.isNotInUse()) {
                availableConnection = conn;
                break;
            }
        }
        if (availableConnection == null) {
            System.out.println("No Connections available");
            return null;
        }
        availableConnection.setInUse(true);
        return availableConnection;
    }

    public void leaveConnection(Connection conn) {
        if (conn != null) {
            conn.setInUse(false);
        }
    }
}
