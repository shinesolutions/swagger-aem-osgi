/*
 * OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties.h
 *
 * 
 */

#ifndef _OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties_H_
#define _OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties_H_


#include <string>
#include "ConfigNodePropertyBoolean.h"
#include "ConfigNodePropertyDropDown.h"
#include "ConfigNodePropertyInteger.h"
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

class OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties();
	OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getUsersPath();

	/*! \brief Set 
	 */
	void setUsersPath(ConfigNodePropertyString  usersPath);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getGroupsPath();

	/*! \brief Set 
	 */
	void setGroupsPath(ConfigNodePropertyString  groupsPath);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getSystemRelativePath();

	/*! \brief Set 
	 */
	void setSystemRelativePath(ConfigNodePropertyString  systemRelativePath);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getDefaultDepth();

	/*! \brief Set 
	 */
	void setDefaultDepth(ConfigNodePropertyInteger  defaultDepth);
	/*! \brief Get 
	 */
	ConfigNodePropertyDropDown getImportBehavior();

	/*! \brief Set 
	 */
	void setImportBehavior(ConfigNodePropertyDropDown  importBehavior);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getPasswordHashAlgorithm();

	/*! \brief Set 
	 */
	void setPasswordHashAlgorithm(ConfigNodePropertyString  passwordHashAlgorithm);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getPasswordHashIterations();

	/*! \brief Set 
	 */
	void setPasswordHashIterations(ConfigNodePropertyInteger  passwordHashIterations);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getPasswordSaltSize();

	/*! \brief Set 
	 */
	void setPasswordSaltSize(ConfigNodePropertyInteger  passwordSaltSize);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getOmitAdminPw();

	/*! \brief Set 
	 */
	void setOmitAdminPw(ConfigNodePropertyBoolean  omitAdminPw);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getSupportAutoSave();

	/*! \brief Set 
	 */
	void setSupportAutoSave(ConfigNodePropertyBoolean  supportAutoSave);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getPasswordMaxAge();

	/*! \brief Set 
	 */
	void setPasswordMaxAge(ConfigNodePropertyInteger  passwordMaxAge);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getInitialPasswordChange();

	/*! \brief Set 
	 */
	void setInitialPasswordChange(ConfigNodePropertyBoolean  initialPasswordChange);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getPasswordHistorySize();

	/*! \brief Set 
	 */
	void setPasswordHistorySize(ConfigNodePropertyInteger  passwordHistorySize);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getPasswordExpiryForAdmin();

	/*! \brief Set 
	 */
	void setPasswordExpiryForAdmin(ConfigNodePropertyBoolean  passwordExpiryForAdmin);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getCacheExpiration();

	/*! \brief Set 
	 */
	void setCacheExpiration(ConfigNodePropertyInteger  cacheExpiration);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getEnableRFC7613UsercaseMappedProfile();

	/*! \brief Set 
	 */
	void setEnableRFC7613UsercaseMappedProfile(ConfigNodePropertyBoolean  enableRFC7613UsercaseMappedProfile);

private:
	ConfigNodePropertyString usersPath;
	ConfigNodePropertyString groupsPath;
	ConfigNodePropertyString systemRelativePath;
	ConfigNodePropertyInteger defaultDepth;
	ConfigNodePropertyDropDown importBehavior;
	ConfigNodePropertyString passwordHashAlgorithm;
	ConfigNodePropertyInteger passwordHashIterations;
	ConfigNodePropertyInteger passwordSaltSize;
	ConfigNodePropertyBoolean omitAdminPw;
	ConfigNodePropertyBoolean supportAutoSave;
	ConfigNodePropertyInteger passwordMaxAge;
	ConfigNodePropertyBoolean initialPasswordChange;
	ConfigNodePropertyInteger passwordHistorySize;
	ConfigNodePropertyBoolean passwordExpiryForAdmin;
	ConfigNodePropertyInteger cacheExpiration;
	ConfigNodePropertyBoolean enableRFC7613UsercaseMappedProfile;
	void __init();
	void __cleanup();

};
}
}

#endif /* _OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties_H_ */
