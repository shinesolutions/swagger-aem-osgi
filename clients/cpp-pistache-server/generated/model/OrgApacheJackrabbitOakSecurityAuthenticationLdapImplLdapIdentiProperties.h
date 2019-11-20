/**
* Adobe Experience Manager OSGI config (AEM) API
* Swagger AEM OSGI is an OpenAPI specification for Adobe Experience Manager (AEM) OSGI Configurations API
*
* OpenAPI spec version: 1.0.0-pre.0
* Contact: opensource@shinesolutions.com
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
/*
 * OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties.h
 *
 * 
 */

#ifndef OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties_H_
#define OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties_H_


#include "ModelBase.h"

#include "ConfigNodePropertyBoolean.h"
#include "ConfigNodePropertyInteger.h"
#include "ConfigNodePropertyArray.h"
#include "ConfigNodePropertyString.h"

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// 
/// </summary>
class  OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties
    : public ModelBase
{
public:
    OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties();
    virtual ~OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    nlohmann::json toJson() const override;
    void fromJson(nlohmann::json& json) override;

    /////////////////////////////////////////////
    /// OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties members

    /// <summary>
    /// 
    /// </summary>
    ConfigNodePropertyString getProviderName() const;
    void setProviderName(ConfigNodePropertyString const& value);
    bool providerNameIsSet() const;
    void unsetProvider_name();
    /// <summary>
    /// 
    /// </summary>
    ConfigNodePropertyString getHostName() const;
    void setHostName(ConfigNodePropertyString const& value);
    bool hostNameIsSet() const;
    void unsetHost_name();
    /// <summary>
    /// 
    /// </summary>
    ConfigNodePropertyInteger getHostPort() const;
    void setHostPort(ConfigNodePropertyInteger const& value);
    bool hostPortIsSet() const;
    void unsetHost_port();
    /// <summary>
    /// 
    /// </summary>
    ConfigNodePropertyBoolean getHostSsl() const;
    void setHostSsl(ConfigNodePropertyBoolean const& value);
    bool hostSslIsSet() const;
    void unsetHost_ssl();
    /// <summary>
    /// 
    /// </summary>
    ConfigNodePropertyBoolean getHostTls() const;
    void setHostTls(ConfigNodePropertyBoolean const& value);
    bool hostTlsIsSet() const;
    void unsetHost_tls();
    /// <summary>
    /// 
    /// </summary>
    ConfigNodePropertyBoolean getHostNoCertCheck() const;
    void setHostNoCertCheck(ConfigNodePropertyBoolean const& value);
    bool hostNoCertCheckIsSet() const;
    void unsetHost_noCertCheck();
    /// <summary>
    /// 
    /// </summary>
    ConfigNodePropertyString getBindDn() const;
    void setBindDn(ConfigNodePropertyString const& value);
    bool bindDnIsSet() const;
    void unsetBind_dn();
    /// <summary>
    /// 
    /// </summary>
    ConfigNodePropertyString getBindPassword() const;
    void setBindPassword(ConfigNodePropertyString const& value);
    bool bindPasswordIsSet() const;
    void unsetBind_password();
    /// <summary>
    /// 
    /// </summary>
    ConfigNodePropertyString getSearchTimeout() const;
    void setSearchTimeout(ConfigNodePropertyString const& value);
    bool searchTimeoutIsSet() const;
    void unsetSearchTimeout();
    /// <summary>
    /// 
    /// </summary>
    ConfigNodePropertyInteger getAdminPoolMaxActive() const;
    void setAdminPoolMaxActive(ConfigNodePropertyInteger const& value);
    bool adminPoolMaxActiveIsSet() const;
    void unsetAdminPool_maxActive();
    /// <summary>
    /// 
    /// </summary>
    ConfigNodePropertyBoolean getAdminPoolLookupOnValidate() const;
    void setAdminPoolLookupOnValidate(ConfigNodePropertyBoolean const& value);
    bool adminPoolLookupOnValidateIsSet() const;
    void unsetAdminPool_lookupOnValidate();
    /// <summary>
    /// 
    /// </summary>
    ConfigNodePropertyInteger getUserPoolMaxActive() const;
    void setUserPoolMaxActive(ConfigNodePropertyInteger const& value);
    bool userPoolMaxActiveIsSet() const;
    void unsetUserPool_maxActive();
    /// <summary>
    /// 
    /// </summary>
    ConfigNodePropertyBoolean getUserPoolLookupOnValidate() const;
    void setUserPoolLookupOnValidate(ConfigNodePropertyBoolean const& value);
    bool userPoolLookupOnValidateIsSet() const;
    void unsetUserPool_lookupOnValidate();
    /// <summary>
    /// 
    /// </summary>
    ConfigNodePropertyString getUserBaseDN() const;
    void setUserBaseDN(ConfigNodePropertyString const& value);
    bool userBaseDNIsSet() const;
    void unsetUser_baseDN();
    /// <summary>
    /// 
    /// </summary>
    ConfigNodePropertyArray getUserObjectclass() const;
    void setUserObjectclass(ConfigNodePropertyArray const& value);
    bool userObjectclassIsSet() const;
    void unsetUser_objectclass();
    /// <summary>
    /// 
    /// </summary>
    ConfigNodePropertyString getUserIdAttribute() const;
    void setUserIdAttribute(ConfigNodePropertyString const& value);
    bool userIdAttributeIsSet() const;
    void unsetUser_idAttribute();
    /// <summary>
    /// 
    /// </summary>
    ConfigNodePropertyString getUserExtraFilter() const;
    void setUserExtraFilter(ConfigNodePropertyString const& value);
    bool userExtraFilterIsSet() const;
    void unsetUser_extraFilter();
    /// <summary>
    /// 
    /// </summary>
    ConfigNodePropertyBoolean getUserMakeDnPath() const;
    void setUserMakeDnPath(ConfigNodePropertyBoolean const& value);
    bool userMakeDnPathIsSet() const;
    void unsetUser_makeDnPath();
    /// <summary>
    /// 
    /// </summary>
    ConfigNodePropertyString getGroupBaseDN() const;
    void setGroupBaseDN(ConfigNodePropertyString const& value);
    bool groupBaseDNIsSet() const;
    void unsetGroup_baseDN();
    /// <summary>
    /// 
    /// </summary>
    ConfigNodePropertyArray getGroupObjectclass() const;
    void setGroupObjectclass(ConfigNodePropertyArray const& value);
    bool groupObjectclassIsSet() const;
    void unsetGroup_objectclass();
    /// <summary>
    /// 
    /// </summary>
    ConfigNodePropertyString getGroupNameAttribute() const;
    void setGroupNameAttribute(ConfigNodePropertyString const& value);
    bool groupNameAttributeIsSet() const;
    void unsetGroup_nameAttribute();
    /// <summary>
    /// 
    /// </summary>
    ConfigNodePropertyString getGroupExtraFilter() const;
    void setGroupExtraFilter(ConfigNodePropertyString const& value);
    bool groupExtraFilterIsSet() const;
    void unsetGroup_extraFilter();
    /// <summary>
    /// 
    /// </summary>
    ConfigNodePropertyBoolean getGroupMakeDnPath() const;
    void setGroupMakeDnPath(ConfigNodePropertyBoolean const& value);
    bool groupMakeDnPathIsSet() const;
    void unsetGroup_makeDnPath();
    /// <summary>
    /// 
    /// </summary>
    ConfigNodePropertyString getGroupMemberAttribute() const;
    void setGroupMemberAttribute(ConfigNodePropertyString const& value);
    bool groupMemberAttributeIsSet() const;
    void unsetGroup_memberAttribute();
    /// <summary>
    /// 
    /// </summary>
    ConfigNodePropertyBoolean getUseUidForExtId() const;
    void setUseUidForExtId(ConfigNodePropertyBoolean const& value);
    bool useUidForExtIdIsSet() const;
    void unsetUseUidForExtId();
    /// <summary>
    /// 
    /// </summary>
    ConfigNodePropertyArray getCustomattributes() const;
    void setCustomattributes(ConfigNodePropertyArray const& value);
    bool customattributesIsSet() const;
    void unsetCustomattributes();

protected:
    ConfigNodePropertyString m_Provider_name;
    bool m_Provider_nameIsSet;
    ConfigNodePropertyString m_Host_name;
    bool m_Host_nameIsSet;
    ConfigNodePropertyInteger m_Host_port;
    bool m_Host_portIsSet;
    ConfigNodePropertyBoolean m_Host_ssl;
    bool m_Host_sslIsSet;
    ConfigNodePropertyBoolean m_Host_tls;
    bool m_Host_tlsIsSet;
    ConfigNodePropertyBoolean m_Host_noCertCheck;
    bool m_Host_noCertCheckIsSet;
    ConfigNodePropertyString m_Bind_dn;
    bool m_Bind_dnIsSet;
    ConfigNodePropertyString m_Bind_password;
    bool m_Bind_passwordIsSet;
    ConfigNodePropertyString m_SearchTimeout;
    bool m_SearchTimeoutIsSet;
    ConfigNodePropertyInteger m_AdminPool_maxActive;
    bool m_AdminPool_maxActiveIsSet;
    ConfigNodePropertyBoolean m_AdminPool_lookupOnValidate;
    bool m_AdminPool_lookupOnValidateIsSet;
    ConfigNodePropertyInteger m_UserPool_maxActive;
    bool m_UserPool_maxActiveIsSet;
    ConfigNodePropertyBoolean m_UserPool_lookupOnValidate;
    bool m_UserPool_lookupOnValidateIsSet;
    ConfigNodePropertyString m_User_baseDN;
    bool m_User_baseDNIsSet;
    ConfigNodePropertyArray m_User_objectclass;
    bool m_User_objectclassIsSet;
    ConfigNodePropertyString m_User_idAttribute;
    bool m_User_idAttributeIsSet;
    ConfigNodePropertyString m_User_extraFilter;
    bool m_User_extraFilterIsSet;
    ConfigNodePropertyBoolean m_User_makeDnPath;
    bool m_User_makeDnPathIsSet;
    ConfigNodePropertyString m_Group_baseDN;
    bool m_Group_baseDNIsSet;
    ConfigNodePropertyArray m_Group_objectclass;
    bool m_Group_objectclassIsSet;
    ConfigNodePropertyString m_Group_nameAttribute;
    bool m_Group_nameAttributeIsSet;
    ConfigNodePropertyString m_Group_extraFilter;
    bool m_Group_extraFilterIsSet;
    ConfigNodePropertyBoolean m_Group_makeDnPath;
    bool m_Group_makeDnPathIsSet;
    ConfigNodePropertyString m_Group_memberAttribute;
    bool m_Group_memberAttributeIsSet;
    ConfigNodePropertyBoolean m_UseUidForExtId;
    bool m_UseUidForExtIdIsSet;
    ConfigNodePropertyArray m_Customattributes;
    bool m_CustomattributesIsSet;
};

}
}
}
}

#endif /* OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties_H_ */