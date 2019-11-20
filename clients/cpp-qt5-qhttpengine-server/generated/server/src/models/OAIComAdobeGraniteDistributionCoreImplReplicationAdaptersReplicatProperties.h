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
 * OAIComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatProperties.h
 *
 * 
 */

#ifndef OAIComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatProperties_H
#define OAIComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatProperties_H

#include <QJsonObject>


#include "OAIConfigNodePropertyBoolean.h"
#include "OAIConfigNodePropertyString.h"

#include "OAIObject.h"

namespace OpenAPI {

class OAIComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatProperties: public OAIObject {
public:
    OAIComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatProperties();
    OAIComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatProperties(QString json);
    ~OAIComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatProperties() override;
    void init();

    QString asJson () const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    OAIConfigNodePropertyString getProviderName() const;
    void setProviderName(const OAIConfigNodePropertyString &provider_name);

    OAIConfigNodePropertyBoolean getForwardRequests() const;
    void setForwardRequests(const OAIConfigNodePropertyBoolean &forward_requests);

    virtual bool isSet() const override;

private:
    OAIConfigNodePropertyString provider_name;
    bool m_provider_name_isSet;

    OAIConfigNodePropertyBoolean forward_requests;
    bool m_forward_requests_isSet;

};

}

#endif // OAIComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatProperties_H