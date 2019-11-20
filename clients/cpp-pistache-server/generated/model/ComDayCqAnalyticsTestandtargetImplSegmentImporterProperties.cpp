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


#include "ComDayCqAnalyticsTestandtargetImplSegmentImporterProperties.h"

namespace org {
namespace openapitools {
namespace server {
namespace model {

ComDayCqAnalyticsTestandtargetImplSegmentImporterProperties::ComDayCqAnalyticsTestandtargetImplSegmentImporterProperties()
{
    m_Cq_analytics_testandtarget_segmentimporter_enabledIsSet = false;
    
}

ComDayCqAnalyticsTestandtargetImplSegmentImporterProperties::~ComDayCqAnalyticsTestandtargetImplSegmentImporterProperties()
{
}

void ComDayCqAnalyticsTestandtargetImplSegmentImporterProperties::validate()
{
    // TODO: implement validation
}

nlohmann::json ComDayCqAnalyticsTestandtargetImplSegmentImporterProperties::toJson() const
{
    nlohmann::json val = nlohmann::json::object();

    if(m_Cq_analytics_testandtarget_segmentimporter_enabledIsSet)
    {
        val["cq.analytics.testandtarget.segmentimporter.enabled"] = ModelBase::toJson(m_Cq_analytics_testandtarget_segmentimporter_enabled);
    }
    

    return val;
}

void ComDayCqAnalyticsTestandtargetImplSegmentImporterProperties::fromJson(nlohmann::json& val)
{
    if(val.find("cq.analytics.testandtarget.segmentimporter.enabled") != val.end())
    {
        if(!val["cq.analytics.testandtarget.segmentimporter.enabled"].is_null())
        {
            ConfigNodePropertyBoolean newItem;
            newItem.fromJson(val["cq.analytics.testandtarget.segmentimporter.enabled"]);
            setCqAnalyticsTestandtargetSegmentimporterEnabled( newItem );
        }
        
    }
    
}


ConfigNodePropertyBoolean ComDayCqAnalyticsTestandtargetImplSegmentImporterProperties::getCqAnalyticsTestandtargetSegmentimporterEnabled() const
{
    return m_Cq_analytics_testandtarget_segmentimporter_enabled;
}
void ComDayCqAnalyticsTestandtargetImplSegmentImporterProperties::setCqAnalyticsTestandtargetSegmentimporterEnabled(ConfigNodePropertyBoolean const& value)
{
    m_Cq_analytics_testandtarget_segmentimporter_enabled = value;
    m_Cq_analytics_testandtarget_segmentimporter_enabledIsSet = true;
}
bool ComDayCqAnalyticsTestandtargetImplSegmentImporterProperties::cqAnalyticsTestandtargetSegmentimporterEnabledIsSet() const
{
    return m_Cq_analytics_testandtarget_segmentimporter_enabledIsSet;
}
void ComDayCqAnalyticsTestandtargetImplSegmentImporterProperties::unsetCq_analytics_testandtarget_segmentimporter_enabled()
{
    m_Cq_analytics_testandtarget_segmentimporter_enabledIsSet = false;
}

}
}
}
}
