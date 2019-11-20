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
 * OAIComAdobeGraniteHttpcacheImplOuterCacheFilterProperties.h
 *
 * 
 */

#ifndef OAIComAdobeGraniteHttpcacheImplOuterCacheFilterProperties_H_
#define OAIComAdobeGraniteHttpcacheImplOuterCacheFilterProperties_H_

#include <QJsonObject>


#include "OAIOAIConfigNodePropertyArray.h"

#include "OAIObject.h"

namespace OpenAPI {

class OAIComAdobeGraniteHttpcacheImplOuterCacheFilterProperties: public OAIObject {
public:
    OAIComAdobeGraniteHttpcacheImplOuterCacheFilterProperties();
    OAIComAdobeGraniteHttpcacheImplOuterCacheFilterProperties(QString json);
    ~OAIComAdobeGraniteHttpcacheImplOuterCacheFilterProperties();
    void init();
    void cleanup();

    QString asJson () override;
    QJsonObject asJsonObject() override;
    void fromJsonObject(QJsonObject json) override;
    OAIComAdobeGraniteHttpcacheImplOuterCacheFilterProperties* fromJson(QString jsonString) override;

    OAIConfigNodePropertyArray* getComAdobeGraniteHttpcacheUrlPaths();
    void setComAdobeGraniteHttpcacheUrlPaths(OAIConfigNodePropertyArray* com_adobe_granite_httpcache_url_paths);


    virtual bool isSet() override;

private:
    OAIConfigNodePropertyArray* com_adobe_granite_httpcache_url_paths;
    bool m_com_adobe_granite_httpcache_url_paths_isSet;

};

}

#endif /* OAIComAdobeGraniteHttpcacheImplOuterCacheFilterProperties_H_ */