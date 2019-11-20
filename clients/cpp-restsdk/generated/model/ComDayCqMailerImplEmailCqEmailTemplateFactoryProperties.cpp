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



#include "ComDayCqMailerImplEmailCqEmailTemplateFactoryProperties.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {

ComDayCqMailerImplEmailCqEmailTemplateFactoryProperties::ComDayCqMailerImplEmailCqEmailTemplateFactoryProperties()
{
    m_Mailer_email_charsetIsSet = false;
}

ComDayCqMailerImplEmailCqEmailTemplateFactoryProperties::~ComDayCqMailerImplEmailCqEmailTemplateFactoryProperties()
{
}

void ComDayCqMailerImplEmailCqEmailTemplateFactoryProperties::validate()
{
    // TODO: implement validation
}

web::json::value ComDayCqMailerImplEmailCqEmailTemplateFactoryProperties::toJson() const
{
    web::json::value val = web::json::value::object();

    if(m_Mailer_email_charsetIsSet)
    {
        val[utility::conversions::to_string_t("mailer.email.charset")] = ModelBase::toJson(m_Mailer_email_charset);
    }

    return val;
}

void ComDayCqMailerImplEmailCqEmailTemplateFactoryProperties::fromJson(web::json::value& val)
{
    if(val.has_field(utility::conversions::to_string_t("mailer.email.charset")))
    {
        if(!val[utility::conversions::to_string_t("mailer.email.charset")].is_null())
        {
            std::shared_ptr<ConfigNodePropertyString> newItem(new ConfigNodePropertyString());
            newItem->fromJson(val[utility::conversions::to_string_t("mailer.email.charset")]);
            setMailerEmailCharset( newItem );
        }
    }
}

void ComDayCqMailerImplEmailCqEmailTemplateFactoryProperties::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t("."))
    {
        namePrefix += utility::conversions::to_string_t(".");
    }

    if(m_Mailer_email_charsetIsSet)
    {
        if (m_Mailer_email_charset.get())
        {
            m_Mailer_email_charset->toMultipart(multipart, utility::conversions::to_string_t("mailer.email.charset."));
        }
    }
}

void ComDayCqMailerImplEmailCqEmailTemplateFactoryProperties::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t("."))
    {
        namePrefix += utility::conversions::to_string_t(".");
    }

    if(multipart->hasContent(utility::conversions::to_string_t("mailer.email.charset")))
    {
        if(multipart->hasContent(utility::conversions::to_string_t("mailer.email.charset")))
        {
            std::shared_ptr<ConfigNodePropertyString> newItem(new ConfigNodePropertyString());
            newItem->fromMultiPart(multipart, utility::conversions::to_string_t("mailer.email.charset."));
            setMailerEmailCharset( newItem );
        }
    }
}

std::shared_ptr<ConfigNodePropertyString> ComDayCqMailerImplEmailCqEmailTemplateFactoryProperties::getMailerEmailCharset() const
{
    return m_Mailer_email_charset;
}


void ComDayCqMailerImplEmailCqEmailTemplateFactoryProperties::setMailerEmailCharset(std::shared_ptr<ConfigNodePropertyString> value)
{
    m_Mailer_email_charset = value;
    m_Mailer_email_charsetIsSet = true;
}
bool ComDayCqMailerImplEmailCqEmailTemplateFactoryProperties::mailerEmailCharsetIsSet() const
{
    return m_Mailer_email_charsetIsSet;
}

void ComDayCqMailerImplEmailCqEmailTemplateFactoryProperties::unsetMailer_email_charset()
{
    m_Mailer_email_charsetIsSet = false;
}

}
}
}
}
