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



#include "ComDayCqWcmMobileCoreImplRedirectRedirectFilterProperties.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {

ComDayCqWcmMobileCoreImplRedirectRedirectFilterProperties::ComDayCqWcmMobileCoreImplRedirectRedirectFilterProperties()
{
    m_Redirect_enabledIsSet = false;
    m_Redirect_stats_enabledIsSet = false;
    m_Redirect_extensionsIsSet = false;
    m_Redirect_pathsIsSet = false;
}

ComDayCqWcmMobileCoreImplRedirectRedirectFilterProperties::~ComDayCqWcmMobileCoreImplRedirectRedirectFilterProperties()
{
}

void ComDayCqWcmMobileCoreImplRedirectRedirectFilterProperties::validate()
{
    // TODO: implement validation
}

web::json::value ComDayCqWcmMobileCoreImplRedirectRedirectFilterProperties::toJson() const
{
    web::json::value val = web::json::value::object();

    if(m_Redirect_enabledIsSet)
    {
        val[utility::conversions::to_string_t("redirect.enabled")] = ModelBase::toJson(m_Redirect_enabled);
    }
    if(m_Redirect_stats_enabledIsSet)
    {
        val[utility::conversions::to_string_t("redirect.stats.enabled")] = ModelBase::toJson(m_Redirect_stats_enabled);
    }
    if(m_Redirect_extensionsIsSet)
    {
        val[utility::conversions::to_string_t("redirect.extensions")] = ModelBase::toJson(m_Redirect_extensions);
    }
    if(m_Redirect_pathsIsSet)
    {
        val[utility::conversions::to_string_t("redirect.paths")] = ModelBase::toJson(m_Redirect_paths);
    }

    return val;
}

void ComDayCqWcmMobileCoreImplRedirectRedirectFilterProperties::fromJson(web::json::value& val)
{
    if(val.has_field(utility::conversions::to_string_t("redirect.enabled")))
    {
        if(!val[utility::conversions::to_string_t("redirect.enabled")].is_null())
        {
            std::shared_ptr<ConfigNodePropertyBoolean> newItem(new ConfigNodePropertyBoolean());
            newItem->fromJson(val[utility::conversions::to_string_t("redirect.enabled")]);
            setRedirectEnabled( newItem );
        }
    }
    if(val.has_field(utility::conversions::to_string_t("redirect.stats.enabled")))
    {
        if(!val[utility::conversions::to_string_t("redirect.stats.enabled")].is_null())
        {
            std::shared_ptr<ConfigNodePropertyBoolean> newItem(new ConfigNodePropertyBoolean());
            newItem->fromJson(val[utility::conversions::to_string_t("redirect.stats.enabled")]);
            setRedirectStatsEnabled( newItem );
        }
    }
    if(val.has_field(utility::conversions::to_string_t("redirect.extensions")))
    {
        if(!val[utility::conversions::to_string_t("redirect.extensions")].is_null())
        {
            std::shared_ptr<ConfigNodePropertyArray> newItem(new ConfigNodePropertyArray());
            newItem->fromJson(val[utility::conversions::to_string_t("redirect.extensions")]);
            setRedirectExtensions( newItem );
        }
    }
    if(val.has_field(utility::conversions::to_string_t("redirect.paths")))
    {
        if(!val[utility::conversions::to_string_t("redirect.paths")].is_null())
        {
            std::shared_ptr<ConfigNodePropertyArray> newItem(new ConfigNodePropertyArray());
            newItem->fromJson(val[utility::conversions::to_string_t("redirect.paths")]);
            setRedirectPaths( newItem );
        }
    }
}

void ComDayCqWcmMobileCoreImplRedirectRedirectFilterProperties::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t("."))
    {
        namePrefix += utility::conversions::to_string_t(".");
    }

    if(m_Redirect_enabledIsSet)
    {
        if (m_Redirect_enabled.get())
        {
            m_Redirect_enabled->toMultipart(multipart, utility::conversions::to_string_t("redirect.enabled."));
        }
    }
    if(m_Redirect_stats_enabledIsSet)
    {
        if (m_Redirect_stats_enabled.get())
        {
            m_Redirect_stats_enabled->toMultipart(multipart, utility::conversions::to_string_t("redirect.stats.enabled."));
        }
    }
    if(m_Redirect_extensionsIsSet)
    {
        if (m_Redirect_extensions.get())
        {
            m_Redirect_extensions->toMultipart(multipart, utility::conversions::to_string_t("redirect.extensions."));
        }
    }
    if(m_Redirect_pathsIsSet)
    {
        if (m_Redirect_paths.get())
        {
            m_Redirect_paths->toMultipart(multipart, utility::conversions::to_string_t("redirect.paths."));
        }
    }
}

