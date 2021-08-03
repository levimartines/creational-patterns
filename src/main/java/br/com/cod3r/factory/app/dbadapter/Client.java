package br.com.cod3r.factory.app.dbadapter;

import br.com.cod3r.factory.app.dbadapter.db.DB;
import br.com.cod3r.factory.app.dbadapter.factory.OracleDBFactory;
import br.com.cod3r.factory.app.dbadapter.factory.PostgresDBFactory;

public class Client {

	public static void main(String[] args) {
		//DB db = new OracleDBFactory().getDatabase();
		DB db = new PostgresDBFactory().getDatabase();
		db.query("SELECT * FROM users");
		db.update("UPDATE users SET nome='Pedro' WHERE id=5");

	}
}
