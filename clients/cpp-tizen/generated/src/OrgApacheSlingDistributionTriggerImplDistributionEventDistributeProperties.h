/*
 * OrgApacheSlingDistributionTriggerImplDistributionEventDistributeProperties.h
 *
 * 
 */

#ifndef _OrgApacheSlingDistributionTriggerImplDistributionEventDistributeProperties_H_
#define _OrgApacheSlingDistributionTriggerImplDistributionEventDistributeProperties_H_


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

class OrgApacheSlingDistributionTriggerImplDistributionEventDistributeProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	OrgApacheSlingDistributionTriggerImplDistributionEventDistributeProperties();
	OrgApacheSlingDistributionTriggerImplDistributionEventDistributeProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OrgApacheSlingDistributionTriggerImplDistributionEventDistributeProperties();

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

private:
	ConfigNodePropertyString name;
	ConfigNodePropertyString path;
	void __init();
	void __cleanup();

};
}
}

#endif /* _OrgApacheSlingDistributionTriggerImplDistributionEventDistributeProperties_H_ */
