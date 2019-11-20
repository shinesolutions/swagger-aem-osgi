/**
 * Adobe Experience Manager OSGI config (AEM) API
 * Swagger AEM OSGI is an OpenAPI specification for Adobe Experience Manager (AEM) OSGI Configurations API
 *
 * OpenAPI spec version: 1.0.0-pre.0
 * Contact: opensource@shinesolutions.com
 *
 * NOTE: This class is auto generated by OpenAPI-Generator 3.2.1-SNAPSHOT.
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



#include "ConfigNodePropertyBoolean.h"
#include "ConfigNodePropertyInteger.h"
#include "ConfigNodePropertyArray.h"
#include "ConfigNodePropertyString.h"
#include <memory>

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// 
/// </summary>
class  OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties
{
public:
    OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties();
    virtual ~OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties();
    
    std::string toJsonString();
    void fromJsonString(std::string const& jsonString);

    /////////////////////////////////////////////
    /// OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties members
    
    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<ConfigNodePropertyString> getProviderName() const;
    void setProviderName(std::shared_ptr<ConfigNodePropertyString> value);
    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<ConfigNodePropertyString> getHostName() const;
    void setHostName(std::shared_ptr<ConfigNodePropertyString> value);
    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<ConfigNodePropertyInteger> getHostPort() const;
    void setHostPort(std::shared_ptr<ConfigNodePropertyInteger> value);
    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<ConfigNodePropertyBoolean> getHostSsl() const;
    void setHostSsl(std::shared_ptr<ConfigNodePropertyBoolean> value);
    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<ConfigNodePropertyBoolean> getHostTls() const;
    void setHostTls(std::shared_ptr<ConfigNodePropertyBoolean> value);
    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<ConfigNodePropertyBoolean> getHostNoCertCheck() const;
    void setHostNoCertCheck(std::shared_ptr<ConfigNodePropertyBoolean> value);
    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<ConfigNodePropertyString> getBindDn() const;
    void setBindDn(std::shared_ptr<ConfigNodePropertyString> value);
    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<ConfigNodePropertyString> getBindPassword() const;
    void setBindPassword(std::shared_ptr<ConfigNodePropertyString> value);
    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<ConfigNodePropertyString> getSearchTimeout() const;
    void setSearchTimeout(std::shared_ptr<ConfigNodePropertyString> value);
    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<ConfigNodePropertyInteger> getAdminPoolMaxActive() const;
    void setAdminPoolMaxActive(std::shared_ptr<ConfigNodePropertyInteger> value);
    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<ConfigNodePropertyBoolean> getAdminPoolLookupOnValidate() const;
    void setAdminPoolLookupOnValidate(std::shared_ptr<ConfigNodePropertyBoolean> value);
    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<ConfigNodePropertyInteger> getUserPoolMaxActive() const;
    void setUserPoolMaxActive(std::shared_ptr<ConfigNodePropertyInteger> value);
    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<ConfigNodePropertyBoolean> getUserPoolLookupOnValidate() const;
    void setUserPoolLookupOnValidate(std::shared_ptr<ConfigNodePropertyBoolean> value);
    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<ConfigNodePropertyString> getUserBaseDN() const;
    void setUserBaseDN(std::shared_ptr<ConfigNodePropertyString> value);
    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<ConfigNodePropertyArray> getUserObjectclass() const;
    void setUserObjectclass(std::shared_ptr<ConfigNodePropertyArray> value);
    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<ConfigNodePropertyString> getUserIdAttribute() const;
    void setUserIdAttribute(std::shared_ptr<ConfigNodePropertyString> value);
    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<ConfigNodePropertyString> getUserExtraFilter() const;
    void setUserExtraFilter(std::shared_ptr<ConfigNodePropertyString> value);
    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<ConfigNodePropertyBoolean> getUserMakeDnPath() const;
    void setUserMakeDnPath(std::shared_ptr<ConfigNodePropertyBoolean> value);
    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<ConfigNodePropertyString> getGroupBaseDN() const;
    void setGroupBaseDN(std::shared_ptr<ConfigNodePropertyString> value);
    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<ConfigNodePropertyArray> getGroupObjectclass() const;
    void setGroupObjectclass(std::shared_ptr<ConfigNodePropertyArray> value);
    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<ConfigNodePropertyString> getGroupNameAttribute() const;
    void setGroupNameAttribute(std::shared_ptr<ConfigNodePropertyString> value);
    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<ConfigNodePropertyString> getGroupExtraFilter() const;
    void setGroupExtraFilter(std::shared_ptr<ConfigNodePropertyString> value);
    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<ConfigNodePropertyBoolean> getGroupMakeDnPath() const;
    void setGroupMakeDnPath(std::shared_ptr<ConfigNodePropertyBoolean> value);
    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<ConfigNodePropertyString> getGroupMemberAttribute() const;
    void setGroupMemberAttribute(std::shared_ptr<ConfigNodePropertyString> value);
    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<ConfigNodePropertyBoolean> getUseUidForExtId() const;
    void setUseUidForExtId(std::shared_ptr<ConfigNodePropertyBoolean> value);
    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<ConfigNodePropertyArray> getCustomattributes() const;
    void setCustomattributes(std::shared_ptr<ConfigNodePropertyArray> value);

protected:
    std::shared_ptr<ConfigNodePropertyString> m_Provider_name;
    std::shared_ptr<ConfigNodePropertyString> m_Host_name;
    std::shared_ptr<ConfigNodePropertyInteger> m_Host_port;
    std::shared_ptr<ConfigNodePropertyBoolean> m_Host_ssl;
    std::shared_ptr<ConfigNodePropertyBoolean> m_Host_tls;
    std::shared_ptr<ConfigNodePropertyBoolean> m_Host_noCertCheck;
    std::shared_ptr<ConfigNodePropertyString> m_Bind_dn;
    std::shared_ptr<ConfigNodePropertyString> m_Bind_password;
    std::shared_ptr<ConfigNodePropertyString> m_SearchTimeout;
    std::shared_ptr<ConfigNodePropertyInteger> m_AdminPool_maxActive;
    std::shared_ptr<ConfigNodePropertyBoolean> m_AdminPool_lookupOnValidate;
    std::shared_ptr<ConfigNodePropertyInteger> m_UserPool_maxActive;
    std::shared_ptr<ConfigNodePropertyBoolean> m_UserPool_lookupOnValidate;
    std::shared_ptr<ConfigNodePropertyString> m_User_baseDN;
    std::shared_ptr<ConfigNodePropertyArray> m_User_objectclass;
    std::shared_ptr<ConfigNodePropertyString> m_User_idAttribute;
    std::shared_ptr<ConfigNodePropertyString> m_User_extraFilter;
    std::shared_ptr<ConfigNodePropertyBoolean> m_User_makeDnPath;
    std::shared_ptr<ConfigNodePropertyString> m_Group_baseDN;
    std::shared_ptr<ConfigNodePropertyArray> m_Group_objectclass;
    std::shared_ptr<ConfigNodePropertyString> m_Group_nameAttribute;
    std::shared_ptr<ConfigNodePropertyString> m_Group_extraFilter;
    std::shared_ptr<ConfigNodePropertyBoolean> m_Group_makeDnPath;
    std::shared_ptr<ConfigNodePropertyString> m_Group_memberAttribute;
    std::shared_ptr<ConfigNodePropertyBoolean> m_UseUidForExtId;
    std::shared_ptr<ConfigNodePropertyArray> m_Customattributes;
};

}
}
}
}

#endif /* OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties_H_ */