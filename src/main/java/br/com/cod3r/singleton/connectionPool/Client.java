package br.com.cod3r.singleton.connectionPool;

import br.com.cod3r.singleton.connectionPool.singleton.Connection;
import br.com.cod3r.singleton.connectionPool.singleton.ConnectionPool;

public class Client {

	public static void doQuery1() {
		ConnectionPool pool = ConnectionPool.getInstance();
		Connection conn = pool.getConnection();
		if (conn != null) {
			conn.query("SELECT * FROM A1");
		}
		pool.leaveConnection(conn);
	}

	public static void doQuery2() {
		ConnectionPool pool = ConnectionPool.getInstance();
		Connection conn = pool.getConnection();
		if (conn != null) {
			conn.query("SELECT * FROM A2");
		}
		pool.leaveConnection(conn);
	}

	public static void doQuery3() {
		ConnectionPool pool = ConnectionPool.getInstance();
		Connection conn = pool.getConnection();
		if (conn != null) {
			conn.query("SELECT * FROM A3");
		}
		pool.leaveConnection(conn);
	}

	public static void main(String[] args) {
		doQuery1();
		doQuery2();
		doQuery3();
	}
}
