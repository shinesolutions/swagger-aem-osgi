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


#include "ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplProperties.h"

namespace org {
namespace openapitools {
namespace server {
namespace model {

ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplProperties::ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplProperties()
{
    m_Cq_commerce_asset_handler_fallbackIsSet = false;
    
}

ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplProperties::~ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplProperties()
{
}

void ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplProperties::validate()
{
    // TODO: implement validation
}

nlohmann::json ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplProperties::toJson() const
{
    nlohmann::json val = nlohmann::json::object();

    if(m_Cq_commerce_asset_handler_fallbackIsSet)
    {
        val["cq.commerce.asset.handler.fallback"] = ModelBase::toJson(m_Cq_commerce_asset_handler_fallback);
    }
    

    return val;
}

void ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplProperties::fromJson(nlohmann::json& val)
{
    if(val.find("cq.commerce.asset.handler.fallback") != val.end())
    {
        if(!val["cq.commerce.asset.handler.fallback"].is_null())
        {
            ConfigNodePropertyString newItem;
            newItem.fromJson(val["cq.commerce.asset.handler.fallback"]);
            setCqCommerceAssetHandlerFallback( newItem );
        }
        
    }
    
}


ConfigNodePropertyString ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplProperties::getCqCommerceAssetHandlerFallback() const
{
    return m_Cq_commerce_asset_handler_fallback;
}
void ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplProperties::setCqCommerceAssetHandlerFallback(ConfigNodePropertyString const& value)
{
    m_Cq_commerce_asset_handler_fallback = value;
    m_Cq_commerce_asset_handler_fallbackIsSet = true;
}
bool ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplProperties::cqCommerceAssetHandlerFallbackIsSet() const
{
    return m_Cq_commerce_asset_handler_fallbackIsSet;
}
void ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplProperties::unsetCq_commerce_asset_handler_fallback()
{
    m_Cq_commerce_asset_handler_fallbackIsSet = false;
}

}
}
}
}
