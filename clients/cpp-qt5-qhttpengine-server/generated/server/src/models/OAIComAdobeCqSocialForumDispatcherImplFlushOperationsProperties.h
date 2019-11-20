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
 * OAIComAdobeCqSocialForumDispatcherImplFlushOperationsProperties.h
 *
 * 
 */

#ifndef OAIComAdobeCqSocialForumDispatcherImplFlushOperationsProperties_H
#define OAIComAdobeCqSocialForumDispatcherImplFlushOperationsProperties_H

#include <QJsonObject>


#include "OAIConfigNodePropertyBoolean.h"
#include "OAIConfigNodePropertyInteger.h"

#include "OAIObject.h"

namespace OpenAPI {

class OAIComAdobeCqSocialForumDispatcherImplFlushOperationsProperties: public OAIObject {
public:
    OAIComAdobeCqSocialForumDispatcherImplFlushOperationsProperties();
    OAIComAdobeCqSocialForumDispatcherImplFlushOperationsProperties(QString json);
    ~OAIComAdobeCqSocialForumDispatcherImplFlushOperationsProperties() override;
    void init();

    QString asJson () const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    OAIConfigNodePropertyInteger getExtensionOrder() const;
    void setExtensionOrder(const OAIConfigNodePropertyInteger &extension_order);

    OAIConfigNodePropertyBoolean getFlushForumontopic() const;
    void setFlushForumontopic(const OAIConfigNodePropertyBoolean &flush_forumontopic);

    virtual bool isSet() const override;

private:
    OAIConfigNodePropertyInteger extension_order;
    bool m_extension_order_isSet;

    OAIConfigNodePropertyBoolean flush_forumontopic;
    bool m_flush_forumontopic_isSet;

};

}

#endif // OAIComAdobeCqSocialForumDispatcherImplFlushOperationsProperties_H