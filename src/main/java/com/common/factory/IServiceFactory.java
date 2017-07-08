package com.common.factory;

import com.common.enums.ServiceEnum;
import com.common.service.IService;

/**
 * @author laxman
 *
 */
public interface IServiceFactory extends IFactory{

	/**
	 * @param service
	 * @return
	 */
	public IService getFactoryInstance(ServiceEnum service);
}
