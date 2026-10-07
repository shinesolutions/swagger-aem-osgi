
/*
 * OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties_H_
#define TINY_CPP_CLIENT_OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyArray.h"
#include "ConfigNodePropertyBoolean.h"
#include "ConfigNodePropertyDropDown.h"
#include "ConfigNodePropertyString.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties{
public:

    /*! \brief Constructor.
	 */
    OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties();
    OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties();


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
	ConfigNodePropertyString getTitle();

	/*! \brief Set 
	 */
	void setTitle(ConfigNodePropertyString title);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getDetails();

	/*! \brief Set 
	 */
	void setDetails(ConfigNodePropertyString details);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getEnabled();

	/*! \brief Set 
	 */
	void setEnabled(ConfigNodePropertyBoolean enabled);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getServiceName();

	/*! \brief Set 
	 */
	void setServiceName(ConfigNodePropertyString serviceName);
	/*! \brief Get 
	 */
	ConfigNodePropertyDropDown getLoglevel();

	/*! \brief Set 
	 */
	void setLoglevel(ConfigNodePropertyDropDown loglevel);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getAllowedroots();

	/*! \brief Set 
	 */
	void setAllowedroots(ConfigNodePropertyArray allowedroots);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getRequestAuthorizationStrategytarget();

	/*! \brief Set 
	 */
	void setRequestAuthorizationStrategytarget(ConfigNodePropertyString requestAuthorizationStrategytarget);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getQueueProviderFactorytarget();

	/*! \brief Set 
	 */
	void setQueueProviderFactorytarget(ConfigNodePropertyString queueProviderFactorytarget);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getPackageBuildertarget();

	/*! \brief Set 
	 */
	void setPackageBuildertarget(ConfigNodePropertyString packageBuildertarget);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getTriggerstarget();

	/*! \brief Set 
	 */
	void setTriggerstarget(ConfigNodePropertyString triggerstarget);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getPriorityQueues();

	/*! \brief Set 
	 */
	void setPriorityQueues(ConfigNodePropertyArray priorityQueues);


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
};
}

#endif /* TINY_CPP_CLIENT_OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties_H_ */
