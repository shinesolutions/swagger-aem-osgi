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



#include "ComAdobeCqCommerceImplPromotionPromotionManagerImplProperties.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {

ComAdobeCqCommerceImplPromotionPromotionManagerImplProperties::ComAdobeCqCommerceImplPromotionPromotionManagerImplProperties()
{
    m_Cq_commerce_promotion_rootIsSet = false;
}

ComAdobeCqCommerceImplPromotionPromotionManagerImplProperties::~ComAdobeCqCommerceImplPromotionPromotionManagerImplProperties()
{
}

void ComAdobeCqCommerceImplPromotionPromotionManagerImplProperties::validate()
{
    // TODO: implement validation
}

web::json::value ComAdobeCqCommerceImplPromotionPromotionManagerImplProperties::toJson() const
{
    web::json::value val = web::json::value::object();

    if(m_Cq_commerce_promotion_rootIsSet)
    {
        val[utility::conversions::to_string_t("cq.commerce.promotion.root")] = ModelBase::toJson(m_Cq_commerce_promotion_root);
    }

    return val;
}

void ComAdobeCqCommerceImplPromotionPromotionManagerImplProperties::fromJson(web::json::value& val)
{
    if(val.has_field(utility::conversions::to_string_t("cq.commerce.promotion.root")))
    {
        if(!val[utility::conversions::to_string_t("cq.commerce.promotion.root")].is_null())
        {
            std::shared_ptr<ConfigNodePropertyString> newItem(new ConfigNodePropertyString());
            newItem->fromJson(val[utility::conversions::to_string_t("cq.commerce.promotion.root")]);
            setCqCommercePromotionRoot( newItem );
        }
    }
}

void ComAdobeCqCommerceImplPromotionPromotionManagerImplProperties::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t("."))
    {
        namePrefix += utility::conversions::to_string_t(".");
    }

    if(m_Cq_commerce_promotion_rootIsSet)
    {
        if (m_Cq_commerce_promotion_root.get())
        {
            m_Cq_commerce_promotion_root->toMultipart(multipart, utility::conversions::to_string_t("cq.commerce.promotion.root."));
        }
    }
}

void ComAdobeCqCommerceImplPromotionPromotionManagerImplProperties::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t("."))
    {
        namePrefix += utility::conversions::to_string_t(".");
    }

    if(multipart->hasContent(utility::conversions::to_string_t("cq.commerce.promotion.root")))
    {
        if(multipart->hasContent(utility::conversions::to_string_t("cq.commerce.promotion.root")))
        {
            std::shared_ptr<ConfigNodePropertyString> newItem(new ConfigNodePropertyString());
            newItem->fromMultiPart(multipart, utility::conversions::to_string_t("cq.commerce.promotion.root."));
            setCqCommercePromotionRoot( newItem );
        }
    }
}

std::shared_ptr<ConfigNodePropertyString> ComAdobeCqCommerceImplPromotionPromotionManagerImplProperties::getCqCommercePromotionRoot() const
{
    return m_Cq_commerce_promotion_root;
}


void ComAdobeCqCommerceImplPromotionPromotionManagerImplProperties::setCqCommercePromotionRoot(std::shared_ptr<ConfigNodePropertyString> value)
{
    m_Cq_commerce_promotion_root = value;
    m_Cq_commerce_promotion_rootIsSet = true;
}
bool ComAdobeCqCommerceImplPromotionPromotionManagerImplProperties::cqCommercePromotionRootIsSet() const
{
    return m_Cq_commerce_promotion_rootIsSet;
}

void ComAdobeCqCommerceImplPromotionPromotionManagerImplProperties::unsetCq_commerce_promotion_root()
{
    m_Cq_commerce_promotion_rootIsSet = false;
}

}
}
}
}
