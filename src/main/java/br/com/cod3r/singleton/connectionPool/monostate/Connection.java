package br.com.cod3r.singleton.connectionPool.monostate;

public class Connection {

    private boolean inUse;

    public Connection() {
        inUse = false;
    }

    public void query(String sql) {
        System.out.println("Running '" + sql + "' in Connection " + this);
    }

    public boolean isNotInUse() {
        return !inUse;
    }

    public void setInUse(boolean status) {
        inUse = status;
    }
}
