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



#include "ComDayCqWcmFoundationImplPageRedirectServletProperties.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {

ComDayCqWcmFoundationImplPageRedirectServletProperties::ComDayCqWcmFoundationImplPageRedirectServletProperties()
{
    m_Excluded_resource_typesIsSet = false;
}

ComDayCqWcmFoundationImplPageRedirectServletProperties::~ComDayCqWcmFoundationImplPageRedirectServletProperties()
{
}

void ComDayCqWcmFoundationImplPageRedirectServletProperties::validate()
{
    // TODO: implement validation
}

web::json::value ComDayCqWcmFoundationImplPageRedirectServletProperties::toJson() const
{
    web::json::value val = web::json::value::object();

    if(m_Excluded_resource_typesIsSet)
    {
        val[utility::conversions::to_string_t("excluded.resource.types")] = ModelBase::toJson(m_Excluded_resource_types);
    }

    return val;
}

void ComDayCqWcmFoundationImplPageRedirectServletProperties::fromJson(web::json::value& val)
{
    if(val.has_field(utility::conversions::to_string_t("excluded.resource.types")))
    {
        if(!val[utility::conversions::to_string_t("excluded.resource.types")].is_null())
        {
            std::shared_ptr<ConfigNodePropertyArray> newItem(new ConfigNodePropertyArray());
            newItem->fromJson(val[utility::conversions::to_string_t("excluded.resource.types")]);
            setExcludedResourceTypes( newItem );
        }
    }
}

void ComDayCqWcmFoundationImplPageRedirectServletProperties::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t("."))
    {
        namePrefix += utility::conversions::to_string_t(".");
    }

    if(m_Excluded_resource_typesIsSet)
    {
        if (m_Excluded_resource_types.get())
        {
            m_Excluded_resource_types->toMultipart(multipart, utility::conversions::to_string_t("excluded.resource.types."));
        }
    }
}

void ComDayCqWcmFoundationImplPageRedirectServletProperties::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t("."))
    {
        namePrefix += utility::conversions::to_string_t(".");
    }

    if(multipart->hasContent(utility::conversions::to_string_t("excluded.resource.types")))
    {
        if(multipart->hasContent(utility::conversions::to_string_t("excluded.resource.types")))
        {
            std::shared_ptr<ConfigNodePropertyArray> newItem(new ConfigNodePropertyArray());
            newItem->fromMultiPart(multipart, utility::conversions::to_string_t("excluded.resource.types."));
            setExcludedResourceTypes( newItem );
        }
    }
}

std::shared_ptr<ConfigNodePropertyArray> ComDayCqWcmFoundationImplPageRedirectServletProperties::getExcludedResourceTypes() const
{
    return m_Excluded_resource_types;
}


void ComDayCqWcmFoundationImplPageRedirectServletProperties::setExcludedResourceTypes(std::shared_ptr<ConfigNodePropertyArray> value)
{
    m_Excluded_resource_types = value;
    m_Excluded_resource_typesIsSet = true;
}
bool ComDayCqWcmFoundationImplPageRedirectServletProperties::excludedResourceTypesIsSet() const
{
    return m_Excluded_resource_typesIsSet;
}

void ComDayCqWcmFoundationImplPageRedirectServletProperties::unsetExcluded_resource_types()
{
    m_Excluded_resource_typesIsSet = false;
}

}
}
}
}
