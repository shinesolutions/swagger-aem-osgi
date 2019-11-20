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
 * OAIComDayCqWcmCoreStatsPageViewStatisticsImplProperties.h
 *
 * 
 */

#ifndef OAIComDayCqWcmCoreStatsPageViewStatisticsImplProperties_H_
#define OAIComDayCqWcmCoreStatsPageViewStatisticsImplProperties_H_

#include <QJsonObject>


#include "OAIOAIConfigNodePropertyString.h"

#include "OAIObject.h"

namespace OpenAPI {

class OAIComDayCqWcmCoreStatsPageViewStatisticsImplProperties: public OAIObject {
public:
    OAIComDayCqWcmCoreStatsPageViewStatisticsImplProperties();
    OAIComDayCqWcmCoreStatsPageViewStatisticsImplProperties(QString json);
    ~OAIComDayCqWcmCoreStatsPageViewStatisticsImplProperties();
    void init();
    void cleanup();

    QString asJson () override;
    QJsonObject asJsonObject() override;
    void fromJsonObject(QJsonObject json) override;
    OAIComDayCqWcmCoreStatsPageViewStatisticsImplProperties* fromJson(QString jsonString) override;

    OAIConfigNodePropertyString* getPageviewstatisticsTrackingurl();
    void setPageviewstatisticsTrackingurl(OAIConfigNodePropertyString* pageviewstatistics_trackingurl);

    OAIConfigNodePropertyString* getPageviewstatisticsTrackingscriptEnabled();
    void setPageviewstatisticsTrackingscriptEnabled(OAIConfigNodePropertyString* pageviewstatistics_trackingscript_enabled);


    virtual bool isSet() override;

private:
    OAIConfigNodePropertyString* pageviewstatistics_trackingurl;
    bool m_pageviewstatistics_trackingurl_isSet;

    OAIConfigNodePropertyString* pageviewstatistics_trackingscript_enabled;
    bool m_pageviewstatistics_trackingscript_enabled_isSet;

};

}

#endif /* OAIComDayCqWcmCoreStatsPageViewStatisticsImplProperties_H_ */