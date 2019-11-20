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
 * OAIComAdobeGraniteDistributionCoreImplReplicationDistributionTransProperties.h
 *
 * 
 */

#ifndef OAIComAdobeGraniteDistributionCoreImplReplicationDistributionTransProperties_H
#define OAIComAdobeGraniteDistributionCoreImplReplicationDistributionTransProperties_H

#include <QJsonObject>


#include "OAIConfigNodePropertyBoolean.h"

#include "OAIObject.h"

namespace OpenAPI {

class OAIComAdobeGraniteDistributionCoreImplReplicationDistributionTransProperties: public OAIObject {
public:
    OAIComAdobeGraniteDistributionCoreImplReplicationDistributionTransProperties();
    OAIComAdobeGraniteDistributionCoreImplReplicationDistributionTransProperties(QString json);
    ~OAIComAdobeGraniteDistributionCoreImplReplicationDistributionTransProperties() override;
    void init();

    QString asJson () const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    OAIConfigNodePropertyBoolean getForwardRequests() const;
    void setForwardRequests(const OAIConfigNodePropertyBoolean &forward_requests);

    virtual bool isSet() const override;

private:
    OAIConfigNodePropertyBoolean forward_requests;
    bool m_forward_requests_isSet;

};

}

#endif // OAIComAdobeGraniteDistributionCoreImplReplicationDistributionTransProperties_H