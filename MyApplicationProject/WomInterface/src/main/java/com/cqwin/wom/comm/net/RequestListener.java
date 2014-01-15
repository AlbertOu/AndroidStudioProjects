package com.cqwin.wom.comm.net;

import java.io.IOException;

public interface RequestListener {
    /**
	 * 用于获取服务器返回的响应内容
	 * 
	 * @param response
	 */
	public void onComplete(int code, String response);

	public void onIOException(int code, IOException e);

	public void onError(int code, Exception e);
}
