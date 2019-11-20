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

#ifndef OAIComDayCqWcmCoreStatsPageViewStatisticsImplProperties_H
#define OAIComDayCqWcmCoreStatsPageViewStatisticsImplProperties_H

#include <QJsonObject>


#include "OAIConfigNodePropertyString.h"

#include "OAIObject.h"

namespace OpenAPI {

class OAIComDayCqWcmCoreStatsPageViewStatisticsImplProperties: public OAIObject {
public:
    OAIComDayCqWcmCoreStatsPageViewStatisticsImplProperties();
    OAIComDayCqWcmCoreStatsPageViewStatisticsImplProperties(QString json);
    ~OAIComDayCqWcmCoreStatsPageViewStatisticsImplProperties() override;
    void init();

    QString asJson () const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    OAIConfigNodePropertyString getPageviewstatisticsTrackingurl() const;
    void setPageviewstatisticsTrackingurl(const OAIConfigNodePropertyString &pageviewstatistics_trackingurl);

    OAIConfigNodePropertyString getPageviewstatisticsTrackingscriptEnabled() const;
    void setPageviewstatisticsTrackingscriptEnabled(const OAIConfigNodePropertyString &pageviewstatistics_trackingscript_enabled);

    virtual bool isSet() const override;

private:
    OAIConfigNodePropertyString pageviewstatistics_trackingurl;
    bool m_pageviewstatistics_trackingurl_isSet;

    OAIConfigNodePropertyString pageviewstatistics_trackingscript_enabled;
    bool m_pageviewstatistics_trackingscript_enabled_isSet;

};

}

#endif // OAIComDayCqWcmCoreStatsPageViewStatisticsImplProperties_H