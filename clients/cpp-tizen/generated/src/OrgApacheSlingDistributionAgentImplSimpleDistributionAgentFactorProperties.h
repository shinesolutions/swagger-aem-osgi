/*
 * OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties.h
 *
 * 
 */

#ifndef _OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties_H_
#define _OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties_H_


#include <string>
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

class OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties();
	OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties();

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
	ConfigNodePropertyString getPackageExportertarget();

	/*! \brief Set 
	 */
	void setPackageExportertarget(ConfigNodePropertyString  packageExportertarget);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getPackageImportertarget();

	/*! \brief Set 
	 */
	void setPackageImportertarget(ConfigNodePropertyString  packageImportertarget);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getRequestAuthorizationStrategytarget();

	/*! \brief Set 
	 */
	void setRequestAuthorizationStrategytarget(ConfigNodePropertyString  requestAuthorizationStrategytarget);
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
	ConfigNodePropertyString packageExportertarget;
	ConfigNodePropertyString packageImportertarget;
	ConfigNodePropertyString requestAuthorizationStrategytarget;
	ConfigNodePropertyString triggerstarget;
	void __init();
	void __cleanup();

};
}
}

#endif /* _OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties_H_ */
