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



#include "ComDayCqWcmCoreImplVariantsPageVariantsProviderImplProperties.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {

ComDayCqWcmCoreImplVariantsPageVariantsProviderImplProperties::ComDayCqWcmCoreImplVariantsPageVariantsProviderImplProperties()
{
    m_Default_externalizer_domainIsSet = false;
}

ComDayCqWcmCoreImplVariantsPageVariantsProviderImplProperties::~ComDayCqWcmCoreImplVariantsPageVariantsProviderImplProperties()
{
}

void ComDayCqWcmCoreImplVariantsPageVariantsProviderImplProperties::validate()
{
    // TODO: implement validation
}

web::json::value ComDayCqWcmCoreImplVariantsPageVariantsProviderImplProperties::toJson() const
{
    web::json::value val = web::json::value::object();

    if(m_Default_externalizer_domainIsSet)
    {
        val[utility::conversions::to_string_t("default.externalizer.domain")] = ModelBase::toJson(m_Default_externalizer_domain);
    }

    return val;
}

void ComDayCqWcmCoreImplVariantsPageVariantsProviderImplProperties::fromJson(web::json::value& val)
{
    if(val.has_field(utility::conversions::to_string_t("default.externalizer.domain")))
    {
        if(!val[utility::conversions::to_string_t("default.externalizer.domain")].is_null())
        {
            std::shared_ptr<ConfigNodePropertyString> newItem(new ConfigNodePropertyString());
            newItem->fromJson(val[utility::conversions::to_string_t("default.externalizer.domain")]);
            setDefaultExternalizerDomain( newItem );
        }
    }
}

void ComDayCqWcmCoreImplVariantsPageVariantsProviderImplProperties::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t("."))
    {
        namePrefix += utility::conversions::to_string_t(".");
    }

    if(m_Default_externalizer_domainIsSet)
    {
        if (m_Default_externalizer_domain.get())
        {
            m_Default_externalizer_domain->toMultipart(multipart, utility::conversions::to_string_t("default.externalizer.domain."));
        }
    }
}

void ComDayCqWcmCoreImplVariantsPageVariantsProviderImplProperties::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t("."))
    {
        namePrefix += utility::conversions::to_string_t(".");
    }

    if(multipart->hasContent(utility::conversions::to_string_t("default.externalizer.domain")))
    {
        if(multipart->hasContent(utility::conversions::to_string_t("default.externalizer.domain")))
        {
            std::shared_ptr<ConfigNodePropertyString> newItem(new ConfigNodePropertyString());
            newItem->fromMultiPart(multipart, utility::conversions::to_string_t("default.externalizer.domain."));
            setDefaultExternalizerDomain( newItem );
        }
    }
}

std::shared_ptr<ConfigNodePropertyString> ComDayCqWcmCoreImplVariantsPageVariantsProviderImplProperties::getDefaultExternalizerDomain() const
{
    return m_Default_externalizer_domain;
}


void ComDayCqWcmCoreImplVariantsPageVariantsProviderImplProperties::setDefaultExternalizerDomain(std::shared_ptr<ConfigNodePropertyString> value)
{
    m_Default_externalizer_domain = value;
    m_Default_externalizer_domainIsSet = true;
}
bool ComDayCqWcmCoreImplVariantsPageVariantsProviderImplProperties::defaultExternalizerDomainIsSet() const
{
    return m_Default_externalizer_domainIsSet;
}

void ComDayCqWcmCoreImplVariantsPageVariantsProviderImplProperties::unsetDefault_externalizer_domain()
{
    m_Default_externalizer_domainIsSet = false;
}

}
}
}
}
