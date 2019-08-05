/*
 * OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeProperties.h
 *
 * 
 */

#ifndef _OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeProperties_H_
#define _OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeProperties_H_


#include <string>
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

class OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeProperties();
	OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeProperties();

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
	ConfigNodePropertyString getPath();

	/*! \brief Set 
	 */
	void setPath(ConfigNodePropertyString  path);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getSeconds();

	/*! \brief Set 
	 */
	void setSeconds(ConfigNodePropertyString  seconds);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getServiceName();

	/*! \brief Set 
	 */
	void setServiceName(ConfigNodePropertyString  serviceName);

private:
	ConfigNodePropertyString name;
	ConfigNodePropertyString path;
	ConfigNodePropertyString seconds;
	ConfigNodePropertyString serviceName;
	void __init();
	void __cleanup();

};
}
}

#endif /* _OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeProperties_H_ */
