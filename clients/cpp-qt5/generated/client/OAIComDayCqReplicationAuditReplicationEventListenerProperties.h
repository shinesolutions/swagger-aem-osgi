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
 * OAIComDayCqReplicationAuditReplicationEventListenerProperties.h
 *
 * 
 */

#ifndef OAIComDayCqReplicationAuditReplicationEventListenerProperties_H_
#define OAIComDayCqReplicationAuditReplicationEventListenerProperties_H_

#include <QJsonObject>


#include "OAIOAIConfigNodePropertyInteger.h"

#include "OAIObject.h"

namespace OpenAPI {

class OAIComDayCqReplicationAuditReplicationEventListenerProperties: public OAIObject {
public:
    OAIComDayCqReplicationAuditReplicationEventListenerProperties();
    OAIComDayCqReplicationAuditReplicationEventListenerProperties(QString json);
    ~OAIComDayCqReplicationAuditReplicationEventListenerProperties();
    void init();
    void cleanup();

    QString asJson () override;
    QJsonObject asJsonObject() override;
    void fromJsonObject(QJsonObject json) override;
    OAIComDayCqReplicationAuditReplicationEventListenerProperties* fromJson(QString jsonString) override;

    OAIConfigNodePropertyInteger* getServiceRanking();
    void setServiceRanking(OAIConfigNodePropertyInteger* service_ranking);


    virtual bool isSet() override;

private:
    OAIConfigNodePropertyInteger* service_ranking;
    bool m_service_ranking_isSet;

};

}

#endif /* OAIComDayCqReplicationAuditReplicationEventListenerProperties_H_ */