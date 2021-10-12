package br.com.cod3r.singleton.connectionPool.singleton;

public class Connection {

    private boolean inUse;

    public Connection() {
        inUse = false;
    }

    public void query(String sql) {
        System.out.println("Running '" + sql + "' in Connection " + this);
    }

    boolean isNotInUse() {
        return !inUse;
    }

    void setInUse(boolean status) {
        inUse = status;
    }
}
