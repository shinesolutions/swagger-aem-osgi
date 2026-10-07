
/*
 * OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurProperties_H_
#define TINY_CPP_CLIENT_OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyArray.h"
#include "ConfigNodePropertyDropDown.h"
#include "ConfigNodePropertyInteger.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurProperties{
public:

    /*! \brief Constructor.
	 */
    OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurProperties();
    OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyDropDown getPermissionsJr2();

	/*! \brief Set 
	 */
	void setPermissionsJr2(ConfigNodePropertyDropDown permissionsJr2);
	/*! \brief Get 
	 */
	ConfigNodePropertyDropDown getImportBehavior();

	/*! \brief Set 
	 */
	void setImportBehavior(ConfigNodePropertyDropDown importBehavior);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getReadPaths();

	/*! \brief Set 
	 */
	void setReadPaths(ConfigNodePropertyArray readPaths);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getAdministrativePrincipals();

	/*! \brief Set 
	 */
	void setAdministrativePrincipals(ConfigNodePropertyArray administrativePrincipals);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getConfigurationRanking();

	/*! \brief Set 
	 */
	void setConfigurationRanking(ConfigNodePropertyInteger configurationRanking);


    private:
    ConfigNodePropertyDropDown permissionsJr2;
    ConfigNodePropertyDropDown importBehavior;
    ConfigNodePropertyArray readPaths;
    ConfigNodePropertyArray administrativePrincipals;
    ConfigNodePropertyInteger configurationRanking;
};
}

#endif /* TINY_CPP_CLIENT_OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurProperties_H_ */
