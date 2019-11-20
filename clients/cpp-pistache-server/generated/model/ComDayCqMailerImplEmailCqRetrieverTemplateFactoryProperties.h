/**
* Adobe Experience Manager OSGI config (AEM) API
* Swagger AEM OSGI is an OpenAPI specification for Adobe Experience Manager (AEM) OSGI Configurations API
*
* OpenAPI spec version: 1.0.0-pre.0
* Contact: opensource@shinesolutions.com
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
/*
 * ComDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties.h
 *
 * 
 */

#ifndef ComDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties_H_
#define ComDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties_H_


#include "ModelBase.h"

#include "ConfigNodePropertyBoolean.h"
#include "ConfigNodePropertyString.h"

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// 
/// </summary>
class  ComDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties
    : public ModelBase
{
public:
    ComDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties();
    virtual ~ComDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    nlohmann::json toJson() const override;
    void fromJson(nlohmann::json& json) override;

    /////////////////////////////////////////////
    /// ComDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties members

    /// <summary>
    /// 
    /// </summary>
    ConfigNodePropertyBoolean getMailerEmailEmbed() const;
    void setMailerEmailEmbed(ConfigNodePropertyBoolean const& value);
    bool mailerEmailEmbedIsSet() const;
    void unsetMailer_email_embed();
    /// <summary>
    /// 
    /// </summary>
    ConfigNodePropertyString getMailerEmailCharset() const;
    void setMailerEmailCharset(ConfigNodePropertyString const& value);
    bool mailerEmailCharsetIsSet() const;
    void unsetMailer_email_charset();
    /// <summary>
    /// 
    /// </summary>
    ConfigNodePropertyString getMailerEmailRetrieverUserID() const;
    void setMailerEmailRetrieverUserID(ConfigNodePropertyString const& value);
    bool mailerEmailRetrieverUserIDIsSet() const;
    void unsetMailer_email_retrieverUserID();
    /// <summary>
    /// 
    /// </summary>
    ConfigNodePropertyString getMailerEmailRetrieverUserPWD() const;
    void setMailerEmailRetrieverUserPWD(ConfigNodePropertyString const& value);
    bool mailerEmailRetrieverUserPWDIsSet() const;
    void unsetMailer_email_retrieverUserPWD();

protected:
    ConfigNodePropertyBoolean m_Mailer_email_embed;
    bool m_Mailer_email_embedIsSet;
    ConfigNodePropertyString m_Mailer_email_charset;
    bool m_Mailer_email_charsetIsSet;
    ConfigNodePropertyString m_Mailer_email_retrieverUserID;
    bool m_Mailer_email_retrieverUserIDIsSet;
    ConfigNodePropertyString m_Mailer_email_retrieverUserPWD;
    bool m_Mailer_email_retrieverUserPWDIsSet;
};

}
}
}
}

#endif /* ComDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties_H_ */