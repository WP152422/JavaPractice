/**
 * 
 */
package org.dimigo.interfaces;

/**
 * <pre>
 * org.dimigo.interfaces
 *   |_ IDBManager
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2017. 5. 25.
 * </pre>
 *
 * @author : Hvid
 * @version : 1.0
 */
public interface IDBManager {
	String ORACLE_DATABASE = "ORACLE";
	String SYBASE_DATABASE = "SYBASE";

	void insert();

	void search();

	void update();

	void delete();

	static IDBManager getDBObject(String database) {
		if (ORACLE_DATABASE.equals(database))
			return (IDBManager) new OracleDB();
		else if (SYBASE_DATABASE.equals(database))
			return (IDBManager) new SybaseDB();
		return null;
	}
}
