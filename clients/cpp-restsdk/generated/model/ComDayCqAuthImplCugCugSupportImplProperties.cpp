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



#include "ComDayCqAuthImplCugCugSupportImplProperties.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {

ComDayCqAuthImplCugCugSupportImplProperties::ComDayCqAuthImplCugCugSupportImplProperties()
{
    m_Cug_exempted_principalsIsSet = false;
    m_Cug_enabledIsSet = false;
    m_Cug_principals_regexIsSet = false;
    m_Cug_principals_replacementIsSet = false;
}

ComDayCqAuthImplCugCugSupportImplProperties::~ComDayCqAuthImplCugCugSupportImplProperties()
{
}

void ComDayCqAuthImplCugCugSupportImplProperties::validate()
{
    // TODO: implement validation
}

web::json::value ComDayCqAuthImplCugCugSupportImplProperties::toJson() const
{
    web::json::value val = web::json::value::object();

    if(m_Cug_exempted_principalsIsSet)
    {
        val[utility::conversions::to_string_t("cug.exempted.principals")] = ModelBase::toJson(m_Cug_exempted_principals);
    }
    if(m_Cug_enabledIsSet)
    {
        val[utility::conversions::to_string_t("cug.enabled")] = ModelBase::toJson(m_Cug_enabled);
    }
    if(m_Cug_principals_regexIsSet)
    {
        val[utility::conversions::to_string_t("cug.principals.regex")] = ModelBase::toJson(m_Cug_principals_regex);
    }
    if(m_Cug_principals_replacementIsSet)
    {
        val[utility::conversions::to_string_t("cug.principals.replacement")] = ModelBase::toJson(m_Cug_principals_replacement);
    }

    return val;
}

void ComDayCqAuthImplCugCugSupportImplProperties::fromJson(web::json::value& val)
{
    if(val.has_field(utility::conversions::to_string_t("cug.exempted.principals")))
    {
        if(!val[utility::conversions::to_string_t("cug.exempted.principals")].is_null())
        {
            std::shared_ptr<ConfigNodePropertyArray> newItem(new ConfigNodePropertyArray());
            newItem->fromJson(val[utility::conversions::to_string_t("cug.exempted.principals")]);
            setCugExemptedPrincipals( newItem );
        }
    }
    if(val.has_field(utility::conversions::to_string_t("cug.enabled")))
    {
        if(!val[utility::conversions::to_string_t("cug.enabled")].is_null())
        {
            std::shared_ptr<ConfigNodePropertyBoolean> newItem(new ConfigNodePropertyBoolean());
            newItem->fromJson(val[utility::conversions::to_string_t("cug.enabled")]);
            setCugEnabled( newItem );
        }
    }
    if(val.has_field(utility::conversions::to_string_t("cug.principals.regex")))
    {
        if(!val[utility::conversions::to_string_t("cug.principals.regex")].is_null())
        {
            std::shared_ptr<ConfigNodePropertyString> newItem(new ConfigNodePropertyString());
            newItem->fromJson(val[utility::conversions::to_string_t("cug.principals.regex")]);
            setCugPrincipalsRegex( newItem );
        }
    }
    if(val.has_field(utility::conversions::to_string_t("cug.principals.replacement")))
    {
        if(!val[utility::conversions::to_string_t("cug.principals.replacement")].is_null())
        {
            std::shared_ptr<ConfigNodePropertyString> newItem(new ConfigNodePropertyString());
            newItem->fromJson(val[utility::conversions::to_string_t("cug.principals.replacement")]);
            setCugPrincipalsReplacement( newItem );
        }
    }
}

void ComDayCqAuthImplCugCugSupportImplProperties::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t("."))
    {
        namePrefix += utility::conversions::to_string_t(".");
    }

    if(m_Cug_exempted_principalsIsSet)
    {
        if (m_Cug_exempted_principals.get())
        {
            m_Cug_exempted_principals->toMultipart(multipart, utility::conversions::to_string_t("cug.exempted.principals."));
        }
    }
    if(m_Cug_enabledIsSet)
    {
        if (m_Cug_enabled.get())
        {
            m_Cug_enabled->toMultipart(multipart, utility::conversions::to_string_t("cug.enabled."));
        }
    }
    if(m_Cug_principals_regexIsSet)
    {
        if (m_Cug_principals_regex.get())
        {
            m_Cug_principals_regex->toMultipart(multipart, utility::conversions::to_string_t("cug.principals.regex."));
        }
    }
    if(m_Cug_principals_replacementIsSet)
    {
        if (m_Cug_principals_replacement.get())
        {
            m_Cug_principals_replacement->toMultipart(multipart, utility::conversions::to_string_t("cug.principals.replacement."));
        }
    }
}

