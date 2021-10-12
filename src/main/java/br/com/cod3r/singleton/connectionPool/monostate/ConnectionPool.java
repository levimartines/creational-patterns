package br.com.cod3r.singleton.connectionPool.monostate;

import java.util.ArrayList;
import java.util.List;

public class ConnectionPool {

    private static final int POOL_SIZE = 2;
    private static final List<Connection> connectionsPool;

    public ConnectionPool() {
    }

    static {
        System.out.println("Creating connections pool");
        connectionsPool = new ArrayList<>();
        for (int i = 0; i < POOL_SIZE; i++) {
            connectionsPool.add(new Connection());
        }
    }

    public Connection getConnection() {
        Connection availableConnection = null;
        for (Connection conn : connectionsPool) {
            if (conn.isNotInUse()) {
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
