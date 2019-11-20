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


#include "ComDayCqWcmCoreImplWCMDebugFilterProperties.h"

namespace org {
namespace openapitools {
namespace server {
namespace model {

ComDayCqWcmCoreImplWCMDebugFilterProperties::ComDayCqWcmCoreImplWCMDebugFilterProperties()
{
    m_Wcmdbgfilter_enabledIsSet = false;
    m_Wcmdbgfilter_jspDebugIsSet = false;
    
}

ComDayCqWcmCoreImplWCMDebugFilterProperties::~ComDayCqWcmCoreImplWCMDebugFilterProperties()
{
}

void ComDayCqWcmCoreImplWCMDebugFilterProperties::validate()
{
    // TODO: implement validation
}

nlohmann::json ComDayCqWcmCoreImplWCMDebugFilterProperties::toJson() const
{
    nlohmann::json val = nlohmann::json::object();

    if(m_Wcmdbgfilter_enabledIsSet)
    {
        val["wcmdbgfilter.enabled"] = ModelBase::toJson(m_Wcmdbgfilter_enabled);
    }
    if(m_Wcmdbgfilter_jspDebugIsSet)
    {
        val["wcmdbgfilter.jspDebug"] = ModelBase::toJson(m_Wcmdbgfilter_jspDebug);
    }
    

    return val;
}

void ComDayCqWcmCoreImplWCMDebugFilterProperties::fromJson(nlohmann::json& val)
{
    if(val.find("wcmdbgfilter.enabled") != val.end())
    {
        if(!val["wcmdbgfilter.enabled"].is_null())
        {
            ConfigNodePropertyBoolean newItem;
            newItem.fromJson(val["wcmdbgfilter.enabled"]);
            setWcmdbgfilterEnabled( newItem );
        }
        
    }
    if(val.find("wcmdbgfilter.jspDebug") != val.end())
    {
        if(!val["wcmdbgfilter.jspDebug"].is_null())
        {
            ConfigNodePropertyBoolean newItem;
            newItem.fromJson(val["wcmdbgfilter.jspDebug"]);
            setWcmdbgfilterJspDebug( newItem );
        }
        
    }
    
}


ConfigNodePropertyBoolean ComDayCqWcmCoreImplWCMDebugFilterProperties::getWcmdbgfilterEnabled() const
{
    return m_Wcmdbgfilter_enabled;
}
void ComDayCqWcmCoreImplWCMDebugFilterProperties::setWcmdbgfilterEnabled(ConfigNodePropertyBoolean const& value)
{
    m_Wcmdbgfilter_enabled = value;
    m_Wcmdbgfilter_enabledIsSet = true;
}
bool ComDayCqWcmCoreImplWCMDebugFilterProperties::wcmdbgfilterEnabledIsSet() const
{
    return m_Wcmdbgfilter_enabledIsSet;
}
void ComDayCqWcmCoreImplWCMDebugFilterProperties::unsetWcmdbgfilter_enabled()
{
    m_Wcmdbgfilter_enabledIsSet = false;
}
ConfigNodePropertyBoolean ComDayCqWcmCoreImplWCMDebugFilterProperties::getWcmdbgfilterJspDebug() const
{
    return m_Wcmdbgfilter_jspDebug;
}
void ComDayCqWcmCoreImplWCMDebugFilterProperties::setWcmdbgfilterJspDebug(ConfigNodePropertyBoolean const& value)
{
    m_Wcmdbgfilter_jspDebug = value;
    m_Wcmdbgfilter_jspDebugIsSet = true;
}
bool ComDayCqWcmCoreImplWCMDebugFilterProperties::wcmdbgfilterJspDebugIsSet() const
{
    return m_Wcmdbgfilter_jspDebugIsSet;
}
void ComDayCqWcmCoreImplWCMDebugFilterProperties::unsetWcmdbgfilter_jspDebug()
{
    m_Wcmdbgfilter_jspDebugIsSet = false;
}

}
}
}
}