void ComDayCqAuthImplCugCugSupportImplProperties::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t("."))
    {
        namePrefix += utility::conversions::to_string_t(".");
    }

    if(multipart->hasContent(utility::conversions::to_string_t("cug.exempted.principals")))
    {
        if(multipart->hasContent(utility::conversions::to_string_t("cug.exempted.principals")))
        {
            std::shared_ptr<ConfigNodePropertyArray> newItem(new ConfigNodePropertyArray());
            newItem->fromMultiPart(multipart, utility::conversions::to_string_t("cug.exempted.principals."));
            setCugExemptedPrincipals( newItem );
        }
    }
    if(multipart->hasContent(utility::conversions::to_string_t("cug.enabled")))
    {
        if(multipart->hasContent(utility::conversions::to_string_t("cug.enabled")))
        {
            std::shared_ptr<ConfigNodePropertyBoolean> newItem(new ConfigNodePropertyBoolean());
            newItem->fromMultiPart(multipart, utility::conversions::to_string_t("cug.enabled."));
            setCugEnabled( newItem );
        }
    }
    if(multipart->hasContent(utility::conversions::to_string_t("cug.principals.regex")))
    {
        if(multipart->hasContent(utility::conversions::to_string_t("cug.principals.regex")))
        {
            std::shared_ptr<ConfigNodePropertyString> newItem(new ConfigNodePropertyString());
            newItem->fromMultiPart(multipart, utility::conversions::to_string_t("cug.principals.regex."));
            setCugPrincipalsRegex( newItem );
        }
    }
    if(multipart->hasContent(utility::conversions::to_string_t("cug.principals.replacement")))
    {
        if(multipart->hasContent(utility::conversions::to_string_t("cug.principals.replacement")))
        {
            std::shared_ptr<ConfigNodePropertyString> newItem(new ConfigNodePropertyString());
            newItem->fromMultiPart(multipart, utility::conversions::to_string_t("cug.principals.replacement."));
            setCugPrincipalsReplacement( newItem );
        }
    }
}

std::shared_ptr<ConfigNodePropertyArray> ComDayCqAuthImplCugCugSupportImplProperties::getCugExemptedPrincipals() const
{
    return m_Cug_exempted_principals;
}


void ComDayCqAuthImplCugCugSupportImplProperties::setCugExemptedPrincipals(std::shared_ptr<ConfigNodePropertyArray> value)
{
    m_Cug_exempted_principals = value;
    m_Cug_exempted_principalsIsSet = true;
}
bool ComDayCqAuthImplCugCugSupportImplProperties::cugExemptedPrincipalsIsSet() const
{
    return m_Cug_exempted_principalsIsSet;
}

void ComDayCqAuthImplCugCugSupportImplProperties::unsetCug_exempted_principals()
{
    m_Cug_exempted_principalsIsSet = false;
}

std::shared_ptr<ConfigNodePropertyBoolean> ComDayCqAuthImplCugCugSupportImplProperties::getCugEnabled() const
{
    return m_Cug_enabled;
}


void ComDayCqAuthImplCugCugSupportImplProperties::setCugEnabled(std::shared_ptr<ConfigNodePropertyBoolean> value)
{
    m_Cug_enabled = value;
    m_Cug_enabledIsSet = true;
}
bool ComDayCqAuthImplCugCugSupportImplProperties::cugEnabledIsSet() const
{
    return m_Cug_enabledIsSet;
}

void ComDayCqAuthImplCugCugSupportImplProperties::unsetCug_enabled()
{
    m_Cug_enabledIsSet = false;
}

std::shared_ptr<ConfigNodePropertyString> ComDayCqAuthImplCugCugSupportImplProperties::getCugPrincipalsRegex() const
{
    return m_Cug_principals_regex;
}


void ComDayCqAuthImplCugCugSupportImplProperties::setCugPrincipalsRegex(std::shared_ptr<ConfigNodePropertyString> value)
{
    m_Cug_principals_regex = value;
    m_Cug_principals_regexIsSet = true;
}
bool ComDayCqAuthImplCugCugSupportImplProperties::cugPrincipalsRegexIsSet() const
{
    return m_Cug_principals_regexIsSet;
}

void ComDayCqAuthImplCugCugSupportImplProperties::unsetCug_principals_regex()
{
    m_Cug_principals_regexIsSet = false;
}

std::shared_ptr<ConfigNodePropertyString> ComDayCqAuthImplCugCugSupportImplProperties::getCugPrincipalsReplacement() const
{
    return m_Cug_principals_replacement;
}


void ComDayCqAuthImplCugCugSupportImplProperties::setCugPrincipalsReplacement(std::shared_ptr<ConfigNodePropertyString> value)
{
    m_Cug_principals_replacement = value;
    m_Cug_principals_replacementIsSet = true;
}
bool ComDayCqAuthImplCugCugSupportImplProperties::cugPrincipalsReplacementIsSet() const
{
    return m_Cug_principals_replacementIsSet;
}

void ComDayCqAuthImplCugCugSupportImplProperties::unsetCug_principals_replacement()
{
    m_Cug_principals_replacementIsSet = false;
}

}
}
}
}
