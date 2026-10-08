
/*
 * OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties_H_
#define TINY_CPP_CLIENT_OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties_H_


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

class OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties{
public:

    /*! \brief Constructor.
	 */
    OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties();
    OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getProvidername();

	/*! \brief Set 
	 */
	void setProvidername(ConfigNodePropertyString providername);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getHostname();

	/*! \brief Set 
	 */
	void setHostname(ConfigNodePropertyString hostname);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getHostport();

	/*! \brief Set 
	 */
	void setHostport(ConfigNodePropertyInteger hostport);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getHostssl();

	/*! \brief Set 
	 */
	void setHostssl(ConfigNodePropertyBoolean hostssl);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getHosttls();

	/*! \brief Set 
	 */
	void setHosttls(ConfigNodePropertyBoolean hosttls);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getHostnoCertCheck();

	/*! \brief Set 
	 */
	void setHostnoCertCheck(ConfigNodePropertyBoolean hostnoCertCheck);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getBinddn();

	/*! \brief Set 
	 */
	void setBinddn(ConfigNodePropertyString binddn);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getBindpassword();

	/*! \brief Set 
	 */
	void setBindpassword(ConfigNodePropertyString bindpassword);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getSearchTimeout();

	/*! \brief Set 
	 */
	void setSearchTimeout(ConfigNodePropertyString searchTimeout);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getAdminPoolmaxActive();

	/*! \brief Set 
	 */
	void setAdminPoolmaxActive(ConfigNodePropertyInteger adminPoolmaxActive);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getAdminPoollookupOnValidate();

	/*! \brief Set 
	 */
	void setAdminPoollookupOnValidate(ConfigNodePropertyBoolean adminPoollookupOnValidate);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getUserPoolmaxActive();

	/*! \brief Set 
	 */
	void setUserPoolmaxActive(ConfigNodePropertyInteger userPoolmaxActive);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getUserPoollookupOnValidate();

	/*! \brief Set 
	 */
	void setUserPoollookupOnValidate(ConfigNodePropertyBoolean userPoollookupOnValidate);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getUserbaseDN();

	/*! \brief Set 
	 */
	void setUserbaseDN(ConfigNodePropertyString userbaseDN);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getUserobjectclass();

	/*! \brief Set 
	 */
	void setUserobjectclass(ConfigNodePropertyArray userobjectclass);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getUseridAttribute();

	/*! \brief Set 
	 */
	void setUseridAttribute(ConfigNodePropertyString useridAttribute);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getUserextraFilter();

	/*! \brief Set 
	 */
	void setUserextraFilter(ConfigNodePropertyString userextraFilter);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getUsermakeDnPath();

	/*! \brief Set 
	 */
	void setUsermakeDnPath(ConfigNodePropertyBoolean usermakeDnPath);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getGroupbaseDN();

	/*! \brief Set 
	 */
	void setGroupbaseDN(ConfigNodePropertyString groupbaseDN);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getGroupobjectclass();

	/*! \brief Set 
	 */
	void setGroupobjectclass(ConfigNodePropertyArray groupobjectclass);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getGroupnameAttribute();

	/*! \brief Set 
	 */
	void setGroupnameAttribute(ConfigNodePropertyString groupnameAttribute);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getGroupextraFilter();

	/*! \brief Set 
	 */
	void setGroupextraFilter(ConfigNodePropertyString groupextraFilter);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getGroupmakeDnPath();

	/*! \brief Set 
	 */
	void setGroupmakeDnPath(ConfigNodePropertyBoolean groupmakeDnPath);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getGroupmemberAttribute();

	/*! \brief Set 
	 */
	void setGroupmemberAttribute(ConfigNodePropertyString groupmemberAttribute);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getUseUidForExtId();

	/*! \brief Set 
	 */
	void setUseUidForExtId(ConfigNodePropertyBoolean useUidForExtId);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getCustomattributes();

	/*! \brief Set 
	 */
	void setCustomattributes(ConfigNodePropertyArray customattributes);


    private:
    ConfigNodePropertyString providername;
    ConfigNodePropertyString hostname;
    ConfigNodePropertyInteger hostport;
    ConfigNodePropertyBoolean hostssl;
    ConfigNodePropertyBoolean hosttls;
    ConfigNodePropertyBoolean hostnoCertCheck;
    ConfigNodePropertyString binddn;
    ConfigNodePropertyString bindpassword;
    ConfigNodePropertyString searchTimeout;
    ConfigNodePropertyInteger adminPoolmaxActive;
    ConfigNodePropertyBoolean adminPoollookupOnValidate;
    ConfigNodePropertyInteger userPoolmaxActive;
    ConfigNodePropertyBoolean userPoollookupOnValidate;
    ConfigNodePropertyString userbaseDN;
    ConfigNodePropertyArray userobjectclass;
    ConfigNodePropertyString useridAttribute;
    ConfigNodePropertyString userextraFilter;
    ConfigNodePropertyBoolean usermakeDnPath;
    ConfigNodePropertyString groupbaseDN;
    ConfigNodePropertyArray groupobjectclass;
    ConfigNodePropertyString groupnameAttribute;
    ConfigNodePropertyString groupextraFilter;
    ConfigNodePropertyBoolean groupmakeDnPath;
    ConfigNodePropertyString groupmemberAttribute;
    ConfigNodePropertyBoolean useUidForExtId;
    ConfigNodePropertyArray customattributes;
};
}

#endif /* TINY_CPP_CLIENT_OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties_H_ */
