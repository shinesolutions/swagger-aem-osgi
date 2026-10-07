/*
 * OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerProperties.h
 *
 * 
 */

#ifndef _OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerProperties_H_
#define _OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerProperties_H_


#include <string>
#include "ConfigNodePropertyArray.h"
#include "ConfigNodePropertyBoolean.h"
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

class OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerProperties();
	OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerProperties();

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
	ConfigNodePropertyArray getIgnoredPathsPatterns();

	/*! \brief Set 
	 */
	void setIgnoredPathsPatterns(ConfigNodePropertyArray  ignoredPathsPatterns);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getServiceName();

	/*! \brief Set 
	 */
	void setServiceName(ConfigNodePropertyString  serviceName);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getDeep();

	/*! \brief Set 
	 */
	void setDeep(ConfigNodePropertyBoolean  deep);

private:
	ConfigNodePropertyString name;
	ConfigNodePropertyString path;
	ConfigNodePropertyArray ignoredPathsPatterns;
	ConfigNodePropertyString serviceName;
	ConfigNodePropertyBoolean deep;
	void __init();
	void __cleanup();

};
}
}

#endif /* _OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerProperties_H_ */
