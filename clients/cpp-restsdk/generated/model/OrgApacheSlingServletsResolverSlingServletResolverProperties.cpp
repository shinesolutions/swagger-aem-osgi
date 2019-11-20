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



#include "OrgApacheSlingServletsResolverSlingServletResolverProperties.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {

OrgApacheSlingServletsResolverSlingServletResolverProperties::OrgApacheSlingServletsResolverSlingServletResolverProperties()
{
    m_Servletresolver_servletRootIsSet = false;
    m_Servletresolver_cacheSizeIsSet = false;
    m_Servletresolver_pathsIsSet = false;
    m_Servletresolver_defaultExtensionsIsSet = false;
}

OrgApacheSlingServletsResolverSlingServletResolverProperties::~OrgApacheSlingServletsResolverSlingServletResolverProperties()
{
}

void OrgApacheSlingServletsResolverSlingServletResolverProperties::validate()
{
    // TODO: implement validation
}

web::json::value OrgApacheSlingServletsResolverSlingServletResolverProperties::toJson() const
{
    web::json::value val = web::json::value::object();

    if(m_Servletresolver_servletRootIsSet)
    {
        val[utility::conversions::to_string_t("servletresolver.servletRoot")] = ModelBase::toJson(m_Servletresolver_servletRoot);
    }
    if(m_Servletresolver_cacheSizeIsSet)
    {
        val[utility::conversions::to_string_t("servletresolver.cacheSize")] = ModelBase::toJson(m_Servletresolver_cacheSize);
    }
    if(m_Servletresolver_pathsIsSet)
    {
        val[utility::conversions::to_string_t("servletresolver.paths")] = ModelBase::toJson(m_Servletresolver_paths);
    }
    if(m_Servletresolver_defaultExtensionsIsSet)
    {
        val[utility::conversions::to_string_t("servletresolver.defaultExtensions")] = ModelBase::toJson(m_Servletresolver_defaultExtensions);
    }

    return val;
}

void OrgApacheSlingServletsResolverSlingServletResolverProperties::fromJson(web::json::value& val)
{
    if(val.has_field(utility::conversions::to_string_t("servletresolver.servletRoot")))
    {
        if(!val[utility::conversions::to_string_t("servletresolver.servletRoot")].is_null())
        {
            std::shared_ptr<ConfigNodePropertyString> newItem(new ConfigNodePropertyString());
            newItem->fromJson(val[utility::conversions::to_string_t("servletresolver.servletRoot")]);
            setServletresolverServletRoot( newItem );
        }
    }
    if(val.has_field(utility::conversions::to_string_t("servletresolver.cacheSize")))
    {
        if(!val[utility::conversions::to_string_t("servletresolver.cacheSize")].is_null())
        {
            std::shared_ptr<ConfigNodePropertyInteger> newItem(new ConfigNodePropertyInteger());
            newItem->fromJson(val[utility::conversions::to_string_t("servletresolver.cacheSize")]);
            setServletresolverCacheSize( newItem );
        }
    }
    if(val.has_field(utility::conversions::to_string_t("servletresolver.paths")))
    {
        if(!val[utility::conversions::to_string_t("servletresolver.paths")].is_null())
        {
            std::shared_ptr<ConfigNodePropertyArray> newItem(new ConfigNodePropertyArray());
            newItem->fromJson(val[utility::conversions::to_string_t("servletresolver.paths")]);
            setServletresolverPaths( newItem );
        }
    }
    if(val.has_field(utility::conversions::to_string_t("servletresolver.defaultExtensions")))
    {
        if(!val[utility::conversions::to_string_t("servletresolver.defaultExtensions")].is_null())
        {
            std::shared_ptr<ConfigNodePropertyArray> newItem(new ConfigNodePropertyArray());
            newItem->fromJson(val[utility::conversions::to_string_t("servletresolver.defaultExtensions")]);
            setServletresolverDefaultExtensions( newItem );
        }
    }
}

void OrgApacheSlingServletsResolverSlingServletResolverProperties::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t("."))
    {
        namePrefix += utility::conversions::to_string_t(".");
    }

    if(m_Servletresolver_servletRootIsSet)
    {
        if (m_Servletresolver_servletRoot.get())
        {
            m_Servletresolver_servletRoot->toMultipart(multipart, utility::conversions::to_string_t("servletresolver.servletRoot."));
        }
    }
    if(m_Servletresolver_cacheSizeIsSet)
    {
        if (m_Servletresolver_cacheSize.get())
        {
            m_Servletresolver_cacheSize->toMultipart(multipart, utility::conversions::to_string_t("servletresolver.cacheSize."));
        }
    }
    if(m_Servletresolver_pathsIsSet)
    {
        if (m_Servletresolver_paths.get())
        {
            m_Servletresolver_paths->toMultipart(multipart, utility::conversions::to_string_t("servletresolver.paths."));
        }
    }
    if(m_Servletresolver_defaultExtensionsIsSet)
    {
        if (m_Servletresolver_defaultExtensions.get())
        {
            m_Servletresolver_defaultExtensions->toMultipart(multipart, utility::conversions::to_string_t("servletresolver.defaultExtensions."));
        }
    }
}

