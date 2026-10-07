/*
 * OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiProperties.h
 *
 * 
 */

#ifndef _OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiProperties_H_
#define _OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiProperties_H_


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

class OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiProperties();
	OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiProperties();

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
	ConfigNodePropertyString getServiceName();

	/*! \brief Set 
	 */
	void setServiceName(ConfigNodePropertyString  serviceName);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getNuggetsPath();

	/*! \brief Set 
	 */
	void setNuggetsPath(ConfigNodePropertyString  nuggetsPath);

private:
	ConfigNodePropertyString name;
	ConfigNodePropertyString path;
	ConfigNodePropertyString serviceName;
	ConfigNodePropertyString nuggetsPath;
	void __init();
	void __cleanup();

};
}
}

#endif /* _OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiProperties_H_ */
