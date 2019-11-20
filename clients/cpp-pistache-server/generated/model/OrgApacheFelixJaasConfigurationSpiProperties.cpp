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


#include "OrgApacheFelixJaasConfigurationSpiProperties.h"

namespace org {
namespace openapitools {
namespace server {
namespace model {

OrgApacheFelixJaasConfigurationSpiProperties::OrgApacheFelixJaasConfigurationSpiProperties()
{
    m_Jaas_defaultRealmNameIsSet = false;
    m_Jaas_configProviderNameIsSet = false;
    m_Jaas_globalConfigPolicyIsSet = false;
    
}

OrgApacheFelixJaasConfigurationSpiProperties::~OrgApacheFelixJaasConfigurationSpiProperties()
{
}

void OrgApacheFelixJaasConfigurationSpiProperties::validate()
{
    // TODO: implement validation
}

nlohmann::json OrgApacheFelixJaasConfigurationSpiProperties::toJson() const
{
    nlohmann::json val = nlohmann::json::object();

    if(m_Jaas_defaultRealmNameIsSet)
    {
        val["jaas.defaultRealmName"] = ModelBase::toJson(m_Jaas_defaultRealmName);
    }
    if(m_Jaas_configProviderNameIsSet)
    {
        val["jaas.configProviderName"] = ModelBase::toJson(m_Jaas_configProviderName);
    }
    if(m_Jaas_globalConfigPolicyIsSet)
    {
        val["jaas.globalConfigPolicy"] = ModelBase::toJson(m_Jaas_globalConfigPolicy);
    }
    

    return val;
}

void OrgApacheFelixJaasConfigurationSpiProperties::fromJson(nlohmann::json& val)
{
    if(val.find("jaas.defaultRealmName") != val.end())
    {
        if(!val["jaas.defaultRealmName"].is_null())
        {
            ConfigNodePropertyString newItem;
            newItem.fromJson(val["jaas.defaultRealmName"]);
            setJaasDefaultRealmName( newItem );
        }
        
    }
    if(val.find("jaas.configProviderName") != val.end())
    {
        if(!val["jaas.configProviderName"].is_null())
        {
            ConfigNodePropertyString newItem;
            newItem.fromJson(val["jaas.configProviderName"]);
            setJaasConfigProviderName( newItem );
        }
        
    }
    if(val.find("jaas.globalConfigPolicy") != val.end())
    {
        if(!val["jaas.globalConfigPolicy"].is_null())
        {
            ConfigNodePropertyDropDown newItem;
            newItem.fromJson(val["jaas.globalConfigPolicy"]);
            setJaasGlobalConfigPolicy( newItem );
        }
        
    }
    
}


ConfigNodePropertyString OrgApacheFelixJaasConfigurationSpiProperties::getJaasDefaultRealmName() const
{
    return m_Jaas_defaultRealmName;
}
void OrgApacheFelixJaasConfigurationSpiProperties::setJaasDefaultRealmName(ConfigNodePropertyString const& value)
{
    m_Jaas_defaultRealmName = value;
    m_Jaas_defaultRealmNameIsSet = true;
}
bool OrgApacheFelixJaasConfigurationSpiProperties::jaasDefaultRealmNameIsSet() const
{
    return m_Jaas_defaultRealmNameIsSet;
}
void OrgApacheFelixJaasConfigurationSpiProperties::unsetJaas_defaultRealmName()
{
    m_Jaas_defaultRealmNameIsSet = false;
}
ConfigNodePropertyString OrgApacheFelixJaasConfigurationSpiProperties::getJaasConfigProviderName() const
{
    return m_Jaas_configProviderName;
}
void OrgApacheFelixJaasConfigurationSpiProperties::setJaasConfigProviderName(ConfigNodePropertyString const& value)
{
    m_Jaas_configProviderName = value;
    m_Jaas_configProviderNameIsSet = true;
}
bool OrgApacheFelixJaasConfigurationSpiProperties::jaasConfigProviderNameIsSet() const
{
    return m_Jaas_configProviderNameIsSet;
}
void OrgApacheFelixJaasConfigurationSpiProperties::unsetJaas_configProviderName()
{
    m_Jaas_configProviderNameIsSet = false;
}
ConfigNodePropertyDropDown OrgApacheFelixJaasConfigurationSpiProperties::getJaasGlobalConfigPolicy() const
{
    return m_Jaas_globalConfigPolicy;
}
void OrgApacheFelixJaasConfigurationSpiProperties::setJaasGlobalConfigPolicy(ConfigNodePropertyDropDown const& value)
{
    m_Jaas_globalConfigPolicy = value;
    m_Jaas_globalConfigPolicyIsSet = true;
}
bool OrgApacheFelixJaasConfigurationSpiProperties::jaasGlobalConfigPolicyIsSet() const
{
    return m_Jaas_globalConfigPolicyIsSet;
}
void OrgApacheFelixJaasConfigurationSpiProperties::unsetJaas_globalConfigPolicy()
{
    m_Jaas_globalConfigPolicyIsSet = false;
}

}
}
}
}
