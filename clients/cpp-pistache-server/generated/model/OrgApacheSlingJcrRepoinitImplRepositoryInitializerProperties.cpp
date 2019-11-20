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


#include "OrgApacheSlingJcrRepoinitImplRepositoryInitializerProperties.h"

namespace org {
namespace openapitools {
namespace server {
namespace model {

OrgApacheSlingJcrRepoinitImplRepositoryInitializerProperties::OrgApacheSlingJcrRepoinitImplRepositoryInitializerProperties()
{
    m_ReferencesIsSet = false;
    
}

OrgApacheSlingJcrRepoinitImplRepositoryInitializerProperties::~OrgApacheSlingJcrRepoinitImplRepositoryInitializerProperties()
{
}

void OrgApacheSlingJcrRepoinitImplRepositoryInitializerProperties::validate()
{
    // TODO: implement validation
}

nlohmann::json OrgApacheSlingJcrRepoinitImplRepositoryInitializerProperties::toJson() const
{
    nlohmann::json val = nlohmann::json::object();

    if(m_ReferencesIsSet)
    {
        val["references"] = ModelBase::toJson(m_References);
    }
    

    return val;
}

void OrgApacheSlingJcrRepoinitImplRepositoryInitializerProperties::fromJson(nlohmann::json& val)
{
    if(val.find("references") != val.end())
    {
        if(!val["references"].is_null())
        {
            ConfigNodePropertyArray newItem;
            newItem.fromJson(val["references"]);
            setReferences( newItem );
        }
        
    }
    
}


ConfigNodePropertyArray OrgApacheSlingJcrRepoinitImplRepositoryInitializerProperties::getReferences() const
{
    return m_References;
}
void OrgApacheSlingJcrRepoinitImplRepositoryInitializerProperties::setReferences(ConfigNodePropertyArray const& value)
{
    m_References = value;
    m_ReferencesIsSet = true;
}
bool OrgApacheSlingJcrRepoinitImplRepositoryInitializerProperties::referencesIsSet() const
{
    return m_ReferencesIsSet;
}
void OrgApacheSlingJcrRepoinitImplRepositoryInitializerProperties::unsetReferences()
{
    m_ReferencesIsSet = false;
}

}
}
}
}
