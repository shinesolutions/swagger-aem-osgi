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
 * OAIComDayCqWcmCoreImplWCMDeveloperModeFilterProperties.h
 *
 * 
 */

#ifndef OAIComDayCqWcmCoreImplWCMDeveloperModeFilterProperties_H_
#define OAIComDayCqWcmCoreImplWCMDeveloperModeFilterProperties_H_

#include <QJsonObject>


#include "OAIOAIConfigNodePropertyBoolean.h"

#include "OAIObject.h"

namespace OpenAPI {

class OAIComDayCqWcmCoreImplWCMDeveloperModeFilterProperties: public OAIObject {
public:
    OAIComDayCqWcmCoreImplWCMDeveloperModeFilterProperties();
    OAIComDayCqWcmCoreImplWCMDeveloperModeFilterProperties(QString json);
    ~OAIComDayCqWcmCoreImplWCMDeveloperModeFilterProperties();
    void init();
    void cleanup();

    QString asJson () override;
    QJsonObject asJsonObject() override;
    void fromJsonObject(QJsonObject json) override;
    OAIComDayCqWcmCoreImplWCMDeveloperModeFilterProperties* fromJson(QString jsonString) override;

    OAIConfigNodePropertyBoolean* getWcmdevmodefilterEnabled();
    void setWcmdevmodefilterEnabled(OAIConfigNodePropertyBoolean* wcmdevmodefilter_enabled);


    virtual bool isSet() override;

private:
    OAIConfigNodePropertyBoolean* wcmdevmodefilter_enabled;
    bool m_wcmdevmodefilter_enabled_isSet;

};

}

#endif /* OAIComDayCqWcmCoreImplWCMDeveloperModeFilterProperties_H_ */