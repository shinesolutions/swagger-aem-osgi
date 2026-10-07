/*
 * OrgApacheSlingDistributionPackagingImplExporterLocalDistributioProperties.h
 *
 * 
 */

#ifndef _OrgApacheSlingDistributionPackagingImplExporterLocalDistributioProperties_H_
#define _OrgApacheSlingDistributionPackagingImplExporterLocalDistributioProperties_H_


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

class OrgApacheSlingDistributionPackagingImplExporterLocalDistributioProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	OrgApacheSlingDistributionPackagingImplExporterLocalDistributioProperties();
	OrgApacheSlingDistributionPackagingImplExporterLocalDistributioProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OrgApacheSlingDistributionPackagingImplExporterLocalDistributioProperties();

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
	ConfigNodePropertyString getPackageBuildertarget();

	/*! \brief Set 
	 */
	void setPackageBuildertarget(ConfigNodePropertyString  packageBuildertarget);

private:
	ConfigNodePropertyString name;
	ConfigNodePropertyString packageBuildertarget;
	void __init();
	void __cleanup();

};
}
}

#endif /* _OrgApacheSlingDistributionPackagingImplExporterLocalDistributioProperties_H_ */
