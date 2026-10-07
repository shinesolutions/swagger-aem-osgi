
/*
 * OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourProperties_H_
#define TINY_CPP_CLIENT_OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyArray.h"
#include "ConfigNodePropertyBoolean.h"
#include "ConfigNodePropertyString.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourProperties{
public:

    /*! \brief Constructor.
	 */
    OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourProperties();
    OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getEnabled();

	/*! \brief Set 
	 */
	void setEnabled(ConfigNodePropertyBoolean enabled);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getConfigPath();

	/*! \brief Set 
	 */
	void setConfigPath(ConfigNodePropertyString configPath);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getFallbackPaths();

	/*! \brief Set 
	 */
	void setFallbackPaths(ConfigNodePropertyArray fallbackPaths);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getConfigCollectionInheritancePropertyNames();

	/*! \brief Set 
	 */
	void setConfigCollectionInheritancePropertyNames(ConfigNodePropertyArray configCollectionInheritancePropertyNames);


    private:
    ConfigNodePropertyBoolean enabled;
    ConfigNodePropertyString configPath;
    ConfigNodePropertyArray fallbackPaths;
    ConfigNodePropertyArray configCollectionInheritancePropertyNames;
};
}

#endif /* TINY_CPP_CLIENT_OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourProperties_H_ */
