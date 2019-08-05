/*
 * OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties.h
 *
 * 
 */

#ifndef _OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties_H_
#define _OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties_H_


#include <string>
#include "ConfigNodePropertyBoolean.h"
#include "ConfigNodePropertyDropDown.h"
#include "ConfigNodePropertyInteger.h"
#include "ConfigNodePropertyString.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties();
	OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getName();

	/*! \brief Set 
	 */
	void setName(ConfigNodePropertyString  name);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getMinPoolSize();

	/*! \brief Set 
	 */
	void setMinPoolSize(ConfigNodePropertyInteger  minPoolSize);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getMaxPoolSize();

	/*! \brief Set 
	 */
	void setMaxPoolSize(ConfigNodePropertyInteger  maxPoolSize);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getQueueSize();

	/*! \brief Set 
	 */
	void setQueueSize(ConfigNodePropertyInteger  queueSize);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getMaxThreadAge();

	/*! \brief Set 
	 */
	void setMaxThreadAge(ConfigNodePropertyInteger  maxThreadAge);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getKeepAliveTime();

	/*! \brief Set 
	 */
	void setKeepAliveTime(ConfigNodePropertyInteger  keepAliveTime);
	/*! \brief Get 
	 */
	ConfigNodePropertyDropDown getBlockPolicy();

	/*! \brief Set 
	 */
	void setBlockPolicy(ConfigNodePropertyDropDown  blockPolicy);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getShutdownGraceful();

	/*! \brief Set 
	 */
	void setShutdownGraceful(ConfigNodePropertyBoolean  shutdownGraceful);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getDaemon();

	/*! \brief Set 
	 */
	void setDaemon(ConfigNodePropertyBoolean  daemon);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getShutdownWaitTime();

	/*! \brief Set 
	 */
	void setShutdownWaitTime(ConfigNodePropertyInteger  shutdownWaitTime);
	/*! \brief Get 
	 */
	ConfigNodePropertyDropDown getPriority();

	/*! \brief Set 
	 */
	void setPriority(ConfigNodePropertyDropDown  priority);

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
	void __init();
	void __cleanup();

};
}
}

#endif /* _OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties_H_ */
