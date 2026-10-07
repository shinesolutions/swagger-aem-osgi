
/*
 * OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties_H_
#define TINY_CPP_CLIENT_OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyBoolean.h"
#include "ConfigNodePropertyDropDown.h"
#include "ConfigNodePropertyInteger.h"
#include "ConfigNodePropertyString.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties{
public:

    /*! \brief Constructor.
	 */
    OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties();
    OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getName();

	/*! \brief Set 
	 */
	void setName(ConfigNodePropertyString name);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getMinPoolSize();

	/*! \brief Set 
	 */
	void setMinPoolSize(ConfigNodePropertyInteger minPoolSize);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getMaxPoolSize();

	/*! \brief Set 
	 */
	void setMaxPoolSize(ConfigNodePropertyInteger maxPoolSize);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getQueueSize();

	/*! \brief Set 
	 */
	void setQueueSize(ConfigNodePropertyInteger queueSize);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getMaxThreadAge();

	/*! \brief Set 
	 */
	void setMaxThreadAge(ConfigNodePropertyInteger maxThreadAge);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getKeepAliveTime();

	/*! \brief Set 
	 */
	void setKeepAliveTime(ConfigNodePropertyInteger keepAliveTime);
	/*! \brief Get 
	 */
	ConfigNodePropertyDropDown getBlockPolicy();

	/*! \brief Set 
	 */
	void setBlockPolicy(ConfigNodePropertyDropDown blockPolicy);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getShutdownGraceful();

	/*! \brief Set 
	 */
	void setShutdownGraceful(ConfigNodePropertyBoolean shutdownGraceful);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getDaemon();

	/*! \brief Set 
	 */
	void setDaemon(ConfigNodePropertyBoolean daemon);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getShutdownWaitTime();

	/*! \brief Set 
	 */
	void setShutdownWaitTime(ConfigNodePropertyInteger shutdownWaitTime);
	/*! \brief Get 
	 */
	ConfigNodePropertyDropDown getPriority();

	/*! \brief Set 
	 */
	void setPriority(ConfigNodePropertyDropDown priority);


    private:
    ConfigNodePropertyString name;
    ConfigNodePropertyInteger minPoolSize;
    ConfigNodePropertyInteger maxPoolSize;
    ConfigNodePropertyInteger queueSize;
    ConfigNodePropertyInteger maxThreadAge;
    ConfigNodePropertyInteger keepAliveTime;
    ConfigNodePropertyDropDown blockPolicy;
    ConfigNodePropertyBoolean shutdownGraceful;
    ConfigNodePropertyBoolean daemon;
    ConfigNodePropertyInteger shutdownWaitTime;
    ConfigNodePropertyDropDown priority;
};
}

#endif /* TINY_CPP_CLIENT_OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties_H_ */
