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
 * OAIComDayCqWcmNotificationEmailImplEmailChannelProperties.h
 *
 * 
 */

#ifndef OAIComDayCqWcmNotificationEmailImplEmailChannelProperties_H_
#define OAIComDayCqWcmNotificationEmailImplEmailChannelProperties_H_

#include <QJsonObject>


#include "OAIOAIConfigNodePropertyString.h"

#include "OAIObject.h"

namespace OpenAPI {

class OAIComDayCqWcmNotificationEmailImplEmailChannelProperties: public OAIObject {
public:
    OAIComDayCqWcmNotificationEmailImplEmailChannelProperties();
    OAIComDayCqWcmNotificationEmailImplEmailChannelProperties(QString json);
    ~OAIComDayCqWcmNotificationEmailImplEmailChannelProperties();
    void init();
    void cleanup();

    QString asJson () override;
    QJsonObject asJsonObject() override;
    void fromJsonObject(QJsonObject json) override;
    OAIComDayCqWcmNotificationEmailImplEmailChannelProperties* fromJson(QString jsonString) override;

    OAIConfigNodePropertyString* getEmailFrom();
    void setEmailFrom(OAIConfigNodePropertyString* email_from);


    virtual bool isSet() override;

private:
    OAIConfigNodePropertyString* email_from;
    bool m_email_from_isSet;

};

}

#endif /* OAIComDayCqWcmNotificationEmailImplEmailChannelProperties_H_ */