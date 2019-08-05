/*
 * OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties.h
 *
 * 
 */

#ifndef _OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties_H_
#define _OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties_H_


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

class OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties();
	OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties();

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
	ConfigNodePropertyBoolean getQueueprocessingenabled();

	/*! \brief Set 
	 */
	void setQueueprocessingenabled(ConfigNodePropertyBoolean  queueprocessingenabled);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getPassiveQueues();

	/*! \brief Set 
	 */
	void setPassiveQueues(ConfigNodePropertyArray  passiveQueues);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getPackageExporterendpoints();

	/*! \brief Set 
	 */
	void setPackageExporterendpoints(ConfigNodePropertyArray  packageExporterendpoints);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getPackageImporterendpoints();

	/*! \brief Set 
	 */
	void setPackageImporterendpoints(ConfigNodePropertyArray  packageImporterendpoints);
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
	ConfigNodePropertyInteger getPullitems();

	/*! \brief Set 
	 */
	void setPullitems(ConfigNodePropertyInteger  pullitems);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getHttpconntimeout();

	/*! \brief Set 
	 */
	void setHttpconntimeout(ConfigNodePropertyInteger  httpconntimeout);
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

private:
	ConfigNodePropertyString name;
	ConfigNodePropertyString title;
	ConfigNodePropertyString details;
	ConfigNodePropertyBoolean enabled;
	ConfigNodePropertyString serviceName;
	ConfigNodePropertyDropDown loglevel;
	ConfigNodePropertyBoolean queueprocessingenabled;
	ConfigNodePropertyArray passiveQueues;
	ConfigNodePropertyArray packageExporterendpoints;
	ConfigNodePropertyArray packageImporterendpoints;
	ConfigNodePropertyDropDown retrystrategy;
	ConfigNodePropertyInteger retryattempts;
	ConfigNodePropertyInteger pullitems;
	ConfigNodePropertyInteger httpconntimeout;
	ConfigNodePropertyString requestAuthorizationStrategytarget;
	ConfigNodePropertyString transportSecretProvidertarget;
	ConfigNodePropertyString packageBuildertarget;
	ConfigNodePropertyString triggerstarget;
	void __init();
	void __cleanup();

};
}
}

#endif /* _OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties_H_ */
