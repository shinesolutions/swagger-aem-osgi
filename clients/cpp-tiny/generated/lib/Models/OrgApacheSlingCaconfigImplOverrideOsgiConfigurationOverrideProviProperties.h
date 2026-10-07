
/*
 * OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviProperties_H_
#define TINY_CPP_CLIENT_OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyArray.h"
#include "ConfigNodePropertyBoolean.h"
#include "ConfigNodePropertyInteger.h"
#include "ConfigNodePropertyString.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviProperties{
public:

    /*! \brief Constructor.
	 */
    OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviProperties();
    OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getDescription();

	/*! \brief Set 
	 */
	void setDescription(ConfigNodePropertyString description);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getOverrides();

	/*! \brief Set 
	 */
	void setOverrides(ConfigNodePropertyArray overrides);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getEnabled();

	/*! \brief Set 
	 */
	void setEnabled(ConfigNodePropertyBoolean enabled);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getServiceranking();

	/*! \brief Set 
	 */
	void setServiceranking(ConfigNodePropertyInteger serviceranking);


    private:
    ConfigNodePropertyString description;
    ConfigNodePropertyArray overrides;
    ConfigNodePropertyBoolean enabled;
    ConfigNodePropertyInteger serviceranking;
};
}

#endif /* TINY_CPP_CLIENT_OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviProperties_H_ */
