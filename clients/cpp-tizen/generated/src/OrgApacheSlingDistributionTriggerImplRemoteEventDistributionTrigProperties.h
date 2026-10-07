/*
 * OrgApacheSlingDistributionTriggerImplRemoteEventDistributionTrigProperties.h
 *
 * 
 */

#ifndef _OrgApacheSlingDistributionTriggerImplRemoteEventDistributionTrigProperties_H_
#define _OrgApacheSlingDistributionTriggerImplRemoteEventDistributionTrigProperties_H_


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

class OrgApacheSlingDistributionTriggerImplRemoteEventDistributionTrigProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	OrgApacheSlingDistributionTriggerImplRemoteEventDistributionTrigProperties();
	OrgApacheSlingDistributionTriggerImplRemoteEventDistributionTrigProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OrgApacheSlingDistributionTriggerImplRemoteEventDistributionTrigProperties();

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
	ConfigNodePropertyString getEndpoint();

	/*! \brief Set 
	 */
	void setEndpoint(ConfigNodePropertyString  endpoint);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getTransportSecretProvidertarget();

	/*! \brief Set 
	 */
	void setTransportSecretProvidertarget(ConfigNodePropertyString  transportSecretProvidertarget);

private:
	ConfigNodePropertyString name;
	ConfigNodePropertyString endpoint;
	ConfigNodePropertyString transportSecretProvidertarget;
	void __init();
	void __cleanup();

};
}
}

#endif /* _OrgApacheSlingDistributionTriggerImplRemoteEventDistributionTrigProperties_H_ */