void OrgApacheSlingServletsResolverSlingServletResolverProperties::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t("."))
    {
        namePrefix += utility::conversions::to_string_t(".");
    }

    if(multipart->hasContent(utility::conversions::to_string_t("servletresolver.servletRoot")))
    {
        if(multipart->hasContent(utility::conversions::to_string_t("servletresolver.servletRoot")))
        {
            std::shared_ptr<ConfigNodePropertyString> newItem(new ConfigNodePropertyString());
            newItem->fromMultiPart(multipart, utility::conversions::to_string_t("servletresolver.servletRoot."));
            setServletresolverServletRoot( newItem );
        }
    }
    if(multipart->hasContent(utility::conversions::to_string_t("servletresolver.cacheSize")))
    {
        if(multipart->hasContent(utility::conversions::to_string_t("servletresolver.cacheSize")))
        {
            std::shared_ptr<ConfigNodePropertyInteger> newItem(new ConfigNodePropertyInteger());
            newItem->fromMultiPart(multipart, utility::conversions::to_string_t("servletresolver.cacheSize."));
            setServletresolverCacheSize( newItem );
        }
    }
    if(multipart->hasContent(utility::conversions::to_string_t("servletresolver.paths")))
    {
        if(multipart->hasContent(utility::conversions::to_string_t("servletresolver.paths")))
        {
            std::shared_ptr<ConfigNodePropertyArray> newItem(new ConfigNodePropertyArray());
            newItem->fromMultiPart(multipart, utility::conversions::to_string_t("servletresolver.paths."));
            setServletresolverPaths( newItem );
        }
    }
    if(multipart->hasContent(utility::conversions::to_string_t("servletresolver.defaultExtensions")))
    {
        if(multipart->hasContent(utility::conversions::to_string_t("servletresolver.defaultExtensions")))
        {
            std::shared_ptr<ConfigNodePropertyArray> newItem(new ConfigNodePropertyArray());
            newItem->fromMultiPart(multipart, utility::conversions::to_string_t("servletresolver.defaultExtensions."));
            setServletresolverDefaultExtensions( newItem );
        }
    }
}

std::shared_ptr<ConfigNodePropertyString> OrgApacheSlingServletsResolverSlingServletResolverProperties::getServletresolverServletRoot() const
{
    return m_Servletresolver_servletRoot;
}


void OrgApacheSlingServletsResolverSlingServletResolverProperties::setServletresolverServletRoot(std::shared_ptr<ConfigNodePropertyString> value)
{
    m_Servletresolver_servletRoot = value;
    m_Servletresolver_servletRootIsSet = true;
}
bool OrgApacheSlingServletsResolverSlingServletResolverProperties::servletresolverServletRootIsSet() const
{
    return m_Servletresolver_servletRootIsSet;
}

void OrgApacheSlingServletsResolverSlingServletResolverProperties::unsetServletresolver_servletRoot()
{
    m_Servletresolver_servletRootIsSet = false;
}

std::shared_ptr<ConfigNodePropertyInteger> OrgApacheSlingServletsResolverSlingServletResolverProperties::getServletresolverCacheSize() const
{
    return m_Servletresolver_cacheSize;
}


void OrgApacheSlingServletsResolverSlingServletResolverProperties::setServletresolverCacheSize(std::shared_ptr<ConfigNodePropertyInteger> value)
{
    m_Servletresolver_cacheSize = value;
    m_Servletresolver_cacheSizeIsSet = true;
}
bool OrgApacheSlingServletsResolverSlingServletResolverProperties::servletresolverCacheSizeIsSet() const
{
    return m_Servletresolver_cacheSizeIsSet;
}

void OrgApacheSlingServletsResolverSlingServletResolverProperties::unsetServletresolver_cacheSize()
{
    m_Servletresolver_cacheSizeIsSet = false;
}

std::shared_ptr<ConfigNodePropertyArray> OrgApacheSlingServletsResolverSlingServletResolverProperties::getServletresolverPaths() const
{
    return m_Servletresolver_paths;
}


void OrgApacheSlingServletsResolverSlingServletResolverProperties::setServletresolverPaths(std::shared_ptr<ConfigNodePropertyArray> value)
{
    m_Servletresolver_paths = value;
    m_Servletresolver_pathsIsSet = true;
}
bool OrgApacheSlingServletsResolverSlingServletResolverProperties::servletresolverPathsIsSet() const
{
    return m_Servletresolver_pathsIsSet;
}

void OrgApacheSlingServletsResolverSlingServletResolverProperties::unsetServletresolver_paths()
{
    m_Servletresolver_pathsIsSet = false;
}

std::shared_ptr<ConfigNodePropertyArray> OrgApacheSlingServletsResolverSlingServletResolverProperties::getServletresolverDefaultExtensions() const
{
    return m_Servletresolver_defaultExtensions;
}


void OrgApacheSlingServletsResolverSlingServletResolverProperties::setServletresolverDefaultExtensions(std::shared_ptr<ConfigNodePropertyArray> value)
{
    m_Servletresolver_defaultExtensions = value;
    m_Servletresolver_defaultExtensionsIsSet = true;
}
bool OrgApacheSlingServletsResolverSlingServletResolverProperties::servletresolverDefaultExtensionsIsSet() const
{
    return m_Servletresolver_defaultExtensionsIsSet;
}

void OrgApacheSlingServletsResolverSlingServletResolverProperties::unsetServletresolver_defaultExtensions()
{
    m_Servletresolver_defaultExtensionsIsSet = false;
}

}
}
}
}
