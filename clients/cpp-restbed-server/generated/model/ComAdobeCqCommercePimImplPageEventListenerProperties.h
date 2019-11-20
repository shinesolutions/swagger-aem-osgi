/**
 * Adobe Experience Manager OSGI config (AEM) API
 * Swagger AEM OSGI is an OpenAPI specification for Adobe Experience Manager (AEM) OSGI Configurations API
 *
 * OpenAPI spec version: 1.0.0-pre.0
 * Contact: opensource@shinesolutions.com
 *
 * NOTE: This class is auto generated by OpenAPI-Generator 3.2.1-SNAPSHOT.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

/*
 * ComAdobeCqCommercePimImplPageEventListenerProperties.h
 *
 * 
 */

#ifndef ComAdobeCqCommercePimImplPageEventListenerProperties_H_
#define ComAdobeCqCommercePimImplPageEventListenerProperties_H_



#include "ConfigNodePropertyBoolean.h"
#include <memory>

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// 
/// </summary>
class  ComAdobeCqCommercePimImplPageEventListenerProperties
{
public:
    ComAdobeCqCommercePimImplPageEventListenerProperties();
    virtual ~ComAdobeCqCommercePimImplPageEventListenerProperties();
    
    std::string toJsonString();
    void fromJsonString(std::string const& jsonString);

    /////////////////////////////////////////////
    /// ComAdobeCqCommercePimImplPageEventListenerProperties members
    
    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<ConfigNodePropertyBoolean> getCqCommercePageeventlistenerEnabled() const;
    void setCqCommercePageeventlistenerEnabled(std::shared_ptr<ConfigNodePropertyBoolean> value);

protected:
    std::shared_ptr<ConfigNodePropertyBoolean> m_Cq_commerce_pageeventlistener_enabled;
};

}
}
}
}

#endif /* ComAdobeCqCommercePimImplPageEventListenerProperties_H_ */