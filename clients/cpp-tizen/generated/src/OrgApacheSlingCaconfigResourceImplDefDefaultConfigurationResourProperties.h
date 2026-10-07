/*
 * OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourProperties.h
 *
 * 
 */

#ifndef _OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourProperties_H_
#define _OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourProperties_H_


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

class OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourProperties();
	OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getEnabled();

	/*! \brief Set 
	 */
	void setEnabled(ConfigNodePropertyBoolean  enabled);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getConfigPath();

	/*! \brief Set 
	 */
	void setConfigPath(ConfigNodePropertyString  configPath);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getFallbackPaths();

	/*! \brief Set 
	 */
	void setFallbackPaths(ConfigNodePropertyArray  fallbackPaths);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getConfigCollectionInheritancePropertyNames();

	/*! \brief Set 
	 */
	void setConfigCollectionInheritancePropertyNames(ConfigNodePropertyArray  configCollectionInheritancePropertyNames);

private:
	ConfigNodePropertyBoolean enabled;
	ConfigNodePropertyString configPath;
	ConfigNodePropertyArray fallbackPaths;
	ConfigNodePropertyArray configCollectionInheritancePropertyNames;
	void __init();
	void __cleanup();

};
}
}

#endif /* _OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourProperties_H_ */
