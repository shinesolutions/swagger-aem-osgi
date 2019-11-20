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
 * OAIComDayCqReportingImplCacheCacheImplProperties.h
 *
 * 
 */

#ifndef OAIComDayCqReportingImplCacheCacheImplProperties_H_
#define OAIComDayCqReportingImplCacheCacheImplProperties_H_

#include <QJsonObject>


#include "OAIOAIConfigNodePropertyBoolean.h"
#include "OAIOAIConfigNodePropertyInteger.h"

#include "OAIObject.h"

namespace OpenAPI {

class OAIComDayCqReportingImplCacheCacheImplProperties: public OAIObject {
public:
    OAIComDayCqReportingImplCacheCacheImplProperties();
    OAIComDayCqReportingImplCacheCacheImplProperties(QString json);
    ~OAIComDayCqReportingImplCacheCacheImplProperties();
    void init();
    void cleanup();

    QString asJson () override;
    QJsonObject asJsonObject() override;
    void fromJsonObject(QJsonObject json) override;
    OAIComDayCqReportingImplCacheCacheImplProperties* fromJson(QString jsonString) override;

    OAIConfigNodePropertyBoolean* getRepcacheEnable();
    void setRepcacheEnable(OAIConfigNodePropertyBoolean* repcache_enable);

    OAIConfigNodePropertyInteger* getRepcacheTtl();
    void setRepcacheTtl(OAIConfigNodePropertyInteger* repcache_ttl);

    OAIConfigNodePropertyInteger* getRepcacheMax();
    void setRepcacheMax(OAIConfigNodePropertyInteger* repcache_max);


    virtual bool isSet() override;

private:
    OAIConfigNodePropertyBoolean* repcache_enable;
    bool m_repcache_enable_isSet;

    OAIConfigNodePropertyInteger* repcache_ttl;
    bool m_repcache_ttl_isSet;

    OAIConfigNodePropertyInteger* repcache_max;
    bool m_repcache_max_isSet;

};

}

#endif /* OAIComDayCqReportingImplCacheCacheImplProperties_H_ */