void ComDayCqWcmMobileCoreImplRedirectRedirectFilterProperties::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t("."))
    {
        namePrefix += utility::conversions::to_string_t(".");
    }

    if(multipart->hasContent(utility::conversions::to_string_t("redirect.enabled")))
    {
        if(multipart->hasContent(utility::conversions::to_string_t("redirect.enabled")))
        {
            std::shared_ptr<ConfigNodePropertyBoolean> newItem(new ConfigNodePropertyBoolean());
            newItem->fromMultiPart(multipart, utility::conversions::to_string_t("redirect.enabled."));
            setRedirectEnabled( newItem );
        }
    }
    if(multipart->hasContent(utility::conversions::to_string_t("redirect.stats.enabled")))
    {
        if(multipart->hasContent(utility::conversions::to_string_t("redirect.stats.enabled")))
        {
            std::shared_ptr<ConfigNodePropertyBoolean> newItem(new ConfigNodePropertyBoolean());
            newItem->fromMultiPart(multipart, utility::conversions::to_string_t("redirect.stats.enabled."));
            setRedirectStatsEnabled( newItem );
        }
    }
    if(multipart->hasContent(utility::conversions::to_string_t("redirect.extensions")))
    {
        if(multipart->hasContent(utility::conversions::to_string_t("redirect.extensions")))
        {
            std::shared_ptr<ConfigNodePropertyArray> newItem(new ConfigNodePropertyArray());
            newItem->fromMultiPart(multipart, utility::conversions::to_string_t("redirect.extensions."));
            setRedirectExtensions( newItem );
        }
    }
    if(multipart->hasContent(utility::conversions::to_string_t("redirect.paths")))
    {
        if(multipart->hasContent(utility::conversions::to_string_t("redirect.paths")))
        {
            std::shared_ptr<ConfigNodePropertyArray> newItem(new ConfigNodePropertyArray());
            newItem->fromMultiPart(multipart, utility::conversions::to_string_t("redirect.paths."));
            setRedirectPaths( newItem );
        }
    }
}

std::shared_ptr<ConfigNodePropertyBoolean> ComDayCqWcmMobileCoreImplRedirectRedirectFilterProperties::getRedirectEnabled() const
{
    return m_Redirect_enabled;
}


void ComDayCqWcmMobileCoreImplRedirectRedirectFilterProperties::setRedirectEnabled(std::shared_ptr<ConfigNodePropertyBoolean> value)
{
    m_Redirect_enabled = value;
    m_Redirect_enabledIsSet = true;
}
bool ComDayCqWcmMobileCoreImplRedirectRedirectFilterProperties::redirectEnabledIsSet() const
{
    return m_Redirect_enabledIsSet;
}

void ComDayCqWcmMobileCoreImplRedirectRedirectFilterProperties::unsetRedirect_enabled()
{
    m_Redirect_enabledIsSet = false;
}

std::shared_ptr<ConfigNodePropertyBoolean> ComDayCqWcmMobileCoreImplRedirectRedirectFilterProperties::getRedirectStatsEnabled() const
{
    return m_Redirect_stats_enabled;
}


void ComDayCqWcmMobileCoreImplRedirectRedirectFilterProperties::setRedirectStatsEnabled(std::shared_ptr<ConfigNodePropertyBoolean> value)
{
    m_Redirect_stats_enabled = value;
    m_Redirect_stats_enabledIsSet = true;
}
bool ComDayCqWcmMobileCoreImplRedirectRedirectFilterProperties::redirectStatsEnabledIsSet() const
{
    return m_Redirect_stats_enabledIsSet;
}

void ComDayCqWcmMobileCoreImplRedirectRedirectFilterProperties::unsetRedirect_stats_enabled()
{
    m_Redirect_stats_enabledIsSet = false;
}

std::shared_ptr<ConfigNodePropertyArray> ComDayCqWcmMobileCoreImplRedirectRedirectFilterProperties::getRedirectExtensions() const
{
    return m_Redirect_extensions;
}


void ComDayCqWcmMobileCoreImplRedirectRedirectFilterProperties::setRedirectExtensions(std::shared_ptr<ConfigNodePropertyArray> value)
{
    m_Redirect_extensions = value;
    m_Redirect_extensionsIsSet = true;
}
bool ComDayCqWcmMobileCoreImplRedirectRedirectFilterProperties::redirectExtensionsIsSet() const
{
    return m_Redirect_extensionsIsSet;
}

void ComDayCqWcmMobileCoreImplRedirectRedirectFilterProperties::unsetRedirect_extensions()
{
    m_Redirect_extensionsIsSet = false;
}

std::shared_ptr<ConfigNodePropertyArray> ComDayCqWcmMobileCoreImplRedirectRedirectFilterProperties::getRedirectPaths() const
{
    return m_Redirect_paths;
}


void ComDayCqWcmMobileCoreImplRedirectRedirectFilterProperties::setRedirectPaths(std::shared_ptr<ConfigNodePropertyArray> value)
{
    m_Redirect_paths = value;
    m_Redirect_pathsIsSet = true;
}
bool ComDayCqWcmMobileCoreImplRedirectRedirectFilterProperties::redirectPathsIsSet() const
{
    return m_Redirect_pathsIsSet;
}

void ComDayCqWcmMobileCoreImplRedirectRedirectFilterProperties::unsetRedirect_paths()
{
    m_Redirect_pathsIsSet = false;
}

}
}
}
}
