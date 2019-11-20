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
 * OAIComDayCqNotificationImplNotificationServiceImplProperties.h
 *
 * 
 */

#ifndef OAIComDayCqNotificationImplNotificationServiceImplProperties_H
#define OAIComDayCqNotificationImplNotificationServiceImplProperties_H

#include <QJsonObject>


#include "OAIConfigNodePropertyString.h"

#include "OAIObject.h"

namespace OpenAPI {

class OAIComDayCqNotificationImplNotificationServiceImplProperties: public OAIObject {
public:
    OAIComDayCqNotificationImplNotificationServiceImplProperties();
    OAIComDayCqNotificationImplNotificationServiceImplProperties(QString json);
    ~OAIComDayCqNotificationImplNotificationServiceImplProperties() override;
    void init();

    QString asJson () const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    OAIConfigNodePropertyString getEventFilter() const;
    void setEventFilter(const OAIConfigNodePropertyString &event_filter);

    virtual bool isSet() const override;

private:
    OAIConfigNodePropertyString event_filter;
    bool m_event_filter_isSet;

};

}

#endif // OAIComDayCqNotificationImplNotificationServiceImplProperties_H