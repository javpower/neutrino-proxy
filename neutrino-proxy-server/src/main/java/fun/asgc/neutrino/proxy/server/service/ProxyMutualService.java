/**
 * Copyright (c) 2022 aoshiguchen
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package fun.asgc.neutrino.proxy.server.service;

import fun.asgc.neutrino.core.annotation.Component;
import fun.asgc.neutrino.core.annotation.NonIntercept;
import fun.asgc.neutrino.proxy.server.proxy.domain.CmdChannelAttachInfo;
import lombok.extern.slf4j.Slf4j;

/**
 * 代理交互服务
 * @author: aoshiguchen
 * @date: 2022/9/3
 */
@Slf4j
@NonIntercept
@Component
public class ProxyMutualService {

	/**
	 * 绑定服务端端口处理
	 * @param attachInfo
	 * @param serverPort
	 */
	public void bindServerPort(CmdChannelAttachInfo attachInfo, Integer serverPort) {
		// TODO
		log.info("绑定服务端端口 licenseKey:{},ip:{},lanInfo:{},serverPort:{}", attachInfo.getLicenseKey(), attachInfo.getIp(), attachInfo.getClientLanInfo(), serverPort);
	}

}
