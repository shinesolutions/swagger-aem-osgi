/*
 * OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableProperties.h
 *
 * 
 */

#ifndef _OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableProperties_H_
#define _OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableProperties_H_


#include <string>
#include "ConfigNodePropertyArray.h"
#include "ConfigNodePropertyDropDown.h"
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

class OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableProperties();
	OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyDropDown getEnabledActions();

	/*! \brief Set 
	 */
	void setEnabledActions(ConfigNodePropertyDropDown  enabledActions);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getUserPrivilegeNames();

	/*! \brief Set 
	 */
	void setUserPrivilegeNames(ConfigNodePropertyArray  userPrivilegeNames);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getGroupPrivilegeNames();

	/*! \brief Set 
	 */
	void setGroupPrivilegeNames(ConfigNodePropertyArray  groupPrivilegeNames);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getConstraint();

	/*! \brief Set 
	 */
	void setConstraint(ConfigNodePropertyString  constraint);

private:
	ConfigNodePropertyDropDown enabledActions;
	ConfigNodePropertyArray userPrivilegeNames;
	ConfigNodePropertyArray groupPrivilegeNames;
	ConfigNodePropertyString constraint;
	void __init();
	void __cleanup();

};
}
}

#endif /* _OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableProperties_H_ */
