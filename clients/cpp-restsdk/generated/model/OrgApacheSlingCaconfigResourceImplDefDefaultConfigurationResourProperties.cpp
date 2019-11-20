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



#include "OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourProperties.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {

OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourProperties::OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourProperties()
{
    m_EnabledIsSet = false;
    m_ConfigPathIsSet = false;
    m_FallbackPathsIsSet = false;
    m_ConfigCollectionInheritancePropertyNamesIsSet = false;
}

OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourProperties::~OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourProperties()
{
}

void OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourProperties::validate()
{
    // TODO: implement validation
}

web::json::value OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourProperties::toJson() const
{
    web::json::value val = web::json::value::object();

    if(m_EnabledIsSet)
    {
        val[utility::conversions::to_string_t("enabled")] = ModelBase::toJson(m_Enabled);
    }
    if(m_ConfigPathIsSet)
    {
        val[utility::conversions::to_string_t("configPath")] = ModelBase::toJson(m_ConfigPath);
    }
    if(m_FallbackPathsIsSet)
    {
        val[utility::conversions::to_string_t("fallbackPaths")] = ModelBase::toJson(m_FallbackPaths);
    }
    if(m_ConfigCollectionInheritancePropertyNamesIsSet)
    {
        val[utility::conversions::to_string_t("configCollectionInheritancePropertyNames")] = ModelBase::toJson(m_ConfigCollectionInheritancePropertyNames);
    }

    return val;
}

void OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourProperties::fromJson(web::json::value& val)
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
    if(val.has_field(utility::conversions::to_string_t("configPath")))
    {
        if(!val[utility::conversions::to_string_t("configPath")].is_null())
        {
            std::shared_ptr<ConfigNodePropertyString> newItem(new ConfigNodePropertyString());
            newItem->fromJson(val[utility::conversions::to_string_t("configPath")]);
            setConfigPath( newItem );
        }
    }
    if(val.has_field(utility::conversions::to_string_t("fallbackPaths")))
    {
        if(!val[utility::conversions::to_string_t("fallbackPaths")].is_null())
        {
            std::shared_ptr<ConfigNodePropertyArray> newItem(new ConfigNodePropertyArray());
            newItem->fromJson(val[utility::conversions::to_string_t("fallbackPaths")]);
            setFallbackPaths( newItem );
        }
    }
    if(val.has_field(utility::conversions::to_string_t("configCollectionInheritancePropertyNames")))
    {
        if(!val[utility::conversions::to_string_t("configCollectionInheritancePropertyNames")].is_null())
        {
            std::shared_ptr<ConfigNodePropertyArray> newItem(new ConfigNodePropertyArray());
            newItem->fromJson(val[utility::conversions::to_string_t("configCollectionInheritancePropertyNames")]);
            setConfigCollectionInheritancePropertyNames( newItem );
        }
    }
}

void OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourProperties::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
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
    if(m_ConfigPathIsSet)
    {
        if (m_ConfigPath.get())
        {
            m_ConfigPath->toMultipart(multipart, utility::conversions::to_string_t("configPath."));
        }
    }
    if(m_FallbackPathsIsSet)
    {
        if (m_FallbackPaths.get())
        {
            m_FallbackPaths->toMultipart(multipart, utility::conversions::to_string_t("fallbackPaths."));
        }
    }
    if(m_ConfigCollectionInheritancePropertyNamesIsSet)
    {
        if (m_ConfigCollectionInheritancePropertyNames.get())
        {
            m_ConfigCollectionInheritancePropertyNames->toMultipart(multipart, utility::conversions::to_string_t("configCollectionInheritancePropertyNames."));
        }
    }
}

void OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourProperties::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
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
    if(multipart->hasContent(utility::conversions::to_string_t("configPath")))
    {
        if(multipart->hasContent(utility::conversions::to_string_t("configPath")))
        {
            std::shared_ptr<ConfigNodePropertyString> newItem(new ConfigNodePropertyString());
            newItem->fromMultiPart(multipart, utility::conversions::to_string_t("configPath."));
            setConfigPath( newItem );
        }
    }
    if(multipart->hasContent(utility::conversions::to_string_t("fallbackPaths")))
    {
        if(multipart->hasContent(utility::conversions::to_string_t("fallbackPaths")))
        {
            std::shared_ptr<ConfigNodePropertyArray> newItem(new ConfigNodePropertyArray());
            newItem->fromMultiPart(multipart, utility::conversions::to_string_t("fallbackPaths."));
            setFallbackPaths( newItem );
        }
    }
    if(multipart->hasContent(utility::conversions::to_string_t("configCollectionInheritancePropertyNames")))
    {
        if(multipart->hasContent(utility::conversions::to_string_t("configCollectionInheritancePropertyNames")))
        {
            std::shared_ptr<ConfigNodePropertyArray> newItem(new ConfigNodePropertyArray());
            newItem->fromMultiPart(multipart, utility::conversions::to_string_t("configCollectionInheritancePropertyNames."));
            setConfigCollectionInheritancePropertyNames( newItem );
        }
    }
}

std::shared_ptr<ConfigNodePropertyBoolean> OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourProperties::getEnabled() const
{
    return m_Enabled;
}


void OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourProperties::setEnabled(std::shared_ptr<ConfigNodePropertyBoolean> value)
{
    m_Enabled = value;
    m_EnabledIsSet = true;
}
bool OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourProperties::enabledIsSet() const
{
    return m_EnabledIsSet;
}

void OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourProperties::unsetEnabled()
{
    m_EnabledIsSet = false;
}

std::shared_ptr<ConfigNodePropertyString> OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourProperties::getConfigPath() const
{
    return m_ConfigPath;
}


void OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourProperties::setConfigPath(std::shared_ptr<ConfigNodePropertyString> value)
{
    m_ConfigPath = value;
    m_ConfigPathIsSet = true;
}
bool OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourProperties::configPathIsSet() const
{
    return m_ConfigPathIsSet;
}

void OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourProperties::unsetConfigPath()
{
    m_ConfigPathIsSet = false;
}

std::shared_ptr<ConfigNodePropertyArray> OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourProperties::getFallbackPaths() const
{
    return m_FallbackPaths;
}


void OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourProperties::setFallbackPaths(std::shared_ptr<ConfigNodePropertyArray> value)
{
    m_FallbackPaths = value;
    m_FallbackPathsIsSet = true;
}
bool OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourProperties::fallbackPathsIsSet() const
{
    return m_FallbackPathsIsSet;
}

void OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourProperties::unsetFallbackPaths()
{
    m_FallbackPathsIsSet = false;
}

std::shared_ptr<ConfigNodePropertyArray> OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourProperties::getConfigCollectionInheritancePropertyNames() const
{
    return m_ConfigCollectionInheritancePropertyNames;
}


void OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourProperties::setConfigCollectionInheritancePropertyNames(std::shared_ptr<ConfigNodePropertyArray> value)
{
    m_ConfigCollectionInheritancePropertyNames = value;
    m_ConfigCollectionInheritancePropertyNamesIsSet = true;
}
bool OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourProperties::configCollectionInheritancePropertyNamesIsSet() const
{
    return m_ConfigCollectionInheritancePropertyNamesIsSet;
}

void OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourProperties::unsetConfigCollectionInheritancePropertyNames()
{
    m_ConfigCollectionInheritancePropertyNamesIsSet = false;
}

}
}
}
}
