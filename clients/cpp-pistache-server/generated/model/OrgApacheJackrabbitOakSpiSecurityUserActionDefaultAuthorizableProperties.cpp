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


#include "OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableProperties.h"

namespace org {
namespace openapitools {
namespace server {
namespace model {

OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableProperties::OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableProperties()
{
    m_EnabledActionsIsSet = false;
    m_UserPrivilegeNamesIsSet = false;
    m_GroupPrivilegeNamesIsSet = false;
    m_ConstraintIsSet = false;
    
}

OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableProperties::~OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableProperties()
{
}

void OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableProperties::validate()
{
    // TODO: implement validation
}

nlohmann::json OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableProperties::toJson() const
{
    nlohmann::json val = nlohmann::json::object();

    if(m_EnabledActionsIsSet)
    {
        val["enabledActions"] = ModelBase::toJson(m_EnabledActions);
    }
    if(m_UserPrivilegeNamesIsSet)
    {
        val["userPrivilegeNames"] = ModelBase::toJson(m_UserPrivilegeNames);
    }
    if(m_GroupPrivilegeNamesIsSet)
    {
        val["groupPrivilegeNames"] = ModelBase::toJson(m_GroupPrivilegeNames);
    }
    if(m_ConstraintIsSet)
    {
        val["constraint"] = ModelBase::toJson(m_Constraint);
    }
    

    return val;
}

void OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableProperties::fromJson(nlohmann::json& val)
{
    if(val.find("enabledActions") != val.end())
    {
        if(!val["enabledActions"].is_null())
        {
            ConfigNodePropertyDropDown newItem;
            newItem.fromJson(val["enabledActions"]);
            setEnabledActions( newItem );
        }
        
    }
    if(val.find("userPrivilegeNames") != val.end())
    {
        if(!val["userPrivilegeNames"].is_null())
        {
            ConfigNodePropertyArray newItem;
            newItem.fromJson(val["userPrivilegeNames"]);
            setUserPrivilegeNames( newItem );
        }
        
    }
    if(val.find("groupPrivilegeNames") != val.end())
    {
        if(!val["groupPrivilegeNames"].is_null())
        {
            ConfigNodePropertyArray newItem;
            newItem.fromJson(val["groupPrivilegeNames"]);
            setGroupPrivilegeNames( newItem );
        }
        
    }
    if(val.find("constraint") != val.end())
    {
        if(!val["constraint"].is_null())
        {
            ConfigNodePropertyString newItem;
            newItem.fromJson(val["constraint"]);
            setConstraint( newItem );
        }
        
    }
    
}


ConfigNodePropertyDropDown OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableProperties::getEnabledActions() const
{
    return m_EnabledActions;
}
void OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableProperties::setEnabledActions(ConfigNodePropertyDropDown const& value)
{
    m_EnabledActions = value;
    m_EnabledActionsIsSet = true;
}
bool OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableProperties::enabledActionsIsSet() const
{
    return m_EnabledActionsIsSet;
}
void OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableProperties::unsetEnabledActions()
{
    m_EnabledActionsIsSet = false;
}
ConfigNodePropertyArray OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableProperties::getUserPrivilegeNames() const
{
    return m_UserPrivilegeNames;
}
void OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableProperties::setUserPrivilegeNames(ConfigNodePropertyArray const& value)
{
    m_UserPrivilegeNames = value;
    m_UserPrivilegeNamesIsSet = true;
}
bool OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableProperties::userPrivilegeNamesIsSet() const
{
    return m_UserPrivilegeNamesIsSet;
}
void OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableProperties::unsetUserPrivilegeNames()
{
    m_UserPrivilegeNamesIsSet = false;
}
ConfigNodePropertyArray OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableProperties::getGroupPrivilegeNames() const
{
    return m_GroupPrivilegeNames;
}
void OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableProperties::setGroupPrivilegeNames(ConfigNodePropertyArray const& value)
{
    m_GroupPrivilegeNames = value;
    m_GroupPrivilegeNamesIsSet = true;
}
bool OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableProperties::groupPrivilegeNamesIsSet() const
{
    return m_GroupPrivilegeNamesIsSet;
}
void OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableProperties::unsetGroupPrivilegeNames()
{
    m_GroupPrivilegeNamesIsSet = false;
}
ConfigNodePropertyString OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableProperties::getConstraint() const
{
    return m_Constraint;
}
void OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableProperties::setConstraint(ConfigNodePropertyString const& value)
{
    m_Constraint = value;
    m_ConstraintIsSet = true;
}
bool OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableProperties::constraintIsSet() const
{
    return m_ConstraintIsSet;
}
void OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableProperties::unsetConstraint()
{
    m_ConstraintIsSet = false;
}

}
}
}
}

