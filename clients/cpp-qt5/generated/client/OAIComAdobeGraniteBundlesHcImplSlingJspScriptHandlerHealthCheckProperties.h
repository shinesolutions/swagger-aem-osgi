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
 * OAIComAdobeGraniteBundlesHcImplSlingJspScriptHandlerHealthCheckProperties.h
 *
 * 
 */

#ifndef OAIComAdobeGraniteBundlesHcImplSlingJspScriptHandlerHealthCheckProperties_H_
#define OAIComAdobeGraniteBundlesHcImplSlingJspScriptHandlerHealthCheckProperties_H_

#include <QJsonObject>


#include "OAIOAIConfigNodePropertyArray.h"

#include "OAIObject.h"

namespace OpenAPI {

class OAIComAdobeGraniteBundlesHcImplSlingJspScriptHandlerHealthCheckProperties: public OAIObject {
public:
    OAIComAdobeGraniteBundlesHcImplSlingJspScriptHandlerHealthCheckProperties();
    OAIComAdobeGraniteBundlesHcImplSlingJspScriptHandlerHealthCheckProperties(QString json);
    ~OAIComAdobeGraniteBundlesHcImplSlingJspScriptHandlerHealthCheckProperties();
    void init();
    void cleanup();

    QString asJson () override;
    QJsonObject asJsonObject() override;
    void fromJsonObject(QJsonObject json) override;
    OAIComAdobeGraniteBundlesHcImplSlingJspScriptHandlerHealthCheckProperties* fromJson(QString jsonString) override;

    OAIConfigNodePropertyArray* getHcTags();
    void setHcTags(OAIConfigNodePropertyArray* hc_tags);


    virtual bool isSet() override;

private:
    OAIConfigNodePropertyArray* hc_tags;
    bool m_hc_tags_isSet;

};

}

#endif /* OAIComAdobeGraniteBundlesHcImplSlingJspScriptHandlerHealthCheckProperties_H_ */
