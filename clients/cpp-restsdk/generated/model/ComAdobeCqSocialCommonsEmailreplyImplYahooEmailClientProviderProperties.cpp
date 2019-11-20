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



#include "ComAdobeCqSocialCommonsEmailreplyImplYahooEmailClientProviderProperties.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {

ComAdobeCqSocialCommonsEmailreplyImplYahooEmailClientProviderProperties::ComAdobeCqSocialCommonsEmailreplyImplYahooEmailClientProviderProperties()
{
    m_PriorityOrderIsSet = false;
    m_ReplyEmailPatternsIsSet = false;
}

ComAdobeCqSocialCommonsEmailreplyImplYahooEmailClientProviderProperties::~ComAdobeCqSocialCommonsEmailreplyImplYahooEmailClientProviderProperties()
{
}

void ComAdobeCqSocialCommonsEmailreplyImplYahooEmailClientProviderProperties::validate()
{
    // TODO: implement validation
}

web::json::value ComAdobeCqSocialCommonsEmailreplyImplYahooEmailClientProviderProperties::toJson() const
{
    web::json::value val = web::json::value::object();

    if(m_PriorityOrderIsSet)
    {
        val[utility::conversions::to_string_t("priorityOrder")] = ModelBase::toJson(m_PriorityOrder);
    }
    if(m_ReplyEmailPatternsIsSet)
    {
        val[utility::conversions::to_string_t("replyEmailPatterns")] = ModelBase::toJson(m_ReplyEmailPatterns);
    }

    return val;
}

void ComAdobeCqSocialCommonsEmailreplyImplYahooEmailClientProviderProperties::fromJson(web::json::value& val)
{
    if(val.has_field(utility::conversions::to_string_t("priorityOrder")))
    {
        if(!val[utility::conversions::to_string_t("priorityOrder")].is_null())
        {
            std::shared_ptr<ConfigNodePropertyInteger> newItem(new ConfigNodePropertyInteger());
            newItem->fromJson(val[utility::conversions::to_string_t("priorityOrder")]);
            setPriorityOrder( newItem );
        }
    }
    if(val.has_field(utility::conversions::to_string_t("replyEmailPatterns")))
    {
        if(!val[utility::conversions::to_string_t("replyEmailPatterns")].is_null())
        {
            std::shared_ptr<ConfigNodePropertyArray> newItem(new ConfigNodePropertyArray());
            newItem->fromJson(val[utility::conversions::to_string_t("replyEmailPatterns")]);
            setReplyEmailPatterns( newItem );
        }
    }
}

void ComAdobeCqSocialCommonsEmailreplyImplYahooEmailClientProviderProperties::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t("."))
    {
        namePrefix += utility::conversions::to_string_t(".");
    }

    if(m_PriorityOrderIsSet)
    {
        if (m_PriorityOrder.get())
        {
            m_PriorityOrder->toMultipart(multipart, utility::conversions::to_string_t("priorityOrder."));
        }
    }
    if(m_ReplyEmailPatternsIsSet)
    {
        if (m_ReplyEmailPatterns.get())
        {
            m_ReplyEmailPatterns->toMultipart(multipart, utility::conversions::to_string_t("replyEmailPatterns."));
        }
    }
}

void ComAdobeCqSocialCommonsEmailreplyImplYahooEmailClientProviderProperties::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t("."))
    {
        namePrefix += utility::conversions::to_string_t(".");
    }

    if(multipart->hasContent(utility::conversions::to_string_t("priorityOrder")))
    {
        if(multipart->hasContent(utility::conversions::to_string_t("priorityOrder")))
        {
            std::shared_ptr<ConfigNodePropertyInteger> newItem(new ConfigNodePropertyInteger());
            newItem->fromMultiPart(multipart, utility::conversions::to_string_t("priorityOrder."));
            setPriorityOrder( newItem );
        }
    }
    if(multipart->hasContent(utility::conversions::to_string_t("replyEmailPatterns")))
    {
        if(multipart->hasContent(utility::conversions::to_string_t("replyEmailPatterns")))
        {
            std::shared_ptr<ConfigNodePropertyArray> newItem(new ConfigNodePropertyArray());
            newItem->fromMultiPart(multipart, utility::conversions::to_string_t("replyEmailPatterns."));
            setReplyEmailPatterns( newItem );
        }
    }
}

std::shared_ptr<ConfigNodePropertyInteger> ComAdobeCqSocialCommonsEmailreplyImplYahooEmailClientProviderProperties::getPriorityOrder() const
{
    return m_PriorityOrder;
}


void ComAdobeCqSocialCommonsEmailreplyImplYahooEmailClientProviderProperties::setPriorityOrder(std::shared_ptr<ConfigNodePropertyInteger> value)
{
    m_PriorityOrder = value;
    m_PriorityOrderIsSet = true;
}
bool ComAdobeCqSocialCommonsEmailreplyImplYahooEmailClientProviderProperties::priorityOrderIsSet() const
{
    return m_PriorityOrderIsSet;
}

void ComAdobeCqSocialCommonsEmailreplyImplYahooEmailClientProviderProperties::unsetPriorityOrder()
{
    m_PriorityOrderIsSet = false;
}

std::shared_ptr<ConfigNodePropertyArray> ComAdobeCqSocialCommonsEmailreplyImplYahooEmailClientProviderProperties::getReplyEmailPatterns() const
{
    return m_ReplyEmailPatterns;
}


void ComAdobeCqSocialCommonsEmailreplyImplYahooEmailClientProviderProperties::setReplyEmailPatterns(std::shared_ptr<ConfigNodePropertyArray> value)
{
    m_ReplyEmailPatterns = value;
    m_ReplyEmailPatternsIsSet = true;
}
bool ComAdobeCqSocialCommonsEmailreplyImplYahooEmailClientProviderProperties::replyEmailPatternsIsSet() const
{
    return m_ReplyEmailPatternsIsSet;
}

void ComAdobeCqSocialCommonsEmailreplyImplYahooEmailClientProviderProperties::unsetReplyEmailPatterns()
{
    m_ReplyEmailPatternsIsSet = false;
}

}
}
}
}
