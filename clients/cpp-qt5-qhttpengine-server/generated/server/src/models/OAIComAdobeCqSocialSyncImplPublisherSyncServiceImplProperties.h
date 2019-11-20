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
 * OAIComAdobeCqSocialSyncImplPublisherSyncServiceImplProperties.h
 *
 * 
 */

#ifndef OAIComAdobeCqSocialSyncImplPublisherSyncServiceImplProperties_H
#define OAIComAdobeCqSocialSyncImplPublisherSyncServiceImplProperties_H

#include <QJsonObject>


#include "OAIConfigNodePropertyArray.h"

#include "OAIObject.h"

namespace OpenAPI {

class OAIComAdobeCqSocialSyncImplPublisherSyncServiceImplProperties: public OAIObject {
public:
    OAIComAdobeCqSocialSyncImplPublisherSyncServiceImplProperties();
    OAIComAdobeCqSocialSyncImplPublisherSyncServiceImplProperties(QString json);
    ~OAIComAdobeCqSocialSyncImplPublisherSyncServiceImplProperties() override;
    void init();

    QString asJson () const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    OAIConfigNodePropertyArray getActiveRunModes() const;
    void setActiveRunModes(const OAIConfigNodePropertyArray &active_run_modes);

    virtual bool isSet() const override;

private:
    OAIConfigNodePropertyArray active_run_modes;
    bool m_active_run_modes_isSet;

};

}

#endif // OAIComAdobeCqSocialSyncImplPublisherSyncServiceImplProperties_H