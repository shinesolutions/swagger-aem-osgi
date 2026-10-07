/*
 * OrgApacheSlingDistributionPackagingImplExporterRemoteDistributiProperties.h
 *
 * 
 */

#ifndef _OrgApacheSlingDistributionPackagingImplExporterRemoteDistributiProperties_H_
#define _OrgApacheSlingDistributionPackagingImplExporterRemoteDistributiProperties_H_


#include <string>
#include "ConfigNodePropertyArray.h"
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

class OrgApacheSlingDistributionPackagingImplExporterRemoteDistributiProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	OrgApacheSlingDistributionPackagingImplExporterRemoteDistributiProperties();
	OrgApacheSlingDistributionPackagingImplExporterRemoteDistributiProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OrgApacheSlingDistributionPackagingImplExporterRemoteDistributiProperties();

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
	ConfigNodePropertyInteger getPullitems();

	/*! \brief Set 
	 */
	void setPullitems(ConfigNodePropertyInteger  pullitems);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getPackageBuildertarget();

	/*! \brief Set 
	 */
	void setPackageBuildertarget(ConfigNodePropertyString  packageBuildertarget);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getTransportSecretProvidertarget();

	/*! \brief Set 
	 */
	void setTransportSecretProvidertarget(ConfigNodePropertyString  transportSecretProvidertarget);

private:
	ConfigNodePropertyString name;
	ConfigNodePropertyArray endpoints;
	ConfigNodePropertyInteger pullitems;
	ConfigNodePropertyString packageBuildertarget;
	ConfigNodePropertyString transportSecretProvidertarget;
	void __init();
	void __cleanup();

};
}
}

#endif /* _OrgApacheSlingDistributionPackagingImplExporterRemoteDistributiProperties_H_ */
