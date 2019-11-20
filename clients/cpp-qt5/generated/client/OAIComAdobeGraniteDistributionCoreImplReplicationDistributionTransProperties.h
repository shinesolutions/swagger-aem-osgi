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

#ifndef OAIComAdobeGraniteDistributionCoreImplReplicationDistributionTransProperties_H_
#define OAIComAdobeGraniteDistributionCoreImplReplicationDistributionTransProperties_H_

#include <QJsonObject>


#include "OAIOAIConfigNodePropertyBoolean.h"

#include "OAIObject.h"

namespace OpenAPI {

class OAIComAdobeGraniteDistributionCoreImplReplicationDistributionTransProperties: public OAIObject {
public:
    OAIComAdobeGraniteDistributionCoreImplReplicationDistributionTransProperties();
    OAIComAdobeGraniteDistributionCoreImplReplicationDistributionTransProperties(QString json);
    ~OAIComAdobeGraniteDistributionCoreImplReplicationDistributionTransProperties();
    void init();
    void cleanup();

    QString asJson () override;
    QJsonObject asJsonObject() override;
    void fromJsonObject(QJsonObject json) override;
    OAIComAdobeGraniteDistributionCoreImplReplicationDistributionTransProperties* fromJson(QString jsonString) override;

    OAIConfigNodePropertyBoolean* getForwardRequests();
    void setForwardRequests(OAIConfigNodePropertyBoolean* forward_requests);


    virtual bool isSet() override;

private:
    OAIConfigNodePropertyBoolean* forward_requests;
    bool m_forward_requests_isSet;

};

}

#endif /* OAIComAdobeGraniteDistributionCoreImplReplicationDistributionTransProperties_H_ */