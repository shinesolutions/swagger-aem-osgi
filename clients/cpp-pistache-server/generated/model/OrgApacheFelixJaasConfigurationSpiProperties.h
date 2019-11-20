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
 * OrgApacheFelixJaasConfigurationSpiProperties.h
 *
 * 
 */

#ifndef OrgApacheFelixJaasConfigurationSpiProperties_H_
#define OrgApacheFelixJaasConfigurationSpiProperties_H_


#include "ModelBase.h"

#include "ConfigNodePropertyDropDown.h"
#include "ConfigNodePropertyString.h"

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// 
/// </summary>
class  OrgApacheFelixJaasConfigurationSpiProperties
    : public ModelBase
{
public:
    OrgApacheFelixJaasConfigurationSpiProperties();
    virtual ~OrgApacheFelixJaasConfigurationSpiProperties();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    nlohmann::json toJson() const override;
    void fromJson(nlohmann::json& json) override;

    /////////////////////////////////////////////
    /// OrgApacheFelixJaasConfigurationSpiProperties members

    /// <summary>
    /// 
    /// </summary>
    ConfigNodePropertyString getJaasDefaultRealmName() const;
    void setJaasDefaultRealmName(ConfigNodePropertyString const& value);
    bool jaasDefaultRealmNameIsSet() const;
    void unsetJaas_defaultRealmName();
    /// <summary>
    /// 
    /// </summary>
    ConfigNodePropertyString getJaasConfigProviderName() const;
    void setJaasConfigProviderName(ConfigNodePropertyString const& value);
    bool jaasConfigProviderNameIsSet() const;
    void unsetJaas_configProviderName();
    /// <summary>
    /// 
    /// </summary>
    ConfigNodePropertyDropDown getJaasGlobalConfigPolicy() const;
    void setJaasGlobalConfigPolicy(ConfigNodePropertyDropDown const& value);
    bool jaasGlobalConfigPolicyIsSet() const;
    void unsetJaas_globalConfigPolicy();

protected:
    ConfigNodePropertyString m_Jaas_defaultRealmName;
    bool m_Jaas_defaultRealmNameIsSet;
    ConfigNodePropertyString m_Jaas_configProviderName;
    bool m_Jaas_configProviderNameIsSet;
    ConfigNodePropertyDropDown m_Jaas_globalConfigPolicy;
    bool m_Jaas_globalConfigPolicyIsSet;
};

}
}
}
}

#endif /* OrgApacheFelixJaasConfigurationSpiProperties_H_ */