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


#include "ComAdobeCqSocialSyncImplPublisherSyncServiceImplProperties.h"

namespace org {
namespace openapitools {
namespace server {
namespace model {

ComAdobeCqSocialSyncImplPublisherSyncServiceImplProperties::ComAdobeCqSocialSyncImplPublisherSyncServiceImplProperties()
{
    m_ActiveRunModesIsSet = false;
    
}

ComAdobeCqSocialSyncImplPublisherSyncServiceImplProperties::~ComAdobeCqSocialSyncImplPublisherSyncServiceImplProperties()
{
}

void ComAdobeCqSocialSyncImplPublisherSyncServiceImplProperties::validate()
{
    // TODO: implement validation
}

nlohmann::json ComAdobeCqSocialSyncImplPublisherSyncServiceImplProperties::toJson() const
{
    nlohmann::json val = nlohmann::json::object();

    if(m_ActiveRunModesIsSet)
    {
        val["activeRunModes"] = ModelBase::toJson(m_ActiveRunModes);
    }
    

    return val;
}

void ComAdobeCqSocialSyncImplPublisherSyncServiceImplProperties::fromJson(nlohmann::json& val)
{
    if(val.find("activeRunModes") != val.end())
    {
        if(!val["activeRunModes"].is_null())
        {
            ConfigNodePropertyArray newItem;
            newItem.fromJson(val["activeRunModes"]);
            setActiveRunModes( newItem );
        }
        
    }
    
}


ConfigNodePropertyArray ComAdobeCqSocialSyncImplPublisherSyncServiceImplProperties::getActiveRunModes() const
{
    return m_ActiveRunModes;
}
void ComAdobeCqSocialSyncImplPublisherSyncServiceImplProperties::setActiveRunModes(ConfigNodePropertyArray const& value)
{
    m_ActiveRunModes = value;
    m_ActiveRunModesIsSet = true;
}
bool ComAdobeCqSocialSyncImplPublisherSyncServiceImplProperties::activeRunModesIsSet() const
{
    return m_ActiveRunModesIsSet;
}
void ComAdobeCqSocialSyncImplPublisherSyncServiceImplProperties::unsetActiveRunModes()
{
    m_ActiveRunModesIsSet = false;
}

}
}
}
}
