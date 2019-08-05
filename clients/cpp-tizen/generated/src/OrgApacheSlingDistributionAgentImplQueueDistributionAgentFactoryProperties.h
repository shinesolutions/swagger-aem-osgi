/*
 * OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties.h
 *
 * 
 */

#ifndef _OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties_H_
#define _OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties_H_


#include <string>
#include "ConfigNodePropertyArray.h"
#include "ConfigNodePropertyBoolean.h"
#include "ConfigNodePropertyDropDown.h"
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

class OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties();
	OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties();

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
	ConfigNodePropertyString getTitle();

	/*! \brief Set 
	 */
	void setTitle(ConfigNodePropertyString  title);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getDetails();

	/*! \brief Set 
	 */
	void setDetails(ConfigNodePropertyString  details);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getEnabled();

	/*! \brief Set 
	 */
	void setEnabled(ConfigNodePropertyBoolean  enabled);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getServiceName();

	/*! \brief Set 
	 */
	void setServiceName(ConfigNodePropertyString  serviceName);
	/*! \brief Get 
	 */
	ConfigNodePropertyDropDown getLoglevel();

	/*! \brief Set 
	 */
	void setLoglevel(ConfigNodePropertyDropDown  loglevel);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getAllowedroots();

	/*! \brief Set 
	 */
	void setAllowedroots(ConfigNodePropertyArray  allowedroots);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getRequestAuthorizationStrategytarget();

	/*! \brief Set 
	 */
	void setRequestAuthorizationStrategytarget(ConfigNodePropertyString  requestAuthorizationStrategytarget);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getQueueProviderFactorytarget();

	/*! \brief Set 
	 */
	void setQueueProviderFactorytarget(ConfigNodePropertyString  queueProviderFactorytarget);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getPackageBuildertarget();

	/*! \brief Set 
	 */
	void setPackageBuildertarget(ConfigNodePropertyString  packageBuildertarget);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getTriggerstarget();

	/*! \brief Set 
	 */
	void setTriggerstarget(ConfigNodePropertyString  triggerstarget);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getPriorityQueues();

	/*! \brief Set 
	 */
	void setPriorityQueues(ConfigNodePropertyArray  priorityQueues);

private:
	ConfigNodePropertyString name;
	ConfigNodePropertyString title;
	ConfigNodePropertyString details;
	ConfigNodePropertyBoolean enabled;
	ConfigNodePropertyString serviceName;
	ConfigNodePropertyDropDown loglevel;
	ConfigNodePropertyArray allowedroots;
	ConfigNodePropertyString requestAuthorizationStrategytarget;
	ConfigNodePropertyString queueProviderFactorytarget;
	ConfigNodePropertyString packageBuildertarget;
	ConfigNodePropertyString triggerstarget;
	ConfigNodePropertyArray priorityQueues;
	void __init();
	void __cleanup();

};
}
}

#endif /* _OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties_H_ */
