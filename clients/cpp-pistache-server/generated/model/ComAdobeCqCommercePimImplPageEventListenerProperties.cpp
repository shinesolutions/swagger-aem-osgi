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


#include "ComAdobeCqCommercePimImplPageEventListenerProperties.h"

namespace org {
namespace openapitools {
namespace server {
namespace model {

ComAdobeCqCommercePimImplPageEventListenerProperties::ComAdobeCqCommercePimImplPageEventListenerProperties()
{
    m_Cq_commerce_pageeventlistener_enabledIsSet = false;
    
}

ComAdobeCqCommercePimImplPageEventListenerProperties::~ComAdobeCqCommercePimImplPageEventListenerProperties()
{
}

void ComAdobeCqCommercePimImplPageEventListenerProperties::validate()
{
    // TODO: implement validation
}

nlohmann::json ComAdobeCqCommercePimImplPageEventListenerProperties::toJson() const
{
    nlohmann::json val = nlohmann::json::object();

    if(m_Cq_commerce_pageeventlistener_enabledIsSet)
    {
        val["cq.commerce.pageeventlistener.enabled"] = ModelBase::toJson(m_Cq_commerce_pageeventlistener_enabled);
    }
    

    return val;
}

void ComAdobeCqCommercePimImplPageEventListenerProperties::fromJson(nlohmann::json& val)
{
    if(val.find("cq.commerce.pageeventlistener.enabled") != val.end())
    {
        if(!val["cq.commerce.pageeventlistener.enabled"].is_null())
        {
            ConfigNodePropertyBoolean newItem;
            newItem.fromJson(val["cq.commerce.pageeventlistener.enabled"]);
            setCqCommercePageeventlistenerEnabled( newItem );
        }
        
    }
    
}


ConfigNodePropertyBoolean ComAdobeCqCommercePimImplPageEventListenerProperties::getCqCommercePageeventlistenerEnabled() const
{
    return m_Cq_commerce_pageeventlistener_enabled;
}
void ComAdobeCqCommercePimImplPageEventListenerProperties::setCqCommercePageeventlistenerEnabled(ConfigNodePropertyBoolean const& value)
{
    m_Cq_commerce_pageeventlistener_enabled = value;
    m_Cq_commerce_pageeventlistener_enabledIsSet = true;
}
bool ComAdobeCqCommercePimImplPageEventListenerProperties::cqCommercePageeventlistenerEnabledIsSet() const
{
    return m_Cq_commerce_pageeventlistener_enabledIsSet;
}
void ComAdobeCqCommercePimImplPageEventListenerProperties::unsetCq_commerce_pageeventlistener_enabled()
{
    m_Cq_commerce_pageeventlistener_enabledIsSet = false;
}

}
}
}
}
