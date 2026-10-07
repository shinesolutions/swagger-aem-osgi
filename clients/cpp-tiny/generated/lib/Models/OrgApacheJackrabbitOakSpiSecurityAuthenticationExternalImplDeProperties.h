
/*
 * OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties_H_
#define TINY_CPP_CLIENT_OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties_H_


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

class OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties{
public:

    /*! \brief Constructor.
	 */
    OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties();
    OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getHandlername();

	/*! \brief Set 
	 */
	void setHandlername(ConfigNodePropertyString handlername);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getUserexpirationTime();

	/*! \brief Set 
	 */
	void setUserexpirationTime(ConfigNodePropertyString userexpirationTime);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getUserautoMembership();

	/*! \brief Set 
	 */
	void setUserautoMembership(ConfigNodePropertyArray userautoMembership);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getUserpropertyMapping();

	/*! \brief Set 
	 */
	void setUserpropertyMapping(ConfigNodePropertyArray userpropertyMapping);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getUserpathPrefix();

	/*! \brief Set 
	 */
	void setUserpathPrefix(ConfigNodePropertyString userpathPrefix);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getUsermembershipExpTime();

	/*! \brief Set 
	 */
	void setUsermembershipExpTime(ConfigNodePropertyString usermembershipExpTime);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getUsermembershipNestingDepth();

	/*! \brief Set 
	 */
	void setUsermembershipNestingDepth(ConfigNodePropertyInteger usermembershipNestingDepth);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getUserdynamicMembership();

	/*! \brief Set 
	 */
	void setUserdynamicMembership(ConfigNodePropertyBoolean userdynamicMembership);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getUserdisableMissing();

	/*! \brief Set 
	 */
	void setUserdisableMissing(ConfigNodePropertyBoolean userdisableMissing);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getGroupexpirationTime();

	/*! \brief Set 
	 */
	void setGroupexpirationTime(ConfigNodePropertyString groupexpirationTime);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getGroupautoMembership();

	/*! \brief Set 
	 */
	void setGroupautoMembership(ConfigNodePropertyArray groupautoMembership);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getGrouppropertyMapping();

	/*! \brief Set 
	 */
	void setGrouppropertyMapping(ConfigNodePropertyArray grouppropertyMapping);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getGrouppathPrefix();

	/*! \brief Set 
	 */
	void setGrouppathPrefix(ConfigNodePropertyString grouppathPrefix);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getEnableRFC7613UsercaseMappedProfile();

	/*! \brief Set 
	 */
	void setEnableRFC7613UsercaseMappedProfile(ConfigNodePropertyBoolean enableRFC7613UsercaseMappedProfile);


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
};
}

#endif /* TINY_CPP_CLIENT_OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties_H_ */
