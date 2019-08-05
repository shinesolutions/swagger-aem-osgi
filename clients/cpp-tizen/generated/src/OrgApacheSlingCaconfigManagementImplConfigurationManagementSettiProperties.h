/*
 * OrgApacheSlingCaconfigManagementImplConfigurationManagementSettiProperties.h
 *
 * 
 */

#ifndef _OrgApacheSlingCaconfigManagementImplConfigurationManagementSettiProperties_H_
#define _OrgApacheSlingCaconfigManagementImplConfigurationManagementSettiProperties_H_


#include <string>
#include "ConfigNodePropertyArray.h"
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

class OrgApacheSlingCaconfigManagementImplConfigurationManagementSettiProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	OrgApacheSlingCaconfigManagementImplConfigurationManagementSettiProperties();
	OrgApacheSlingCaconfigManagementImplConfigurationManagementSettiProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OrgApacheSlingCaconfigManagementImplConfigurationManagementSettiProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getIgnorePropertyNameRegex();

	/*! \brief Set 
	 */
	void setIgnorePropertyNameRegex(ConfigNodePropertyArray  ignorePropertyNameRegex);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getConfigCollectionPropertiesResourceNames();

	/*! \brief Set 
	 */
	void setConfigCollectionPropertiesResourceNames(ConfigNodePropertyArray  configCollectionPropertiesResourceNames);

private:
	ConfigNodePropertyArray ignorePropertyNameRegex;
	ConfigNodePropertyArray configCollectionPropertiesResourceNames;
	void __init();
	void __cleanup();

};
}
}

#endif /* _OrgApacheSlingCaconfigManagementImplConfigurationManagementSettiProperties_H_ */
