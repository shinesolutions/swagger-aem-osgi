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



#include "ComDayCqWcmCoreImplEventRepositoryChangeEventListenerProperties.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {

ComDayCqWcmCoreImplEventRepositoryChangeEventListenerProperties::ComDayCqWcmCoreImplEventRepositoryChangeEventListenerProperties()
{
    m_PathsIsSet = false;
    m_ExcludedPathsIsSet = false;
}

ComDayCqWcmCoreImplEventRepositoryChangeEventListenerProperties::~ComDayCqWcmCoreImplEventRepositoryChangeEventListenerProperties()
{
}

void ComDayCqWcmCoreImplEventRepositoryChangeEventListenerProperties::validate()
{
    // TODO: implement validation
}

web::json::value ComDayCqWcmCoreImplEventRepositoryChangeEventListenerProperties::toJson() const
{
    web::json::value val = web::json::value::object();

    if(m_PathsIsSet)
    {
        val[utility::conversions::to_string_t("paths")] = ModelBase::toJson(m_Paths);
    }
    if(m_ExcludedPathsIsSet)
    {
        val[utility::conversions::to_string_t("excludedPaths")] = ModelBase::toJson(m_ExcludedPaths);
    }

    return val;
}

void ComDayCqWcmCoreImplEventRepositoryChangeEventListenerProperties::fromJson(web::json::value& val)
{
    if(val.has_field(utility::conversions::to_string_t("paths")))
    {
        if(!val[utility::conversions::to_string_t("paths")].is_null())
        {
            std::shared_ptr<ConfigNodePropertyArray> newItem(new ConfigNodePropertyArray());
            newItem->fromJson(val[utility::conversions::to_string_t("paths")]);
            setPaths( newItem );
        }
    }
    if(val.has_field(utility::conversions::to_string_t("excludedPaths")))
    {
        if(!val[utility::conversions::to_string_t("excludedPaths")].is_null())
        {
            std::shared_ptr<ConfigNodePropertyArray> newItem(new ConfigNodePropertyArray());
            newItem->fromJson(val[utility::conversions::to_string_t("excludedPaths")]);
            setExcludedPaths( newItem );
        }
    }
}

void ComDayCqWcmCoreImplEventRepositoryChangeEventListenerProperties::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t("."))
    {
        namePrefix += utility::conversions::to_string_t(".");
    }

    if(m_PathsIsSet)
    {
        if (m_Paths.get())
        {
            m_Paths->toMultipart(multipart, utility::conversions::to_string_t("paths."));
        }
    }
    if(m_ExcludedPathsIsSet)
    {
        if (m_ExcludedPaths.get())
        {
            m_ExcludedPaths->toMultipart(multipart, utility::conversions::to_string_t("excludedPaths."));
        }
    }
}

void ComDayCqWcmCoreImplEventRepositoryChangeEventListenerProperties::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t("."))
    {
        namePrefix += utility::conversions::to_string_t(".");
    }

    if(multipart->hasContent(utility::conversions::to_string_t("paths")))
    {
        if(multipart->hasContent(utility::conversions::to_string_t("paths")))
        {
            std::shared_ptr<ConfigNodePropertyArray> newItem(new ConfigNodePropertyArray());
            newItem->fromMultiPart(multipart, utility::conversions::to_string_t("paths."));
            setPaths( newItem );
        }
    }
    if(multipart->hasContent(utility::conversions::to_string_t("excludedPaths")))
    {
        if(multipart->hasContent(utility::conversions::to_string_t("excludedPaths")))
        {
            std::shared_ptr<ConfigNodePropertyArray> newItem(new ConfigNodePropertyArray());
            newItem->fromMultiPart(multipart, utility::conversions::to_string_t("excludedPaths."));
            setExcludedPaths( newItem );
        }
    }
}

std::shared_ptr<ConfigNodePropertyArray> ComDayCqWcmCoreImplEventRepositoryChangeEventListenerProperties::getPaths() const
{
    return m_Paths;
}


void ComDayCqWcmCoreImplEventRepositoryChangeEventListenerProperties::setPaths(std::shared_ptr<ConfigNodePropertyArray> value)
{
    m_Paths = value;
    m_PathsIsSet = true;
}
bool ComDayCqWcmCoreImplEventRepositoryChangeEventListenerProperties::pathsIsSet() const
{
    return m_PathsIsSet;
}

void ComDayCqWcmCoreImplEventRepositoryChangeEventListenerProperties::unsetPaths()
{
    m_PathsIsSet = false;
}

std::shared_ptr<ConfigNodePropertyArray> ComDayCqWcmCoreImplEventRepositoryChangeEventListenerProperties::getExcludedPaths() const
{
    return m_ExcludedPaths;
}


void ComDayCqWcmCoreImplEventRepositoryChangeEventListenerProperties::setExcludedPaths(std::shared_ptr<ConfigNodePropertyArray> value)
{
    m_ExcludedPaths = value;
    m_ExcludedPathsIsSet = true;
}
bool ComDayCqWcmCoreImplEventRepositoryChangeEventListenerProperties::excludedPathsIsSet() const
{
    return m_ExcludedPathsIsSet;
}

void ComDayCqWcmCoreImplEventRepositoryChangeEventListenerProperties::unsetExcludedPaths()
{
    m_ExcludedPathsIsSet = false;
}

}
}
}
}
