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
 * OAIComDayCqWorkflowImplEmailEMailNotificationServiceProperties.h
 *
 * 
 */

#ifndef OAIComDayCqWorkflowImplEmailEMailNotificationServiceProperties_H
#define OAIComDayCqWorkflowImplEmailEMailNotificationServiceProperties_H

#include <QJsonObject>


#include "OAIConfigNodePropertyBoolean.h"
#include "OAIConfigNodePropertyString.h"

#include "OAIObject.h"

namespace OpenAPI {

class OAIComDayCqWorkflowImplEmailEMailNotificationServiceProperties: public OAIObject {
public:
    OAIComDayCqWorkflowImplEmailEMailNotificationServiceProperties();
    OAIComDayCqWorkflowImplEmailEMailNotificationServiceProperties(QString json);
    ~OAIComDayCqWorkflowImplEmailEMailNotificationServiceProperties() override;
    void init();

    QString asJson () const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    OAIConfigNodePropertyString getFromAddress() const;
    void setFromAddress(const OAIConfigNodePropertyString &from_address);

    OAIConfigNodePropertyString getHostPrefix() const;
    void setHostPrefix(const OAIConfigNodePropertyString &host_prefix);

    OAIConfigNodePropertyBoolean getNotifyOnabort() const;
    void setNotifyOnabort(const OAIConfigNodePropertyBoolean &notify_onabort);

    OAIConfigNodePropertyBoolean getNotifyOncomplete() const;
    void setNotifyOncomplete(const OAIConfigNodePropertyBoolean &notify_oncomplete);

    OAIConfigNodePropertyBoolean getNotifyOncontainercomplete() const;
    void setNotifyOncontainercomplete(const OAIConfigNodePropertyBoolean &notify_oncontainercomplete);

    OAIConfigNodePropertyBoolean getNotifyUseronly() const;
    void setNotifyUseronly(const OAIConfigNodePropertyBoolean &notify_useronly);

    virtual bool isSet() const override;

private:
    OAIConfigNodePropertyString from_address;
    bool m_from_address_isSet;

    OAIConfigNodePropertyString host_prefix;
    bool m_host_prefix_isSet;

    OAIConfigNodePropertyBoolean notify_onabort;
    bool m_notify_onabort_isSet;

    OAIConfigNodePropertyBoolean notify_oncomplete;
    bool m_notify_oncomplete_isSet;

    OAIConfigNodePropertyBoolean notify_oncontainercomplete;
    bool m_notify_oncontainercomplete_isSet;

    OAIConfigNodePropertyBoolean notify_useronly;
    bool m_notify_useronly_isSet;

};

}

#endif // OAIComDayCqWorkflowImplEmailEMailNotificationServiceProperties_H