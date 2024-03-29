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


#include "ComDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterProperties.h"

namespace org {
namespace openapitools {
namespace server {
namespace model {

ComDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterProperties::ComDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterProperties()
{
    m_Cq_analytics_testandtarget_accountoptionsupdater_enabledIsSet = false;
    
}

ComDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterProperties::~ComDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterProperties()
{
}

void ComDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterProperties::validate()
{
    // TODO: implement validation
}

nlohmann::json ComDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterProperties::toJson() const
{
    nlohmann::json val = nlohmann::json::object();

    if(m_Cq_analytics_testandtarget_accountoptionsupdater_enabledIsSet)
    {
        val["cq.analytics.testandtarget.accountoptionsupdater.enabled"] = ModelBase::toJson(m_Cq_analytics_testandtarget_accountoptionsupdater_enabled);
    }
    

    return val;
}

void ComDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterProperties::fromJson(nlohmann::json& val)
{
    if(val.find("cq.analytics.testandtarget.accountoptionsupdater.enabled") != val.end())
    {
        if(!val["cq.analytics.testandtarget.accountoptionsupdater.enabled"].is_null())
        {
            ConfigNodePropertyBoolean newItem;
            newItem.fromJson(val["cq.analytics.testandtarget.accountoptionsupdater.enabled"]);
            setCqAnalyticsTestandtargetAccountoptionsupdaterEnabled( newItem );
        }
        
    }
    
}


ConfigNodePropertyBoolean ComDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterProperties::getCqAnalyticsTestandtargetAccountoptionsupdaterEnabled() const
{
    return m_Cq_analytics_testandtarget_accountoptionsupdater_enabled;
}
void ComDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterProperties::setCqAnalyticsTestandtargetAccountoptionsupdaterEnabled(ConfigNodePropertyBoolean const& value)
{
    m_Cq_analytics_testandtarget_accountoptionsupdater_enabled = value;
    m_Cq_analytics_testandtarget_accountoptionsupdater_enabledIsSet = true;
}
bool ComDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterProperties::cqAnalyticsTestandtargetAccountoptionsupdaterEnabledIsSet() const
{
    return m_Cq_analytics_testandtarget_accountoptionsupdater_enabledIsSet;
}
void ComDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterProperties::unsetCq_analytics_testandtarget_accountoptionsupdater_enabled()
{
    m_Cq_analytics_testandtarget_accountoptionsupdater_enabledIsSet = false;
}

}
}
}
}

