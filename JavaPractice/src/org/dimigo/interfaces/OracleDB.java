/**
 * 
 */
package org.dimigo.interfaces;

/**
 * <pre>
 * org.dimigo.interfaces
 *   |_ OracleDB
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2017. 5. 25.
 * </pre>
 *
 * @author	: Hvid
 * @version	: 1.0
 */
public class OracleDB implements IDBManager {

	/* (non-Javadoc)
	 * @see org.dimigo.interfaces.IDBManager#insert()
	 */
	@Override
	public void insert() {
		// TODO Auto-generated method stub
		System.out.println("Oracle DB 저장");
	}

	/* (non-Javadoc)
	 * @see org.dimigo.interfaces.IDBManager#search()
	 */
	@Override
	public void search() {
		// TODO Auto-generated method stub
		System.out.println("Oracle DB 조회");
	}

	/* (non-Javadoc)
	 * @see org.dimigo.interfaces.IDBManager#update()
	 */
	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.println("Oracle DB 변경");
	}

	/* (non-Javadoc)
	 * @see org.dimigo.interfaces.IDBManager#delete()
	 */
	@Override
	public void delete() {
		// TODO Auto-generated method stub
		System.out.println("Oracle DB 삭제");
	}

}
