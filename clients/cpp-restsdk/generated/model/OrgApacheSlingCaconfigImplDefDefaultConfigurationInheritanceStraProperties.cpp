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



#include "OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraProperties.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {

OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraProperties::OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraProperties()
{
    m_EnabledIsSet = false;
    m_ConfigPropertyInheritancePropertyNamesIsSet = false;
}

OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraProperties::~OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraProperties()
{
}

void OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraProperties::validate()
{
    // TODO: implement validation
}

web::json::value OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraProperties::toJson() const
{
    web::json::value val = web::json::value::object();

    if(m_EnabledIsSet)
    {
        val[utility::conversions::to_string_t("enabled")] = ModelBase::toJson(m_Enabled);
    }
    if(m_ConfigPropertyInheritancePropertyNamesIsSet)
    {
        val[utility::conversions::to_string_t("configPropertyInheritancePropertyNames")] = ModelBase::toJson(m_ConfigPropertyInheritancePropertyNames);
    }

    return val;
}

void OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraProperties::fromJson(web::json::value& val)
{
    if(val.has_field(utility::conversions::to_string_t("enabled")))
    {
        if(!val[utility::conversions::to_string_t("enabled")].is_null())
        {
            std::shared_ptr<ConfigNodePropertyBoolean> newItem(new ConfigNodePropertyBoolean());
            newItem->fromJson(val[utility::conversions::to_string_t("enabled")]);
            setEnabled( newItem );
        }
    }
    if(val.has_field(utility::conversions::to_string_t("configPropertyInheritancePropertyNames")))
    {
        if(!val[utility::conversions::to_string_t("configPropertyInheritancePropertyNames")].is_null())
        {
            std::shared_ptr<ConfigNodePropertyArray> newItem(new ConfigNodePropertyArray());
            newItem->fromJson(val[utility::conversions::to_string_t("configPropertyInheritancePropertyNames")]);
            setConfigPropertyInheritancePropertyNames( newItem );
        }
    }
}

void OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraProperties::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t("."))
    {
        namePrefix += utility::conversions::to_string_t(".");
    }

    if(m_EnabledIsSet)
    {
        if (m_Enabled.get())
        {
            m_Enabled->toMultipart(multipart, utility::conversions::to_string_t("enabled."));
        }
    }
    if(m_ConfigPropertyInheritancePropertyNamesIsSet)
    {
        if (m_ConfigPropertyInheritancePropertyNames.get())
        {
            m_ConfigPropertyInheritancePropertyNames->toMultipart(multipart, utility::conversions::to_string_t("configPropertyInheritancePropertyNames."));
        }
    }
}

void OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraProperties::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t("."))
    {
        namePrefix += utility::conversions::to_string_t(".");
    }

    if(multipart->hasContent(utility::conversions::to_string_t("enabled")))
    {
        if(multipart->hasContent(utility::conversions::to_string_t("enabled")))
        {
            std::shared_ptr<ConfigNodePropertyBoolean> newItem(new ConfigNodePropertyBoolean());
            newItem->fromMultiPart(multipart, utility::conversions::to_string_t("enabled."));
            setEnabled( newItem );
        }
    }
    if(multipart->hasContent(utility::conversions::to_string_t("configPropertyInheritancePropertyNames")))
    {
        if(multipart->hasContent(utility::conversions::to_string_t("configPropertyInheritancePropertyNames")))
        {
            std::shared_ptr<ConfigNodePropertyArray> newItem(new ConfigNodePropertyArray());
            newItem->fromMultiPart(multipart, utility::conversions::to_string_t("configPropertyInheritancePropertyNames."));
            setConfigPropertyInheritancePropertyNames( newItem );
        }
    }
}

std::shared_ptr<ConfigNodePropertyBoolean> OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraProperties::getEnabled() const
{
    return m_Enabled;
}


void OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraProperties::setEnabled(std::shared_ptr<ConfigNodePropertyBoolean> value)
{
    m_Enabled = value;
    m_EnabledIsSet = true;
}
bool OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraProperties::enabledIsSet() const
{
    return m_EnabledIsSet;
}

void OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraProperties::unsetEnabled()
{
    m_EnabledIsSet = false;
}

std::shared_ptr<ConfigNodePropertyArray> OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraProperties::getConfigPropertyInheritancePropertyNames() const
{
    return m_ConfigPropertyInheritancePropertyNames;
}


void OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraProperties::setConfigPropertyInheritancePropertyNames(std::shared_ptr<ConfigNodePropertyArray> value)
{
    m_ConfigPropertyInheritancePropertyNames = value;
    m_ConfigPropertyInheritancePropertyNamesIsSet = true;
}
bool OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraProperties::configPropertyInheritancePropertyNamesIsSet() const
{
    return m_ConfigPropertyInheritancePropertyNamesIsSet;
}

void OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraProperties::unsetConfigPropertyInheritancePropertyNames()
{
    m_ConfigPropertyInheritancePropertyNamesIsSet = false;
}

}
}
}
}
