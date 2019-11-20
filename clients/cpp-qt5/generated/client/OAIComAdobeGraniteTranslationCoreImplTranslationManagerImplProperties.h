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
 * OAIComAdobeGraniteTranslationCoreImplTranslationManagerImplProperties.h
 *
 * 
 */

#ifndef OAIComAdobeGraniteTranslationCoreImplTranslationManagerImplProperties_H_
#define OAIComAdobeGraniteTranslationCoreImplTranslationManagerImplProperties_H_

#include <QJsonObject>


#include "OAIOAIConfigNodePropertyString.h"

#include "OAIObject.h"

namespace OpenAPI {

class OAIComAdobeGraniteTranslationCoreImplTranslationManagerImplProperties: public OAIObject {
public:
    OAIComAdobeGraniteTranslationCoreImplTranslationManagerImplProperties();
    OAIComAdobeGraniteTranslationCoreImplTranslationManagerImplProperties(QString json);
    ~OAIComAdobeGraniteTranslationCoreImplTranslationManagerImplProperties();
    void init();
    void cleanup();

    QString asJson () override;
    QJsonObject asJsonObject() override;
    void fromJsonObject(QJsonObject json) override;
    OAIComAdobeGraniteTranslationCoreImplTranslationManagerImplProperties* fromJson(QString jsonString) override;

    OAIConfigNodePropertyString* getDefaultConnectorName();
    void setDefaultConnectorName(OAIConfigNodePropertyString* default_connector_name);

    OAIConfigNodePropertyString* getDefaultCategory();
    void setDefaultCategory(OAIConfigNodePropertyString* default_category);


    virtual bool isSet() override;

private:
    OAIConfigNodePropertyString* default_connector_name;
    bool m_default_connector_name_isSet;

    OAIConfigNodePropertyString* default_category;
    bool m_default_category_isSet;

};

}

#endif /* OAIComAdobeGraniteTranslationCoreImplTranslationManagerImplProperties_H_ */