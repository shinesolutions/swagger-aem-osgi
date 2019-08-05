/*
 * OrgApacheSlingDistributionResourcesImplDistributionServiceResourProperties.h
 *
 * 
 */

#ifndef _OrgApacheSlingDistributionResourcesImplDistributionServiceResourProperties_H_
#define _OrgApacheSlingDistributionResourcesImplDistributionServiceResourProperties_H_


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

class OrgApacheSlingDistributionResourcesImplDistributionServiceResourProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	OrgApacheSlingDistributionResourcesImplDistributionServiceResourProperties();
	OrgApacheSlingDistributionResourcesImplDistributionServiceResourProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OrgApacheSlingDistributionResourcesImplDistributionServiceResourProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getProviderroots();

	/*! \brief Set 
	 */
	void setProviderroots(ConfigNodePropertyString  providerroots);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getKind();

	/*! \brief Set 
	 */
	void setKind(ConfigNodePropertyString  kind);

private:
	ConfigNodePropertyString providerroots;
	ConfigNodePropertyString kind;
	void __init();
	void __cleanup();

};
}
}

#endif /* _OrgApacheSlingDistributionResourcesImplDistributionServiceResourProperties_H_ */
