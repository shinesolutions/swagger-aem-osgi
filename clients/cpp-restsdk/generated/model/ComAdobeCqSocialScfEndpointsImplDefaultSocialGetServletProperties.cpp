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



#include "ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletProperties.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {

ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletProperties::ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletProperties()
{
    m_Sling_servlet_selectorsIsSet = false;
    m_Sling_servlet_extensionsIsSet = false;
}

ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletProperties::~ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletProperties()
{
}

void ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletProperties::validate()
{
    // TODO: implement validation
}

web::json::value ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletProperties::toJson() const
{
    web::json::value val = web::json::value::object();

    if(m_Sling_servlet_selectorsIsSet)
    {
        val[utility::conversions::to_string_t("sling.servlet.selectors")] = ModelBase::toJson(m_Sling_servlet_selectors);
    }
    if(m_Sling_servlet_extensionsIsSet)
    {
        val[utility::conversions::to_string_t("sling.servlet.extensions")] = ModelBase::toJson(m_Sling_servlet_extensions);
    }

    return val;
}

void ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletProperties::fromJson(web::json::value& val)
{
    if(val.has_field(utility::conversions::to_string_t("sling.servlet.selectors")))
    {
        if(!val[utility::conversions::to_string_t("sling.servlet.selectors")].is_null())
        {
            std::shared_ptr<ConfigNodePropertyArray> newItem(new ConfigNodePropertyArray());
            newItem->fromJson(val[utility::conversions::to_string_t("sling.servlet.selectors")]);
            setSlingServletSelectors( newItem );
        }
    }
    if(val.has_field(utility::conversions::to_string_t("sling.servlet.extensions")))
    {
        if(!val[utility::conversions::to_string_t("sling.servlet.extensions")].is_null())
        {
            std::shared_ptr<ConfigNodePropertyString> newItem(new ConfigNodePropertyString());
            newItem->fromJson(val[utility::conversions::to_string_t("sling.servlet.extensions")]);
            setSlingServletExtensions( newItem );
        }
    }
}

void ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletProperties::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t("."))
    {
        namePrefix += utility::conversions::to_string_t(".");
    }

    if(m_Sling_servlet_selectorsIsSet)
    {
        if (m_Sling_servlet_selectors.get())
        {
            m_Sling_servlet_selectors->toMultipart(multipart, utility::conversions::to_string_t("sling.servlet.selectors."));
        }
    }
    if(m_Sling_servlet_extensionsIsSet)
    {
        if (m_Sling_servlet_extensions.get())
        {
            m_Sling_servlet_extensions->toMultipart(multipart, utility::conversions::to_string_t("sling.servlet.extensions."));
        }
    }
}

void ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletProperties::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t("."))
    {
        namePrefix += utility::conversions::to_string_t(".");
    }

    if(multipart->hasContent(utility::conversions::to_string_t("sling.servlet.selectors")))
    {
        if(multipart->hasContent(utility::conversions::to_string_t("sling.servlet.selectors")))
        {
            std::shared_ptr<ConfigNodePropertyArray> newItem(new ConfigNodePropertyArray());
            newItem->fromMultiPart(multipart, utility::conversions::to_string_t("sling.servlet.selectors."));
            setSlingServletSelectors( newItem );
        }
    }
    if(multipart->hasContent(utility::conversions::to_string_t("sling.servlet.extensions")))
    {
        if(multipart->hasContent(utility::conversions::to_string_t("sling.servlet.extensions")))
        {
            std::shared_ptr<ConfigNodePropertyString> newItem(new ConfigNodePropertyString());
            newItem->fromMultiPart(multipart, utility::conversions::to_string_t("sling.servlet.extensions."));
            setSlingServletExtensions( newItem );
        }
    }
}

std::shared_ptr<ConfigNodePropertyArray> ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletProperties::getSlingServletSelectors() const
{
    return m_Sling_servlet_selectors;
}


void ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletProperties::setSlingServletSelectors(std::shared_ptr<ConfigNodePropertyArray> value)
{
    m_Sling_servlet_selectors = value;
    m_Sling_servlet_selectorsIsSet = true;
}
bool ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletProperties::slingServletSelectorsIsSet() const
{
    return m_Sling_servlet_selectorsIsSet;
}

void ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletProperties::unsetSling_servlet_selectors()
{
    m_Sling_servlet_selectorsIsSet = false;
}

std::shared_ptr<ConfigNodePropertyString> ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletProperties::getSlingServletExtensions() const
{
    return m_Sling_servlet_extensions;
}


void ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletProperties::setSlingServletExtensions(std::shared_ptr<ConfigNodePropertyString> value)
{
    m_Sling_servlet_extensions = value;
    m_Sling_servlet_extensionsIsSet = true;
}
bool ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletProperties::slingServletExtensionsIsSet() const
{
    return m_Sling_servlet_extensionsIsSet;
}

void ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletProperties::unsetSling_servlet_extensions()
{
    m_Sling_servlet_extensionsIsSet = false;
}

}
}
}
}
