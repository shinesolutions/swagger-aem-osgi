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



#include "OrgApacheSlingServletsGetImplVersionVersionInfoServletProperties.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {

OrgApacheSlingServletsGetImplVersionVersionInfoServletProperties::OrgApacheSlingServletsGetImplVersionVersionInfoServletProperties()
{
    m_Sling_servlet_selectorsIsSet = false;
    m_EcmaSuportIsSet = false;
}

OrgApacheSlingServletsGetImplVersionVersionInfoServletProperties::~OrgApacheSlingServletsGetImplVersionVersionInfoServletProperties()
{
}

void OrgApacheSlingServletsGetImplVersionVersionInfoServletProperties::validate()
{
    // TODO: implement validation
}

web::json::value OrgApacheSlingServletsGetImplVersionVersionInfoServletProperties::toJson() const
{
    web::json::value val = web::json::value::object();

    if(m_Sling_servlet_selectorsIsSet)
    {
        val[utility::conversions::to_string_t("sling.servlet.selectors")] = ModelBase::toJson(m_Sling_servlet_selectors);
    }
    if(m_EcmaSuportIsSet)
    {
        val[utility::conversions::to_string_t("ecmaSuport")] = ModelBase::toJson(m_EcmaSuport);
    }

    return val;
}

void OrgApacheSlingServletsGetImplVersionVersionInfoServletProperties::fromJson(web::json::value& val)
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
    if(val.has_field(utility::conversions::to_string_t("ecmaSuport")))
    {
        if(!val[utility::conversions::to_string_t("ecmaSuport")].is_null())
        {
            std::shared_ptr<ConfigNodePropertyBoolean> newItem(new ConfigNodePropertyBoolean());
            newItem->fromJson(val[utility::conversions::to_string_t("ecmaSuport")]);
            setEcmaSuport( newItem );
        }
    }
}

void OrgApacheSlingServletsGetImplVersionVersionInfoServletProperties::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
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
    if(m_EcmaSuportIsSet)
    {
        if (m_EcmaSuport.get())
        {
            m_EcmaSuport->toMultipart(multipart, utility::conversions::to_string_t("ecmaSuport."));
        }
    }
}

void OrgApacheSlingServletsGetImplVersionVersionInfoServletProperties::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
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
    if(multipart->hasContent(utility::conversions::to_string_t("ecmaSuport")))
    {
        if(multipart->hasContent(utility::conversions::to_string_t("ecmaSuport")))
        {
            std::shared_ptr<ConfigNodePropertyBoolean> newItem(new ConfigNodePropertyBoolean());
            newItem->fromMultiPart(multipart, utility::conversions::to_string_t("ecmaSuport."));
            setEcmaSuport( newItem );
        }
    }
}

std::shared_ptr<ConfigNodePropertyArray> OrgApacheSlingServletsGetImplVersionVersionInfoServletProperties::getSlingServletSelectors() const
{
    return m_Sling_servlet_selectors;
}


void OrgApacheSlingServletsGetImplVersionVersionInfoServletProperties::setSlingServletSelectors(std::shared_ptr<ConfigNodePropertyArray> value)
{
    m_Sling_servlet_selectors = value;
    m_Sling_servlet_selectorsIsSet = true;
}
bool OrgApacheSlingServletsGetImplVersionVersionInfoServletProperties::slingServletSelectorsIsSet() const
{
    return m_Sling_servlet_selectorsIsSet;
}

void OrgApacheSlingServletsGetImplVersionVersionInfoServletProperties::unsetSling_servlet_selectors()
{
    m_Sling_servlet_selectorsIsSet = false;
}

std::shared_ptr<ConfigNodePropertyBoolean> OrgApacheSlingServletsGetImplVersionVersionInfoServletProperties::getEcmaSuport() const
{
    return m_EcmaSuport;
}


void OrgApacheSlingServletsGetImplVersionVersionInfoServletProperties::setEcmaSuport(std::shared_ptr<ConfigNodePropertyBoolean> value)
{
    m_EcmaSuport = value;
    m_EcmaSuportIsSet = true;
}
bool OrgApacheSlingServletsGetImplVersionVersionInfoServletProperties::ecmaSuportIsSet() const
{
    return m_EcmaSuportIsSet;
}

void OrgApacheSlingServletsGetImplVersionVersionInfoServletProperties::unsetEcmaSuport()
{
    m_EcmaSuportIsSet = false;
}

}
}
}
}
