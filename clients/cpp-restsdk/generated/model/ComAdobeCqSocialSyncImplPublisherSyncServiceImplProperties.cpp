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



#include "ComAdobeCqSocialSyncImplPublisherSyncServiceImplProperties.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {

ComAdobeCqSocialSyncImplPublisherSyncServiceImplProperties::ComAdobeCqSocialSyncImplPublisherSyncServiceImplProperties()
{
    m_ActiveRunModesIsSet = false;
}

ComAdobeCqSocialSyncImplPublisherSyncServiceImplProperties::~ComAdobeCqSocialSyncImplPublisherSyncServiceImplProperties()
{
}

void ComAdobeCqSocialSyncImplPublisherSyncServiceImplProperties::validate()
{
    // TODO: implement validation
}

web::json::value ComAdobeCqSocialSyncImplPublisherSyncServiceImplProperties::toJson() const
{
    web::json::value val = web::json::value::object();

    if(m_ActiveRunModesIsSet)
    {
        val[utility::conversions::to_string_t("activeRunModes")] = ModelBase::toJson(m_ActiveRunModes);
    }

    return val;
}

void ComAdobeCqSocialSyncImplPublisherSyncServiceImplProperties::fromJson(web::json::value& val)
{
    if(val.has_field(utility::conversions::to_string_t("activeRunModes")))
    {
        if(!val[utility::conversions::to_string_t("activeRunModes")].is_null())
        {
            std::shared_ptr<ConfigNodePropertyArray> newItem(new ConfigNodePropertyArray());
            newItem->fromJson(val[utility::conversions::to_string_t("activeRunModes")]);
            setActiveRunModes( newItem );
        }
    }
}

void ComAdobeCqSocialSyncImplPublisherSyncServiceImplProperties::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t("."))
    {
        namePrefix += utility::conversions::to_string_t(".");
    }

    if(m_ActiveRunModesIsSet)
    {
        if (m_ActiveRunModes.get())
        {
            m_ActiveRunModes->toMultipart(multipart, utility::conversions::to_string_t("activeRunModes."));
        }
    }
}

void ComAdobeCqSocialSyncImplPublisherSyncServiceImplProperties::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t("."))
    {
        namePrefix += utility::conversions::to_string_t(".");
    }

    if(multipart->hasContent(utility::conversions::to_string_t("activeRunModes")))
    {
        if(multipart->hasContent(utility::conversions::to_string_t("activeRunModes")))
        {
            std::shared_ptr<ConfigNodePropertyArray> newItem(new ConfigNodePropertyArray());
            newItem->fromMultiPart(multipart, utility::conversions::to_string_t("activeRunModes."));
            setActiveRunModes( newItem );
        }
    }
}

std::shared_ptr<ConfigNodePropertyArray> ComAdobeCqSocialSyncImplPublisherSyncServiceImplProperties::getActiveRunModes() const
{
    return m_ActiveRunModes;
}


void ComAdobeCqSocialSyncImplPublisherSyncServiceImplProperties::setActiveRunModes(std::shared_ptr<ConfigNodePropertyArray> value)
{
    m_ActiveRunModes = value;
    m_ActiveRunModesIsSet = true;
}
bool ComAdobeCqSocialSyncImplPublisherSyncServiceImplProperties::activeRunModesIsSet() const
{
    return m_ActiveRunModesIsSet;
}

void ComAdobeCqSocialSyncImplPublisherSyncServiceImplProperties::unsetActiveRunModes()
{
    m_ActiveRunModesIsSet = false;
}

}
}
}
}
