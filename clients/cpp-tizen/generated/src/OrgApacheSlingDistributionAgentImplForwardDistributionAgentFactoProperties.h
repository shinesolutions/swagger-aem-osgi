/*
 * OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties.h
 *
 * 
 */

#ifndef _OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties_H_
#define _OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties_H_


#include <string>
#include "ConfigNodePropertyArray.h"
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

class OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties();
	OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties();

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
	ConfigNodePropertyBoolean getQueueprocessingenabled();

	/*! \brief Set 
	 */
	void setQueueprocessingenabled(ConfigNodePropertyBoolean  queueprocessingenabled);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getPackageImporterendpoints();

	/*! \brief Set 
	 */
	void setPackageImporterendpoints(ConfigNodePropertyArray  packageImporterendpoints);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getPassiveQueues();

	/*! \brief Set 
	 */
	void setPassiveQueues(ConfigNodePropertyArray  passiveQueues);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getPriorityQueues();

	/*! \brief Set 
	 */
	void setPriorityQueues(ConfigNodePropertyArray  priorityQueues);
	/*! \brief Get 
	 */
	ConfigNodePropertyDropDown getRetrystrategy();

	/*! \brief Set 
	 */
	void setRetrystrategy(ConfigNodePropertyDropDown  retrystrategy);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getRetryattempts();

	/*! \brief Set 
	 */
	void setRetryattempts(ConfigNodePropertyInteger  retryattempts);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getRequestAuthorizationStrategytarget();

	/*! \brief Set 
	 */
	void setRequestAuthorizationStrategytarget(ConfigNodePropertyString  requestAuthorizationStrategytarget);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getTransportSecretProvidertarget();

	/*! \brief Set 
	 */
	void setTransportSecretProvidertarget(ConfigNodePropertyString  transportSecretProvidertarget);
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
	ConfigNodePropertyDropDown getQueueprovider();

	/*! \brief Set 
	 */
	void setQueueprovider(ConfigNodePropertyDropDown  queueprovider);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getAsyncdelivery();

	/*! \brief Set 
	 */
	void setAsyncdelivery(ConfigNodePropertyBoolean  asyncdelivery);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getHttpconntimeout();

	/*! \brief Set 
	 */
	void setHttpconntimeout(ConfigNodePropertyInteger  httpconntimeout);

private:
	ConfigNodePropertyString name;
	ConfigNodePropertyString title;
	ConfigNodePropertyString details;
	ConfigNodePropertyBoolean enabled;
	ConfigNodePropertyString serviceName;
	ConfigNodePropertyDropDown loglevel;
	ConfigNodePropertyArray allowedroots;
	ConfigNodePropertyBoolean queueprocessingenabled;
	ConfigNodePropertyArray packageImporterendpoints;
	ConfigNodePropertyArray passiveQueues;
	ConfigNodePropertyArray priorityQueues;
	ConfigNodePropertyDropDown retrystrategy;
	ConfigNodePropertyInteger retryattempts;
	ConfigNodePropertyString requestAuthorizationStrategytarget;
	ConfigNodePropertyString transportSecretProvidertarget;
	ConfigNodePropertyString packageBuildertarget;
	ConfigNodePropertyString triggerstarget;
	ConfigNodePropertyDropDown queueprovider;
	ConfigNodePropertyBoolean asyncdelivery;
	ConfigNodePropertyInteger httpconntimeout;
	void __init();
	void __cleanup();

};
}
}

#endif /* _OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties_H_ */
