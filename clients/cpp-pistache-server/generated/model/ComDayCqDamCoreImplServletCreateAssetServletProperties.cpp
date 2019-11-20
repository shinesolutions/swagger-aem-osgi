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


#include "ComDayCqDamCoreImplServletCreateAssetServletProperties.h"

namespace org {
namespace openapitools {
namespace server {
namespace model {

ComDayCqDamCoreImplServletCreateAssetServletProperties::ComDayCqDamCoreImplServletCreateAssetServletProperties()
{
    m_Detect_duplicateIsSet = false;
    
}

ComDayCqDamCoreImplServletCreateAssetServletProperties::~ComDayCqDamCoreImplServletCreateAssetServletProperties()
{
}

void ComDayCqDamCoreImplServletCreateAssetServletProperties::validate()
{
    // TODO: implement validation
}

nlohmann::json ComDayCqDamCoreImplServletCreateAssetServletProperties::toJson() const
{
    nlohmann::json val = nlohmann::json::object();

    if(m_Detect_duplicateIsSet)
    {
        val["detect_duplicate"] = ModelBase::toJson(m_Detect_duplicate);
    }
    

    return val;
}

void ComDayCqDamCoreImplServletCreateAssetServletProperties::fromJson(nlohmann::json& val)
{
    if(val.find("detect_duplicate") != val.end())
    {
        if(!val["detect_duplicate"].is_null())
        {
            ConfigNodePropertyBoolean newItem;
            newItem.fromJson(val["detect_duplicate"]);
            setDetectDuplicate( newItem );
        }
        
    }
    
}


ConfigNodePropertyBoolean ComDayCqDamCoreImplServletCreateAssetServletProperties::getDetectDuplicate() const
{
    return m_Detect_duplicate;
}
void ComDayCqDamCoreImplServletCreateAssetServletProperties::setDetectDuplicate(ConfigNodePropertyBoolean const& value)
{
    m_Detect_duplicate = value;
    m_Detect_duplicateIsSet = true;
}
bool ComDayCqDamCoreImplServletCreateAssetServletProperties::detectDuplicateIsSet() const
{
    return m_Detect_duplicateIsSet;
}
void ComDayCqDamCoreImplServletCreateAssetServletProperties::unsetDetect_duplicate()
{
    m_Detect_duplicateIsSet = false;
}

}
}
}
}
