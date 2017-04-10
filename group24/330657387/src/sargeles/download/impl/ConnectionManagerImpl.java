package sargeles.download.impl;

import sargeles.download.api.Connection;
import sargeles.download.api.ConnectionException;
import sargeles.download.api.ConnectionManager;

//返回接口，是对实现的一种隐蔽
public class ConnectionManagerImpl implements ConnectionManager {

	@Override
	public Connection open(String url) throws ConnectionException {
		Connection res = new ConnectionImpl(url);
		
		return res;
	}

}
