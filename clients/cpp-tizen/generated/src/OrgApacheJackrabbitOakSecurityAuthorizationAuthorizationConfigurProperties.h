/*
 * OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurProperties.h
 *
 * 
 */

#ifndef _OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurProperties_H_
#define _OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurProperties_H_


#include <string>
#include "ConfigNodePropertyArray.h"
#include "ConfigNodePropertyDropDown.h"
#include "ConfigNodePropertyInteger.h"
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

class OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurProperties();
	OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyDropDown getPermissionsJr2();

	/*! \brief Set 
	 */
	void setPermissionsJr2(ConfigNodePropertyDropDown  permissionsJr2);
	/*! \brief Get 
	 */
	ConfigNodePropertyDropDown getImportBehavior();

	/*! \brief Set 
	 */
	void setImportBehavior(ConfigNodePropertyDropDown  importBehavior);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getReadPaths();

	/*! \brief Set 
	 */
	void setReadPaths(ConfigNodePropertyArray  readPaths);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getAdministrativePrincipals();

	/*! \brief Set 
	 */
	void setAdministrativePrincipals(ConfigNodePropertyArray  administrativePrincipals);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getConfigurationRanking();

	/*! \brief Set 
	 */
	void setConfigurationRanking(ConfigNodePropertyInteger  configurationRanking);

private:
	ConfigNodePropertyDropDown permissionsJr2;
	ConfigNodePropertyDropDown importBehavior;
	ConfigNodePropertyArray readPaths;
	ConfigNodePropertyArray administrativePrincipals;
	ConfigNodePropertyInteger configurationRanking;
	void __init();
	void __cleanup();

};
}
}

#endif /* _OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurProperties_H_ */
