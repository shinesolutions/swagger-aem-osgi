/*
 * OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties.h
 *
 * 
 */

#ifndef _OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties_H_
#define _OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties_H_


#include <string>
#include "ConfigNodePropertyArray.h"
#include "ConfigNodePropertyBoolean.h"
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

class OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties();
	OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getHandlername();

	/*! \brief Set 
	 */
	void setHandlername(ConfigNodePropertyString  handlername);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getUserexpirationTime();

	/*! \brief Set 
	 */
	void setUserexpirationTime(ConfigNodePropertyString  userexpirationTime);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getUserautoMembership();

	/*! \brief Set 
	 */
	void setUserautoMembership(ConfigNodePropertyArray  userautoMembership);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getUserpropertyMapping();

	/*! \brief Set 
	 */
	void setUserpropertyMapping(ConfigNodePropertyArray  userpropertyMapping);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getUserpathPrefix();

	/*! \brief Set 
	 */
	void setUserpathPrefix(ConfigNodePropertyString  userpathPrefix);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getUsermembershipExpTime();

	/*! \brief Set 
	 */
	void setUsermembershipExpTime(ConfigNodePropertyString  usermembershipExpTime);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getUsermembershipNestingDepth();

	/*! \brief Set 
	 */
	void setUsermembershipNestingDepth(ConfigNodePropertyInteger  usermembershipNestingDepth);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getUserdynamicMembership();

	/*! \brief Set 
	 */
	void setUserdynamicMembership(ConfigNodePropertyBoolean  userdynamicMembership);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getUserdisableMissing();

	/*! \brief Set 
	 */
	void setUserdisableMissing(ConfigNodePropertyBoolean  userdisableMissing);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getGroupexpirationTime();

	/*! \brief Set 
	 */
	void setGroupexpirationTime(ConfigNodePropertyString  groupexpirationTime);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getGroupautoMembership();

	/*! \brief Set 
	 */
	void setGroupautoMembership(ConfigNodePropertyArray  groupautoMembership);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getGrouppropertyMapping();

	/*! \brief Set 
	 */
	void setGrouppropertyMapping(ConfigNodePropertyArray  grouppropertyMapping);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getGrouppathPrefix();

	/*! \brief Set 
	 */
	void setGrouppathPrefix(ConfigNodePropertyString  grouppathPrefix);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getEnableRFC7613UsercaseMappedProfile();

	/*! \brief Set 
	 */
	void setEnableRFC7613UsercaseMappedProfile(ConfigNodePropertyBoolean  enableRFC7613UsercaseMappedProfile);

private:
	ConfigNodePropertyString handlername;
	ConfigNodePropertyString userexpirationTime;
	ConfigNodePropertyArray userautoMembership;
	ConfigNodePropertyArray userpropertyMapping;
	ConfigNodePropertyString userpathPrefix;
	ConfigNodePropertyString usermembershipExpTime;
	ConfigNodePropertyInteger usermembershipNestingDepth;
	ConfigNodePropertyBoolean userdynamicMembership;
	ConfigNodePropertyBoolean userdisableMissing;
	ConfigNodePropertyString groupexpirationTime;
	ConfigNodePropertyArray groupautoMembership;
	ConfigNodePropertyArray grouppropertyMapping;
	ConfigNodePropertyString grouppathPrefix;
	ConfigNodePropertyBoolean enableRFC7613UsercaseMappedProfile;
	void __init();
	void __cleanup();

};
}
}

#endif /* _OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties_H_ */
