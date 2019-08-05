/*
 * OrgApacheSlingDistributionResourcesImplDistributionConfigurationProperties.h
 *
 * 
 */

#ifndef _OrgApacheSlingDistributionResourcesImplDistributionConfigurationProperties_H_
#define _OrgApacheSlingDistributionResourcesImplDistributionConfigurationProperties_H_


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

class OrgApacheSlingDistributionResourcesImplDistributionConfigurationProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	OrgApacheSlingDistributionResourcesImplDistributionConfigurationProperties();
	OrgApacheSlingDistributionResourcesImplDistributionConfigurationProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OrgApacheSlingDistributionResourcesImplDistributionConfigurationProperties();

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

#endif /* _OrgApacheSlingDistributionResourcesImplDistributionConfigurationProperties_H_ */
