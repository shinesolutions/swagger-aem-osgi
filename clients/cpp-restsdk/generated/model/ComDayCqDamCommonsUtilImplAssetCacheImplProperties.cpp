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



#include "ComDayCqDamCommonsUtilImplAssetCacheImplProperties.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {

ComDayCqDamCommonsUtilImplAssetCacheImplProperties::ComDayCqDamCommonsUtilImplAssetCacheImplProperties()
{
    m_Large_file_minIsSet = false;
    m_Cache_applyIsSet = false;
    m_Mime_typesIsSet = false;
}

ComDayCqDamCommonsUtilImplAssetCacheImplProperties::~ComDayCqDamCommonsUtilImplAssetCacheImplProperties()
{
}

void ComDayCqDamCommonsUtilImplAssetCacheImplProperties::validate()
{
    // TODO: implement validation
}

web::json::value ComDayCqDamCommonsUtilImplAssetCacheImplProperties::toJson() const
{
    web::json::value val = web::json::value::object();

    if(m_Large_file_minIsSet)
    {
        val[utility::conversions::to_string_t("large.file.min")] = ModelBase::toJson(m_Large_file_min);
    }
    if(m_Cache_applyIsSet)
    {
        val[utility::conversions::to_string_t("cache.apply")] = ModelBase::toJson(m_Cache_apply);
    }
    if(m_Mime_typesIsSet)
    {
        val[utility::conversions::to_string_t("mime.types")] = ModelBase::toJson(m_Mime_types);
    }

    return val;
}

void ComDayCqDamCommonsUtilImplAssetCacheImplProperties::fromJson(web::json::value& val)
{
    if(val.has_field(utility::conversions::to_string_t("large.file.min")))
    {
        if(!val[utility::conversions::to_string_t("large.file.min")].is_null())
        {
            std::shared_ptr<ConfigNodePropertyInteger> newItem(new ConfigNodePropertyInteger());
            newItem->fromJson(val[utility::conversions::to_string_t("large.file.min")]);
            setLargeFileMin( newItem );
        }
    }
    if(val.has_field(utility::conversions::to_string_t("cache.apply")))
    {
        if(!val[utility::conversions::to_string_t("cache.apply")].is_null())
        {
            std::shared_ptr<ConfigNodePropertyBoolean> newItem(new ConfigNodePropertyBoolean());
            newItem->fromJson(val[utility::conversions::to_string_t("cache.apply")]);
            setCacheApply( newItem );
        }
    }
    if(val.has_field(utility::conversions::to_string_t("mime.types")))
    {
        if(!val[utility::conversions::to_string_t("mime.types")].is_null())
        {
            std::shared_ptr<ConfigNodePropertyArray> newItem(new ConfigNodePropertyArray());
            newItem->fromJson(val[utility::conversions::to_string_t("mime.types")]);
            setMimeTypes( newItem );
        }
    }
}

void ComDayCqDamCommonsUtilImplAssetCacheImplProperties::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t("."))
    {
        namePrefix += utility::conversions::to_string_t(".");
    }

    if(m_Large_file_minIsSet)
    {
        if (m_Large_file_min.get())
        {
            m_Large_file_min->toMultipart(multipart, utility::conversions::to_string_t("large.file.min."));
        }
    }
    if(m_Cache_applyIsSet)
    {
        if (m_Cache_apply.get())
        {
            m_Cache_apply->toMultipart(multipart, utility::conversions::to_string_t("cache.apply."));
        }
    }
    if(m_Mime_typesIsSet)
    {
        if (m_Mime_types.get())
        {
            m_Mime_types->toMultipart(multipart, utility::conversions::to_string_t("mime.types."));
        }
    }
}

void ComDayCqDamCommonsUtilImplAssetCacheImplProperties::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t("."))
    {
        namePrefix += utility::conversions::to_string_t(".");
    }

    if(multipart->hasContent(utility::conversions::to_string_t("large.file.min")))
    {
        if(multipart->hasContent(utility::conversions::to_string_t("large.file.min")))
        {
            std::shared_ptr<ConfigNodePropertyInteger> newItem(new ConfigNodePropertyInteger());
            newItem->fromMultiPart(multipart, utility::conversions::to_string_t("large.file.min."));
            setLargeFileMin( newItem );
        }
    }
    if(multipart->hasContent(utility::conversions::to_string_t("cache.apply")))
    {
        if(multipart->hasContent(utility::conversions::to_string_t("cache.apply")))
        {
            std::shared_ptr<ConfigNodePropertyBoolean> newItem(new ConfigNodePropertyBoolean());
            newItem->fromMultiPart(multipart, utility::conversions::to_string_t("cache.apply."));
            setCacheApply( newItem );
        }
    }
    if(multipart->hasContent(utility::conversions::to_string_t("mime.types")))
    {
        if(multipart->hasContent(utility::conversions::to_string_t("mime.types")))
        {
            std::shared_ptr<ConfigNodePropertyArray> newItem(new ConfigNodePropertyArray());
            newItem->fromMultiPart(multipart, utility::conversions::to_string_t("mime.types."));
            setMimeTypes( newItem );
        }
    }
}

std::shared_ptr<ConfigNodePropertyInteger> ComDayCqDamCommonsUtilImplAssetCacheImplProperties::getLargeFileMin() const
{
    return m_Large_file_min;
}


void ComDayCqDamCommonsUtilImplAssetCacheImplProperties::setLargeFileMin(std::shared_ptr<ConfigNodePropertyInteger> value)
{
    m_Large_file_min = value;
    m_Large_file_minIsSet = true;
}
bool ComDayCqDamCommonsUtilImplAssetCacheImplProperties::largeFileMinIsSet() const
{
    return m_Large_file_minIsSet;
}

void ComDayCqDamCommonsUtilImplAssetCacheImplProperties::unsetLarge_file_min()
{
    m_Large_file_minIsSet = false;
}

std::shared_ptr<ConfigNodePropertyBoolean> ComDayCqDamCommonsUtilImplAssetCacheImplProperties::getCacheApply() const
{
    return m_Cache_apply;
}


void ComDayCqDamCommonsUtilImplAssetCacheImplProperties::setCacheApply(std::shared_ptr<ConfigNodePropertyBoolean> value)
{
    m_Cache_apply = value;
    m_Cache_applyIsSet = true;
}
bool ComDayCqDamCommonsUtilImplAssetCacheImplProperties::cacheApplyIsSet() const
{
    return m_Cache_applyIsSet;
}

void ComDayCqDamCommonsUtilImplAssetCacheImplProperties::unsetCache_apply()
{
    m_Cache_applyIsSet = false;
}

std::shared_ptr<ConfigNodePropertyArray> ComDayCqDamCommonsUtilImplAssetCacheImplProperties::getMimeTypes() const
{
    return m_Mime_types;
}


void ComDayCqDamCommonsUtilImplAssetCacheImplProperties::setMimeTypes(std::shared_ptr<ConfigNodePropertyArray> value)
{
    m_Mime_types = value;
    m_Mime_typesIsSet = true;
}
bool ComDayCqDamCommonsUtilImplAssetCacheImplProperties::mimeTypesIsSet() const
{
    return m_Mime_typesIsSet;
}

void ComDayCqDamCommonsUtilImplAssetCacheImplProperties::unsetMime_types()
{
    m_Mime_typesIsSet = false;
}

}
}
}
}

