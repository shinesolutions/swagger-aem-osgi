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


#include "ComDayCqWcmMsmImplLiveRelationshipManagerImplProperties.h"

namespace org {
namespace openapitools {
namespace server {
namespace model {

ComDayCqWcmMsmImplLiveRelationshipManagerImplProperties::ComDayCqWcmMsmImplLiveRelationshipManagerImplProperties()
{
    m_Liverelationshipmgr_relationsconfig_defaultIsSet = false;
    
}

ComDayCqWcmMsmImplLiveRelationshipManagerImplProperties::~ComDayCqWcmMsmImplLiveRelationshipManagerImplProperties()
{
}

void ComDayCqWcmMsmImplLiveRelationshipManagerImplProperties::validate()
{
    // TODO: implement validation
}

nlohmann::json ComDayCqWcmMsmImplLiveRelationshipManagerImplProperties::toJson() const
{
    nlohmann::json val = nlohmann::json::object();

    if(m_Liverelationshipmgr_relationsconfig_defaultIsSet)
    {
        val["liverelationshipmgr.relationsconfig.default"] = ModelBase::toJson(m_Liverelationshipmgr_relationsconfig_default);
    }
    

    return val;
}

void ComDayCqWcmMsmImplLiveRelationshipManagerImplProperties::fromJson(nlohmann::json& val)
{
    if(val.find("liverelationshipmgr.relationsconfig.default") != val.end())
    {
        if(!val["liverelationshipmgr.relationsconfig.default"].is_null())
        {
            ConfigNodePropertyString newItem;
            newItem.fromJson(val["liverelationshipmgr.relationsconfig.default"]);
            setLiverelationshipmgrRelationsconfigDefault( newItem );
        }
        
    }
    
}


ConfigNodePropertyString ComDayCqWcmMsmImplLiveRelationshipManagerImplProperties::getLiverelationshipmgrRelationsconfigDefault() const
{
    return m_Liverelationshipmgr_relationsconfig_default;
}
void ComDayCqWcmMsmImplLiveRelationshipManagerImplProperties::setLiverelationshipmgrRelationsconfigDefault(ConfigNodePropertyString const& value)
{
    m_Liverelationshipmgr_relationsconfig_default = value;
    m_Liverelationshipmgr_relationsconfig_defaultIsSet = true;
}
bool ComDayCqWcmMsmImplLiveRelationshipManagerImplProperties::liverelationshipmgrRelationsconfigDefaultIsSet() const
{
    return m_Liverelationshipmgr_relationsconfig_defaultIsSet;
}
void ComDayCqWcmMsmImplLiveRelationshipManagerImplProperties::unsetLiverelationshipmgr_relationsconfig_default()
{
    m_Liverelationshipmgr_relationsconfig_defaultIsSet = false;
}

}
}
}
}
