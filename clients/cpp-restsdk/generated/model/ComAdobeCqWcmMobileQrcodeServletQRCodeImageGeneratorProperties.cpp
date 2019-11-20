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



#include "ComAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorProperties.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {

ComAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorProperties::ComAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorProperties()
{
    m_Cq_wcm_qrcode_servlet_whitelistIsSet = false;
}

ComAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorProperties::~ComAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorProperties()
{
}

void ComAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorProperties::validate()
{
    // TODO: implement validation
}

web::json::value ComAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorProperties::toJson() const
{
    web::json::value val = web::json::value::object();

    if(m_Cq_wcm_qrcode_servlet_whitelistIsSet)
    {
        val[utility::conversions::to_string_t("cq.wcm.qrcode.servlet.whitelist")] = ModelBase::toJson(m_Cq_wcm_qrcode_servlet_whitelist);
    }

    return val;
}

void ComAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorProperties::fromJson(web::json::value& val)
{
    if(val.has_field(utility::conversions::to_string_t("cq.wcm.qrcode.servlet.whitelist")))
    {
        if(!val[utility::conversions::to_string_t("cq.wcm.qrcode.servlet.whitelist")].is_null())
        {
            std::shared_ptr<ConfigNodePropertyArray> newItem(new ConfigNodePropertyArray());
            newItem->fromJson(val[utility::conversions::to_string_t("cq.wcm.qrcode.servlet.whitelist")]);
            setCqWcmQrcodeServletWhitelist( newItem );
        }
    }
}

void ComAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorProperties::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t("."))
    {
        namePrefix += utility::conversions::to_string_t(".");
    }

    if(m_Cq_wcm_qrcode_servlet_whitelistIsSet)
    {
        if (m_Cq_wcm_qrcode_servlet_whitelist.get())
        {
            m_Cq_wcm_qrcode_servlet_whitelist->toMultipart(multipart, utility::conversions::to_string_t("cq.wcm.qrcode.servlet.whitelist."));
        }
    }
}

void ComAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorProperties::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t("."))
    {
        namePrefix += utility::conversions::to_string_t(".");
    }

    if(multipart->hasContent(utility::conversions::to_string_t("cq.wcm.qrcode.servlet.whitelist")))
    {
        if(multipart->hasContent(utility::conversions::to_string_t("cq.wcm.qrcode.servlet.whitelist")))
        {
            std::shared_ptr<ConfigNodePropertyArray> newItem(new ConfigNodePropertyArray());
            newItem->fromMultiPart(multipart, utility::conversions::to_string_t("cq.wcm.qrcode.servlet.whitelist."));
            setCqWcmQrcodeServletWhitelist( newItem );
        }
    }
}

std::shared_ptr<ConfigNodePropertyArray> ComAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorProperties::getCqWcmQrcodeServletWhitelist() const
{
    return m_Cq_wcm_qrcode_servlet_whitelist;
}


void ComAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorProperties::setCqWcmQrcodeServletWhitelist(std::shared_ptr<ConfigNodePropertyArray> value)
{
    m_Cq_wcm_qrcode_servlet_whitelist = value;
    m_Cq_wcm_qrcode_servlet_whitelistIsSet = true;
}
bool ComAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorProperties::cqWcmQrcodeServletWhitelistIsSet() const
{
    return m_Cq_wcm_qrcode_servlet_whitelistIsSet;
}

void ComAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorProperties::unsetCq_wcm_qrcode_servlet_whitelist()
{
    m_Cq_wcm_qrcode_servlet_whitelistIsSet = false;
}

}
}
}
}
