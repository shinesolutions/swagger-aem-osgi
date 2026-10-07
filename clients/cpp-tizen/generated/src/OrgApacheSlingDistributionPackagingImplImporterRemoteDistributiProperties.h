/*
 * OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiProperties.h
 *
 * 
 */

#ifndef _OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiProperties_H_
#define _OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiProperties_H_


#include <string>
#include "ConfigNodePropertyArray.h"
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

class OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiProperties();
	OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiProperties();

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
	ConfigNodePropertyArray getEndpoints();

	/*! \brief Set 
	 */
	void setEndpoints(ConfigNodePropertyArray  endpoints);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getTransportSecretProvidertarget();

	/*! \brief Set 
	 */
	void setTransportSecretProvidertarget(ConfigNodePropertyString  transportSecretProvidertarget);

private:
	ConfigNodePropertyString name;
	ConfigNodePropertyArray endpoints;
	ConfigNodePropertyString transportSecretProvidertarget;
	void __init();
	void __cleanup();

};
}
}

#endif /* _OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiProperties_H_ */
