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
 * OAIComAdobeCqSocialNotificationsImplMentionsRouterProperties.h
 *
 * 
 */

#ifndef OAIComAdobeCqSocialNotificationsImplMentionsRouterProperties_H
#define OAIComAdobeCqSocialNotificationsImplMentionsRouterProperties_H

#include <QJsonObject>


#include "OAIConfigNodePropertyString.h"

#include "OAIObject.h"

namespace OpenAPI {

class OAIComAdobeCqSocialNotificationsImplMentionsRouterProperties: public OAIObject {
public:
    OAIComAdobeCqSocialNotificationsImplMentionsRouterProperties();
    OAIComAdobeCqSocialNotificationsImplMentionsRouterProperties(QString json);
    ~OAIComAdobeCqSocialNotificationsImplMentionsRouterProperties() override;
    void init();

    QString asJson () const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    OAIConfigNodePropertyString getEventTopics() const;
    void setEventTopics(const OAIConfigNodePropertyString &event_topics);

    OAIConfigNodePropertyString getEventFilter() const;
    void setEventFilter(const OAIConfigNodePropertyString &event_filter);

    virtual bool isSet() const override;

private:
    OAIConfigNodePropertyString event_topics;
    bool m_event_topics_isSet;

    OAIConfigNodePropertyString event_filter;
    bool m_event_filter_isSet;

};

}

#endif // OAIComAdobeCqSocialNotificationsImplMentionsRouterProperties_H