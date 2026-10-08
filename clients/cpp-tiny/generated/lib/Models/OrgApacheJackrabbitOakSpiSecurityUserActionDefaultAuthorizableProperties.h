
/*
 * OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableProperties_H_
#define TINY_CPP_CLIENT_OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyArray.h"
#include "ConfigNodePropertyDropDown.h"
#include "ConfigNodePropertyString.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableProperties{
public:

    /*! \brief Constructor.
	 */
    OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableProperties();
    OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyDropDown getEnabledActions();

	/*! \brief Set 
	 */
	void setEnabledActions(ConfigNodePropertyDropDown enabledActions);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getUserPrivilegeNames();

	/*! \brief Set 
	 */
	void setUserPrivilegeNames(ConfigNodePropertyArray userPrivilegeNames);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getGroupPrivilegeNames();

	/*! \brief Set 
	 */
	void setGroupPrivilegeNames(ConfigNodePropertyArray groupPrivilegeNames);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getConstraint();

	/*! \brief Set 
	 */
	void setConstraint(ConfigNodePropertyString constraint);


    private:
    ConfigNodePropertyDropDown enabledActions;
    ConfigNodePropertyArray userPrivilegeNames;
    ConfigNodePropertyArray groupPrivilegeNames;
    ConfigNodePropertyString constraint;
};
}

#endif /* TINY_CPP_CLIENT_OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableProperties_H_ */
