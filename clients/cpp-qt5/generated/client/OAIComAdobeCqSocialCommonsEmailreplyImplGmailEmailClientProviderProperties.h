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
 * OAIComAdobeCqSocialCommonsEmailreplyImplGmailEmailClientProviderProperties.h
 *
 * 
 */

#ifndef OAIComAdobeCqSocialCommonsEmailreplyImplGmailEmailClientProviderProperties_H_
#define OAIComAdobeCqSocialCommonsEmailreplyImplGmailEmailClientProviderProperties_H_

#include <QJsonObject>


#include "OAIOAIConfigNodePropertyArray.h"
#include "OAIOAIConfigNodePropertyInteger.h"

#include "OAIObject.h"

namespace OpenAPI {

class OAIComAdobeCqSocialCommonsEmailreplyImplGmailEmailClientProviderProperties: public OAIObject {
public:
    OAIComAdobeCqSocialCommonsEmailreplyImplGmailEmailClientProviderProperties();
    OAIComAdobeCqSocialCommonsEmailreplyImplGmailEmailClientProviderProperties(QString json);
    ~OAIComAdobeCqSocialCommonsEmailreplyImplGmailEmailClientProviderProperties();
    void init();
    void cleanup();

    QString asJson () override;
    QJsonObject asJsonObject() override;
    void fromJsonObject(QJsonObject json) override;
    OAIComAdobeCqSocialCommonsEmailreplyImplGmailEmailClientProviderProperties* fromJson(QString jsonString) override;

    OAIConfigNodePropertyInteger* getPriorityOrder();
    void setPriorityOrder(OAIConfigNodePropertyInteger* priority_order);

    OAIConfigNodePropertyArray* getReplyEmailPatterns();
    void setReplyEmailPatterns(OAIConfigNodePropertyArray* reply_email_patterns);


    virtual bool isSet() override;

private:
    OAIConfigNodePropertyInteger* priority_order;
    bool m_priority_order_isSet;

    OAIConfigNodePropertyArray* reply_email_patterns;
    bool m_reply_email_patterns_isSet;

};

}

#endif /* OAIComAdobeCqSocialCommonsEmailreplyImplGmailEmailClientProviderProperties_H_ */