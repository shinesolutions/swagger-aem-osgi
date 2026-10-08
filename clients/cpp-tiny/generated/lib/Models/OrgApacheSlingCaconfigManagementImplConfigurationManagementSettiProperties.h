
/*
 * OrgApacheSlingCaconfigManagementImplConfigurationManagementSettiProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_OrgApacheSlingCaconfigManagementImplConfigurationManagementSettiProperties_H_
#define TINY_CPP_CLIENT_OrgApacheSlingCaconfigManagementImplConfigurationManagementSettiProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyArray.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class OrgApacheSlingCaconfigManagementImplConfigurationManagementSettiProperties{
public:

    /*! \brief Constructor.
	 */
    OrgApacheSlingCaconfigManagementImplConfigurationManagementSettiProperties();
    OrgApacheSlingCaconfigManagementImplConfigurationManagementSettiProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OrgApacheSlingCaconfigManagementImplConfigurationManagementSettiProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getIgnorePropertyNameRegex();

	/*! \brief Set 
	 */
	void setIgnorePropertyNameRegex(ConfigNodePropertyArray ignorePropertyNameRegex);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getConfigCollectionPropertiesResourceNames();

	/*! \brief Set 
	 */
	void setConfigCollectionPropertiesResourceNames(ConfigNodePropertyArray configCollectionPropertiesResourceNames);


    private:
    ConfigNodePropertyArray ignorePropertyNameRegex;
    ConfigNodePropertyArray configCollectionPropertiesResourceNames;
};
}

#endif /* TINY_CPP_CLIENT_OrgApacheSlingCaconfigManagementImplConfigurationManagementSettiProperties_H_ */
