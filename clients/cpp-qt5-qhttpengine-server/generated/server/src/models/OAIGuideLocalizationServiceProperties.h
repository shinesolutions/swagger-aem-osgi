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
 * OAIGuideLocalizationServiceProperties.h
 *
 * 
 */

#ifndef OAIGuideLocalizationServiceProperties_H
#define OAIGuideLocalizationServiceProperties_H

#include <QJsonObject>


#include "OAIConfigNodePropertyArray.h"

#include "OAIObject.h"

namespace OpenAPI {

class OAIGuideLocalizationServiceProperties: public OAIObject {
public:
    OAIGuideLocalizationServiceProperties();
    OAIGuideLocalizationServiceProperties(QString json);
    ~OAIGuideLocalizationServiceProperties() override;
    void init();

    QString asJson () const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    OAIConfigNodePropertyArray getSupportedLocales() const;
    void setSupportedLocales(const OAIConfigNodePropertyArray &supported_locales);

    OAIConfigNodePropertyArray getLocalizableProperties() const;
    void setLocalizableProperties(const OAIConfigNodePropertyArray &localizable_properties);

    virtual bool isSet() const override;

private:
    OAIConfigNodePropertyArray supported_locales;
    bool m_supported_locales_isSet;

    OAIConfigNodePropertyArray localizable_properties;
    bool m_localizable_properties_isSet;

};

}

#endif // OAIGuideLocalizationServiceProperties_H