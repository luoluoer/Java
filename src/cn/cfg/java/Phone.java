
package cn.cfg.java;

/**
* 这是文档注释
* @author 作者
* @version 创建时间：2021年12月26日 下午6:57:58
*/
class Phone implements Usb {

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("我是手机,我开始工作了");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("我是手机,我停止工作了");
	}

}
